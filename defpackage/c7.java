package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c7 extends y20 implements kw {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(e90 e90Var, gw gwVar, boolean z, int i) {
        super(2);
        this.h = e90Var;
        this.i = gwVar;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        ci ciVar = (ci) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                m20.g((e90) this.h, (gw) this.i, this.f, ciVar, d80.I(this.g | 1));
                break;
            default:
                dq0.b(this.f, (um0) this.h, (u01) this.i, ciVar, d80.I(this.g | 1));
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(boolean z, um0 um0Var, u01 u01Var, int i) {
        super(2);
        this.f = z;
        this.h = um0Var;
        this.i = u01Var;
        this.g = i;
    }
}
