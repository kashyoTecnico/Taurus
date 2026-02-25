package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ey0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(int i, Object obj) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [iw, y20] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i = this.e;
        j41 j41Var = j41.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                d8 d8Var = (d8) obj;
                Object value = d8Var.e.getValue();
                q31 q31Var = y41.a;
                ((g4) obj2).e(value, Float.valueOf(((g8) d8Var.f).a));
                return j41Var;
            case 1:
                return ((y20) obj2).g(Long.valueOf(((Number) obj).longValue()));
            case 2:
                Throwable th = (Throwable) obj;
                oy0 oy0Var = (oy0) obj2;
                ad adVar = oy0Var.f;
                if (adVar != null) {
                    adVar.m(th);
                }
                oy0Var.f = null;
                return j41Var;
            case 3:
                float[] fArr = ((e80) obj).a;
                d30 d30Var = (d30) obj2;
                if (d30Var.H()) {
                    l81.C(d30Var).K(d30Var, fArr);
                }
                return j41Var;
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                s01 s01Var = (s01) obj2;
                vg0 vg0Var = s01Var.a;
                vg0 vg0Var2 = s01Var.a;
                float fG = vg0Var.g() + fFloatValue;
                vg0 vg0Var3 = s01Var.b;
                if (fG > vg0Var3.g()) {
                    fFloatValue = vg0Var3.g() - vg0Var2.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -vg0Var2.g();
                }
                vg0Var2.h(vg0Var2.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            default:
                return new f4(5, (e31) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(g4 g4Var) {
        super(1);
        this.e = 0;
        q31 q31Var = y41.a;
        this.f = g4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ey0(iw iwVar) {
        super(1);
        this.e = 1;
        this.f = (y20) iwVar;
    }
}
