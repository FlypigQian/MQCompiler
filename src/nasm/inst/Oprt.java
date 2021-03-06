package nasm.inst;

import nasm.AsmBB;
import nasm.AsmPrinter;
import nasm.reg.AsmReg;

public class Oprt extends Inst {
	
	public enum Op {
		ADD, SUB,
		IMUL, IDIV,
		AND, OR, XOR,
		SHL, SAR,
		NEG, BIT_NOT,
		INC
	}
	public Op op;
	public Boolean isDiv = null;
	
	public Oprt(AsmReg dst, AsmReg src, AsmBB blk, Op op) {
		super(dst, src, blk);
		this.op = op;
	}
	
	public Oprt(AsmReg dst, AsmBB blk, Op op) {
		super(dst, null, blk);
		assert op == Op.NEG || op == Op.BIT_NOT || op == Op.INC;
		this.op = op;
	}
	
	@Override
	public void AcceptPrint(AsmPrinter printer) {
		printer.Print(this);
	}
}
