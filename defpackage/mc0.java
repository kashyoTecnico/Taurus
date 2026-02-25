package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mc0 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ nc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc0(nc0 nc0Var, int i) {
        super(0);
        this.e = i;
        this.f = nc0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                nc0 nc0Var = this.f;
                dd ddVar = nc0Var.H;
                c10.m(ddVar);
                nc0Var.I0(ddVar, nc0Var.G);
                break;
            default:
                nc0 nc0Var2 = this.f.t;
                if (nc0Var2 != null) {
                    nc0Var2.V0();
                }
                break;
        }
        return j41.a;
    }
}
