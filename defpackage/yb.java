package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yb implements iw {
    public final /* synthetic */ xb d;
    public final /* synthetic */ zb e;
    public final /* synthetic */ bm0 f;

    public yb(xb xbVar, zb zbVar, bm0 bm0Var) {
        this.d = xbVar;
        this.e = zbVar;
        this.f = bm0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i;
        xb xbVar = this.d;
        xbVar.a = null;
        xbVar.b = null;
        z9 z9Var = this.e.g;
        int i2 = this.f.d;
        do {
            i = z9Var.get();
        } while (!z9Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return j41.a;
    }
}
