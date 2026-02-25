package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class eb {
    public static final HashMap a = b(true);
    public static final HashMap b = b(false);
    public static final e5 c = e5.d;

    public static final void a(e90 e90Var, ci ciVar, int i) {
        ciVar.W(-211209833);
        if ((((ciVar.f(e90Var) ? 4 : 2) | i) & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            int iHashCode = Long.hashCode(ciVar.T);
            e90 e90VarP = r31.P(ciVar, e90Var);
            wh0 wh0VarL = ciVar.l();
            sh.b.getClass();
            si siVar = rh.b;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, rh.e, c);
            dq0.m(ciVar, rh.d, wh0VarL);
            dq0.m(ciVar, rh.c, e90VarP);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            ciVar.p(true);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new j(i, 3, e90Var);
        }
    }

    public static final HashMap b(boolean z) {
        HashMap map = new HashMap(9);
        c(map, z, g2.e);
        c(map, z, g2.f);
        c(map, z, g2.g);
        c(map, z, g2.h);
        c(map, z, g2.i);
        c(map, z, g2.j);
        c(map, z, g2.k);
        c(map, z, g2.l);
        c(map, z, g2.m);
        return map;
    }

    public static final void c(HashMap map, boolean z, sa saVar) {
        map.put(saVar, new hb(saVar, z));
    }

    public static final l80 d(sa saVar, boolean z) {
        l80 l80Var = (l80) (z ? a : b).get(saVar);
        return l80Var == null ? new hb(saVar, z) : l80Var;
    }
}
