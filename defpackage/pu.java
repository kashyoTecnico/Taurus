package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pu extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu(int i, int i2, Object obj) {
        super(1);
        this.e = i2;
        this.g = obj;
        this.f = i;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                dm0 dm0Var = (dm0) this.g;
                Boolean boolValueOf = Boolean.valueOf(((av) obj).E0(this.f));
                dm0Var.d = boolValueOf;
                return boolValueOf;
            default:
                ni0.h((ni0) obj, (oi0) this.g, 0, -this.f);
                return j41.a;
        }
    }
}
