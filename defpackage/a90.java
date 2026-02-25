package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a90 extends d90 implements pi, l30 {
    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        float f = ((kp) l81.A(this, w00.a)).d;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        oi0 oi0VarE = g80Var.e(j);
        boolean z = this.q && !Float.isNaN(f) && Float.compare(f, f2) > 0;
        int iN = Float.isNaN(f) ? 0 : n80Var.N(f);
        int iMax = z ? Math.max(oi0VarE.d, iN) : oi0VarE.d;
        int iMax2 = z ? Math.max(oi0VarE.e, iN) : oi0VarE.e;
        return n80Var.a0(iMax, iMax2, ls.d, new z80(iMax, oi0VarE, iMax2));
    }
}
