package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jl0 extends gv0 {
    public final iw e;
    public int f;

    public jl0(long j, lv0 lv0Var, iw iwVar) {
        super(j, lv0Var);
        this.e = iwVar;
        this.f = 1;
    }

    @Override // defpackage.gv0
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.gv0
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.gv0
    public final void n(dx0 dx0Var) {
        mv0 mv0Var = ov0.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.gv0
    public final gv0 u(iw iwVar) {
        ov0.d(this);
        return new zb0(this.b, this.a, ov0.l(iwVar, this.e, true), this);
    }

    @Override // defpackage.gv0
    public final void m() {
    }
}
