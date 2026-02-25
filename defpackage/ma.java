package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ma {
    static {
        float f = 40;
        nm.e(f, f);
    }

    public static final void a(String str, iw iwVar, e90 e90Var, boolean z, c21 c21Var, t20 t20Var, s20 s20Var, int i, int i2, of ofVar, iw iwVar2, fa0 fa0Var, fw0 fw0Var, zg zgVar, ci ciVar, int i3) {
        iw iwVar3;
        iw iwVar4;
        ciVar.W(945255183);
        int i4 = i3 | (ciVar.f(str) ? 4 : 2) | (ciVar.h(iwVar) ? 32 : 16) | (ciVar.f(e90Var) ? 256 : 128) | (ciVar.g(z) ? 2048 : 1024) | (ciVar.g(false) ? 16384 : 8192) | (ciVar.f(c21Var) ? 131072 : 65536) | (ciVar.f(t20Var) ? 1048576 : 524288) | (ciVar.f(s20Var) ? 8388608 : 4194304) | (ciVar.g(false) ? 67108864 : 33554432) | (ciVar.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (ciVar.d(i2) ? 4 : 2) | (ciVar.f(ofVar) ? 32 : 16) | 384 | (ciVar.f(fa0Var) ? 2048 : 1024) | (ciVar.f(fw0Var) ? 16384 : 8192);
        if ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898 && ciVar.z()) {
            ciVar.Q();
            iwVar4 = iwVar2;
        } else {
            ciVar.S();
            if ((i3 & 1) == 0 || ciVar.x()) {
                iwVar3 = e3.q;
            } else {
                ciVar.Q();
                iwVar3 = iwVar2;
            }
            ciVar.q();
            Object objK = ciVar.K();
            iw iwVar5 = iwVar3;
            Object obj = vh.a;
            if (objK == obj) {
                objK = qo0.n(new a11(str, 0L, 6));
                ciVar.e0(objK);
            }
            za0 za0Var = (za0) objK;
            a11 a11Var = (a11) za0Var.getValue();
            a11 a11Var2 = new a11(new q8(str), a11Var.b, a11Var.c);
            boolean zF = ciVar.f(a11Var2);
            Object objK2 = ciVar.K();
            if (zF || objK2 == obj) {
                objK2 = new g3(3, a11Var2, za0Var);
                ciVar.e0(objK2);
            }
            l81.f((gw) objK2, ciVar);
            boolean z2 = (i4 & 14) == 4;
            Object objK3 = ciVar.K();
            if (z2 || objK3 == obj) {
                objK3 = qo0.n(str);
                ciVar.e0(objK3);
            }
            Object obj2 = (za0) objK3;
            int i6 = t20Var.a;
            u20 u20Var = new u20(i6);
            if (i6 == 0) {
                u20Var = null;
            }
            xy xyVar = new xy(0, true, u20Var != null ? u20Var.a : 1, 1, d60.f);
            boolean zF2 = ciVar.f(obj2) | ((i4 & 112) == 32);
            Object objK4 = ciVar.K();
            if (zF2 || objK4 == obj) {
                objK4 = new u7(iwVar, za0Var, obj2, 1);
                ciVar.e0(objK4);
            }
            int i7 = i5 << 9;
            b10.g(a11Var2, (iw) objK4, e90Var, c21Var, ofVar, iwVar5, fa0Var, fw0Var, true, i, i2, xyVar, s20Var, z, zgVar, ciVar, (i4 & 896) | ((i4 >> 6) & 7168) | (i7 & 57344) | 196608 | (3670016 & i7) | (i7 & 29360128), (i4 & 57344) | ((i4 >> 15) & 896) | (i4 & 7168) | 196608);
            iwVar4 = iwVar5;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new la(str, iwVar, e90Var, z, c21Var, t20Var, s20Var, i, i2, ofVar, iwVar4, fa0Var, fw0Var, zgVar, i3);
        }
    }
}
