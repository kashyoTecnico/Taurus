package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class z7 {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj = m61.a;
        dq0.a(0.5f, 0.5f);
        nm.f(0.5f, 0.5f);
    }

    public static final ww0 a(Object obj, q31 q31Var, e8 e8Var, String str, ci ciVar, int i) {
        Object objK = ciVar.K();
        Object obj2 = vh.a;
        if (objK == obj2) {
            objK = qo0.n(null);
            ciVar.e0(objK);
        }
        za0 za0Var = (za0) objK;
        Object objK2 = ciVar.K();
        if (objK2 == obj2) {
            objK2 = new x7(obj, q31Var, null);
            ciVar.e0(objK2);
        }
        x7 x7Var = (x7) objK2;
        za0 za0VarQ = qo0.q(null, ciVar);
        za0 za0VarQ2 = qo0.q(e8Var, ciVar);
        Object objK3 = ciVar.K();
        if (objK3 == obj2) {
            objK3 = nm.a(-1, 6, null);
            ciVar.e0(objK3);
        }
        ld ldVar = (ld) objK3;
        boolean zH = ciVar.h(ldVar) | ciVar.h(obj);
        Object objK4 = ciVar.K();
        if (zH || objK4 == obj2) {
            objK4 = new g3(2, ldVar, obj);
            ciVar.e0(objK4);
        }
        l81.f((gw) objK4, ciVar);
        boolean zH2 = ciVar.h(ldVar) | ciVar.h(x7Var) | ciVar.f(za0VarQ2) | ciVar.f(za0VarQ);
        Object objK5 = ciVar.K();
        if (zH2 || objK5 == obj2) {
            Object y7Var = new y7(ldVar, x7Var, za0VarQ2, za0VarQ, null);
            ciVar.e0(y7Var);
            objK5 = y7Var;
        }
        l81.d(ciVar, (kw) objK5, ldVar);
        ww0 ww0Var = (ww0) za0Var.getValue();
        return ww0Var == null ? x7Var.c : ww0Var;
    }
}
