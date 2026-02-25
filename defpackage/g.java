package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g extends jy0 implements kw {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
            case 0:
                g gVar = (g) k(lkVar, wlVar);
                j41 j41Var = j41.a;
                gVar.o(j41Var);
                return j41Var;
            case 1:
                g gVar2 = (g) k(lkVar, wlVar);
                j41 j41Var2 = j41.a;
                gVar2.o(j41Var2);
                return j41Var2;
            default:
                g gVar3 = (g) k(lkVar, wlVar);
                j41 j41Var3 = j41.a;
                gVar3.o(j41Var3);
                return j41Var3;
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new g((ke) this.i, lkVar, 0);
            case 1:
                return new g((ke) this.i, lkVar, 1);
            default:
                return new g((qo) this.i, lkVar, 2);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        lk lkVar = null;
        j41 j41Var = j41.a;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                c10.X(obj);
                ke keVar = (ke) obj2;
                if (keVar.D == null) {
                    ny nyVar = new ny();
                    fa0 fa0Var = keVar.t;
                    if (fa0Var != null) {
                        nm.z(keVar.o0(), null, new c(fa0Var, nyVar, lkVar, 0), 3);
                    }
                    keVar.D = nyVar;
                    break;
                }
                break;
            case 1:
                c10.X(obj);
                ke keVar2 = (ke) obj2;
                ny nyVar2 = keVar2.D;
                if (nyVar2 != null) {
                    oy oyVar = new oy(nyVar2);
                    fa0 fa0Var2 = keVar2.t;
                    if (fa0Var2 != null) {
                        nm.z(keVar2.o0(), null, new c(fa0Var2, oyVar, lkVar, 1), 3);
                    }
                    keVar2.D = null;
                    break;
                }
                break;
            default:
                c10.X(obj);
                ((qo) obj2).show();
                break;
        }
        return j41Var;
    }
}
