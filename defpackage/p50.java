package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p50 {
    public static final p50 c = new p50(m50.c, 17);
    public final float a;
    public final int b;

    public p50(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        float f = p50Var.a;
        float f2 = m50.b;
        return Float.compare(this.a, f) == 0 && this.b == p50Var.b;
    }

    public final int hashCode() {
        float f = m50.b;
        return Integer.hashCode(0) + b8.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) m50.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
