package opt.optimizers;

import ir.IrProg;
import ir.quad.Ret;
import ir.structure.BasicBlock;
import ir.structure.IrFunct;

public class ControlFlowCleaner {
	public void ClearBeforeRet (IrProg ir) {
		for (IrFunct funct : ir.functs.values()) {
			for (BasicBlock cur = funct.bbs.list.Head(); cur != null; cur = cur.next) {
				for (int i = 0; i < cur.quads.size(); ++i) {
					if (cur.quads.get(i) instanceof Ret) {
						i++;
						while (i < cur.quads.size())
							cur.quads.remove(i);
					}
				}
			}
		}
	}
	
	// assume cfg has been built
	public void ClearUselessBB(IrProg ir) {
		for (IrFunct funct : ir.functs.values()) {
			// traverse bbs
			for (BasicBlock cur = funct.bbs.list.Head(); cur != null; cur = cur.next) {
				// if a basic block has neither predecessor nor successor, delete it.
				if (cur != funct.bbs.list.Head() && funct.bbs.cfg.predesessors.get(cur).size() + funct.bbs.cfg.successors.get(cur).size() == 0) {
					funct.bbs.list.Remove(cur);
				}
			}
		}
	}
}