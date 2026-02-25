package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class br0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br0(long j, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = j;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        kr0 kr0Var = (kr0) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
            case 0:
                br0 br0Var = (br0) k(lkVar, kr0Var);
                j41 j41Var = j41.a;
                br0Var.o(j41Var);
                return j41Var;
            default:
                br0 br0Var2 = (br0) k(lkVar, kr0Var);
                j41 j41Var2 = j41.a;
                br0Var2.o(j41Var2);
                return j41Var2;
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                br0 br0Var = new br0(this.j, lkVar, 0);
                br0Var.i = obj;
                return br0Var;
            default:
                br0 br0Var2 = new br0(this.j, lkVar, 1);
                br0Var2.i = obj;
                return br0Var2;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                c10.X(obj);
                mr0 mr0Var = ((kr0) this.i).a;
                mr0.a(mr0Var, mr0Var.h, this.j, 1);
                break;
            default:
                c10.X(obj);
                mr0 mr0Var2 = ((kr0) this.i).a;
                mr0.a(mr0Var2, mr0Var2.h, this.j, 1);
                break;
        }
        return j41.a;
    }
}
