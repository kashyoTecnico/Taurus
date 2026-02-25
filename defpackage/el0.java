package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class el0 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(long j, c21 c21Var, kw kwVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = j;
        this.g = c21Var;
        this.h = kwVar;
        this.i = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                c21 c21Var = (c21) this.g;
                kw kwVar = (kw) this.h;
                nm.g(this.f, c21Var, kwVar, (ci) obj, d80.I(this.i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                c21 c21Var2 = (c21) this.g;
                kw kwVar2 = (kw) this.h;
                j01.b(this.f, c21Var2, kwVar2, (ci) obj, d80.I(this.i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                c51 c51Var = (c51) this.g;
                e90 e90Var = (e90) this.h;
                ry.b(c51Var, e90Var, this.f, (ci) obj, d80.I(this.i | 1));
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(c51 c51Var, e90 e90Var, long j, int i) {
        super(2);
        this.e = 2;
        this.g = c51Var;
        this.h = e90Var;
        this.f = j;
        this.i = i;
    }
}
