package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b41 {
    public final c21 a;
    public final c21 b;
    public final c21 c;
    public final c21 d;
    public final c21 e;
    public final c21 f;
    public final c21 g;
    public final c21 h;
    public final c21 i;
    public final c21 j;
    public final c21 k;
    public final c21 l;
    public final c21 m;
    public final c21 n;
    public final c21 o;

    public b41(c21 c21Var, int i) {
        c21 c21Var2 = d41.d;
        c21 c21Var3 = d41.e;
        c21 c21Var4 = d41.f;
        c21 c21Var5 = d41.g;
        c21 c21Var6 = d41.h;
        c21 c21Var7 = d41.i;
        c21 c21Var8 = d41.m;
        c21 c21Var9 = d41.n;
        c21 c21Var10 = d41.o;
        c21Var = (i & 512) != 0 ? d41.a : c21Var;
        c21 c21Var11 = d41.b;
        c21 c21Var12 = d41.c;
        c21 c21Var13 = d41.j;
        c21 c21Var14 = d41.k;
        c21 c21Var15 = d41.l;
        this.a = c21Var2;
        this.b = c21Var3;
        this.c = c21Var4;
        this.d = c21Var5;
        this.e = c21Var6;
        this.f = c21Var7;
        this.g = c21Var8;
        this.h = c21Var9;
        this.i = c21Var10;
        this.j = c21Var;
        this.k = c21Var11;
        this.l = c21Var12;
        this.m = c21Var13;
        this.n = c21Var14;
        this.o = c21Var15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return c10.i(this.a, b41Var.a) && c10.i(this.b, b41Var.b) && c10.i(this.c, b41Var.c) && c10.i(this.d, b41Var.d) && c10.i(this.e, b41Var.e) && c10.i(this.f, b41Var.f) && c10.i(this.g, b41Var.g) && c10.i(this.h, b41Var.h) && c10.i(this.i, b41Var.i) && c10.i(this.j, b41Var.j) && c10.i(this.k, b41Var.k) && c10.i(this.l, b41Var.l) && c10.i(this.m, b41Var.m) && c10.i(this.n, b41Var.n) && c10.i(this.o, b41Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}
