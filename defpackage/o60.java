package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o60 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ yz0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o60(yz0 yz0Var, int i) {
        super(1);
        this.e = i;
        this.f = yz0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                this.f.c(((ed0) obj).a);
                break;
            default:
                nj0 nj0Var = (nj0) obj;
                this.f.e(c10.R(nj0Var, false));
                nj0Var.a();
                break;
        }
        return j41.a;
    }
}
