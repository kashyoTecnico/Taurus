package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oa0 extends xm0 implements kw {
    public vw f;
    public pa0 g;
    public long[] h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pa0 l;
    public final /* synthetic */ vw m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(pa0 pa0Var, vw vwVar, lk lkVar) {
        super(lkVar);
        this.l = pa0Var;
        this.m = vwVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((oa0) k((lk) obj2, (yt0) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        oa0 oa0Var = new oa0(this.l, this.m, lkVar);
        oa0Var.k = obj;
        return oa0Var;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        yt0 yt0Var;
        pa0 pa0Var;
        long[] jArr;
        int i;
        vw vwVar;
        int i2 = this.j;
        if (i2 == 0) {
            c10.X(obj);
            yt0Var = (yt0) this.k;
            pa0Var = this.l;
            na0 na0Var = pa0Var.e;
            jArr = na0Var.c;
            i = na0Var.e;
            vwVar = this.m;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.i;
            jArr = this.h;
            pa0Var = this.g;
            vwVar = this.f;
            yt0Var = (yt0) this.k;
            c10.X(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return j41.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        vwVar.e = i;
        Object obj2 = pa0Var.e.b[i];
        this.k = yt0Var;
        this.f = vwVar;
        this.g = pa0Var;
        this.h = jArr;
        this.i = i3;
        this.j = 1;
        yt0Var.b(obj2, this);
        return xl.d;
    }
}
