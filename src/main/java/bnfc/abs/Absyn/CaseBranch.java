package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public abstract class CaseBranch implements java.io.Serializable {
  public abstract <R,A> R accept(CaseBranch.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(bnfc.abs.Absyn.CaseBranc p, A arg);

  }

}
