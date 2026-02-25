package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ez0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ lw j;
    public final /* synthetic */ dk0 k;
    public final /* synthetic */ nj0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez0(lw lwVar, dk0 dk0Var, nj0 nj0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = lwVar;
        this.k = dk0Var;
        this.l = nj0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((ez0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new ez0(this.j, this.k, this.l, lkVar, 0);
            default:
                return new ez0(this.j, this.k, this.l, lkVar, 1);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    ed0 ed0Var = new ed0(this.l.c);
                    this.i = 1;
                    Object objC = this.j.c(this.k, ed0Var, this);
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
                    ed0 ed0Var2 = new ed0(this.l.c);
                    this.i = 1;
                    Object objC2 = this.j.c(this.k, ed0Var2, this);
                    xl xlVar2 = xl.d;
                    if (objC2 == xlVar2) {
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
}
