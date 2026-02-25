package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hu0 {
    public static final hu0 d = new hu0();
    public final long a;
    public final long b;
    public final float c;

    public hu0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu0)) {
            return false;
        }
        hu0 hu0Var = (hu0) obj;
        return bf.c(this.a, hu0Var.a) && ed0.b(this.b, hu0Var.b) && this.c == hu0Var.c;
    }

    public final int hashCode() {
        int i = bf.h;
        return Float.hashCode(this.c) + b8.e(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        b8.l(this.a, sb, ", offset=");
        sb.append((Object) ed0.i(this.b));
        sb.append(", blurRadius=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ hu0() {
        this(0.0f, r31.d(4278190080L), 0L);
    }
}
