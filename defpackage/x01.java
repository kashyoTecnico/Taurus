package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x01 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ck f;
    public final /* synthetic */ u01 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x01(ck ckVar, u01 u01Var, int i) {
        super(0);
        this.e = i;
        this.f = ckVar;
        this.g = u01Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                this.g.d();
                c4.k(this.f);
                break;
            case 1:
                this.g.b(false);
                c4.k(this.f);
                break;
            case 2:
                this.g.l();
                c4.k(this.f);
                break;
            default:
                this.g.m();
                c4.k(this.f);
                break;
        }
        return j41.a;
    }
}
