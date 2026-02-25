package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.relocation.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uk extends y20 implements kw {
    public final /* synthetic */ r40 e;
    public final /* synthetic */ c21 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ s01 i;
    public final /* synthetic */ a11 j;
    public final /* synthetic */ of k;
    public final /* synthetic */ e90 l;
    public final /* synthetic */ e90 m;
    public final /* synthetic */ e90 n;
    public final /* synthetic */ e90 o;
    public final /* synthetic */ lb p;
    public final /* synthetic */ u01 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ iw s;
    public final /* synthetic */ hd0 t;
    public final /* synthetic */ xn u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(r40 r40Var, c21 c21Var, int i, int i2, s01 s01Var, a11 a11Var, of ofVar, e90 e90Var, e90 e90Var2, e90 e90Var3, e90 e90Var4, lb lbVar, u01 u01Var, boolean z, iw iwVar, hd0 hd0Var, xn xnVar) {
        super(2);
        this.e = r40Var;
        this.f = c21Var;
        this.g = i;
        this.h = i2;
        this.i = s01Var;
        this.j = a11Var;
        this.k = ofVar;
        this.l = e90Var;
        this.m = e90Var2;
        this.n = e90Var3;
        this.o = e90Var4;
        this.p = lbVar;
        this.q = u01Var;
        this.r = z;
        this.s = iwVar;
        this.t = hd0Var;
        this.u = xnVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        e90 u51Var;
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            r40 r40Var = this.e;
            e90 e90VarC = b.c(b90.a, ((kp) r40Var.g.getValue()).d, Float.NaN);
            int i = this.g;
            int i2 = this.h;
            c21 c21Var = this.f;
            e90 e90VarR = r31.r(e90VarC, new ay(i, i2, c21Var));
            a11 a11Var = this.j;
            long j = a11Var.b;
            boolean zH = ciVar.h(r40Var);
            Object objK = ciVar.K();
            if (zH || objK == vh.a) {
                objK = new b(6, r40Var);
                ciVar.e0(objK);
            }
            gw gwVar = (gw) objK;
            s01 s01Var = this.i;
            if0 if0Var = (if0) s01Var.e.getValue();
            int i3 = w11.c;
            int iE = (int) (j >> 32);
            long j2 = s01Var.d;
            if (iE == ((int) (j2 >> 32)) && (iE = (int) (j & 4294967295L)) == ((int) (4294967295L & j2))) {
                iE = w11.e(j);
            }
            s01Var.d = j;
            y21 y21VarD = c10.D(this.k, a11Var.a);
            int iOrdinal = if0Var.ordinal();
            if (iOrdinal == 0) {
                u51Var = new u51(s01Var, iE, y21VarD, gwVar);
            } else {
                if (iOrdinal != 1) {
                    throw new fg();
                }
                u51Var = new my(s01Var, iE, y21VarD, gwVar);
            }
            jp0.a(a.a(r31.r(androidx.compose.ui.graphics.a.b(e90VarR, 0.0f, null, 520191).c(u51Var).c(this.l).c(this.m), new xs0(3, c21Var)).c(this.n).c(this.o), this.p), b10.b0(-363167407, new tk(this.q, r40Var, this.r, this.s, a11Var, this.t, this.u, this.h), ciVar), ciVar, 48);
        }
        return j41.a;
    }
}
