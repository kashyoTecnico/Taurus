package defpackage;

import androidx.compose.foundation.layout.b;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ay extends y20 implements lw {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ c21 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(int i, int i2, c21 c21Var) {
        super(3);
        this.e = i;
        this.f = i2;
        this.g = c21Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        ci ciVar = (ci) obj2;
        ((Number) obj3).intValue();
        ciVar.V(408240218);
        int i = this.e;
        int i2 = this.f;
        c10.b0(i, i2);
        b90 b90Var = b90.a;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            ciVar.p(false);
            return b90Var;
        }
        xn xnVar = (xn) ciVar.j(ti.h);
        jv jvVar = (jv) ciVar.j(ti.k);
        e30 e30Var = (e30) ciVar.j(ti.n);
        c21 c21Var = this.g;
        boolean zF = ciVar.f(c21Var) | ciVar.f(e30Var);
        Object objK = ciVar.K();
        v71 v71Var = vh.a;
        if (zF || objK == v71Var) {
            objK = dp0.i(c21Var, e30Var);
            ciVar.e0(objK);
        }
        c21 c21Var2 = (c21) objK;
        boolean zF2 = ciVar.f(jvVar) | ciVar.f(c21Var2);
        Object objK2 = ciVar.K();
        if (zF2 || objK2 == v71Var) {
            iw0 iw0Var = c21Var2.a;
            vy0 vy0Var = iw0Var.f;
            zv zvVar = iw0Var.c;
            if (zvVar == null) {
                zvVar = zv.f;
            }
            xv xvVar = iw0Var.d;
            int i3 = xvVar != null ? xvVar.a : 0;
            yv yvVar = iw0Var.e;
            objK2 = ((kv) jvVar).b(vy0Var, zvVar, i3, yvVar != null ? yvVar.a : 65535);
            ciVar.e0(objK2);
        }
        ww0 ww0Var = (ww0) objK2;
        boolean zF3 = ciVar.f(ww0Var.getValue()) | ciVar.f(xnVar) | ciVar.f(jvVar) | ciVar.f(c21Var) | ciVar.f(e30Var);
        Object objK3 = ciVar.K();
        if (zF3 || objK3 == v71Var) {
            objK3 = Integer.valueOf((int) (d01.a(c21Var2, xnVar, jvVar, d01.a, 1) & 4294967295L));
            ciVar.e0(objK3);
        }
        int iIntValue = ((Number) objK3).intValue();
        boolean zF4 = ciVar.f(c21Var) | ciVar.f(xnVar) | ciVar.f(jvVar) | ciVar.f(e30Var) | ciVar.f(ww0Var.getValue());
        Object objK4 = ciVar.K();
        if (zF4 || objK4 == v71Var) {
            StringBuilder sb = new StringBuilder();
            String str = d01.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objK4 = Integer.valueOf((int) (d01.a(c21Var2, xnVar, jvVar, sb.toString(), 2) & 4294967295L));
            ciVar.e0(objK4);
        }
        int iIntValue2 = ((Number) objK4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue) : null;
        e90 e90VarC = b.c(b90Var, numValueOf != null ? xnVar.j0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? xnVar.j0(numValueOf2.intValue()) : Float.NaN);
        ciVar.p(false);
        return e90VarC;
    }
}
