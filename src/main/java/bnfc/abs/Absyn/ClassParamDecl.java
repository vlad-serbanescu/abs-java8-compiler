package bnfc.abs.Absyn; // Java Package generated by the BNF Converter.

public class ClassParamDecl extends Decl {
  public final Ann ann_;
  public final String uident_;
  public final ListParam listparam_;
  public final ListClassBody listclassbody_1, listclassbody_2;
  public final MaybeBlock maybeblock_;
  public ClassParamDecl(Ann p1, String p2, ListParam p3, ListClassBody p4, MaybeBlock p5, ListClassBody p6) { ann_ = p1; uident_ = p2; listparam_ = p3; listclassbody_1 = p4; maybeblock_ = p5; listclassbody_2 = p6; }

  public <R,A> R accept(bnfc.abs.Absyn.Decl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof bnfc.abs.Absyn.ClassParamDecl) {
      bnfc.abs.Absyn.ClassParamDecl x = (bnfc.abs.Absyn.ClassParamDecl)o;
      return this.ann_.equals(x.ann_) && this.uident_.equals(x.uident_) && this.listparam_.equals(x.listparam_) && this.listclassbody_1.equals(x.listclassbody_1) && this.maybeblock_.equals(x.maybeblock_) && this.listclassbody_2.equals(x.listclassbody_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(37*(37*(this.ann_.hashCode())+this.uident_.hashCode())+this.listparam_.hashCode())+this.listclassbody_1.hashCode())+this.maybeblock_.hashCode())+this.listclassbody_2.hashCode();
  }


}
