package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sq0 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ tq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq0(tq0 tq0Var, int i) {
        super(0);
        this.e = i;
        this.f = tq0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(this.f.a.g() > 0);
            default:
                tq0 tq0Var = this.f;
                return Boolean.valueOf(tq0Var.a.g() < tq0Var.d.g());
        }
    }
}
