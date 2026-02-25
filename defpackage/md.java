package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class md extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md(nd ndVar, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.k = ndVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((md) k((lk) obj2, (lk0) obj)).o(j41.a);
            default:
                return ((md) k((lk) obj2, (wt) obj)).o(j41.a);
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                md mdVar = new md(this.k, lkVar, 0);
                mdVar.j = obj;
                return mdVar;
            default:
                md mdVar2 = new md(this.k, lkVar, 1);
                mdVar2.j = obj;
                return mdVar2;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                j41 j41Var = j41.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                    return j41Var;
                }
                c10.X(obj);
                lk0 lk0Var = (lk0) this.j;
                this.i = 1;
                Object objD = this.k.d(new wt0(lk0Var), this);
                xl xlVar = xl.d;
                if (objD != xlVar) {
                    objD = j41Var;
                }
                return objD == xlVar ? xlVar : j41Var;
            default:
                int i2 = this.i;
                if (i2 == 0) {
                    c10.X(obj);
                    wt wtVar = (wt) this.j;
                    this.i = 1;
                    Object objD2 = this.k.d(wtVar, this);
                    xl xlVar2 = xl.d;
                    if (objD2 == xlVar2) {
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
