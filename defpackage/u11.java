package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u11 {
    public static final u11 c = new u11(2, false);
    public static final u11 d = new u11(1, true);
    public final int a;
    public final boolean b;

    public u11(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u11)) {
            return false;
        }
        u11 u11Var = (u11) obj;
        return this.a == u11Var.a && this.b == u11Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
