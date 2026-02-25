package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements kw {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xg(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                int I = d80.I(this.e) | 1;
                ((zg) this.f).f(this.g, (ci) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                c4.b((fl0) this.f, (kw) this.g, (ci) obj, d80.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                c4.c((fl0[]) this.f, (kw) this.g, (ci) obj, d80.I(this.e | 1));
                break;
        }
        return j41.a;
    }
}
