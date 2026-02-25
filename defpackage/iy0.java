package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class iy0 extends y20 implements iw {
    public final /* synthetic */ dm0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ a8 g;
    public final /* synthetic */ f8 h;
    public final /* synthetic */ iw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(dm0 dm0Var, float f, a8 a8Var, f8 f8Var, iw iwVar) {
        super(1);
        this.e = dm0Var;
        this.f = f;
        this.g = a8Var;
        this.h = f8Var;
        this.i = iwVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.e.d;
        c10.m(obj2);
        dq0.e((d8) obj2, jLongValue, this.f, this.g, this.h, this.i);
        return j41.a;
    }
}
