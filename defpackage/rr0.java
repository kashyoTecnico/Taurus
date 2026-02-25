package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rr0 {
    public final um0 a;
    public final int b;
    public final long c;

    public rr0(um0 um0Var, int i, long j) {
        this.a = um0Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr0)) {
            return false;
        }
        rr0 rr0Var = (rr0) obj;
        return this.a == rr0Var.a && this.b == rr0Var.b && this.c == rr0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b8.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
