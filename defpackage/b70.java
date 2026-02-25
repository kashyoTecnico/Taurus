package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b70 extends y20 implements gw {
    public final /* synthetic */ c70 e;
    public final /* synthetic */ eg0 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(c70 c70Var, eg0 eg0Var, long j) {
        super(0);
        this.e = c70Var;
        this.f = eg0Var;
        this.g = j;
    }

    @Override // defpackage.gw
    public final Object a() {
        x60 x60VarM0;
        w30 w30Var = this.e.i;
        ni0 placementScope = null;
        if (b10.N(w30Var.a) || w30Var.c) {
            nc0 nc0Var = w30Var.a().t;
            if (nc0Var != null) {
                placementScope = nc0Var.o;
            }
        } else {
            nc0 nc0Var2 = w30Var.a().t;
            if (nc0Var2 != null && (x60VarM0 = nc0Var2.M0()) != null) {
                placementScope = x60VarM0.o;
            }
        }
        if (placementScope == null) {
            placementScope = ((p3) this.f).getPlacementScope();
        }
        x60 x60VarM02 = w30Var.a().M0();
        c10.m(x60VarM02);
        ni0.i(placementScope, x60VarM02, this.g);
        return j41.a;
    }
}
