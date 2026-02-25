package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b7 extends y20 implements iw {
    public final /* synthetic */ id0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(id0 id0Var, boolean z, boolean z2) {
        super(1);
        this.e = id0Var;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        ct0 ct0Var = (ct0) obj;
        long jA = this.e.a();
        ct0Var.d(js0.c, new is0(this.f ? nx.e : nx.f, jA, this.g ? 1 : 3, nm.x(jA)));
        return j41.a;
    }
}
