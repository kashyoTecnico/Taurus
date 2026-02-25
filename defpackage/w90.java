package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w90 {
    public q8 a;
    public c21 b;
    public jv c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public x80 h;
    public xn j;
    public g30 k;
    public e30 l;
    public o11 m;
    public long i = tz.a;
    public int n = -1;
    public int o = -1;

    public w90(q8 q8Var, c21 c21Var, jv jvVar, int i, boolean z, int i2, int i3) {
        this.a = q8Var;
        this.b = c21Var;
        this.c = jvVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, e30 e30Var) {
        int i2 = this.n;
        int i3 = this.o;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int iE = mq0.e(b(hj.a(0, i, 0, Integer.MAX_VALUE), e30Var).e);
        this.n = i;
        this.o = iE;
        return iE;
    }

    public final u90 b(long j, e30 e30Var) {
        g30 g30VarD = d(e30Var);
        long jE = c10.E(j, this.e, this.d, g30VarD.c());
        boolean z = this.e;
        int i = this.d;
        int i2 = this.f;
        if ((!z && i == 2) || i2 < 1) {
            i2 = 1;
        }
        return new u90(g30VarD, jE, i2, i == 2);
    }

    public final void c(xn xnVar) {
        long jA;
        xn xnVar2 = this.j;
        if (xnVar != null) {
            int i = tz.b;
            jA = tz.a(xnVar.b(), xnVar.k());
        } else {
            jA = tz.a;
        }
        if (xnVar2 == null) {
            this.j = xnVar;
            this.i = jA;
        } else if (xnVar == null || this.i != jA) {
            this.j = xnVar;
            this.i = jA;
            this.k = null;
            this.m = null;
            this.o = -1;
            this.n = -1;
        }
    }

    public final g30 d(e30 e30Var) {
        g30 g30Var = this.k;
        if (g30Var == null || e30Var != this.l || g30Var.b()) {
            this.l = e30Var;
            q8 q8Var = this.a;
            c21 c21VarI = dp0.i(this.b, e30Var);
            xn xnVar = this.j;
            c10.m(xnVar);
            g30Var = new g30(q8Var, c21VarI, ks.d, xnVar, this.c);
        }
        this.k = g30Var;
        return g30Var;
    }

    public final o11 e(e30 e30Var, long j, u90 u90Var) {
        float fMin = Math.min(u90Var.a.c(), u90Var.d);
        q8 q8Var = this.a;
        c21 c21Var = this.b;
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        xn xnVar = this.j;
        c10.m(xnVar);
        return new o11(new n11(q8Var, c21Var, ks.d, i, z, i2, xnVar, e30Var, this.c, j), u90Var, hj.d(j, d80.e(mq0.e(fMin), mq0.e(u90Var.e))));
    }
}
