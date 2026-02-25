package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cy0 extends y20 implements kw {
    public final /* synthetic */ e90 e;
    public final /* synthetic */ ju0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ fa0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ gw k;
    public final /* synthetic */ float l;
    public final /* synthetic */ zg m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(e90 e90Var, ju0 ju0Var, long j, float f, fa0 fa0Var, boolean z, gw gwVar, float f2, zg zgVar) {
        super(2);
        this.e = e90Var;
        this.f = ju0Var;
        this.g = j;
        this.h = f;
        this.i = fa0Var;
        this.j = z;
        this.k = gwVar;
        this.l = f2;
        this.m = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            hx0 hx0Var = w00.a;
            e90 e90VarB = a.b(dy0.b(this.e.c(MinimumInteractiveModifier.a), this.f, dy0.c(this.g, this.h, ciVar), null, ((xn) ciVar.j(ti.h)).A(this.l)), this.i, sn0.a(ciVar), this.j, null, this.k);
            l80 l80VarD = eb.d(g2.e, true);
            int iHashCode = Long.hashCode(ciVar.T);
            wh0 wh0VarL = ciVar.l();
            e90 e90VarP = r31.P(ciVar, e90VarB);
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
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            this.m.e(ciVar, 0);
            ciVar.p(true);
        }
        return j41.a;
    }
}
