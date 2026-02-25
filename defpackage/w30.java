package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w30 {
    public final t30 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public c70 q;
    public p30 d = p30.h;
    public final k80 p = new k80(this);

    public w30(t30 t30Var) {
        this.a = t30Var;
    }

    public final nc0 a() {
        return this.a.G.d;
    }

    public final void b() {
        p30 p30Var = this.a.H.d;
        p30 p30Var2 = p30.f;
        p30 p30Var3 = p30.g;
        if (p30Var == p30Var2 || p30Var == p30Var3) {
            if (this.p.C) {
                g(true);
            } else {
                f(true);
            }
        }
        if (p30Var == p30Var3) {
            c70 c70Var = this.q;
            if (c70Var == null || !c70Var.w) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        c70 c70Var = this.q;
        if (c70Var != null) {
            w30 w30Var = c70Var.i;
            w30Var.d = p30.e;
            k80 k80Var = w30Var.p;
            t30 t30Var = w30Var.a;
            w30Var.e = false;
            gg0 snapshotObserver = ((p3) r31.U(t30Var)).getSnapshotObserver();
            a70 a70Var = new a70(c70Var, j);
            snapshotObserver.getClass();
            if (t30Var.j != null) {
                snapshotObserver.a(t30Var, snapshotObserver.b, a70Var);
            } else {
                snapshotObserver.a(t30Var, snapshotObserver.c, a70Var);
            }
            w30Var.f = true;
            w30Var.g = true;
            if (b10.N(t30Var)) {
                k80Var.x = true;
                k80Var.y = true;
            } else {
                k80Var.w = true;
            }
            w30Var.d = p30.h;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            t30 t30VarT = this.a.t();
            w30 w30Var = t30VarT != null ? t30VarT.H : null;
            if (w30Var != null) {
                if (i == 0) {
                    w30Var.d(w30Var.l - 1);
                } else {
                    w30Var.d(w30Var.l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            t30 t30VarT = this.a.t();
            w30 w30Var = t30VarT != null ? t30VarT.H : null;
            if (w30Var != null) {
                if (i == 0) {
                    w30Var.e(w30Var.o - 1);
                } else {
                    w30Var.e(w30Var.o + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        k80 k80Var = this.p;
        w30 w30Var = k80Var.i;
        Object obj = k80Var.t;
        t30 t30Var = this.a;
        if ((obj != null || w30Var.a().l() != null) && k80Var.s) {
            k80Var.s = false;
            k80Var.t = w30Var.a().l();
            t30 t30VarT = t30Var.t();
            if (t30VarT != null) {
                t30.U(t30VarT, false, 7);
            }
        }
        c70 c70Var = this.q;
        if (c70Var != null) {
            w30 w30Var2 = c70Var.i;
            if (c70Var.y == null) {
                x60 x60VarM0 = w30Var2.a().M0();
                c10.m(x60VarM0);
                if (x60VarM0.r.l() == null) {
                    return;
                }
            }
            if (c70Var.x) {
                c70Var.x = false;
                x60 x60VarM02 = w30Var2.a().M0();
                c10.m(x60VarM02);
                c70Var.y = x60VarM02.r.l();
                if (b10.N(t30Var)) {
                    t30 t30VarT2 = t30Var.t();
                    if (t30VarT2 != null) {
                        t30.U(t30VarT2, false, 7);
                        return;
                    }
                    return;
                }
                t30 t30VarT3 = t30Var.t();
                if (t30VarT3 != null) {
                    t30.S(t30VarT3, false, 7);
                }
            }
        }
    }
}
