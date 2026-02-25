package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class je extends jy0 implements lw {
    public int h;
    public /* synthetic */ dk0 i;
    public /* synthetic */ long j;
    public final /* synthetic */ ke k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(ke keVar, lk lkVar) {
        super(3, lkVar);
        this.k = keVar;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((ed0) obj2).a;
        je jeVar = new je(this.k, (lk) obj3);
        jeVar.i = (dk0) obj;
        jeVar.j = j;
        return jeVar.o(j41.a);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        Object objQ;
        int i = this.h;
        j41 j41Var = j41.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
            return j41Var;
        }
        c10.X(obj);
        dk0 dk0Var = this.i;
        long j = this.j;
        ke keVar = this.k;
        if (keVar.w) {
            this.h = 1;
            fa0 fa0Var = keVar.t;
            xl xlVar = xl.d;
            if (fa0Var == null || (objQ = nm.q(new e(dk0Var, j, fa0Var, keVar, null), this)) != xlVar) {
                objQ = j41Var;
            }
            if (objQ == xlVar) {
                return xlVar;
            }
        }
        return j41Var;
    }
}
