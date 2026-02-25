package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fz0 extends xm0 implements kw {
    public int f;
    public /* synthetic */ Object g;

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((fz0) k((lk) obj2, (oy0) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        fz0 fz0Var = new fz0(lkVar);
        fz0Var.g = obj;
        return fz0Var;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
            return obj;
        }
        c10.X(obj);
        oy0 oy0Var = (oy0) this.g;
        this.f = 1;
        Object objD = iz0.d(oy0Var, hj0.e, this);
        xl xlVar = xl.d;
        return objD == xlVar ? xlVar : objD;
    }
}
