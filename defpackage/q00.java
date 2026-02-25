package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q00 {
    public static final q00 e = new q00(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public q00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return this.a == q00Var.a && this.b == q00Var.b && this.c == q00Var.c && this.d == q00Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b8.c(this.c, b8.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return b8.h(sb, this.d, ')');
    }
}
