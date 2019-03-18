package ast.node.dec.variable;

import ast.usage.AstBaseVisitor;

public class GlobalVarDec extends VarDecList {
  public GlobalVarDec(VarDecList varDecList) {
    super(varDecList);
    varDecList.varDecs.forEach(x -> x.isGlobal = true);
  }

  @Override
  protected String SelfDeclare() {
    return "GlobalVarDec: \n";
  }

  @Override
  public String PrettyPrint() {
    return Formatter(this, super.toString() + ";\n");
  }

  @Override
  public <T> T Accept(AstBaseVisitor<T> visitor) {
    return visitor.visit(this);
  }
}
