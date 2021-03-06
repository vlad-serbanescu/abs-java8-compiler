package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class AnyExport extends Export {
  public final ListQA listqa_;
  public AnyExport(ListQA p1) { listqa_ = p1; }

  public <R,A> R accept(bnfc.abs.Absyn.Export.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.AnyExport) {
      bnfc.abs.Absyn.AnyExport x = (bnfc.abs.Absyn.AnyExport)o;
      return this.listqa_.equals(x.listqa_);
    }
    return false;
  }

  public int hashCode() {
    return this.listqa_.hashCode();
  }


}
