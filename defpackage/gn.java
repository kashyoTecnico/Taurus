package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gn extends jy0 implements kw {
    public int h;
    public final /* synthetic */ in i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ob k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(in inVar, int i, ob obVar, lk lkVar) {
        super(2, lkVar);
        this.i = inVar;
        this.j = i;
        this.k = obVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((gn) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        return new gn(this.i, this.j, this.k, lkVar);
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        if (i == 0) {
            c10.X(obj);
            in inVar = this.i;
            kb0 kb0Var = inVar.c;
            hn hnVar = inVar.b;
            ob obVar = new ob(inVar, this.k, (lk) null, 4);
            this.h = 1;
            kb0Var.getClass();
            Object objQ = nm.q(new jb0(this.j, kb0Var, obVar, hnVar, null), this);
            xl xlVar = xl.d;
            if (objQ == xlVar) {
                return xlVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10.X(obj);
        }
        return j41.a;
    }
}
