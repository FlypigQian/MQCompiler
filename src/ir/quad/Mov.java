package ir.quad;

import ir.Printer;
import ir.structure.BasicBlock;
import ir.structure.IrValue;
import ir.structure.Reg;
import nasm.AsmTranslateVisitor;

import java.util.List;

/**
 * A Quad used by tmp construction.
 * */
public class Mov extends Quad {
	public Reg dst;
	public IrValue src;
	
	public Mov(Reg dst, IrValue src) {
		this.dst = dst;
		this.src = src;
	}
	
	public Mov(BasicBlock blk, Reg dst, IrValue src) {
		this.blk = blk;
		this.dst = dst;
		this.src = src;
	}
	
	@Override
	public Reg GetDefReg() {
		return dst;
	}
	@Override
	public void GetUseRegs(List<Reg> list_) {
		if (src instanceof Reg)
			list_.add((Reg) src);
	}
	@Override
	public void ReplaceUse(Reg v, IrValue c) {
		assert src == v;
		src = c;
	}
	
	@Override
	public void AcceptPrint(Printer printer) {
		printer.print(this);
	}
	
	@Override
	public void AcceptTranslator(AsmTranslateVisitor translator) {
		translator.visit(this);
	}
}
