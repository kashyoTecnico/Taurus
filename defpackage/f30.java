package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f30 {
    public final int a;
    public final int b;
    public final boolean c;

    public f30(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return this.a == f30Var.a && this.b == f30Var.b && this.c == f30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b8.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
