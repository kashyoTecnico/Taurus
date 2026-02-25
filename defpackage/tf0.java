package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tf0 extends y20 implements kw {
    public final /* synthetic */ e90 e;
    public final /* synthetic */ kw f;
    public final /* synthetic */ xn g;
    public final /* synthetic */ zz0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ iw j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ c21 l;
    public final /* synthetic */ t20 m;
    public final /* synthetic */ s20 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ of q;
    public final /* synthetic */ fa0 r;
    public final /* synthetic */ ju0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(e90 e90Var, kw kwVar, xn xnVar, zz0 zz0Var, String str, iw iwVar, boolean z, c21 c21Var, t20 t20Var, s20 s20Var, int i, int i2, of ofVar, fa0 fa0Var, ju0 ju0Var) {
        super(2);
        this.e = e90Var;
        this.f = kwVar;
        this.g = xnVar;
        this.h = zz0Var;
        this.i = str;
        this.j = iwVar;
        this.k = z;
        this.l = c21Var;
        this.m = t20Var;
        this.n = s20Var;
        this.o = i;
        this.p = i2;
        this.q = ofVar;
        this.r = fa0Var;
        this.s = ju0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Resources.NotFoundException {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            kw kwVar = this.f;
            e90 e90VarG = b90.a;
            if (kwVar != null) {
                e90VarG = a.g(dt0.a(e90VarG, true, s40.m), 0.0f, this.g.I(xf0.b), 0.0f, 13);
            }
            e90 e90VarC = this.e.c(e90VarG);
            ciVar.j(m4.a);
            ((Context) ciVar.j(m4.b)).getResources().getString(R.string.default_error_message);
            float f = j01.b;
            e90 e90VarA = b.a(e90VarC, qf0.c, qf0.b);
            zz0 zz0Var = this.h;
            fw0 fw0Var = new fw0(zz0Var.i);
            kw kwVar2 = this.f;
            ju0 ju0Var = this.s;
            String str = this.i;
            boolean z = this.k;
            of ofVar = this.q;
            fa0 fa0Var = this.r;
            ma.a(str, this.j, e90VarA, z, this.l, this.m, this.n, this.o, this.p, ofVar, null, fa0Var, fw0Var, b10.b0(1474611661, new sf0(str, z, ofVar, fa0Var, kwVar2, zz0Var, ju0Var), ciVar), ciVar, 0);
        }
        return j41.a;
    }
}
