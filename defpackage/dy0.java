package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.graphics.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class dy0 {
    public static final vi a = new vi(si.C);

    public static final void a(e90 e90Var, ju0 ju0Var, long j, long j2, float f, float f2, zg zgVar, ci ciVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            ju0Var = nm.h;
        }
        ju0 ju0Var2 = ju0Var;
        long jB = (i2 & 8) != 0 ? lf.b(j, ciVar) : j2;
        float f3 = (i2 & 16) != 0 ? 0 : f;
        float f4 = (i2 & 32) != 0 ? 0 : f2;
        vi viVar = a;
        float f5 = ((kp) ciVar.j(viVar)).d + f3;
        c4.c(new fl0[]{mj.a.a(new bf(jB)), viVar.a(new kp(f5))}, b10.b0(-70914509, new by0(e90Var, ju0Var2, j, f5, null, f4, zgVar), ciVar), ciVar, 56);
    }

    public static final e90 b(e90 e90Var, ju0 ju0Var, long j, cb cbVar, float f) {
        e90 borderModifierNodeElement = b90.a;
        e90 e90VarC = e90Var.c(f > 0.0f ? a.a(borderModifierNodeElement, f, ju0Var, 124895) : borderModifierNodeElement);
        if (cbVar != null) {
            borderModifierNodeElement = new BorderModifierNodeElement(cbVar.a, cbVar.b, ju0Var);
        }
        return c10.r(androidx.compose.foundation.a.a(e90VarC.c(borderModifierNodeElement), j, ju0Var), ju0Var);
    }

    public static final long c(long j, float f, ci ciVar) {
        kf kfVar = (kf) ciVar.j(lf.a);
        boolean zBooleanValue = ((Boolean) ciVar.j(lf.b)).booleanValue();
        long j2 = kfVar.p;
        if (!bf.c(j, j2) || !zBooleanValue) {
            return j;
        }
        if (kp.a(f, 0)) {
            return j2;
        }
        return r31.s(bf.b(kfVar.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
