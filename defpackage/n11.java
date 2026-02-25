package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n11 {
    public final q8 a;
    public final c21 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final xn g;
    public final e30 h;
    public final jv i;
    public final long j;

    public n11(q8 q8Var, c21 c21Var, List list, int i, boolean z, int i2, xn xnVar, e30 e30Var, jv jvVar, long j) {
        this.a = q8Var;
        this.b = c21Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = xnVar;
        this.h = e30Var;
        this.i = jvVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n11)) {
            return false;
        }
        n11 n11Var = (n11) obj;
        return c10.i(this.a, n11Var.a) && c10.i(this.b, n11Var.b) && c10.i(this.c, n11Var.c) && this.d == n11Var.d && this.e == n11Var.e && this.f == n11Var.f && c10.i(this.g, n11Var.g) && this.h == n11Var.h && c10.i(this.i, n11Var.i) && gj.b(this.j, n11Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + b8.c(this.f, b8.d((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) mq0.n(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) gj.k(this.j)) + ')';
    }
}
