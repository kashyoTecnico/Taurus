package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a10 extends d90 implements l30 {
    public int r;
    public boolean s;

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        return g80Var.b0(i);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        return this.r == 1 ? g80Var.S(i) : g80Var.X(i);
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        int iS = this.r == 1 ? g80Var.S(gj.g(j)) : g80Var.X(gj.g(j));
        if (iS < 0) {
            iS = 0;
        }
        if (iS < 0) {
            rz.a("width must be >= 0");
        }
        long jH = hj.h(iS, iS, 0, Integer.MAX_VALUE);
        if (this.s) {
            jH = hj.e(j, jH);
        }
        oi0 oi0VarE = g80Var.e(jH);
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new t6(oi0VarE, 2));
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        return this.r == 1 ? g80Var.S(i) : g80Var.X(i);
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        return g80Var.f(i);
    }
}
