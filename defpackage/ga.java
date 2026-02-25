package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ga extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ha f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga(ha haVar, int i) {
        super(0);
        this.e = i;
        this.f = haVar;
    }

    @Override // defpackage.gw
    public final Object a() {
        switch (this.e) {
            case 0:
                this.f.C0();
                break;
            default:
                ha haVar = this.f;
                c90 c90Var = haVar.r;
                c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ij ijVar = (ij) c90Var;
                u61 u61Var = (u61) haVar.v(q71.a);
                if (!c10.i(u61Var, ijVar.b)) {
                    ijVar.b = u61Var;
                    ijVar.a.g(u61Var);
                }
                break;
        }
        return j41.a;
    }
}
