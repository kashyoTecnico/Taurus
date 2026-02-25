package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class iw0 implements m8 {
    public final c11 a;
    public final long b;
    public final zv c;
    public final xv d;
    public final yv e;
    public final vy0 f;
    public final String g;
    public final long h;
    public final ja i;
    public final d11 j;
    public final d60 k;
    public final long l;
    public final uz0 m;
    public final hu0 n;
    public final zi0 o;
    public final tq p;

    public iw0(long j, long j2, zv zvVar, xv xvVar, yv yvVar, vy0 vy0Var, String str, long j3, ja jaVar, d11 d11Var, d60 d60Var, long j4, uz0 uz0Var, hu0 hu0Var, zi0 zi0Var) {
        this(j != 16 ? new qf(j) : b11.a, j2, zvVar, xvVar, yvVar, vy0Var, str, j3, jaVar, d11Var, d60Var, j4, uz0Var, hu0Var, zi0Var, null);
    }

    public final boolean a(iw0 iw0Var) {
        if (this == iw0Var) {
            return true;
        }
        return f21.a(this.b, iw0Var.b) && c10.i(this.c, iw0Var.c) && c10.i(this.d, iw0Var.d) && c10.i(this.e, iw0Var.e) && c10.i(this.f, iw0Var.f) && c10.i(this.g, iw0Var.g) && f21.a(this.h, iw0Var.h) && c10.i(this.i, iw0Var.i) && c10.i(this.j, iw0Var.j) && c10.i(this.k, iw0Var.k) && bf.c(this.l, iw0Var.l) && c10.i(this.o, iw0Var.o);
    }

    public final boolean b(iw0 iw0Var) {
        return c10.i(this.a, iw0Var.a) && c10.i(this.m, iw0Var.m) && c10.i(this.n, iw0Var.n) && c10.i(this.p, iw0Var.p);
    }

    public final iw0 c(iw0 iw0Var) {
        if (iw0Var == null) {
            return this;
        }
        c11 c11Var = iw0Var.a;
        return jw0.a(this, c11Var.a(), c11Var.b(), c11Var.c(), iw0Var.b, iw0Var.c, iw0Var.d, iw0Var.e, iw0Var.f, iw0Var.g, iw0Var.h, iw0Var.i, iw0Var.j, iw0Var.k, iw0Var.l, iw0Var.m, iw0Var.n, iw0Var.o, iw0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return a(iw0Var) && b(iw0Var);
    }

    public final int hashCode() {
        c11 c11Var = this.a;
        long jA = c11Var.a();
        int i = bf.h;
        int iHashCode = Long.hashCode(jA) * 31;
        ac acVarB = c11Var.b();
        int iHashCode2 = (Float.hashCode(c11Var.c()) + ((iHashCode + (acVarB != null ? acVarB.hashCode() : 0)) * 31)) * 31;
        g21[] g21VarArr = f21.b;
        int iE = b8.e(this.b, iHashCode2, 31);
        zv zvVar = this.c;
        int i2 = (iE + (zvVar != null ? zvVar.d : 0)) * 31;
        xv xvVar = this.d;
        int iHashCode3 = (i2 + (xvVar != null ? Integer.hashCode(xvVar.a) : 0)) * 31;
        yv yvVar = this.e;
        int iHashCode4 = (iHashCode3 + (yvVar != null ? Integer.hashCode(yvVar.a) : 0)) * 31;
        vy0 vy0Var = this.f;
        int iHashCode5 = (iHashCode4 + (vy0Var != null ? vy0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iE2 = b8.e(this.h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        ja jaVar = this.i;
        int iHashCode6 = (iE2 + (jaVar != null ? Float.hashCode(jaVar.a) : 0)) * 31;
        d11 d11Var = this.j;
        int iHashCode7 = (iHashCode6 + (d11Var != null ? d11Var.hashCode() : 0)) * 31;
        d60 d60Var = this.k;
        int iE3 = b8.e(this.l, (iHashCode7 + (d60Var != null ? d60Var.d.hashCode() : 0)) * 31, 31);
        uz0 uz0Var = this.m;
        int i3 = (iE3 + (uz0Var != null ? uz0Var.a : 0)) * 31;
        hu0 hu0Var = this.n;
        int iHashCode8 = (i3 + (hu0Var != null ? hu0Var.hashCode() : 0)) * 31;
        zi0 zi0Var = this.o;
        int iHashCode9 = (iHashCode8 + (zi0Var != null ? zi0Var.hashCode() : 0)) * 31;
        tq tqVar = this.p;
        return iHashCode9 + (tqVar != null ? tqVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        c11 c11Var = this.a;
        sb.append((Object) bf.i(c11Var.a()));
        sb.append(", brush=");
        sb.append(c11Var.b());
        sb.append(", alpha=");
        sb.append(c11Var.c());
        sb.append(", fontSize=");
        sb.append((Object) f21.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) f21.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        b8.l(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public iw0(c11 c11Var, long j, zv zvVar, xv xvVar, yv yvVar, vy0 vy0Var, String str, long j2, ja jaVar, d11 d11Var, d60 d60Var, long j3, uz0 uz0Var, hu0 hu0Var, zi0 zi0Var, tq tqVar) {
        this.a = c11Var;
        this.b = j;
        this.c = zvVar;
        this.d = xvVar;
        this.e = yvVar;
        this.f = vy0Var;
        this.g = str;
        this.h = j2;
        this.i = jaVar;
        this.j = d11Var;
        this.k = d60Var;
        this.l = j3;
        this.m = uz0Var;
        this.n = hu0Var;
        this.o = zi0Var;
        this.p = tqVar;
    }

    public iw0(long j, long j2, zv zvVar, xv xvVar, yv yvVar, vy0 vy0Var, String str, long j3, ja jaVar, d11 d11Var, d60 d60Var, long j4, uz0 uz0Var, hu0 hu0Var, int i) {
        this((i & 1) != 0 ? bf.g : j, (i & 2) != 0 ? f21.c : j2, (i & 4) != 0 ? null : zvVar, (i & 8) != 0 ? null : xvVar, (i & 16) != 0 ? null : yvVar, (i & 32) != 0 ? null : vy0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? f21.c : j3, (i & 256) != 0 ? null : jaVar, (i & 512) != 0 ? null : d11Var, (i & 1024) != 0 ? null : d60Var, (i & 2048) != 0 ? bf.g : j4, (i & 4096) != 0 ? null : uz0Var, (i & 8192) != 0 ? null : hu0Var, (zi0) null);
    }
}
