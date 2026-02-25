package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pa implements h2 {
    public final float a;

    public pa(float f) {
        this.a = f;
    }

    @Override // defpackage.h2
    public final long a(long j, long j2, e30 e30Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1;
        int iRound = Math.round((this.a + f) * (((int) (j3 >> 32)) / 2.0f));
        return (Math.round((f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f)) & 4294967295L) | (iRound << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa) && Float.compare(this.a, ((pa) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
