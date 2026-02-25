package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sy {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof sy) {
            return this.a == ((sy) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
