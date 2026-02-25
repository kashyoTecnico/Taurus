package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cs0 implements yz0 {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ as0 c;
    public final /* synthetic */ ys0 d;
    public final /* synthetic */ long e;

    public cs0(as0 as0Var, ys0 ys0Var, long j) {
        this.c = as0Var;
        this.d = ys0Var;
        this.e = j;
    }

    @Override // defpackage.yz0
    public final void a() {
        xr0 xr0Var;
        long j = this.e;
        ys0 ys0Var = this.d;
        if (!at0.a(ys0Var, j) || (xr0Var = ((zs0) ys0Var).h) == null) {
            return;
        }
        xr0Var.a();
    }

    @Override // defpackage.yz0
    public final void c(long j) {
        d30 d30Var = (d30) this.c.a();
        ys0 ys0Var = this.d;
        if (d30Var != null) {
            if (!d30Var.H()) {
                return;
            }
            tr0 tr0Var = g2.S;
            uj0 uj0Var = ((zs0) ys0Var).f;
            if (uj0Var != null) {
                uj0Var.j(Boolean.TRUE, d30Var, new ed0(j), tr0Var);
            }
            this.a = j;
        }
        if (at0.a(ys0Var, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.yz0
    public final void e(long j) {
        d30 d30Var = (d30) this.c.a();
        if (d30Var == null || !d30Var.H()) {
            return;
        }
        ys0 ys0Var = this.d;
        if (at0.a(ys0Var, this.e)) {
            long jG = ed0.g(this.b, j);
            this.b = jG;
            long jG2 = ed0.g(this.a, jG);
            if (((zs0) ys0Var).b(d30Var, jG2, this.a, g2.S, true)) {
                this.a = jG2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.yz0
    public final void onCancel() {
        xr0 xr0Var;
        long j = this.e;
        ys0 ys0Var = this.d;
        if (!at0.a(ys0Var, j) || (xr0Var = ((zs0) ys0Var).h) == null) {
            return;
        }
        xr0Var.a();
    }

    @Override // defpackage.yz0
    public final void b() {
    }

    @Override // defpackage.yz0
    public final void d() {
    }
}
