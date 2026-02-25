package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e70 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ f70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e70(f70 f70Var, int i) {
        super(0);
        this.e = i;
        this.f = f70Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                d30 d30Var = (d30) this.f.x.getValue();
                return new ed0(d30Var != null ? d30Var.R(0L) : 9205357640488583168L);
            case 1:
                return new ed0(this.f.z);
            default:
                this.f.C0();
                return j41.a;
        }
    }
}
