package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sa implements h2 {
    public final float a;
    public final float b;

    public sa(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.h2
    public final long a(long j, long j2, e30 e30Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        e30 e30Var2 = e30.d;
        float f3 = this.a;
        if (e30Var != e30Var2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.b) * f2;
        int iRound = Math.round(f5);
        return (Math.round(f6) & 4294967295L) | (iRound << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return Float.compare(this.a, saVar.a) == 0 && Float.compare(this.b, saVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
