package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ys implements u61 {
    public final u61 a;
    public final u61 b;

    public ys(u61 u61Var, u61 u61Var2) {
        this.a = u61Var;
        this.b = u61Var2;
    }

    @Override // defpackage.u61
    public final int a(xn xnVar) {
        int iA = this.a.a(xnVar) - this.b.a(xnVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.u61
    public final int b(xn xnVar) {
        int iB = this.a.b(xnVar) - this.b.b(xnVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.u61
    public final int c(xn xnVar, e30 e30Var) {
        int iC = this.a.c(xnVar, e30Var) - this.b.c(xnVar, e30Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.u61
    public final int d(xn xnVar, e30 e30Var) {
        int iD = this.a.d(xnVar, e30Var) - this.b.d(xnVar, e30Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return c10.i(ysVar.a, this.a) && c10.i(ysVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
