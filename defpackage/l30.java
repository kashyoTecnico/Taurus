package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface l30 extends ln {
    default int C(v60 v60Var, g80 g80Var, int i) {
        return e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, qc0.d, rc0.e, 2), hj.b(i, 0, 13)).c();
    }

    default int P(v60 v60Var, g80 g80Var, int i) {
        return e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, qc0.d, rc0.d, 2), hj.b(0, i, 7)).e();
    }

    m80 e(n80 n80Var, g80 g80Var, long j);

    default int f(v60 v60Var, g80 g80Var, int i) {
        return e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, qc0.e, rc0.d, 2), hj.b(0, i, 7)).e();
    }

    default int m(v60 v60Var, g80 g80Var, int i) {
        return e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, qc0.e, rc0.e, 2), hj.b(i, 0, 13)).c();
    }
}
