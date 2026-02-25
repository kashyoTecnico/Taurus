package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sg0 {
    public String a;
    public c21 b;
    public jv c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public xn i;
    public d6 j;
    public boolean k;
    public x80 m;
    public rg0 n;
    public e30 o;
    public long h = tz.a;
    public long l = d80.e(0, 0);
    public long p = hj.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public sg0(String str, c21 c21Var, jv jvVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = c21Var;
        this.c = jvVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, e30 e30Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int iE = mq0.e(b(hj.a(0, i, 0, Integer.MAX_VALUE), e30Var).b());
        this.q = i;
        this.r = iE;
        return iE;
    }

    public final d6 b(long j, e30 e30Var) {
        rg0 rg0VarE = e(e30Var);
        long jE = c10.E(j, this.e, this.d, rg0VarE.c());
        boolean z = this.e;
        int i = this.d;
        int i2 = this.f;
        return new d6((h6) rg0VarE, ((z || i != 2) && i2 >= 1) ? i2 : 1, i == 2 ? 2 : 1, jE);
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = hj.h(0, 0, 0, 0);
        this.l = d80.e(0, 0);
        this.k = false;
    }

    public final void d(xn xnVar) {
        long jA;
        xn xnVar2 = this.i;
        if (xnVar != null) {
            int i = tz.b;
            jA = tz.a(xnVar.b(), xnVar.k());
        } else {
            jA = tz.a;
        }
        if (xnVar2 == null) {
            this.i = xnVar;
            this.h = jA;
        } else if (xnVar == null || this.h != jA) {
            this.i = xnVar;
            this.h = jA;
            c();
        }
    }

    public final rg0 e(e30 e30Var) {
        rg0 h6Var = this.n;
        if (h6Var == null || e30Var != this.o || h6Var.b()) {
            this.o = e30Var;
            String str = this.a;
            c21 c21VarI = dp0.i(this.b, e30Var);
            xn xnVar = this.i;
            c10.m(xnVar);
            jv jvVar = this.c;
            ks ksVar = ks.d;
            h6Var = new h6(str, c21VarI, ksVar, ksVar, jvVar, xnVar);
        }
        this.n = h6Var;
        return h6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = tz.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
