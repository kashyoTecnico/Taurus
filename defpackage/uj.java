package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public uj(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uj)) {
            return false;
        }
        uj ujVar = (uj) obj;
        return bf.c(this.a, ujVar.a) && bf.c(this.b, ujVar.b) && bf.c(this.c, ujVar.c) && bf.c(this.d, ujVar.d) && bf.c(this.e, ujVar.e);
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.e) + b8.e(this.d, b8.e(this.c, b8.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        b8.l(this.a, sb, ", textColor=");
        b8.l(this.b, sb, ", iconColor=");
        b8.l(this.c, sb, ", disabledTextColor=");
        b8.l(this.d, sb, ", disabledIconColor=");
        sb.append((Object) bf.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
