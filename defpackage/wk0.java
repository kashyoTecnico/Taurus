package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class wk0 {
    public static final float a;
    public static final float b;
    public static final em c;

    static {
        float f = 10;
        a = f;
        a.f(dt0.a(androidx.compose.ui.layout.a.b(y4.g), true, s40.w), 0.0f, f, 1);
        b = xk0.b - (xk0.a * 2);
        new em(0.2f, 0.0f, 0.8f);
        new em(0.4f, 0.0f, 1.0f);
        new em(0.0f, 0.0f, 0.65f);
        new em(0.1f, 0.0f, 0.45f);
        c = new em(0.4f, 0.0f, 0.2f);
    }

    public static final void a(e90 e90Var, long j, float f, long j2, int i, ci ciVar, int i2) {
        long j3;
        int i3;
        long j4;
        float f2;
        long j5;
        float f3;
        long j6;
        float f4;
        long j7;
        int i4;
        long j8;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        ciVar.W(-115871647);
        if (((i2 | 26000) & 9363) == 9362 && ciVar.z()) {
            ciVar.Q();
            j7 = j;
            f4 = f;
            j8 = j2;
            i4 = i;
        } else {
            ciVar.S();
            if ((i2 & 1) == 0 || ciVar.x()) {
                float f5 = tk0.a;
                float f6 = xk0.a;
                long jE = lf.e(26, ciVar);
                float f7 = tk0.a;
                j3 = bf.f;
                i3 = tk0.b;
                j4 = jE;
                f2 = f7;
            } else {
                ciVar.Q();
                j4 = j;
                f2 = f;
                j3 = j2;
                i3 = i;
            }
            ciVar.q();
            int i5 = i3;
            qx0 qx0Var = new qx0(((xn) ciVar.j(ti.h)).A(f2), 0.0f, i5, 0, 26);
            Object objK = ciVar.K();
            Object obj = vh.a;
            if (objK == obj) {
                objK = new nz();
                ciVar.e0(objK);
            }
            nz nzVar = (nz) objK;
            nzVar.a(0, ciVar);
            long j9 = j3;
            q31 q31Var = y41.b;
            of ofVar = zq.b;
            lz lzVarO = l81.o(nzVar, 0, 5, q31Var, r31.H(r31.c0(6660, 2, ofVar)), ciVar, 33208, 16);
            lz lzVarN = l81.n(nzVar, 286.0f, r31.H(r31.c0(1332, 2, ofVar)), ciVar);
            c8 c8Var = new c8(2);
            c8Var.b = 1332;
            v20 v20VarB = c8Var.b(fValueOf2, 0);
            em emVar = c;
            v20VarB.b = emVar;
            c8Var.b(fValueOf, 666);
            lz lzVarN2 = l81.n(nzVar, 290.0f, r31.H(new w20(c8Var)), ciVar);
            c8 c8Var2 = new c8(2);
            c8Var2.b = 1332;
            c8Var2.b(fValueOf2, 666).b = emVar;
            c8Var2.b(fValueOf, c8Var2.b);
            lz lzVarN3 = l81.n(nzVar, 290.0f, r31.H(new w20(c8Var2)), ciVar);
            e90 e90VarE = b.e(dt0.a(e90Var, true, s40.x), b);
            boolean zE = ciVar.e(j9) | ciVar.h(qx0Var) | ciVar.f(lzVarO) | ciVar.f(lzVarN2) | ciVar.f(lzVarN3) | ciVar.f(lzVarN) | ciVar.e(j4);
            Object objK2 = ciVar.K();
            if (zE || objK2 == obj) {
                j5 = j4;
                f3 = f2;
                Object uk0Var = new uk0(j9, qx0Var, lzVarO, lzVarN2, lzVarN3, lzVarN, f3, j5);
                j6 = j9;
                ciVar.e0(uk0Var);
                objK2 = uk0Var;
            } else {
                j6 = j9;
                j5 = j4;
                f3 = f2;
            }
            r31.a(e90VarE, (iw) objK2, ciVar, 0);
            f4 = f3;
            j7 = j5;
            i4 = i5;
            j8 = j6;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new vk0(e90Var, j7, f4, j8, i4, i2);
        }
    }

    public static final void b(sq sqVar, float f, float f2, long j, qx0 qx0Var) {
        float f3 = 2;
        float f4 = qx0Var.a / f3;
        float fD = yu0.d(sqVar.c()) - (f3 * f4);
        sqVar.m0(j, f, f2, nm.f(f4, f4), dq0.a(fD, fD), qx0Var);
    }
}
