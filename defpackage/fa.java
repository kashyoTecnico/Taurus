package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fa extends d90 implements qq, cd0 {
    public long r;
    public ju0 s;
    public long t;
    public e30 u;
    public nf0 v;
    public ju0 w;

    @Override // defpackage.cd0
    public final void J() {
        this.t = 9205357640488583168L;
        this.u = null;
        this.v = null;
        this.w = null;
        m20.F(this);
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        v30 v30Var2;
        fd fdVar = v30Var.d;
        if (this.s != nm.h) {
            v30Var2 = v30Var;
            dm0 dm0Var = new dm0();
            if (yu0.a(fdVar.c(), this.t) && v30Var2.getLayoutDirection() == this.u && c10.i(this.w, this.s)) {
                nf0 nf0Var = this.v;
                c10.m(nf0Var);
                dm0Var.d = nf0Var;
            } else {
                c4.A(this, new ea(dm0Var, this, v30Var2, 0));
            }
            this.v = (nf0) dm0Var.d;
            this.t = fdVar.c();
            this.u = v30Var2.getLayoutDirection();
            this.w = this.s;
            Object obj = dm0Var.d;
            c10.m(obj);
            nf0 nf0Var2 = (nf0) obj;
            if (!bf.c(this.r, bf.g)) {
                r31.x(v30Var2, nf0Var2, this.r);
            }
        } else if (bf.c(this.r, bf.g)) {
            v30Var2 = v30Var;
        } else {
            v30Var2 = v30Var;
            sq.E(v30Var2, this.r, 0L, 126);
        }
        v30Var2.a();
    }
}
