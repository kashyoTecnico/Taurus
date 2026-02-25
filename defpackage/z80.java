package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z80 extends y20 implements iw {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ oi0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(int i, oi0 oi0Var, int i2) {
        super(1);
        this.g = i;
        this.f = oi0Var;
        this.h = i2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                ni0.h((ni0) obj, this.f, d80.B((this.g - r0.d) / 2.0f), d80.B((this.h - r0.e) / 2.0f));
                break;
            default:
                ni0.h((ni0) obj, this.f, -this.g, -this.h);
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(oi0 oi0Var, int i, int i2) {
        super(1);
        this.f = oi0Var;
        this.g = i;
        this.h = i2;
    }
}
