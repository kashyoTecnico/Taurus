package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c21 {
    public static final c21 d = new c21(0, 0, null, 0, 0, 0, 16777215);
    public final iw0 a;
    public final tg0 b;
    public final ej0 c;

    public c21(iw0 iw0Var, tg0 tg0Var, ej0 ej0Var) {
        this.a = iw0Var;
        this.b = tg0Var;
        this.c = ej0Var;
    }

    public static c21 a(c21 c21Var, long j, long j2, zv zvVar, vy0 vy0Var, long j3, long j4, p50 p50Var, int i) {
        ja jaVar;
        d11 d11Var;
        long j5;
        ej0 ej0Var = b10.i;
        long jA = (i & 1) != 0 ? c21Var.a.a.a() : j;
        long j6 = (i & 2) != 0 ? c21Var.a.b : j2;
        zv zvVar2 = (i & 4) != 0 ? c21Var.a.c : zvVar;
        iw0 iw0Var = c21Var.a;
        xv xvVar = iw0Var.d;
        yv yvVar = iw0Var.e;
        vy0 vy0Var2 = (i & 32) != 0 ? iw0Var.f : vy0Var;
        String str = iw0Var.g;
        long j7 = (i & 128) != 0 ? iw0Var.h : j3;
        ja jaVar2 = iw0Var.i;
        d11 d11Var2 = iw0Var.j;
        d60 d60Var = iw0Var.k;
        long j8 = iw0Var.l;
        uz0 uz0Var = iw0Var.m;
        hu0 hu0Var = iw0Var.n;
        tq tqVar = iw0Var.p;
        tg0 tg0Var = c21Var.b;
        int i2 = tg0Var.a;
        int i3 = tg0Var.b;
        if ((i & 131072) != 0) {
            jaVar = jaVar2;
            d11Var = d11Var2;
            j5 = tg0Var.c;
        } else {
            jaVar = jaVar2;
            d11Var = d11Var2;
            j5 = j4;
        }
        e11 e11Var = tg0Var.d;
        ej0 ej0Var2 = (i & 524288) != 0 ? c21Var.c : ej0Var;
        return new c21(new iw0(bf.c(jA, iw0Var.a.a()) ? iw0Var.a : jA != 16 ? new qf(jA) : b11.a, j6, zvVar2, xvVar, yvVar, vy0Var2, str, j7, jaVar, d11Var, d60Var, j8, uz0Var, hu0Var, ej0Var2 != null ? ej0Var2.a : null, tqVar), new tg0(i2, i3, j5, e11Var, ej0Var2 != null ? ej0Var2.b : null, (i & 1048576) != 0 ? tg0Var.f : p50Var, tg0Var.g, tg0Var.h, tg0Var.i), ej0Var2);
    }

    public static c21 e(c21 c21Var, long j, long j2, vy0 vy0Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? f21.c : j2;
        vy0 vy0Var2 = (i2 & 32) != 0 ? null : vy0Var;
        long j6 = (i2 & 128) != 0 ? f21.c : j3;
        long j7 = bf.g;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? f21.c : j4;
        iw0 iw0VarA = jw0.a(c21Var.a, j, null, Float.NaN, j5, null, null, null, vy0Var2, null, j6, null, null, null, j7, null, null, null, null);
        tg0 tg0VarA = ug0.a(c21Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (c21Var.a == iw0VarA && c21Var.b == tg0VarA) ? c21Var : new c21(iw0VarA, tg0VarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(c21 c21Var) {
        if (this != c21Var) {
            return c10.i(this.b, c21Var.b) && this.a.a(c21Var.a);
        }
        return true;
    }

    public final c21 d(c21 c21Var) {
        return (c21Var == null || c21Var.equals(d)) ? this : new c21(this.a.c(c21Var.a), this.b.a(c21Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c21)) {
            return false;
        }
        c21 c21Var = (c21) obj;
        return c10.i(this.a, c21Var.a) && c10.i(this.b, c21Var.b) && c10.i(this.c, c21Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ej0 ej0Var = this.c;
        return iHashCode + (ej0Var != null ? ej0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) bf.i(b()));
        sb.append(", brush=");
        iw0 iw0Var = this.a;
        sb.append(iw0Var.a.b());
        sb.append(", alpha=");
        sb.append(iw0Var.a.c());
        sb.append(", fontSize=");
        sb.append((Object) f21.d(iw0Var.b));
        sb.append(", fontWeight=");
        sb.append(iw0Var.c);
        sb.append(", fontStyle=");
        sb.append(iw0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(iw0Var.e);
        sb.append(", fontFamily=");
        sb.append(iw0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(iw0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) f21.d(iw0Var.h));
        sb.append(", baselineShift=");
        sb.append(iw0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(iw0Var.j);
        sb.append(", localeList=");
        sb.append(iw0Var.k);
        sb.append(", background=");
        b8.l(iw0Var.l, sb, ", textDecoration=");
        sb.append(iw0Var.m);
        sb.append(", shadow=");
        sb.append(iw0Var.n);
        sb.append(", drawStyle=");
        sb.append(iw0Var.p);
        sb.append(", textAlign=");
        tg0 tg0Var = this.b;
        sb.append((Object) oz0.a(tg0Var.a));
        sb.append(", textDirection=");
        sb.append((Object) xz0.a(tg0Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) f21.d(tg0Var.c));
        sb.append(", textIndent=");
        sb.append(tg0Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(tg0Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) k50.a(tg0Var.g));
        sb.append(", hyphens=");
        sb.append((Object) py.a(tg0Var.h));
        sb.append(", textMotion=");
        sb.append(tg0Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c21(iw0 iw0Var, tg0 tg0Var) {
        zi0 zi0Var = iw0Var.o;
        vi0 vi0Var = tg0Var.e;
        this(iw0Var, tg0Var, (zi0Var == null && vi0Var == null) ? null : new ej0(zi0Var, vi0Var));
    }

    public c21(long j, long j2, zv zvVar, long j3, int i, long j4, int i2) {
        this(new iw0((i2 & 1) != 0 ? bf.g : j, (i2 & 2) != 0 ? f21.c : j2, (i2 & 4) != 0 ? null : zvVar, (xv) null, (yv) null, (i2 & 32) != 0 ? null : vy0.a, (String) null, (i2 & 128) != 0 ? f21.c : j3, (ja) null, (d11) null, (d60) null, bf.g, (uz0) null, (hu0) null, (zi0) null), new tg0((32768 & i2) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i2 & 131072) != 0 ? f21.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
