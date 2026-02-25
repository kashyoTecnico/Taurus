package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gn0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ hn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn0(hn0 hn0Var, int i) {
        super(1);
        this.e = i;
        this.f = hn0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f.n.b(c10.s(dDoubleValue, r8.e, r8.f)));
            default:
                return Double.valueOf(c10.s(this.f.k.b(((Number) obj).doubleValue()), r8.e, r8.f));
        }
    }
}
