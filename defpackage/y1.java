package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y1 extends y20 implements kw {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ zg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(zg zgVar) {
        super(2);
        this.f = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        j41 j41Var = j41.a;
        zg zgVar = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                float f = f2.a;
                float f2 = f2.a;
                f2.b(zgVar, (ci) obj, d80.I(439));
                break;
            default:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar.z()) {
                    tf tfVarA = rf.a(o9.c, g2.p, ciVar, 0);
                    int iJ = c10.J(ciVar);
                    wh0 wh0VarL = ciVar.l();
                    e90 e90VarP = r31.P(ciVar, b90.a);
                    sh.b.getClass();
                    si siVar = rh.b;
                    ciVar.X();
                    if (ciVar.S) {
                        ciVar.k(siVar);
                    } else {
                        ciVar.h0();
                    }
                    dq0.m(ciVar, rh.e, tfVarA);
                    dq0.m(ciVar, rh.d, wh0VarL);
                    n9 n9Var = rh.f;
                    if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iJ))) {
                        b8.k(iJ, ciVar, iJ, n9Var);
                    }
                    dq0.m(ciVar, rh.c, e90VarP);
                    zgVar.c(uf.a, ciVar, 6);
                    ciVar.p(true);
                    break;
                } else {
                    ciVar.Q();
                    break;
                }
                break;
        }
        return j41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(zg zgVar, int i) {
        super(2);
        float f = f2.a;
        float f2 = f2.a;
        this.f = zgVar;
    }
}
