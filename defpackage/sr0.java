package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sr0 {
    public final rr0 a;
    public final rr0 b;
    public final boolean c;

    public sr0(rr0 rr0Var, rr0 rr0Var2, boolean z) {
        this.a = rr0Var;
        this.b = rr0Var2;
        this.c = z;
    }

    public static sr0 a(sr0 sr0Var, rr0 rr0Var, rr0 rr0Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            rr0Var = sr0Var.a;
        }
        if ((i & 2) != 0) {
            rr0Var2 = sr0Var.b;
        }
        if ((i & 4) != 0) {
            z = sr0Var.c;
        }
        sr0Var.getClass();
        return new sr0(rr0Var, rr0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr0)) {
            return false;
        }
        sr0 sr0Var = (sr0) obj;
        return c10.i(this.a, sr0Var.a) && c10.i(this.b, sr0Var.b) && this.c == sr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
