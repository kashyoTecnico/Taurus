package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oo0 extends d90 implements l30, j31 {
    public e00 r;
    public final j4 s;

    public oo0(e00 e00Var) {
        this.r = e00Var;
        this.s = new j4(18, this, e00Var);
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        oi0 oi0VarE = g80Var.e(j);
        return n80Var.M(oi0VarE.d, oi0VarE.e, ls.d, this.s, new t6(oi0VarE, 5));
    }

    @Override // defpackage.j31
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
