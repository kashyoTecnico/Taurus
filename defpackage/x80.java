package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x80 {
    public static x80 h;
    public final e30 a;
    public final c21 b;
    public final xn c;
    public final jv d;
    public final c21 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public x80(e30 e30Var, c21 c21Var, xn xnVar, jv jvVar) {
        this.a = e30Var;
        this.b = c21Var;
        this.c = xnVar;
        this.d = jvVar;
        this.e = dp0.i(c21Var, e30Var);
    }

    public final long a(long j, int i) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float fB = c4.e(y80.a, this.e, hj.b(0, 0, 15), this.c, this.d, 1, 96).b();
            float fB2 = c4.e(y80.b, this.e, hj.b(0, 0, 15), this.c, this.d, 2, 96).b() - fB;
            this.g = fB;
            this.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = gj.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = gj.i(j);
        }
        return hj.a(gj.j(j), gj.h(j), i2, gj.g(j));
    }
}
