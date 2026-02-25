package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class py {
    public final int a;

    public static String a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py) {
            return this.a == ((py) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
