package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class QA_ extends QA {
  public final String u_;
  public final QA qa_;
  public QA_(String p1, QA p2) { u_ = p1; qa_ = p2; }

  public <R,A> R accept(bnfc.abs.Absyn.QA.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.QA_) {
      bnfc.abs.Absyn.QA_ x = (bnfc.abs.Absyn.QA_)o;
      return this.u_.equals(x.u_) && this.qa_.equals(x.qa_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.u_.hashCode())+this.qa_.hashCode();
  }


}