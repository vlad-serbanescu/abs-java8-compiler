package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class SIf extends Stm {
  public final PureExp pureexp_;
  public final Stm stm_;
  public SIf(PureExp p1, Stm p2) { pureexp_ = p1; stm_ = p2; }

  public <R,A> R accept(bnfc.abs.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.SIf) {
      bnfc.abs.Absyn.SIf x = (bnfc.abs.Absyn.SIf)o;
      return this.pureexp_.equals(x.pureexp_) && this.stm_.equals(x.stm_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.pureexp_.hashCode())+this.stm_.hashCode();
  }


}
