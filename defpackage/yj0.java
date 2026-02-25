package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yj0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public yj0(boolean z, nr0 nr0Var, boolean z2) {
        vi viVar = u6.a;
        int i = !z ? 262152 : 262144;
        i = nr0Var == nr0.e ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = nr0Var == nr0.d;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj;
        return this.a == yj0Var.a && this.b == yj0Var.b && this.c == yj0Var.c && this.d == yj0Var.d && this.e == yj0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + b8.d(b8.d(b8.d(b8.d(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
