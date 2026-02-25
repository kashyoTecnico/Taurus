package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pb extends jy0 implements kw {
    public /* synthetic */ Object h;
    public final /* synthetic */ qb i;
    public final /* synthetic */ nc0 j;
    public final /* synthetic */ y20 k;
    public final /* synthetic */ ea l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pb(qb qbVar, nc0 nc0Var, gw gwVar, ea eaVar, lk lkVar) {
        super(2, lkVar);
        this.i = qbVar;
        this.j = nc0Var;
        this.k = (y20) gwVar;
        this.l = eaVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((pb) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [gw, y20] */
    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        pb pbVar = new pb(this.i, this.j, this.k, this.l, lkVar);
        pbVar.h = obj;
        return pbVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gw, y20] */
    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        c10.X(obj);
        wl wlVar = (wl) this.h;
        nc0 nc0Var = this.j;
        ?? r2 = this.k;
        qb qbVar = this.i;
        nm.z(wlVar, null, new ob(qbVar, nc0Var, (gw) r2, (lk) null), 3);
        return nm.z(wlVar, null, new c(qbVar, this.l, null, 7), 3);
    }
}
