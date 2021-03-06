package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class Mod extends Module {
  public final QU qu_;
  public final ListExport listexport_;
  public final ListImport listimport_;
  public final ListAnnDecl listanndecl_;
  public final MaybeBlock maybeblock_;
  public Mod(QU p1, ListExport p2, ListImport p3, ListAnnDecl p4, MaybeBlock p5) { qu_ = p1; listexport_ = p2; listimport_ = p3; listanndecl_ = p4; maybeblock_ = p5; }

  public <R,A> R accept(bnfc.abs.Absyn.Module.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.Mod) {
      bnfc.abs.Absyn.Mod x = (bnfc.abs.Absyn.Mod)o;
      return this.qu_.equals(x.qu_) && this.listexport_.equals(x.listexport_) && this.listimport_.equals(x.listimport_) && this.listanndecl_.equals(x.listanndecl_) && this.maybeblock_.equals(x.maybeblock_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(37*(this.qu_.hashCode())+this.listexport_.hashCode())+this.listimport_.hashCode())+this.listanndecl_.hashCode())+this.maybeblock_.hashCode();
  }


}
