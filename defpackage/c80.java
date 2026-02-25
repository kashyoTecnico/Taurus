package defpackage;

import androidx.compose.foundation.d;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class c80 {
    static {
        new k40(si.r);
    }

    public static final void a(kf kfVar, mu0 mu0Var, b41 b41Var, zg zgVar, ci ciVar, int i) {
        int i2;
        mu0 mu0Var2;
        ciVar.W(-2127166334);
        if ((i & 6) == 0) {
            i2 = (ciVar.f(kfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.f(b41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.h(zgVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
            mu0Var2 = mu0Var;
        } else {
            ciVar.S();
            if ((i & 1) == 0 || ciVar.x()) {
                mu0Var2 = (mu0) ciVar.j(nu0.a);
            } else {
                ciVar.Q();
                mu0Var2 = mu0Var;
            }
            ciVar.q();
            fz fzVarA = sn0.a(ciVar);
            long j = kfVar.a;
            boolean zE = ciVar.e(j);
            Object objK = ciVar.K();
            if (zE || objK == vh.a) {
                objK = new x11(j, bf.b(j, 0.4f));
                ciVar.e0(objK);
            }
            c4.c(new fl0[]{lf.a.a(kfVar), d.a.a(fzVarA), xn0.a.a(ag.b), nu0.a.a(mu0Var2), y11.a.a((x11) objK), c41.a.a(b41Var)}, b10.b0(-1066563262, new h4(10, b41Var, zgVar), ciVar), ciVar, 56);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new e2(kfVar, mu0Var2, b41Var, zgVar, i, 3);
        }
    }
}
