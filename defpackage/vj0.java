package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vj0 extends y20 implements gw {
    public final /* synthetic */ cm0 e;
    public final /* synthetic */ wj0 f;
    public final /* synthetic */ q00 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(cm0 cm0Var, wj0 wj0Var, q00 q00Var, long j, long j2) {
        super(0);
        this.e = cm0Var;
        this.f = wj0Var;
        this.g = q00Var;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.gw
    public final Object a() {
        wj0 wj0Var = this.f;
        this.e.d = wj0Var.getPositionProvider().a(this.g, this.h, wj0Var.getParentLayoutDirection(), this.i);
        return j41.a;
    }
}
