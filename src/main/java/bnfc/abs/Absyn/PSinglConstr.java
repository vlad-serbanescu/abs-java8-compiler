package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class PSinglConstr extends Pattern {
  public final String uident_;
  public PSinglConstr(String p1) { uident_ = p1; }

  public <R,A> R accept(bnfc.abs.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.PSinglConstr) {
      bnfc.abs.Absyn.PSinglConstr x = (bnfc.abs.Absyn.PSinglConstr)o;
      return this.uident_.equals(x.uident_);
    }
    return false;
  }

  public int hashCode() {
    return this.uident_.hashCode();
  }


}
