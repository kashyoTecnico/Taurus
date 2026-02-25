package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r40 {
    public wz0 a;
    public final nl0 b;
    public final cw0 c;
    public final xz d;
    public j11 e;
    public final zg0 f;
    public final zg0 g;
    public d30 h;
    public final zg0 i;
    public q8 j;
    public final zg0 k;
    public final zg0 l;
    public final zg0 m;
    public final zg0 n;
    public final zg0 o;
    public boolean p;
    public final zg0 q;
    public final e9 r;
    public iw s;
    public final xk t;
    public final xk u;
    public final a6 v;
    public long w;
    public final zg0 x;
    public final zg0 y;

    public r40(wz0 wz0Var, nl0 nl0Var, cw0 cw0Var) {
        this.a = wz0Var;
        this.b = nl0Var;
        this.c = cw0Var;
        xz xzVar = new xz(5);
        q8 q8Var = s8.a;
        long j = w11.b;
        a11 a11Var = new a11(q8Var, j, (w11) null);
        xzVar.e = a11Var;
        xzVar.f = new jr(q8Var, a11Var.b);
        this.d = xzVar;
        Boolean bool = Boolean.FALSE;
        this.f = qo0.n(bool);
        this.g = qo0.n(new kp(0));
        this.i = qo0.n(null);
        this.k = qo0.n(px.d);
        this.l = qo0.n(bool);
        this.m = qo0.n(bool);
        this.n = qo0.n(bool);
        this.o = qo0.n(bool);
        this.p = true;
        this.q = qo0.n(Boolean.TRUE);
        e9 e9Var = new e9();
        e9Var.a = cw0Var;
        this.r = e9Var;
        this.s = e3.I;
        this.t = new xk(this, 5);
        this.u = new xk(this, 4);
        this.v = c10.d();
        this.w = bf.g;
        this.x = qo0.n(new w11(j));
        this.y = qo0.n(new w11(j));
    }

    public final px a() {
        return (px) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final d30 c() {
        d30 d30Var = this.h;
        if (d30Var == null || !d30Var.H()) {
            return null;
        }
        return d30Var;
    }

    public final p11 d() {
        return (p11) this.i.getValue();
    }

    public final void e(long j) {
        this.y.setValue(new w11(j));
    }

    public final void f(long j) {
        this.x.setValue(new w11(j));
    }
}
