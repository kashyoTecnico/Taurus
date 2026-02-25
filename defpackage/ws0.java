package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ws0 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ xn f;
    public final /* synthetic */ za0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws0(xn xnVar, za0 za0Var, int i) {
        super(1);
        this.e = i;
        this.f = xnVar;
        this.g = za0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                long j = ((np) obj).a;
                float fB = np.b(j);
                xn xnVar = this.f;
                this.g.setValue(new t00(d80.e(xnVar.N(fB), xnVar.N(np.a(j)))));
                return j41.a;
            case 1:
                return g70.a(new vs0((gw) obj, 0), new ws0(this.f, this.g, 0));
            case 2:
                long j2 = ((np) obj).a;
                float fB2 = np.b(j2);
                xn xnVar2 = this.f;
                this.g.setValue(new t00(d80.e(xnVar2.N(fB2), xnVar2.N(np.a(j2)))));
                return j41.a;
            default:
                return g70.a(new vs0((gw) obj, 1), new ws0(this.f, this.g, 2));
        }
    }
}
