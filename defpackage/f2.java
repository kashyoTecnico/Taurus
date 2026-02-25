package defpackage;

import androidx.compose.foundation.layout.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class f2 {
    public static final float a = 280;
    public static final float b = 560;
    public static final float c = 8;
    public static final float d = 12;
    public static final jg0 e;
    public static final jg0 f;
    public static final jg0 g;

    static {
        float f2 = 24;
        e = new jg0(f2, f2, f2, f2);
        float f3 = 16;
        a.b(f3);
        f = a.b(f3);
        g = a.b(f2);
    }

    public static final void a(zg zgVar, e90 e90Var, kw kwVar, kw kwVar2, ju0 ju0Var, long j, float f2, long j2, long j3, long j4, long j5, ci ciVar, int i) {
        e90 e90Var2;
        ciVar.W(1522575799);
        int i2 = i | 48 | (ciVar.h(null) ? 256 : 128) | (ciVar.h(kwVar) ? 2048 : 1024) | (ciVar.h(kwVar2) ? 16384 : 8192) | (ciVar.f(ju0Var) ? 131072 : 65536) | (ciVar.e(j) ? 1048576 : 524288) | (ciVar.c(f2) ? 8388608 : 4194304) | (ciVar.e(j2) ? 67108864 : 33554432) | (ciVar.e(j3) ? 536870912 : 268435456);
        int i3 = (ciVar.e(j4) ? (char) 4 : (char) 2) | (ciVar.e(j5) ? ' ' : (char) 16);
        if ((i2 & 306783379) == 306783378 && (i3 & 19) == 18 && ciVar.z()) {
            ciVar.Q();
            e90Var2 = e90Var;
        } else {
            zg zgVarB0 = b10.b0(-2126308228, new v1(kwVar, kwVar2, j3, j4, j5, j2, zgVar), ciVar);
            int i4 = i2 >> 12;
            int i5 = (i4 & 896) | (i4 & 112) | 12582918 | ((i2 >> 9) & 57344);
            b90 b90Var = b90.a;
            dy0.a(b90Var, ju0Var, j, 0L, f2, 0.0f, zgVarB0, ciVar, i5, 104);
            e90Var2 = b90Var;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new w1(zgVar, e90Var2, kwVar, kwVar2, ju0Var, j, f2, j2, j3, j4, j5, i);
        }
    }

    public static final void b(zg zgVar, ci ciVar, int i) {
        ciVar.W(586821353);
        if ((i & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            Object objK = ciVar.K();
            if (objK == vh.a) {
                objK = new e5(6);
                ciVar.e0(objK);
            }
            l80 l80Var = (l80) objK;
            int iHashCode = Long.hashCode(ciVar.T);
            wh0 wh0VarL = ciVar.l();
            e90 e90VarP = r31.P(ciVar, b90.a);
            sh.b.getClass();
            si siVar = rh.b;
            ciVar.X();
            if (ciVar.S) {
                ciVar.k(siVar);
            } else {
                ciVar.h0();
            }
            dq0.m(ciVar, rh.e, l80Var);
            dq0.m(ciVar, rh.d, wh0VarL);
            n9 n9Var = rh.f;
            if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                b8.k(iHashCode, ciVar, iHashCode, n9Var);
            }
            dq0.m(ciVar, rh.c, e90VarP);
            zgVar.e(ciVar, 6);
            ciVar.p(true);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new y1(zgVar, i);
        }
    }

    public static final void c(gw gwVar, zg zgVar, e90 e90Var, kw kwVar, kw kwVar2, kw kwVar3, ju0 ju0Var, long j, long j2, long j3, long j4, float f2, no noVar, ci ciVar, int i, int i2) {
        int i3;
        zg zgVar2;
        kw kwVar4;
        int i4;
        ciVar.W(-919826268);
        if ((i & 6) == 0) {
            i3 = (ciVar.h(gwVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            zgVar2 = zgVar;
            i3 |= ciVar.h(zgVar2) ? 32 : 16;
        } else {
            zgVar2 = zgVar;
        }
        if ((i & 384) == 0) {
            i3 |= ciVar.f(e90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            kwVar4 = kwVar;
            i3 |= ciVar.h(kwVar4) ? 2048 : 1024;
        } else {
            kwVar4 = kwVar;
        }
        if ((i & 24576) == 0) {
            i3 |= ciVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ciVar.h(kwVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ciVar.h(kwVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ciVar.f(ju0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ciVar.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ciVar.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ciVar.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ciVar.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ciVar.c(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ciVar.f(noVar) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
        } else {
            d(gwVar, e90Var, noVar, b10.b0(-1852840226, new a2(kwVar2, kwVar3, ju0Var, j, f2, j2, j3, j4, kwVar4, zgVar2), ciVar), ciVar, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new b2(gwVar, zgVar, e90Var, kwVar, kwVar2, kwVar3, ju0Var, j, j2, j3, j4, f2, noVar, i, i2);
        }
    }

    public static final void d(gw gwVar, e90 e90Var, no noVar, zg zgVar, ci ciVar, int i) {
        int i2;
        ciVar.W(-1922902937);
        if ((i & 6) == 0) {
            i2 = (ciVar.h(gwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ciVar.f(e90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ciVar.f(noVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ciVar.h(zgVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && ciVar.z()) {
            ciVar.Q();
        } else {
            l81.b(gwVar, noVar, b10.b0(905289008, new d2(e90Var, zgVar), ciVar), ciVar, ((i2 >> 3) & 112) | (i2 & 14) | 384);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new e2(gwVar, e90Var, noVar, zgVar, i, 0);
        }
    }
}
