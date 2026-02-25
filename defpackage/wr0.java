package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wr0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yz0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr0(yz0 yz0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.k = yz0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        rj0 rj0Var = (rj0) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((wr0) k(lkVar, rj0Var)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                wr0 wr0Var = new wr0(this.k, lkVar, 0);
                wr0Var.j = obj;
                return wr0Var;
            default:
                wr0 wr0Var2 = new wr0(this.k, lkVar, 1);
                wr0Var2.j = obj;
                return wr0Var2;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    rj0 rj0Var = (rj0) this.j;
                    this.i = 1;
                    Object objB = c10.B(rj0Var, this.k, this);
                    xl xlVar = xl.d;
                    if (objB == xlVar) {
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
                    rj0 rj0Var2 = (rj0) this.j;
                    this.i = 1;
                    Object objB2 = c10.B(rj0Var2, this.k, this);
                    xl xlVar2 = xl.d;
                    if (objB2 == xlVar2) {
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
