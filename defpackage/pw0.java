package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pw0 implements lk, yl {
    public final lk d;
    public final ml e;

    public pw0(lk lkVar, ml mlVar) {
        this.d = lkVar;
        this.e = mlVar;
    }

    @Override // defpackage.yl
    public final yl d() {
        lk lkVar = this.d;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.e;
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        this.d.h(obj);
    }
}
