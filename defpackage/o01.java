package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o01 extends jy0 implements kw {
    public za0 h;
    public int i;
    public final /* synthetic */ za0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ fa0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o01(za0 za0Var, boolean z, fa0 fa0Var, lk lkVar) {
        super(2, lkVar);
        this.j = za0Var;
        this.k = z;
        this.l = fa0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((o01) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        return new o01(this.j, this.k, this.l, lkVar);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        za0 za0Var;
        za0 za0Var2;
        int i = this.i;
        if (i == 0) {
            c10.X(obj);
            za0Var = this.j;
            fk0 fk0Var = (fk0) za0Var.getValue();
            if (fk0Var != null) {
                v00 gk0Var = this.k ? new gk0(fk0Var) : new ek0(fk0Var);
                fa0 fa0Var = this.l;
                if (fa0Var != null) {
                    this.h = za0Var;
                    this.i = 1;
                    Object objA = fa0Var.a(gk0Var, this);
                    xl xlVar = xl.d;
                    if (objA == xlVar) {
                        return xlVar;
                    }
                    za0Var2 = za0Var;
                }
                za0Var.setValue(null);
            }
            return j41.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        za0Var2 = this.h;
        c10.X(obj);
        za0Var = za0Var2;
        za0Var.setValue(null);
        return j41.a;
    }
}
