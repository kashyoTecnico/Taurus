package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rf0 extends y20 implements kw {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fa0 f;
    public final /* synthetic */ zz0 g;
    public final /* synthetic */ ju0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(boolean z, fa0 fa0Var, zz0 zz0Var, ju0 ju0Var) {
        super(2);
        this.e = z;
        this.f = fa0Var;
        this.g = zz0Var;
        this.h = ju0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            qf0.a.a(this.e, this.f, null, this.g, this.h, 0.0f, 0.0f, ciVar, 100663296, 200);
        }
        return j41.a;
    }
}
