package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class ENaryFunCall extends PureExp {
  public final QL ql_;
  public final ListPureExp listpureexp_;
  public ENaryFunCall(QL p1, ListPureExp p2) { ql_ = p1; listpureexp_ = p2; }

  public <R,A> R accept(bnfc.abs.Absyn.PureExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.ENaryFunCall) {
      bnfc.abs.Absyn.ENaryFunCall x = (bnfc.abs.Absyn.ENaryFunCall)o;
      return this.ql_.equals(x.ql_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ql_.hashCode())+this.listpureexp_.hashCode();
  }


}
