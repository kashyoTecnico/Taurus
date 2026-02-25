package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t4 extends y20 implements kw {
    public final /* synthetic */ long e;
    public final /* synthetic */ e90 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(long j, e90 e90Var) {
        super(2);
        this.e = j;
        this.f = e90Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            long j = this.e;
            if (j != 9205357640488583168L) {
                ciVar.V(1828881000);
                e90 e90VarD = b.d(this.f, np.b(j), np.a(j), 0.0f, 0.0f, 12);
                l80 l80VarD = eb.d(g2.f, false);
                int iHashCode = Long.hashCode(ciVar.T);
                wh0 wh0VarL = ciVar.l();
                e90 e90VarP = r31.P(ciVar, e90VarD);
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
                z4.b(null, ciVar, 0, 1);
                ciVar.p(true);
                ciVar.p(false);
            } else {
                ciVar.V(1829217412);
                z4.b(this.f, ciVar, 0, 0);
                ciVar.p(false);
            }
        }
        return j41.a;
    }
}
