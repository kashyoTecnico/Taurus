package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kp implements Comparable {
    public final float d;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.d, ((kp) obj).d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kp) {
            return Float.compare(this.d, ((kp) obj).d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return b(this.d);
    }
}
