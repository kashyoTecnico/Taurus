package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e11 {
    public static final e11 c = new e11(jp0.j(0), jp0.j(0));
    public final long a;
    public final long b;

    public e11(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e11)) {
            return false;
        }
        e11 e11Var = (e11) obj;
        return f21.a(this.a, e11Var.a) && f21.a(this.b, e11Var.b);
    }

    public final int hashCode() {
        g21[] g21VarArr = f21.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) f21.d(this.a)) + ", restLine=" + ((Object) f21.d(this.b)) + ')';
    }
}
