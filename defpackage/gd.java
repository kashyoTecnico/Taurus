package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gd(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return bf.c(this.a, gdVar.a) && bf.c(this.b, gdVar.b) && bf.c(this.c, gdVar.c) && bf.c(this.d, gdVar.d);
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.d) + b8.e(this.c, b8.e(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
