package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pd extends jy0 implements kw {
    public final /* synthetic */ int h = 0;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sd k;
    public final /* synthetic */ wt l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(sd sdVar, wt wtVar, lk lkVar) {
        super(2, lkVar);
        this.k = sdVar;
        this.l = wtVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((pd) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new pd(this.k, this.l, this.j, lkVar);
            default:
                pd pdVar = new pd(this.k, this.l, lkVar);
                pdVar.j = obj;
                return pdVar;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [jy0, lw] */
    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    ?? r9 = this.k.h;
                    Object obj2 = this.j;
                    this.i = 1;
                    Object objC = r9.c(this.l, obj2, this);
                    xl xlVar = xl.d;
                    if (objC == xlVar) {
                        return xlVar;
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
                    wl wlVar = (wl) this.j;
                    dm0 dm0Var = new dm0();
                    sd sdVar = this.k;
                    vt vtVar = sdVar.g;
                    rd rdVar = new rd(dm0Var, wlVar, sdVar, this.l, 0);
                    this.i = 1;
                    Object objB = vtVar.b(rdVar, this);
                    xl xlVar2 = xl.d;
                    if (objB == xlVar2) {
                        return xlVar2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(sd sdVar, wt wtVar, Object obj, lk lkVar) {
        super(2, lkVar);
        this.k = sdVar;
        this.l = wtVar;
        this.j = obj;
    }
}
