package defpackage;

import android.util.Base64;
import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class q70 {
    public static final zg0 a = qo0.n("");
    public static final String b;

    static {
        byte[] bArrDecode = Base64.decode("REdtb2JpbGVNeA==", 0);
        c10.o(bArrDecode, "decode(...)");
        b = new String(bArrDecode, xd.a);
    }

    public static final void a(final String str, final iw iwVar, final e90 e90Var, ci ciVar, final int i) {
        za0 za0Var;
        c10.p(str, "datosEquipo");
        c10.p(iwVar, "onRemoveDoConfirmed");
        ciVar.W(-536151823);
        int i2 = i | (ciVar.f(str) ? 4 : 2) | (ciVar.h(iwVar) ? 32 : 16) | (ciVar.f(e90Var) ? 256 : 128);
        if ((i2 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            ciVar.V(1290718104);
            Object objK = ciVar.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = qo0.n(Boolean.FALSE);
                ciVar.e0(objK);
            }
            za0 za0Var2 = (za0) objK;
            ciVar.p(false);
            ciVar.V(1290719861);
            Object objK2 = ciVar.K();
            if (objK2 == v71Var) {
                objK2 = qo0.n("");
                ciVar.e0(objK2);
            }
            za0 za0Var3 = (za0) objK2;
            ciVar.p(false);
            e90 e90VarC = e90Var.c(b.b);
            tf tfVarA = rf.a(o9.d, g2.q, ciVar, 54);
            int iHashCode = Long.hashCode(ciVar.T);
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
            dq0.m(ciVar, rh.e, tfVarA);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            l11.b("PANEL DE CONTROL", null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, ((b41) ciVar.j(c41.a)).e, ciVar, 6, 65534);
            h9.a(ciVar, b.b(16));
            l11.b(str, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, ciVar, i2 & 14, 131070);
            h9.a(ciVar, b.b(24));
            ciVar.V(692274122);
            Object objK3 = ciVar.K();
            if (objK3 == v71Var) {
                za0Var = za0Var2;
                objK3 = new m70(za0Var, 0);
                ciVar.e0(objK3);
            } else {
                za0Var = za0Var2;
            }
            ciVar.p(false);
            c10.b((gw) objK3, null, false, null, null, null, null, fh.a, ciVar, 805306374, 510);
            ciVar.p(true);
            if (((Boolean) za0Var.getValue()).booleanValue()) {
                ciVar.V(1290737676);
                Object objK4 = ciVar.K();
                if (objK4 == v71Var) {
                    objK4 = new m70(za0Var, 1);
                    ciVar.e0(objK4);
                }
                ciVar.p(false);
                c4.a((gw) objK4, b10.b0(1975946500, new o70(iwVar, za0Var3, za0Var), ciVar), null, b10.b0(-74462398, new p70(za0Var, 0), ciVar), fh.d, b10.b0(-1002592097, new p70(za0Var3, 1), ciVar), null, 0L, 0L, 0L, 0L, 0.0f, null, ciVar, 1772598);
            }
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new kw(str, iwVar, e90Var, i) { // from class: n70
                public final /* synthetic */ String d;
                public final /* synthetic */ iw e;
                public final /* synthetic */ e90 f;

                @Override // defpackage.kw
                public final Object e(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = d80.I(1);
                    q70.a(this.d, this.e, this.f, (ci) obj, I);
                    return j41.a;
                }
            };
        }
    }
}
