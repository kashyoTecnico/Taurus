package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class an implements g80 {
    public final /* synthetic */ int d;
    public final g80 e;
    public final Enum f;
    public final Enum g;

    public /* synthetic */ an(g80 g80Var, Enum r2, Enum r3, int i) {
        this.d = i;
        this.e = g80Var;
        this.f = r2;
        this.g = r3;
    }

    @Override // defpackage.g80
    public final int S(int i) {
        switch (this.d) {
        }
        return this.e.S(i);
    }

    @Override // defpackage.g80
    public final int X(int i) {
        switch (this.d) {
        }
        return this.e.X(i);
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        switch (this.d) {
        }
        return this.e.b0(i);
    }

    @Override // defpackage.g80
    public final oi0 e(long j) {
        switch (this.d) {
            case 0:
                y00 y00Var = (y00) this.f;
                z00 z00Var = (z00) this.g;
                z00 z00Var2 = z00.d;
                y00 y00Var2 = y00.e;
                g80 g80Var = this.e;
                if (z00Var == z00Var2) {
                    return new lt(y00Var == y00Var2 ? g80Var.X(gj.g(j)) : g80Var.S(gj.g(j)), gj.c(j) ? gj.g(j) : 32767, 0);
                }
                return new lt(gj.d(j) ? gj.h(j) : 32767, y00Var == y00Var2 ? g80Var.f(gj.h(j)) : g80Var.b0(gj.h(j)), 0);
            case 1:
                o80 o80Var = (o80) this.f;
                p80 p80Var = (p80) this.g;
                p80 p80Var2 = p80.d;
                o80 o80Var2 = o80.e;
                g80 g80Var2 = this.e;
                if (p80Var == p80Var2) {
                    return new lt(o80Var == o80Var2 ? g80Var2.X(gj.g(j)) : g80Var2.S(gj.g(j)), gj.c(j) ? gj.g(j) : 32767, 1);
                }
                return new lt(gj.d(j) ? gj.h(j) : 32767, o80Var == o80Var2 ? g80Var2.f(gj.h(j)) : g80Var2.b0(gj.h(j)), 1);
            default:
                qc0 qc0Var = (qc0) this.f;
                rc0 rc0Var = (rc0) this.g;
                rc0 rc0Var2 = rc0.d;
                qc0 qc0Var2 = qc0.e;
                g80 g80Var3 = this.e;
                if (rc0Var == rc0Var2) {
                    return new lt(qc0Var == qc0Var2 ? g80Var3.X(gj.g(j)) : g80Var3.S(gj.g(j)), gj.c(j) ? gj.g(j) : 32767, 2);
                }
                return new lt(gj.d(j) ? gj.h(j) : 32767, qc0Var == qc0Var2 ? g80Var3.f(gj.h(j)) : g80Var3.b0(gj.h(j)), 2);
        }
    }

    @Override // defpackage.g80
    public final int f(int i) {
        switch (this.d) {
        }
        return this.e.f(i);
    }

    @Override // defpackage.g80
    public final Object l() {
        switch (this.d) {
        }
        return this.e.l();
    }
}
