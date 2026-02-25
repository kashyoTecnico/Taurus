package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n30 extends nc0 {
    public static final a6 T;
    public l30 R;
    public m30 S;

    static {
        a6 a6VarD = c10.d();
        a6VarD.e(bf.e);
        a6VarD.a.setStrokeWidth(1.0f);
        a6VarD.i(1);
        T = a6VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n30(t30 t30Var, l30 l30Var) {
        super(t30Var);
        this.R = l30Var;
        this.S = t30Var.j != null ? new m30(this) : null;
        if ((((d90) l30Var).d.f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.nc0
    public final void J0() {
        if (this.S == null) {
            this.S = new m30(this);
        }
    }

    @Override // defpackage.nc0
    public final x60 M0() {
        return this.S;
    }

    @Override // defpackage.nc0
    public final d90 O0() {
        return ((d90) this.R).d;
    }

    @Override // defpackage.g80
    public final int S(int i) {
        l30 l30Var = this.R;
        nc0 nc0Var = this.s;
        c10.m(nc0Var);
        return l30Var.P(this, nc0Var, i);
    }

    @Override // defpackage.g80
    public final int X(int i) {
        l30 l30Var = this.R;
        nc0 nc0Var = this.s;
        c10.m(nc0Var);
        return l30Var.f(this, nc0Var, i);
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        l30 l30Var = this.R;
        nc0 nc0Var = this.s;
        c10.m(nc0Var);
        return l30Var.C(this, nc0Var, i);
    }

    @Override // defpackage.nc0
    public final void d1(dd ddVar, fx fxVar) {
        nc0 nc0Var;
        nc0 nc0Var2 = this.s;
        c10.m(nc0Var2);
        nc0Var2.H0(ddVar, fxVar);
        if (!((p3) r31.U(this.r)).getShowLayoutBounds() || (nc0Var = this.s) == null) {
            return;
        }
        if (t00.a(this.f, nc0Var.f) && m00.a(nc0Var.C, 0L)) {
            return;
        }
        long j = this.f;
        ddVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, T);
    }

    @Override // defpackage.g80
    public final oi0 e(long j) {
        i0(j);
        l30 l30Var = this.R;
        nc0 nc0Var = this.s;
        c10.m(nc0Var);
        h1(l30Var.e(this, nc0Var, j));
        Z0();
        return this;
    }

    @Override // defpackage.g80
    public final int f(int i) {
        l30 l30Var = this.R;
        nc0 nc0Var = this.s;
        c10.m(nc0Var);
        return l30Var.m(this, nc0Var, i);
    }

    @Override // defpackage.oi0
    public final void g0(long j, float f, iw iwVar) {
        e1(j, f, iwVar);
        if (this.m) {
            return;
        }
        a1();
        w0().b();
        c10.m(this.s);
    }

    @Override // defpackage.v60
    public final int o0(iy iyVar) {
        m30 m30Var = this.S;
        if (m30Var == null) {
            return c4.g(this, iyVar);
        }
        la0 la0Var = m30Var.w;
        int iD = la0Var.d(iyVar);
        if (iD >= 0) {
            return la0Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q1(l30 l30Var) {
        if (!l30Var.equals(this.R) && (((d90) l30Var).d.f & 512) != 0) {
            throw new ClassCastException();
        }
        this.R = l30Var;
    }
}
