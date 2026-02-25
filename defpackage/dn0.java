package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class dn0 implements ip {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn0 b;

    public /* synthetic */ dn0(hn0 hn0Var, int i) {
        this.a = i;
        this.b = hn0Var;
    }

    @Override // defpackage.ip
    public final double b(double d) {
        switch (this.a) {
            case 0:
                return c10.s(this.b.k.b(d), r8.e, r8.f);
            default:
                return this.b.n.b(c10.s(d, r8.e, r8.f));
        }
    }
}
