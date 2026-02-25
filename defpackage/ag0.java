package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ag0 {
    public final long a;
    public final jg0 b;

    public ag0() {
        long jD = r31.d(4284900966L);
        float f = 0;
        jg0 jg0Var = new jg0(f, f, f, f);
        this.a = jD;
        this.b = jg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ag0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c10.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        ag0 ag0Var = (ag0) obj;
        return bf.c(this.a, ag0Var.a) && c10.i(this.b, ag0Var.b);
    }

    public final int hashCode() {
        int i = bf.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        b8.l(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
