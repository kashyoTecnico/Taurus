package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n8 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public n8(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return c10.i(this.a, n8Var.a) && this.b == n8Var.b && this.c == n8Var.c && c10.i(this.d, n8Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + b8.c(this.c, b8.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}
