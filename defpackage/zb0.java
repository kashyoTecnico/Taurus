package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zb0 extends gv0 {
    public final iw e;
    public final gv0 f;

    public zb0(long j, lv0 lv0Var, iw iwVar, gv0 gv0Var) {
        super(j, lv0Var);
        this.e = iwVar;
        this.f = gv0Var;
        gv0Var.k();
    }

    @Override // defpackage.gv0
    public final void c() {
        gv0 gv0Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != gv0Var.g()) {
            a();
        }
        gv0Var.l();
        this.c = true;
        synchronized (ov0.c) {
            o();
        }
    }

    @Override // defpackage.gv0
    public final iw e() {
        return this.e;
    }

    @Override // defpackage.gv0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gv0
    public final iw i() {
        return null;
    }

    @Override // defpackage.gv0
    public final void k() {
        dp0.k();
        throw null;
    }

    @Override // defpackage.gv0
    public final void l() {
        dp0.k();
        throw null;
    }

    @Override // defpackage.gv0
    public final void n(dx0 dx0Var) {
        mv0 mv0Var = ov0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.gv0
    public final gv0 u(iw iwVar) {
        return new zb0(this.b, this.a, ov0.l(iwVar, this.e, true), this.f);
    }

    @Override // defpackage.gv0
    public final void m() {
    }
}
