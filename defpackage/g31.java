package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g31 extends ya0 {
    public final ya0 o;
    public final boolean p;
    public final boolean q;
    public iw r;
    public iw s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public g31(ya0 ya0Var, iw iwVar, iw iwVar2, boolean z, boolean z2) {
        iw iwVarI;
        iw iwVarY;
        mv0 mv0Var = ov0.a;
        super(0L, lv0.h, ov0.l(iwVar, (ya0Var == null || (iwVarY = ya0Var.e()) == null) ? ov0.j.e : iwVarY, z), ov0.b(iwVar2, (ya0Var == null || (iwVarI = ya0Var.i()) == null) ? ov0.j.f : iwVarI));
        this.o = ya0Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = dq0.d();
    }

    @Override // defpackage.ya0
    public final void B(ua0 ua0Var) {
        dp0.k();
        throw null;
    }

    @Override // defpackage.ya0
    public final ya0 C(iw iwVar, iw iwVar2) {
        iw iwVarL = ov0.l(iwVar, this.r, true);
        iw iwVarB = ov0.b(iwVar2, this.s);
        return !this.p ? new g31(D().C(null, iwVarB), iwVarL, iwVarB, false, true) : D().C(iwVarL, iwVarB);
    }

    public final ya0 D() {
        ya0 ya0Var = this.o;
        return ya0Var == null ? ov0.j : ya0Var;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void c() {
        ya0 ya0Var;
        this.c = true;
        if (!this.q || (ya0Var = this.o) == null) {
            return;
        }
        ya0Var.c();
    }

    @Override // defpackage.gv0
    public final lv0 d() {
        return D().d();
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final iw e() {
        return this.r;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.gv0
    public final long g() {
        return D().g();
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final int h() {
        return D().h();
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final iw i() {
        return this.s;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void k() {
        dp0.k();
        throw null;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void l() {
        dp0.k();
        throw null;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void m() {
        D().m();
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void n(dx0 dx0Var) {
        D().n(dx0Var);
    }

    @Override // defpackage.gv0
    public final void r(lv0 lv0Var) {
        dp0.k();
        throw null;
    }

    @Override // defpackage.gv0
    public final void s(long j) {
        dp0.k();
        throw null;
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.ya0, defpackage.gv0
    public final gv0 u(iw iwVar) {
        iw iwVarL = ov0.l(iwVar, this.r, true);
        return !this.p ? ov0.h(D().u(null), iwVarL, true) : D().u(iwVarL);
    }

    @Override // defpackage.ya0
    public final mq0 w() {
        return D().w();
    }

    @Override // defpackage.ya0
    public final ua0 x() {
        return D().x();
    }

    @Override // defpackage.ya0
    /* renamed from: y */
    public final iw e() {
        return this.r;
    }
}
