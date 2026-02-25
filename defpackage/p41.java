package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p41 extends d90 implements l30 {
    public float r;
    public float s;

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        int iB0 = g80Var.b0(i);
        int iN = !kp.a(this.s, Float.NaN) ? v60Var.N(this.s) : 0;
        return iB0 < iN ? iN : iB0;
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        int iS = g80Var.S(i);
        int iN = !kp.a(this.r, Float.NaN) ? v60Var.N(this.r) : 0;
        return iS < iN ? iN : iS;
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        int iJ;
        int i = 0;
        if (kp.a(this.r, Float.NaN) || gj.j(j) != 0) {
            iJ = gj.j(j);
        } else {
            iJ = n80Var.N(this.r);
            int iH = gj.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
            if (iJ < 0) {
                iJ = 0;
            }
        }
        int iH2 = gj.h(j);
        if (kp.a(this.s, Float.NaN) || gj.i(j) != 0) {
            i = gj.i(j);
        } else {
            int iN = n80Var.N(this.s);
            int iG = gj.g(j);
            if (iN > iG) {
                iN = iG;
            }
            if (iN >= 0) {
                i = iN;
            }
        }
        oi0 oi0VarE = g80Var.e(hj.a(iJ, iH2, i, gj.g(j)));
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new t6(oi0VarE, 10));
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        int iX = g80Var.X(i);
        int iN = !kp.a(this.r, Float.NaN) ? v60Var.N(this.r) : 0;
        return iX < iN ? iN : iX;
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        int iF = g80Var.f(i);
        int iN = !kp.a(this.s, Float.NaN) ? v60Var.N(this.s) : 0;
        return iF < iN ? iN : iF;
    }
}
