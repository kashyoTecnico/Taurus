package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v30 implements sq {
    public final fd d = new fd();
    public qq e;

    @Override // defpackage.xn
    public final float A(float f) {
        return this.d.b() * f;
    }

    @Override // defpackage.sq
    public final e9 D() {
        return this.d.e;
    }

    @Override // defpackage.xn
    public final float I(long j) {
        return this.d.I(j);
    }

    @Override // defpackage.sq
    public final void L(long j, long j2, long j3, int i) {
        this.d.L(j, j2, j3, i);
    }

    @Override // defpackage.xn
    public final int N(float f) {
        return this.d.N(f);
    }

    @Override // defpackage.sq
    public final void O(r5 r5Var, long j, long j2, float f, ta taVar) {
        this.d.O(r5Var, j, j2, f, taVar);
    }

    @Override // defpackage.sq
    public final long T() {
        return this.d.T();
    }

    @Override // defpackage.sq
    public final void V(i6 i6Var, long j) {
        this.d.V(i6Var, j);
    }

    @Override // defpackage.xn
    public final long W(long j) {
        return this.d.W(j);
    }

    @Override // defpackage.xn
    public final float Z(long j) {
        return this.d.Z(j);
    }

    public final void a() {
        fd fdVar = this.d;
        dd ddVarO = fdVar.e.o();
        ln lnVar = this.e;
        if (lnVar == null) {
            throw b8.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        d90 d90Var = (d90) lnVar;
        d90 d90VarI = d90Var.d.i;
        if (d90VarI == null || (d90VarI.g & 4) == 0) {
            d90VarI = null;
        } else {
            while (d90VarI != null) {
                int i = d90VarI.f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    d90VarI = d90VarI.i;
                }
            }
            d90VarI = null;
        }
        if (d90VarI == null) {
            nc0 nc0VarX = d80.x(lnVar, 4);
            if (nc0VarX.O0() == d90Var.d) {
                nc0VarX = nc0VarX.s;
                c10.m(nc0VarX);
            }
            nc0VarX.d1(ddVarO, (fx) fdVar.e.b);
            return;
        }
        eb0 eb0Var = null;
        while (d90VarI != null) {
            if (d90VarI instanceof qq) {
                qq qqVar = (qq) d90VarI;
                fx fxVar = (fx) fdVar.e.b;
                nc0 nc0VarX2 = d80.x(qqVar, 4);
                long jF = d80.F(nc0VarX2.f);
                t30 t30Var = nc0VarX2.r;
                t30Var.getClass();
                ((p3) r31.U(t30Var)).getSharedDrawScope().d(ddVarO, jF, nc0VarX2, qqVar, fxVar);
            } else if ((d90VarI.f & 4) != 0 && (d90VarI instanceof mn)) {
                int i2 = 0;
                for (d90 d90Var2 = ((mn) d90VarI).s; d90Var2 != null; d90Var2 = d90Var2.i) {
                    if ((d90Var2.f & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            d90VarI = d90Var2;
                        } else {
                            if (eb0Var == null) {
                                eb0Var = new eb0(new d90[16]);
                            }
                            if (d90VarI != null) {
                                eb0Var.b(d90VarI);
                                d90VarI = null;
                            }
                            eb0Var.b(d90Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            d90VarI = d80.i(eb0Var);
        }
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.sq
    public final long c() {
        return this.d.c();
    }

    public final void d(dd ddVar, long j, nc0 nc0Var, qq qqVar, fx fxVar) {
        qq qqVar2 = this.e;
        this.e = qqVar;
        e30 e30Var = nc0Var.r.A;
        fd fdVar = this.d;
        e9 e9Var = fdVar.e;
        ed edVar = ((fd) e9Var.c).d;
        xn xnVar = edVar.a;
        e30 e30Var2 = edVar.b;
        dd ddVarO = e9Var.o();
        e9 e9Var2 = fdVar.e;
        long jS = e9Var2.s();
        fx fxVar2 = (fx) e9Var2.b;
        e9Var2.A(nc0Var);
        e9Var2.B(e30Var);
        e9Var2.z(ddVar);
        e9Var2.C(j);
        e9Var2.b = fxVar;
        ddVar.l();
        try {
            qqVar.d(this);
            ddVar.i();
            e9Var2.A(xnVar);
            e9Var2.B(e30Var2);
            e9Var2.z(ddVarO);
            e9Var2.C(jS);
            e9Var2.b = fxVar2;
            this.e = qqVar2;
        } catch (Throwable th) {
            ddVar.i();
            e9Var2.A(xnVar);
            e9Var2.B(e30Var2);
            e9Var2.z(ddVarO);
            e9Var2.C(jS);
            e9Var2.b = fxVar2;
            throw th;
        }
    }

    @Override // defpackage.xn
    public final long f0(float f) {
        return this.d.f0(f);
    }

    @Override // defpackage.sq
    public final void g(i6 i6Var, ac acVar, float f, tq tqVar, int i) {
        this.d.g(i6Var, acVar, f, tqVar, i);
    }

    @Override // defpackage.sq
    public final e30 getLayoutDirection() {
        return this.d.d.b;
    }

    @Override // defpackage.xn
    public final float j0(int i) {
        return this.d.j0(i);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.d.k();
    }

    @Override // defpackage.xn
    public final float l0(float f) {
        return f / this.d.b();
    }

    @Override // defpackage.sq
    public final void m0(long j, float f, float f2, long j2, long j3, tq tqVar) {
        this.d.m0(j, f, f2, j2, j3, tqVar);
    }

    @Override // defpackage.sq
    public final void p(float f, long j, long j2) {
        this.d.p(f, j, j2);
    }

    @Override // defpackage.sq
    public final void w(long j, long j2, long j3, long j4) {
        this.d.w(j, j2, j3, j4);
    }

    @Override // defpackage.xn
    public final long x(float f) {
        return this.d.x(f);
    }

    @Override // defpackage.xn
    public final long y(long j) {
        return this.d.y(j);
    }
}
