package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f5 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ kw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5(Object obj, kw kwVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.g = obj;
        this.h = kwVar;
        this.f = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        ci ciVar = (ci) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                l81.i((e90) this.g, this.h, ciVar, d80.I(this.f | 1));
                break;
            default:
                nm.c((u01) this.g, (zg) this.h, ciVar, d80.I(this.f | 1));
                break;
        }
        return j41.a;
    }
}
