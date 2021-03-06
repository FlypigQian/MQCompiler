package ir.quad;

import ir.Printer;
import ir.structure.BasicBlock;
import ir.structure.IrValue;
import ir.structure.Reg;
import nasm.AsmTranslateVisitor;

import java.util.List;

public class Binary extends Quad {
  public enum Op {
    ADD, SUB, MUL, DIV, MOD,
    SHL, SHR,
    AND, XOR, OR,
    GT, GE, LT, LE,
	  EQ, NE,
    LAND, LOR // logical AND & OR.
  }

  // ans is val instead of addr.
  public Reg ans;
  public Op op;
  public IrValue src1;
  public IrValue src2;

  public Binary(Reg ans, Op op, IrValue src1, IrValue src2) {
    this.ans = ans;
    this.op = op;
    this.src1 = src1;
    this.src2 = src2;
  }
	
	public Binary(BasicBlock blk, Reg ans, Op op, IrValue src1, IrValue src2) {
  	this.blk = blk;
		this.ans = ans;
		this.op = op;
		this.src1 = src1;
		this.src2 = src2;
	}
  
  @Override
  public Reg GetDefReg() {
    return ans;
  }
	
	@Override
	public void GetUseRegs(List<Reg> list_) {
  	if (src1 instanceof Reg) list_.add((Reg) src1);
		if (src2 instanceof Reg) list_.add((Reg) src2);
	}
	
	/**
	 * Applied in ConstantPropagation and CopyPropagation.
	 *
	 * @param v
	 * @param val
	 */
	@Override
	public void ReplaceUse(Reg v, IrValue val) {
		boolean replace = false;
		if (src1 == v) {
			src1 = val;
			replace = true;
		}
		if (src2 == v) {
			src2 = val;
			replace = true;
		}
		assert replace;
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
