package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p8 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public p8(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        qz.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return c10.i(this.a, p8Var.a) && this.b == p8Var.b && this.c == p8Var.c && c10.i(this.d, p8Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + b8.c(this.c, b8.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public p8(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
