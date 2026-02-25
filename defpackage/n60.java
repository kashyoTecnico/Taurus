package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n60 extends jy0 implements kw {
    public /* synthetic */ Object h;
    public final /* synthetic */ rj0 i;
    public final /* synthetic */ yz0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(rj0 rj0Var, yz0 yz0Var, lk lkVar) {
        super(2, lkVar);
        this.i = rj0Var;
        this.j = yz0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((n60) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        n60 n60Var = new n60(this.i, this.j, lkVar);
        n60Var.h = obj;
        return n60Var;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        c10.X(obj);
        wl wlVar = (wl) this.h;
        rj0 rj0Var = this.i;
        yz0 yz0Var = this.j;
        lk lkVar = null;
        nm.z(wlVar, null, new hl(rj0Var, yz0Var, lkVar, 1), 1);
        return nm.z(wlVar, null, new hl(rj0Var, yz0Var, lkVar, 2), 1);
    }
}
