package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class et extends d90 implements l30 {
    public int r;
    public float s;

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        if (!gj.d(j) || this.r == 1) {
            iJ = gj.j(j);
            iH = gj.h(j);
        } else {
            iJ = c10.u(Math.round(gj.h(j) * this.s), gj.j(j), gj.h(j));
            iH = iJ;
        }
        if (!gj.c(j) || this.r == 2) {
            i = gj.i(j);
            iG = gj.g(j);
        } else {
            i = c10.u(Math.round(gj.g(j) * this.s), gj.i(j), gj.g(j));
            iG = i;
        }
        oi0 oi0VarE = g80Var.e(hj.a(iJ, iH, i, iG));
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new t6(oi0VarE, 1));
    }
}
