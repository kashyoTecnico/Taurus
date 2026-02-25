package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yi0 implements fz {
    public final za0 a;

    public yi0(za0 za0Var) {
        this.a = za0Var;
    }

    @Override // defpackage.fz
    public final gz a(fa0 fa0Var, ci ciVar) {
        long jB;
        ciVar.V(988743187);
        wn0 wn0Var = (wn0) ciVar.j(xn0.a);
        za0 za0Var = this.a;
        if (((bf) za0Var.getValue()).a != bf.g) {
            ciVar.V(-303571590);
            ciVar.p(false);
            jB = ((bf) za0Var.getValue()).a;
        } else {
            ciVar.V(-303521246);
            jB = wn0Var.b(ciVar);
            ciVar.p(false);
        }
        za0 za0VarQ = qo0.q(new bf(jB), ciVar);
        za0 za0VarQ2 = qo0.q(wn0Var.a(ciVar), ciVar);
        ciVar.V(331259447);
        ViewGroup viewGroupB = yn0.b((View) ciVar.j(m4.f));
        boolean zF = ciVar.f(this) | ciVar.f(fa0Var) | ciVar.f(viewGroupB);
        Object objK = ciVar.K();
        Object obj = vh.a;
        if (zF || objK == obj) {
            objK = new v6(za0VarQ, za0VarQ2, viewGroupB);
            ciVar.e0(objK);
        }
        v6 v6Var = (v6) objK;
        ciVar.p(false);
        boolean zF2 = ciVar.f(fa0Var) | ciVar.h(v6Var);
        Object objK2 = ciVar.K();
        if (zF2 || objK2 == obj) {
            objK2 = new ob(fa0Var, v6Var, (lk) null, 8);
            ciVar.e0(objK2);
        }
        l81.e(v6Var, fa0Var, (kw) objK2, ciVar);
        ciVar.p(false);
        return v6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi0) {
            return kp.a(Float.NaN, Float.NaN) && this.a.equals(((yi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + b8.b(Float.NaN, Boolean.hashCode(true) * 31, 31);
    }
}
