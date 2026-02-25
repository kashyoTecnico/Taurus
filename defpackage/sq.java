package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface sq extends xn {
    static /* synthetic */ void E(sq sqVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = n0(sqVar.c(), 0L);
        }
        sqVar.L(j, 0L, j2, (i & 64) != 0 ? 3 : 0);
    }

    static void F(v30 v30Var, ac acVar, long j, long j2, long j3, tq tqVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jN0 = (i & 4) != 0 ? n0(v30Var.d.c(), j4) : j2;
        tq tqVar2 = (i & 32) != 0 ? dt.a : tqVar;
        fd fdVar = v30Var.d;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        fdVar.d.c.j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jN0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jN0 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), fdVar.d(acVar, tqVar2, 1.0f, null, 3));
    }

    static /* synthetic */ void Y(sq sqVar, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = sqVar.T();
        }
        sqVar.p(f, j, j2);
    }

    static long n0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void t(sq sqVar, i6 i6Var, ac acVar, float f, qx0 qx0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        tq tqVar = qx0Var;
        if ((i & 8) != 0) {
            tqVar = dt.a;
        }
        sqVar.g(i6Var, acVar, f2, tqVar, (i & 32) != 0 ? 3 : 0);
    }

    static void z(sq sqVar, r5 r5Var, long j, float f, ta taVar, int i) {
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        sqVar.O(r5Var, j, j, f, taVar);
    }

    e9 D();

    void L(long j, long j2, long j3, int i);

    void O(r5 r5Var, long j, long j2, float f, ta taVar);

    default long T() {
        return dq0.g(D().s());
    }

    void V(i6 i6Var, long j);

    default long c() {
        return D().s();
    }

    void g(i6 i6Var, ac acVar, float f, tq tqVar, int i);

    e30 getLayoutDirection();

    void m0(long j, float f, float f2, long j2, long j3, tq tqVar);

    void p(float f, long j, long j2);

    void w(long j, long j2, long j3, long j4);
}
