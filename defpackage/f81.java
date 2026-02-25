package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f81 extends d90 implements l30 {
    public int r;
    public y20 s;

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        oi0 oi0VarE = g80Var.e(hj.a(this.r != 1 ? 0 : gj.j(j), gj.h(j), this.r == 2 ? gj.i(j) : 0, gj.g(j)));
        int iU = c10.u(oi0VarE.d, gj.j(j), gj.h(j));
        int iU2 = c10.u(oi0VarE.e, gj.i(j), gj.g(j));
        return n80Var.a0(iU, iU2, ls.d, new e81(this, iU, oi0VarE, iU2, n80Var));
    }
}
