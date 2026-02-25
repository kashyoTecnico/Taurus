package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class j01 {
    public static final float b;
    public static final float g;
    public static final float h;
    public static final e90 i;
    public static final long a = hj.a(0, 0, 0, 0);
    public static final float c = 12;
    public static final float d = 4;
    public static final float e = 2;
    public static final float f = 24;

    static {
        float f2 = 16;
        b = f2;
        g = f2;
        h = f2;
        float f3 = 48;
        i = b.a(b90.a, f3, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x044f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x062e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r38, defpackage.kw r39, defpackage.of r40, defpackage.kw r41, boolean r42, defpackage.fa0 r43, defpackage.jg0 r44, defpackage.zz0 r45, defpackage.zg r46, defpackage.ci r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j01.a(java.lang.String, kw, of, kw, boolean, fa0, jg0, zz0, zg, ci, int, int):void");
    }

    public static final void b(long j, c21 c21Var, kw kwVar, ci ciVar, int i2) {
        int i3;
        ci ciVar2;
        long j2;
        c21 c21Var2;
        kw kwVar2;
        ciVar.W(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.e(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.f(c21Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ciVar.h(kwVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
            j2 = j;
            c21Var2 = c21Var;
            kwVar2 = kwVar;
            ciVar2 = ciVar;
        } else {
            ciVar2 = ciVar;
            nm.g(j, c21Var, kwVar, ciVar2, i3 & 1022);
            j2 = j;
            c21Var2 = c21Var;
            kwVar2 = kwVar;
        }
        nl0 nl0VarR = ciVar2.r();
        if (nl0VarR != null) {
            nl0VarR.d = new el0(j2, c21Var2, kwVar2, i2, 1);
        }
    }

    public static final Object c(g80 g80Var) {
        Object objL = g80Var.l();
        h30 h30Var = objL instanceof h30 ? (h30) objL : null;
        if (h30Var != null) {
            return h30Var.r;
        }
        return null;
    }
}
