package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class aq0 {
    public static final float a = 16;

    public static final void a(e90 e90Var, kw kwVar, kw kwVar2, kw kwVar3, kw kwVar4, int i, long j, long j2, u61 u61Var, zg zgVar, ci ciVar, int i2) {
        kw kwVar5;
        kw kwVar6;
        kw kwVar7;
        kw kwVar8;
        long j3;
        long jB;
        p71 p71Var;
        int i3;
        u61 u61Var2;
        e90 e90Var2;
        long j4;
        long j5;
        u61 u61Var3;
        kw kwVar9;
        kw kwVar10;
        int i4;
        kw kwVar11;
        kw kwVar12;
        ciVar.W(-1219521777);
        if (((i2 | 38497712) & 306783379) == 306783378 && ciVar.z()) {
            ciVar.Q();
            e90Var2 = e90Var;
            kwVar11 = kwVar;
            kwVar12 = kwVar2;
            kwVar9 = kwVar3;
            kwVar10 = kwVar4;
            i4 = i;
            j4 = j;
            j5 = j2;
            u61Var3 = u61Var;
        } else {
            ciVar.S();
            if ((i2 & 1) == 0 || ciVar.x()) {
                kwVar5 = gh.a;
                kwVar6 = gh.b;
                kwVar7 = gh.c;
                kwVar8 = gh.d;
                j3 = ((kf) ciVar.j(lf.a)).n;
                jB = lf.b(j3, ciVar);
                WeakHashMap weakHashMap = p71.u;
                View view = (View) ciVar.j(m4.f);
                WeakHashMap weakHashMap2 = p71.u;
                synchronized (weakHashMap2) {
                    try {
                        Object p71Var2 = weakHashMap2.get(view);
                        if (p71Var2 == null) {
                            p71Var2 = new p71(view);
                            weakHashMap2.put(view, p71Var2);
                        }
                        p71Var = (p71) p71Var2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                boolean zH = ciVar.h(p71Var) | ciVar.h(view);
                Object objK = ciVar.K();
                if (zH || objK == vh.a) {
                    objK = new d31(3, p71Var, view);
                    ciVar.e0(objK);
                }
                l81.c(p71Var, (iw) objK, ciVar);
                i3 = 2;
                u61Var2 = p71Var.g;
            } else {
                ciVar.Q();
                kwVar5 = kwVar;
                kwVar6 = kwVar2;
                kwVar7 = kwVar3;
                kwVar8 = kwVar4;
                i3 = i;
                j3 = j;
                jB = j2;
                u61Var2 = u61Var;
            }
            ciVar.q();
            boolean zF = ciVar.f(u61Var2);
            Object objK2 = ciVar.K();
            if (zF || objK2 == vh.a) {
                objK2 = new gb0(u61Var2);
                ciVar.e0(objK2);
            }
            gb0 gb0Var = (gb0) objK2;
            boolean zF2 = ciVar.f(gb0Var) | ciVar.f(u61Var2);
            Object objK3 = ciVar.K();
            if (zF2 || objK3 == vh.a) {
                objK3 = new j4(19, gb0Var, u61Var2);
                ciVar.e0(objK3);
            }
            rq rqVar = q71.a;
            xs0 xs0Var = new xs0(4, (iw) objK3);
            e90Var2 = e90Var;
            kw kwVar13 = kwVar5;
            kw kwVar14 = kwVar6;
            kw kwVar15 = kwVar7;
            kw kwVar16 = kwVar8;
            int i5 = i3;
            long j6 = j3;
            long j7 = jB;
            dy0.a(r31.r(e90Var2, xs0Var), null, j6, j7, 0.0f, 0.0f, b10.b0(-1979205334, new wp0(i5, kwVar13, zgVar, kwVar15, kwVar16, gb0Var, kwVar14), ciVar), ciVar, 12582912, 114);
            j4 = j6;
            j5 = j7;
            u61Var3 = u61Var2;
            kwVar9 = kwVar15;
            kwVar10 = kwVar16;
            i4 = i5;
            kwVar11 = kwVar13;
            kwVar12 = kwVar14;
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new xp0(e90Var2, kwVar11, kwVar12, kwVar9, kwVar10, i4, j4, j5, u61Var3, zgVar, i2);
        }
    }

    public static final void b(int i, kw kwVar, zg zgVar, kw kwVar2, kw kwVar3, u61 u61Var, kw kwVar4, ci ciVar, int i2) {
        int i3;
        zg zgVar2;
        u61 u61Var2;
        kw kwVar5;
        ciVar.W(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.h(kwVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zgVar2 = zgVar;
            i3 |= ciVar.h(zgVar2) ? 256 : 128;
        } else {
            zgVar2 = zgVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ciVar.h(kwVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ciVar.h(kwVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            u61Var2 = u61Var;
            i3 |= ciVar.f(u61Var2) ? 131072 : 65536;
        } else {
            u61Var2 = u61Var;
        }
        if ((1572864 & i2) == 0) {
            kwVar5 = kwVar4;
            i3 |= ciVar.h(kwVar5) ? 1048576 : 524288;
        } else {
            kwVar5 = kwVar4;
        }
        if ((i3 & 599187) == 599186 && ciVar.z()) {
            ciVar.Q();
        } else {
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object objK = ciVar.K();
            if (z || objK == vh.a) {
                wp0 wp0Var = new wp0(kwVar, kwVar2, kwVar3, i, u61Var2, kwVar5, zgVar2);
                ciVar.e0(wp0Var);
                objK = wp0Var;
            }
            l81.g(null, (kw) objK, ciVar, 0);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new zp0(i, kwVar, zgVar, kwVar2, kwVar3, u61Var, kwVar4, i2);
        }
    }
}
