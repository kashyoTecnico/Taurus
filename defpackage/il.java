package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class il extends jy0 implements kw {
    public /* synthetic */ Object h;
    public final /* synthetic */ rj0 i;
    public final /* synthetic */ yz0 j;
    public final /* synthetic */ u01 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(rj0 rj0Var, yz0 yz0Var, u01 u01Var, lk lkVar) {
        super(2, lkVar);
        this.i = rj0Var;
        this.j = yz0Var;
        this.k = u01Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        il ilVar = (il) k((lk) obj2, (wl) obj);
        j41 j41Var = j41.a;
        ilVar.o(j41Var);
        return j41Var;
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        il ilVar = new il(this.i, this.j, this.k, lkVar);
        ilVar.h = obj;
        return ilVar;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        c10.X(obj);
        wl wlVar = (wl) this.h;
        rj0 rj0Var = this.i;
        lk lkVar = null;
        nm.z(wlVar, null, new hl(rj0Var, this.j, lkVar, 0), 1);
        nm.z(wlVar, null, new c(rj0Var, this.k, lkVar, 11), 1);
        return j41.a;
    }
}
