package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rm extends d90 implements qq {
    public final fa0 r;
    public boolean s;
    public boolean t;
    public boolean u;

    public rm(fa0 fa0Var) {
        this.r = fa0Var;
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        v30Var.a();
        fd fdVar = v30Var.d;
        if (this.s) {
            sq.E(v30Var, bf.b(bf.b, 0.3f), fdVar.c(), 122);
        } else if (this.t || this.u) {
            sq.E(v30Var, bf.b(bf.b, 0.1f), fdVar.c(), 122);
        }
    }

    @Override // defpackage.d90
    public final void s0() {
        nm.z(o0(), null, new qm(this, null, 0), 3);
    }
}
