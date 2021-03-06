package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class SCase extends Stm {
  public final PureExp pureexp_;
  public final ListSCaseBranch listscasebranch_;
  public SCase(PureExp p1, ListSCaseBranch p2) { pureexp_ = p1; listscasebranch_ = p2; }

  public <R,A> R accept(bnfc.abs.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.SCase) {
      bnfc.abs.Absyn.SCase x = (bnfc.abs.Absyn.SCase)o;
      return this.pureexp_.equals(x.pureexp_) && this.listscasebranch_.equals(x.listscasebranch_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.pureexp_.hashCode())+this.listscasebranch_.hashCode();
  }


}
