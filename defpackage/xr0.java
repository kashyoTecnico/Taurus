package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xr0 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ss0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(ss0 ss0Var, int i) {
        super(0);
        this.e = i;
        this.f = ss0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                ed0 ed0Var = (ed0) this.f.n.getValue();
                break;
            case 1:
                ed0 ed0Var2 = (ed0) this.f.o.getValue();
                break;
            case 2:
                ss0 ss0Var = this.f;
                ss0Var.s = true;
                ss0Var.p();
                ss0Var.p.setValue(null);
                ss0Var.q.setValue(null);
                break;
            default:
                this.f.i();
                break;
        }
        return j41.a;
    }
}
