package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i41 implements u61 {
    public final u61 a;
    public final u61 b;

    public i41(u61 u61Var, u61 u61Var2) {
        this.a = u61Var;
        this.b = u61Var2;
    }

    @Override // defpackage.u61
    public final int a(xn xnVar) {
        return Math.max(this.a.a(xnVar), this.b.a(xnVar));
    }

    @Override // defpackage.u61
    public final int b(xn xnVar) {
        return Math.max(this.a.b(xnVar), this.b.b(xnVar));
    }

    @Override // defpackage.u61
    public final int c(xn xnVar, e30 e30Var) {
        return Math.max(this.a.c(xnVar, e30Var), this.b.c(xnVar, e30Var));
    }

    @Override // defpackage.u61
    public final int d(xn xnVar, e30 e30Var) {
        return Math.max(this.a.d(xnVar, e30Var), this.b.d(xnVar, e30Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i41)) {
            return false;
        }
        i41 i41Var = (i41) obj;
        return c10.i(i41Var.a, this.a) && c10.i(i41Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
