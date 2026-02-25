package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x11 {
    public final long a;
    public final long b;

    public x11(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x11)) {
            return false;
        }
        x11 x11Var = (x11) obj;
        return bf.c(this.a, x11Var.a) && bf.c(this.b, x11Var.b);
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        b8.l(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) bf.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
