package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t60 extends y20 implements gw {
    public final /* synthetic */ v60 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ qi0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(v60 v60Var, long j, long j2, qi0 qi0Var) {
        super(0);
        this.e = v60Var;
        this.f = j;
        this.g = j2;
        this.h = qi0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        v60 v60Var = this.e;
        v60Var.z0().d = false;
        v60Var.z0().e = this.f;
        v60Var.z0().f = this.g;
        iw iwVarD = this.h.d.d();
        if (iwVarD != null) {
            iwVarD.g(v60Var.z0());
        }
        return j41.a;
    }
}
