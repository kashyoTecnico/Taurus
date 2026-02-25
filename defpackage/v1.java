package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v1 extends y20 implements kw {
    public final /* synthetic */ kw e;
    public final /* synthetic */ kw f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ zg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(kw kwVar, kw kwVar2, long j, long j2, long j3, long j4, zg zgVar) {
        super(2);
        this.e = kwVar;
        this.f = kwVar2;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            e90 e90VarC = a.c(b90.a, f2.e);
            int i = 0;
            tf tfVarA = rf.a(o9.c, g2.p, ciVar, 0);
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
            n9 n9Var = rh.e;
            dq0.m(ciVar, n9Var, tfVarA);
            n9 n9Var2 = rh.d;
            dq0.m(ciVar, n9Var2, wh0VarL);
            n9 n9Var3 = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iJ))) {
                b8.k(iJ, ciVar, iJ, n9Var3);
            }
            n9 n9Var4 = rh.c;
            dq0.m(ciVar, n9Var4, e90VarP);
            ciVar.V(-1924971291);
            ciVar.p(false);
            ciVar.V(-1924961479);
            kw kwVar = this.e;
            if (kwVar != null) {
                nm.g(this.g, c41.a(oo.c, ciVar), b10.b0(434448772, new u1(i, kwVar), ciVar), ciVar, 384);
            }
            ciVar.p(false);
            ciVar.V(-1924936431);
            int i2 = 1;
            kw kwVar2 = this.f;
            if (kwVar2 != null) {
                nm.g(this.h, c41.a(oo.e, ciVar), b10.b0(-796843771, new u1(i2, kwVar2), ciVar), ciVar, 384);
            }
            ciVar.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(g2.r);
            l80 l80VarD = eb.d(g2.e, false);
            int iJ2 = c10.J(ciVar);
            wh0 wh0VarL2 = ciVar.l();
            e90 e90VarP2 = r31.P(ciVar, horizontalAlignElement);
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, n9Var, l80VarD);
            dq0.m(ciVar, n9Var2, wh0VarL2);
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iJ2))) {
                b8.k(iJ2, ciVar, iJ2, n9Var3);
            }
            dq0.m(ciVar, n9Var4, e90VarP2);
            int i3 = oo.a;
            nm.g(this.i, c41.a(10, ciVar), this.j, ciVar, 0);
            ciVar.p(true);
            ciVar.p(true);
        }
        return j41.a;
    }
}
