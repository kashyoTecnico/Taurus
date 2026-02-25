package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ds0 implements p90 {
    public long d = 0;
    public final /* synthetic */ as0 e;
    public final /* synthetic */ ys0 f;
    public final /* synthetic */ long g;

    public ds0(as0 as0Var, ys0 ys0Var, long j) {
        this.e = as0Var;
        this.f = ys0Var;
        this.g = j;
    }

    @Override // defpackage.p90
    public final void c() {
        xr0 xr0Var = ((zs0) this.f).h;
        if (xr0Var != null) {
            xr0Var.a();
        }
    }

    @Override // defpackage.p90
    public final boolean d(long j, tr0 tr0Var) {
        d30 d30Var = (d30) this.e.a();
        if (d30Var == null || !d30Var.H()) {
            return false;
        }
        zs0 zs0Var = (zs0) this.f;
        uj0 uj0Var = zs0Var.f;
        if (uj0Var != null) {
            uj0Var.j(Boolean.FALSE, d30Var, new ed0(j), tr0Var);
        }
        this.d = j;
        return at0.a(zs0Var, this.g);
    }

    @Override // defpackage.p90
    public final boolean f(long j, tr0 tr0Var) {
        d30 d30Var = (d30) this.e.a();
        if (d30Var == null) {
            return true;
        }
        if (!d30Var.H()) {
            return false;
        }
        ys0 ys0Var = this.f;
        if (!at0.a(ys0Var, this.g)) {
            return false;
        }
        if (!((zs0) ys0Var).b(d30Var, j, this.d, tr0Var, false)) {
            return true;
        }
        this.d = j;
        return true;
    }
}
