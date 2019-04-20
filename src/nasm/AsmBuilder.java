package nasm;

import ir.IrProg;
import ir.structure.BasicBlock;
import ir.structure.IrFunct;
import ir.structure.Reg;
import ir.structure.StringLiteral;
import nasm.allocate.AsmRegAllocator;
import nasm.inst.Call;
import nasm.inst.Msg;
import nasm.reg.GlobalMem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static config.Config.ALLOCAREGS;
import static config.Config.COMMENTNASM;
import static nasm.Utils.BasicBlockRenamer;
import static nasm.Utils.GlobalRenamer;

/** Translate IR to NASM assembly with infinite registers.
 * This AsmBuilder will contain comments, delete them later. */
public class AsmBuilder {
	public Map<String, AsmFunct> asmFuncts = new HashMap<>();
	
	// GlobalMem consists of globals and string literals.
	// map @a to _G_a.
	public Map<String, GlobalMem> globalMems = new HashMap<>();
	
	public Set<StringLiteral> strings = new HashSet<>();
	
	public AsmTranslateVisitor translator = new AsmTranslateVisitor();
	public AsmRegAllocator allocator = new AsmRegAllocator();
	
	
	public void TranslateIr(IrProg ir) {
		// config
		translator.ConfigTranslateContext(globalMems);
		strings.addAll(ir.stringPool.values());
		for (Reg g : ir.globals.values())
			globalMems.put(g.name, new GlobalMem(GlobalRenamer(g.name)));
		
		// build nasm. All regs are virtual by now, except global, string, allocated.
		// allocated has already been stackMem, but offset hasn't been set.
		for (IrFunct irFunct : ir.functs.values()) {
			
			// create and config asmfunct
			AsmFunct asmfunct = new AsmFunct(irFunct.name, irFunct.regArgs);
			asmFuncts.put(asmfunct.name, asmfunct);
			translator.ConfigAsmFunct(asmfunct);
			
			// create and translate each basic block.
			for (BasicBlock cur = irFunct.bbs.list.Head(); cur != null; cur = cur.next) {
				AsmBB asmCur = new AsmBB(BasicBlockRenamer(cur), asmfunct, cur.loopLevel);
				asmfunct.bbs.add(asmCur);
				translator.ConfigAsmBB(asmCur);
				translator.TranslateQuadList(cur.quads);
			}
			
			// maintain cfg.
			asmfunct.InitCFG(irFunct.bbs.cfg);
			
			// do technical function routine.
			// if asmFunct is main, call _init_ first.
			if (asmfunct.name.equals("main")) {
				int cnt = 0;
				asmfunct.bbs.get(0).insts.add(cnt++, new Msg(asmfunct.bbs.get(0), "BEGIN args pass\n"));
				asmfunct.bbs.get(0).insts.add(cnt++, new Msg(asmfunct.bbs.get(0), "END args pass\n"));
				asmfunct.bbs.get(0).insts.add(cnt++, new Call(asmfunct.bbs.get(0), "_init_", Boolean.FALSE));
			}

			translator.ArgsVirtualize();
			translator.x86_FormCheck();
			if (ALLOCAREGS)
				allocator.AllocateRegister(asmfunct);
			asmfunct.CalcStackOffset();
			translator.CallerCalleeSave();
			translator.AddPrologue();
			if (!COMMENTNASM)
				asmFuncts.values().forEach(Utils::DelMsg);
		}
	}
	
	public void Print (AsmPrinter printer) throws Exception {
		printer.PrintExtern();
		printer.PrintHeaders(asmFuncts, globalMems);
		printer.PrintSection(AsmPrinter.SECTION.TEXT);
		for (AsmFunct asmFunct : asmFuncts.values()) {
			printer.Print(asmFunct);
		}
		printer.PrintSection(AsmPrinter.SECTION.DATA);
		printer.PrintStringLabels(strings);
		printer.PrintSection(AsmPrinter.SECTION.bss);
		printer.PrintGVar(globalMems);
		printer.pasteLibFunction();
	}
}