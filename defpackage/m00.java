package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m00 {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m00) {
            return this.a == ((m00) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return b8.h(sb, (int) (j & 4294967295L), ')');
    }
}
