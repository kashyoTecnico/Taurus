package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u1 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ kw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(int i, kw kwVar) {
        super(2);
        this.e = i;
        this.f = kwVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    e90 e90VarC = a.c(b90.a, f2.f).c(new HorizontalAlignElement(g2.p));
                    l80 l80VarD = eb.d(g2.e, false);
                    int iJ = c10.J(ciVar);
                    wh0 wh0VarL = ciVar.l();
                    e90 e90VarP = r31.P(ciVar, e90VarC);
                    sh.b.getClass();
                    si siVar = rh.b;
                    ciVar.X();
                    if (ciVar.S) {
                        ciVar.k(siVar);
                    } else {
                        ciVar.h0();
                    }
                    dq0.m(ciVar, rh.e, l80VarD);
                    dq0.m(ciVar, rh.d, wh0VarL);
                    n9 n9Var = rh.f;
                    if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iJ))) {
                        b8.k(iJ, ciVar, iJ, n9Var);
                    }
                    dq0.m(ciVar, rh.c, e90VarP);
                    this.f.e(ciVar, 0);
                    ciVar.p(true);
                }
                return j41.a;
            case 1:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    e90 e90VarC2 = a.c(new LayoutWeightElement(1.0f, false), f2.g).c(new HorizontalAlignElement(g2.p));
                    l80 l80VarD2 = eb.d(g2.e, false);
                    int iJ2 = c10.J(ciVar2);
                    wh0 wh0VarL2 = ciVar2.l();
                    e90 e90VarP2 = r31.P(ciVar2, e90VarC2);
                    sh.b.getClass();
                    si siVar2 = rh.b;
                    ciVar2.X();
                    if (ciVar2.S) {
                        ciVar2.k(siVar2);
                    } else {
                        ciVar2.h0();
                    }
                    dq0.m(ciVar2, rh.e, l80VarD2);
                    dq0.m(ciVar2, rh.d, wh0VarL2);
                    n9 n9Var2 = rh.f;
                    if (ciVar2.S || !c10.i(ciVar2.K(), Integer.valueOf(iJ2))) {
                        b8.k(iJ2, ciVar2, iJ2, n9Var2);
                    }
                    dq0.m(ciVar2, rh.c, e90VarP2);
                    this.f.e(ciVar2, 0);
                    ciVar2.p(true);
                }
                return j41.a;
            default:
                ci ciVar3 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar3.z()) {
                    ciVar3.Q();
                } else {
                    this.f.e(ciVar3, 0);
                }
                return j41.a;
        }
    }
}
