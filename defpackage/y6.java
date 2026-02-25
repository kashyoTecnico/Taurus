package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y6 extends y20 implements kw {
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ e90 g;
    public final /* synthetic */ id0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(long j, boolean z, e90 e90Var, id0 id0Var) {
        super(2);
        this.e = j;
        this.f = z;
        this.g = e90Var;
        this.h = id0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            long j = this.e;
            v71 v71Var = vh.a;
            id0 id0Var = this.h;
            boolean z = this.f;
            if (j != 9205357640488583168L) {
                ciVar.V(-837727128);
                v71 v71Var2 = z ? c10.b : c10.a;
                e90 e90VarD = b.d(this.g, np.b(j), np.a(j), 0.0f, 0.0f, 12);
                lo0 lo0VarA = ko0.a(v71Var2, g2.n, ciVar, 0);
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
                dq0.m(ciVar, rh.e, lo0VarA);
                dq0.m(ciVar, rh.d, wh0VarL);
                n9 n9Var = rh.f;
                if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                    b8.k(iHashCode, ciVar, iHashCode, n9Var);
                }
                dq0.m(ciVar, rh.c, e90VarP);
                boolean zH = ciVar.h(id0Var);
                Object objK = ciVar.K();
                if (zH || objK == v71Var) {
                    objK = new x6(id0Var, 0);
                    ciVar.e0(objK);
                }
                m20.g(b90.a, (gw) objK, z, ciVar, 6);
                ciVar.p(true);
                ciVar.p(false);
            } else {
                ciVar.V(-836867312);
                boolean zH2 = ciVar.h(id0Var);
                Object objK2 = ciVar.K();
                if (zH2 || objK2 == v71Var) {
                    objK2 = new x6(id0Var, 1);
                    ciVar.e0(objK2);
                }
                m20.g(this.g, (gw) objK2, z, ciVar, 0);
                ciVar.p(false);
            }
        }
        return j41.a;
    }
}
