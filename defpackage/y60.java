package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y60 implements d30 {
    public final x60 d;

    public y60(x60 x60Var) {
        this.d = x60Var;
    }

    @Override // defpackage.d30
    public final long C(long j) {
        return ed0.g(this.d.r.C(j), a());
    }

    @Override // defpackage.d30
    public final boolean H() {
        return this.d.r.O0().q;
    }

    @Override // defpackage.d30
    public final void J(float[] fArr) {
        this.d.r.J(fArr);
    }

    @Override // defpackage.d30
    public final void K(d30 d30Var, float[] fArr) {
        this.d.r.K(d30Var, fArr);
    }

    @Override // defpackage.d30
    public final xl0 P(d30 d30Var, boolean z) {
        return this.d.r.P(d30Var, z);
    }

    @Override // defpackage.d30
    public final long Q() {
        x60 x60Var = this.d;
        return (x60Var.d << 32) | (x60Var.e & 4294967295L);
    }

    @Override // defpackage.d30
    public final long R(long j) {
        return this.d.r.R(ed0.g(j, a()));
    }

    public final long a() {
        x60 x60Var = this.d;
        x60 x60VarD = m20.D(x60Var);
        return ed0.f(b(x60VarD.u, 0L), x60Var.r.X0(x60VarD.r, 0L));
    }

    public final long b(d30 d30Var, long j) {
        boolean z = d30Var instanceof y60;
        x60 x60Var = this.d;
        if (!z) {
            x60 x60VarD = m20.D(x60Var);
            nc0 nc0Var = x60VarD.r;
            long jB = b(x60VarD.u, j);
            float f = (int) (x60VarD.s & 4294967295L);
            long jF = ed0.f(jB, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!nc0Var.O0().q) {
                pz.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            nc0Var.Y0();
            nc0 nc0Var2 = nc0Var.t;
            if (nc0Var2 != null) {
                nc0Var = nc0Var2;
            }
            return ed0.g(jF, nc0Var.X0(d30Var, 0L));
        }
        x60 x60Var2 = ((y60) d30Var).d;
        nc0 nc0Var3 = x60Var2.r;
        nc0Var3.Y0();
        x60 x60VarM0 = x60Var.r.K0(nc0Var3).M0();
        if (x60VarM0 != null) {
            long jB2 = m00.b(m00.c(x60Var2.G0(x60VarM0, false), c10.U(j)), x60Var.G0(x60VarM0, false));
            return (Float.floatToRawIntBits((int) (jB2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (jB2 & 4294967295L)) & 4294967295L);
        }
        x60 x60VarD2 = m20.D(x60Var2);
        long jC = m00.c(m00.c(x60Var2.G0(x60VarD2, false), x60VarD2.s), c10.U(j));
        x60 x60VarD3 = m20.D(x60Var);
        long jB3 = m00.b(jC, m00.c(x60Var.G0(x60VarD3, false), x60VarD3.s));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB3 >> 32));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jB3 & 4294967295L)) & 4294967295L;
        nc0 nc0Var4 = x60VarD3.r.t;
        c10.m(nc0Var4);
        nc0 nc0Var5 = x60VarD2.r.t;
        c10.m(nc0Var5);
        return nc0Var4.X0(nc0Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.d30
    public final long d(long j) {
        return this.d.r.d(ed0.g(0L, a()));
    }

    @Override // defpackage.d30
    public final long h(long j) {
        return ed0.g(this.d.r.h(j), a());
    }

    @Override // defpackage.d30
    public final long i(long j) {
        return this.d.r.i(ed0.g(j, a()));
    }

    @Override // defpackage.d30
    public final d30 m() {
        x60 x60VarM0;
        if (!H()) {
            pz.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        nc0 nc0Var = this.d.r.r.G.d.t;
        if (nc0Var == null || (x60VarM0 = nc0Var.M0()) == null) {
            return null;
        }
        return x60VarM0.u;
    }

    @Override // defpackage.d30
    public final long v(d30 d30Var, long j) {
        return b(d30Var, j);
    }
}
