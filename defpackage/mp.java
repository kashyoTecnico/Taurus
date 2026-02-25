package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mp {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof mp) {
            return this.a == ((mp) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) kp.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) kp.b(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
