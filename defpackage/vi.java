package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vi extends dl0 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(gw gwVar) {
        super(gwVar);
        g2 g2Var = g2.V;
        this.c = g2Var;
    }

    @Override // defpackage.dl0
    public final fl0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new fl0(this, obj, obj == null, null, true);
            default:
                return new fl0(this, obj, obj == null, (uv0) this.c, true);
        }
    }

    @Override // defpackage.dl0
    public u41 b() {
        switch (this.b) {
            case 0:
                return (wi) this.c;
            default:
                return super.b();
        }
    }

    public vi(iw iwVar) {
        super(new mi(1));
        this.c = new wi(iwVar);
    }
}
