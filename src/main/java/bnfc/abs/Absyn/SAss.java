package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class SAss extends Stm {
  public final String lident_;
  public final Exp exp_;
  public SAss(String p1, Exp p2) { lident_ = p1; exp_ = p2; }

  public <R,A> R accept(bnfc.abs.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.SAss) {
      bnfc.abs.Absyn.SAss x = (bnfc.abs.Absyn.SAss)o;
      return this.lident_.equals(x.lident_) && this.exp_.equals(x.exp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.lident_.hashCode())+this.exp_.hashCode();
  }


}
