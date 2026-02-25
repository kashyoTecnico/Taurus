package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w60 extends ni0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ w60(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.xn
    public final float b() {
        switch (this.e) {
            case 0:
                return ((v60) this.f).b();
            default:
                return ((p3) this.f).getDensity().b();
        }
    }

    @Override // defpackage.ni0
    public float d(ly lyVar) {
        float fIntBitsToFloat;
        int iY0;
        switch (this.e) {
            case 0:
                kw kwVar = lyVar.a;
                if (kwVar != null) {
                    return ((Number) kwVar.e(this, Float.valueOf(Float.NaN))).floatValue();
                }
                v60 v60Var = (v60) this.f;
                if (v60Var.n) {
                    return Float.NaN;
                }
                v60 v60Var2 = v60Var;
                while (true) {
                    po0 po0Var = v60Var2.p;
                    if (!Float.isNaN((po0Var == null || (iY0 = y9.y0(po0Var.b, lyVar)) < 0) ? Float.NaN : po0Var.c[iY0])) {
                        v60Var2.k0(v60Var.v0(), lyVar);
                        d30 d30VarT0 = v60Var2.t0();
                        d30 d30VarT02 = v60Var.t0();
                        switch (lyVar.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (d30VarT02.v(d30VarT0, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (d30VarT0.Q() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (d30VarT02.v(d30VarT0, (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(((int) (d30VarT0.Q() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    v60 v60VarX0 = v60Var2.x0();
                    if (v60VarX0 == null) {
                        v60Var2.k0(v60Var.v0(), lyVar);
                        return Float.NaN;
                    }
                    v60Var2 = v60VarX0;
                }
                break;
            default:
                return super.d(lyVar);
        }
    }

    @Override // defpackage.ni0
    public final e30 e() {
        switch (this.e) {
            case 0:
                return ((v60) this.f).getLayoutDirection();
            default:
                return ((p3) this.f).getLayoutDirection();
        }
    }

    @Override // defpackage.ni0
    public final int f() {
        switch (this.e) {
            case 0:
                return ((v60) this.f).d0();
            default:
                return ((p3) this.f).getRoot().H.p.d;
        }
    }

    @Override // defpackage.xn
    public final float k() {
        switch (this.e) {
            case 0:
                return ((v60) this.f).k();
            default:
                return ((p3) this.f).getDensity().k();
        }
    }
}
