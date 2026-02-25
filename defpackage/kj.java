package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kj {
    public final int a;
    public final long b;
    public final lj c;
    public final k51 d;

    public kj(int i, long j, lj ljVar, k51 k51Var) {
        this.a = i;
        this.b = j;
        this.c = ljVar;
        this.d = k51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj;
        return this.a == kjVar.a && this.b == kjVar.b && this.c == kjVar.c && c10.i(this.d, kjVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b8.e(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        k51 k51Var = this.d;
        return iHashCode + (k51Var == null ? 0 : k51Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
