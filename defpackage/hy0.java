package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hy0 extends y20 implements iw {
    public final /* synthetic */ dm0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ a8 g;
    public final /* synthetic */ k8 h;
    public final /* synthetic */ f8 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ iw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(dm0 dm0Var, Object obj, a8 a8Var, k8 k8Var, f8 f8Var, float f, iw iwVar) {
        super(1);
        this.e = dm0Var;
        this.f = obj;
        this.g = a8Var;
        this.h = k8Var;
        this.i = f8Var;
        this.j = f;
        this.k = iwVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        a8 a8Var = this.g;
        d8 d8Var = new d8(this.f, a8Var.d(), this.h, jLongValue, a8Var.e(), jLongValue, new gy0(this.i, 0));
        dq0.e(d8Var, jLongValue, this.j, this.g, this.i, this.k);
        this.e.d = d8Var;
        return j41.a;
    }
}
