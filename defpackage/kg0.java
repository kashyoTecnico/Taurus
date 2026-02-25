package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kg0 extends d90 implements l30 {
    public jg0 r;

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        float f = 0;
        if (Float.compare(this.r.b(n80Var.getLayoutDirection()), f) < 0 || Float.compare(this.r.d(), f) < 0 || Float.compare(this.r.c(n80Var.getLayoutDirection()), f) < 0 || Float.compare(this.r.a(), f) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iN = n80Var.N(this.r.c(n80Var.getLayoutDirection())) + n80Var.N(this.r.b(n80Var.getLayoutDirection()));
        int iN2 = n80Var.N(this.r.a()) + n80Var.N(this.r.d());
        oi0 oi0VarE = g80Var.e(hj.i(j, -iN, -iN2));
        return n80Var.a0(hj.g(j, oi0VarE.d + iN), hj.f(j, oi0VarE.e + iN2), ls.d, new u7(oi0VarE, n80Var, this, 7));
    }
}
