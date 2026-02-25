package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e01 extends y20 implements iw {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(float f, za0 za0Var) {
        super(1);
        this.f = f;
        this.g = za0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                long j = ((yu0) obj).a;
                float fD = yu0.d(j);
                float f = this.f;
                float f2 = fD * f;
                float fB = yu0.b(j) * f;
                za0 za0Var = (za0) this.g;
                if (yu0.d(((yu0) za0Var.getValue()).a) != f2 || yu0.b(((yu0) za0Var.getValue()).a) != fB) {
                    za0Var.setValue(new yu0(dq0.a(f2, fB)));
                }
                return j41.a;
            default:
                long jLongValue = ((Number) obj).longValue();
                e31 e31Var = (e31) this.g;
                zg0 zg0Var = e31Var.i;
                xg0 xg0Var = e31Var.e;
                if (!((Boolean) zg0Var.getValue()).booleanValue()) {
                    if (((rv0) ov0.t(xg0Var.e, xg0Var)).c == Long.MIN_VALUE) {
                        xg0Var.g(jLongValue);
                        ((zg0) e31Var.a.e).setValue(Boolean.TRUE);
                    }
                    long jRound = jLongValue - ((rv0) ov0.t(xg0Var.e, xg0Var)).c;
                    float f3 = this.f;
                    if (f3 != 0.0f) {
                        double d = jRound / f3;
                        if (Double.isNaN(d)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        jRound = Math.round(d);
                    }
                    e31Var.d.g(jRound);
                    e31Var.e(jRound, f3 == 0.0f);
                }
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(e31 e31Var, float f) {
        super(1);
        this.g = e31Var;
        this.f = f;
    }
}
