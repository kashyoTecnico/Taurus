package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qc extends d90 implements cd0, jc, qq {
    public final rc r;
    public boolean s;
    public iw t;

    public qc(rc rcVar, iw iwVar) {
        this.r = rcVar;
        this.t = iwVar;
        rcVar.d = this;
    }

    public final void A0() {
        this.s = false;
        this.r.e = null;
        m20.F(this);
    }

    @Override // defpackage.cd0
    public final void J() {
        A0();
    }

    @Override // defpackage.ln, defpackage.qj0
    public final void a() {
        A0();
    }

    @Override // defpackage.jc
    public final xn b() {
        return d80.z(this).z;
    }

    @Override // defpackage.jc
    public final long c() {
        return d80.F(d80.x(this, 128).f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [iw, y20] */
    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        boolean z = this.s;
        rc rcVar = this.r;
        if (!z) {
            rcVar.e = null;
            c4.A(this, new g3(4, this, rcVar));
            if (rcVar.e == null) {
                throw b8.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.s = true;
        }
        rq rqVar = rcVar.e;
        c10.m(rqVar);
        rqVar.a.g(v30Var);
    }

    @Override // defpackage.jc
    public final e30 getLayoutDirection() {
        return d80.z(this).A;
    }

    @Override // defpackage.qq
    public final void h0() {
        A0();
    }

    @Override // defpackage.ln
    public final void k0() {
        A0();
    }

    @Override // defpackage.d90
    public final void u0() {
        A0();
    }

    @Override // defpackage.d90
    public final void t0() {
    }
}
