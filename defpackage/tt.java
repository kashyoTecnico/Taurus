package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tt implements rt {
    public final int a;
    public final int b;
    public final yq c;
    public final long d;
    public final long e;

    public tt(int i, int i2, yq yqVar) {
        this.a = i;
        this.b = i2;
        this.c = yqVar;
        this.d = i * 1000000;
        this.e = i2 * 1000000;
    }

    @Override // defpackage.rt
    public final float b(long j, float f, float f2, float f3) {
        float fV = this.a == 0 ? 1.0f : c10.v(j - this.e, 0L, this.d) / this.d;
        if (fV < 0.0f) {
            fV = 0.0f;
        }
        float fA = this.c.a(fV <= 1.0f ? fV : 1.0f);
        q31 q31Var = y41.a;
        return (f2 * fA) + ((1 - fA) * f);
    }

    @Override // defpackage.rt
    public final float c(long j, float f, float f2, float f3) {
        long jV = c10.v(j - this.e, 0L, this.d);
        if (jV < 0) {
            return 0.0f;
        }
        if (jV == 0) {
            return f3;
        }
        return (b(jV, f, f2, f3) - b(jV - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.rt
    public final long d(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }
}
