package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class UA extends QA {
  public final String u_;
  public UA(String p1) { u_ = p1; }

  public <R,A> R accept(bnfc.abs.Absyn.QA.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.UA) {
      bnfc.abs.Absyn.UA x = (bnfc.abs.Absyn.UA)o;
      return this.u_.equals(x.u_);
    }
    return false;
  }

  public int hashCode() {
    return this.u_.hashCode();
  }


}