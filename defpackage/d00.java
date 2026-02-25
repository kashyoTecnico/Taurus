package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d00 {
    public static final d00 e = new d00(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static d00 a(d00 d00Var, d00 d00Var2) {
        return b(Math.min(d00Var.a, d00Var2.a), Math.min(d00Var.b, d00Var2.b), Math.min(d00Var.c, d00Var2.c), Math.min(d00Var.d, d00Var2.d));
    }

    public static d00 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new d00(i, i2, i3, i4);
    }

    public static d00 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d00.class != obj.getClass()) {
            return false;
        }
        d00 d00Var = (d00) obj;
        return this.d == d00Var.d && this.a == d00Var.a && this.c == d00Var.c && this.b == d00Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return b8.h(sb, this.d, '}');
    }
}
