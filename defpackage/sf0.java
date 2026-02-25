package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sf0 extends y20 implements lw {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ of g;
    public final /* synthetic */ fa0 h;
    public final /* synthetic */ kw i;
    public final /* synthetic */ zz0 j;
    public final /* synthetic */ ju0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(String str, boolean z, of ofVar, fa0 fa0Var, kw kwVar, zz0 zz0Var, ju0 ju0Var) {
        super(3);
        this.e = str;
        this.f = z;
        this.g = ofVar;
        this.h = fa0Var;
        this.i = kwVar;
        this.j = zz0Var;
        this.k = ju0Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        kw kwVar = (kw) obj;
        ci ciVar = (ci) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ciVar.h(kwVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else {
            qf0 qf0Var = qf0.a;
            ju0 ju0Var = this.k;
            boolean z = this.f;
            fa0 fa0Var = this.h;
            zz0 zz0Var = this.j;
            qf0Var.b(this.e, kwVar, z, this.g, fa0Var, this.i, zz0Var, null, b10.b0(2108828640, new rf0(z, fa0Var, zz0Var, ju0Var), ciVar), ciVar, (iIntValue << 3) & 112);
        }
        return j41.a;
    }
}
