package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p01 extends jy0 implements lw {
    public int h;
    public /* synthetic */ dk0 i;
    public /* synthetic */ long j;
    public final /* synthetic */ wl k;
    public final /* synthetic */ za0 l;
    public final /* synthetic */ fa0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(wl wlVar, za0 za0Var, fa0 fa0Var, lk lkVar) {
        super(3, lkVar);
        this.k = wlVar;
        this.l = za0Var;
        this.m = fa0Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((ed0) obj2).a;
        za0 za0Var = this.l;
        fa0 fa0Var = this.m;
        p01 p01Var = new p01(this.k, za0Var, fa0Var, (lk) obj3);
        p01Var.i = (dk0) obj;
        p01Var.j = j;
        return p01Var.o(j41.a);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        wl wlVar = this.k;
        if (i == 0) {
            c10.X(obj);
            dk0 dk0Var = this.i;
            nm.z(wlVar, null, new d(this.l, this.j, this.m, null, 2), 3);
            this.h = 1;
            obj = dk0Var.d(this);
            xl xlVar = xl.d;
            if (obj == xlVar) {
                return xlVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
        }
        nm.z(wlVar, null, new o01(this.l, ((Boolean) obj).booleanValue(), this.m, null), 3);
        return j41.a;
    }
}
