package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h31 extends gv0 {
    public final gv0 e;
    public final boolean f;
    public final boolean g;
    public iw h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h31(gv0 gv0Var, iw iwVar, boolean z, boolean z2) {
        iw iwVarE;
        super(0L, lv0.h);
        mv0 mv0Var = ov0.a;
        this.e = gv0Var;
        this.f = z;
        this.g = z2;
        this.h = ov0.l(iwVar, (gv0Var == null || (iwVarE = gv0Var.e()) == null) ? ov0.j.e : iwVarE, z);
        this.i = dq0.d();
    }

    @Override // defpackage.gv0
    public final void c() {
        gv0 gv0Var;
        this.c = true;
        if (!this.g || (gv0Var = this.e) == null) {
            return;
        }
        gv0Var.c();
    }

    @Override // defpackage.gv0
    public final lv0 d() {
        return v().d();
    }

    @Override // defpackage.gv0
    public final iw e() {
        return this.h;
    }

    @Override // defpackage.gv0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.gv0
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // defpackage.gv0
    public final void n(dx0 dx0Var) {
        v().n(dx0Var);
    }

    @Override // defpackage.gv0
    public final gv0 u(iw iwVar) {
        iw iwVarL = ov0.l(iwVar, this.h, true);
        return !this.f ? ov0.h(v().u(null), iwVarL, true) : v().u(iwVarL);
    }

    public final gv0 v() {
        gv0 gv0Var = this.e;
        return gv0Var == null ? ov0.j : gv0Var;
    }
}
