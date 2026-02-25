package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w4 extends y20 implements iw {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(float f, r5 r5Var, ta taVar) {
        super(1);
        this.f = f;
        this.g = r5Var;
        this.h = taVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        long jRound;
        switch (this.e) {
            case 0:
                v30 v30Var = (v30) obj;
                v30Var.a();
                float f = this.f;
                r5 r5Var = (r5) this.g;
                ta taVar = (ta) this.h;
                fd fdVar = v30Var.d;
                e9 e9Var = fdVar.e;
                long jS = e9Var.s();
                e9Var.o().l();
                try {
                    r1 r1Var = (r1) e9Var.a;
                    r1Var.s(f, 0.0f);
                    dd ddVarO = ((e9) r1Var.e).o();
                    int i = (int) 0;
                    ddVarO.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i));
                    ddVarO.h();
                    ddVarO.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i));
                    fdVar.e(r5Var, taVar);
                    b8.m(e9Var, jS);
                    return j41.a;
                } catch (Throwable th) {
                    b8.m(e9Var, jS);
                    throw th;
                }
            default:
                long jLongValue = ((Number) obj).longValue();
                r41 r41Var = (r41) this.g;
                if (r41Var.b == Long.MIN_VALUE) {
                    r41Var.b = jLongValue;
                }
                float f2 = r41Var.e;
                g8 g8Var = new g8(f2);
                float f3 = this.f;
                g8 g8Var2 = r41.f;
                if (f3 == 0.0f) {
                    jRound = r41Var.a.b(new g8(f2), g8Var2, r41Var.c);
                } else {
                    double d = (jLongValue - r41Var.b) / f3;
                    if (Double.isNaN(d)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    jRound = Math.round(d);
                }
                long j = jRound;
                float f4 = ((g8) r41Var.a.o(j, g8Var, g8Var2, r41Var.c)).a;
                r41Var.c = (g8) r41Var.a.l(j, g8Var, g8Var2, r41Var.c);
                r41Var.b = jLongValue;
                float f5 = r41Var.e - f4;
                r41Var.e = f4;
                ((iw) this.h).g(Float.valueOf(f5));
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(r41 r41Var, float f, iw iwVar) {
        super(1);
        this.g = r41Var;
        this.f = f;
        this.h = iwVar;
    }
}
