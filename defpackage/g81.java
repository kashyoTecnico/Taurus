package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g81 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ i81 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g81(i81 i81Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = i81Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((g81) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new g81(this.j, lkVar, 0);
            default:
                return new g81(this.j, lkVar, 1);
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
                p3 p3Var = this.j.d;
                this.i = 1;
                Object objD = p3Var.v.d(this);
                xl xlVar = xl.d;
                if (objD != xlVar) {
                    objD = j41Var;
                }
                return objD == xlVar ? xlVar : j41Var;
            default:
                int i2 = this.i;
                j41 j41Var2 = j41.a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                    return j41Var2;
                }
                c10.X(obj);
                p3 p3Var2 = this.j.d;
                this.i = 1;
                Object objE = p3Var2.w.e(this);
                xl xlVar2 = xl.d;
                if (objE != xlVar2) {
                    objE = j41Var2;
                }
                return objE == xlVar2 ? xlVar2 : j41Var2;
        }
    }
}
