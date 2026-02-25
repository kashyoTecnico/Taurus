package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ ke j;
    public final /* synthetic */ fk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ke keVar, fk0 fk0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = keVar;
        this.k = fk0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((f) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new f(this.j, this.k, lkVar, 0);
            default:
                return new f(this.j, this.k, lkVar, 1);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    fa0 fa0Var = this.j.t;
                    if (fa0Var != null) {
                        this.i = 1;
                        Object objA = fa0Var.a(this.k, this);
                        xl xlVar = xl.d;
                        if (objA == xlVar) {
                            return xlVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
            default:
                int i2 = this.i;
                if (i2 == 0) {
                    c10.X(obj);
                    fa0 fa0Var2 = this.j.t;
                    if (fa0Var2 != null) {
                        gk0 gk0Var = new gk0(this.k);
                        this.i = 1;
                        Object objA2 = fa0Var2.a(gk0Var, this);
                        xl xlVar2 = xl.d;
                        if (objA2 == xlVar2) {
                            return xlVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
        }
    }
}
