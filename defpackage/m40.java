package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m40 extends d90 implements pi, xw, ln {
    public z5 r;
    public r40 s;
    public u01 t;
    public final zg0 u = qo0.n(null);

    public m40(z5 z5Var, r40 r40Var, u01 u01Var) {
        this.r = z5Var;
        this.s = r40Var;
        this.t = u01Var;
    }

    @Override // defpackage.d90
    public final void s0() {
        z5 z5Var = this.r;
        if (z5Var.a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        z5Var.a = this;
    }

    @Override // defpackage.d90
    public final void t0() {
        this.r.k(this);
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        this.u.setValue(nc0Var);
    }
}
