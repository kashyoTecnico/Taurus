package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class z4 {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(id0 id0Var, e90 e90Var, long j, ci ciVar, int i) {
        int i2;
        ciVar.W(1776202187);
        int i3 = (ciVar.f(id0Var) ? 4 : 2) | i | (ciVar.f(e90Var) ? 32 : 16) | 128;
        if ((i3 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            ciVar.S();
            if ((i & 1) == 0 || ciVar.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ciVar.Q();
                i2 = i3 & (-897);
            }
            ciVar.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = ciVar.K();
            if (z || objK == vh.a) {
                objK = new h(6, id0Var);
                ciVar.e0(objK);
            }
            m20.d(id0Var, g2.f, b10.b0(-1653527038, new t4(j, dt0.a(e90Var, false, (iw) objK)), ciVar), ciVar, i4 | 432);
        }
        long j2 = j;
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new u4(id0Var, e90Var, j2, i, 0);
        }
    }

    public static final void b(e90 e90Var, ci ciVar, int i, int i2) {
        int i3;
        ciVar.W(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (ciVar.f(e90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            if (i4 != 0) {
                e90Var = b90.a;
            }
            h9.a(ciVar, r31.r(b.f(e90Var, b, a), y4.f));
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new v4(e90Var, i, i2);
        }
    }
}
