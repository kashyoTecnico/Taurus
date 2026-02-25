package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class f31 {
    public static final /* synthetic */ int a = 0;

    static {
        m20.I(si.F);
    }

    public static final c31 a(e31 e31Var, Object obj, Object obj2, jt jtVar, q31 q31Var, ci ciVar) {
        boolean zF = ciVar.f(e31Var);
        Object objK = ciVar.K();
        Object obj3 = vh.a;
        if (zF || objK == obj3) {
            k8 k8Var = (k8) q31Var.a.g(obj2);
            k8Var.d();
            objK = new c31(e31Var, obj, k8Var, q31Var);
            ciVar.e0(objK);
        }
        c31 c31Var = (c31) objK;
        if (((Boolean) e31Var.i.getValue()).booleanValue()) {
            c31Var.e.setValue(obj2);
            c31Var.f.setValue(jtVar);
            if (!c10.i(c31Var.a().d, obj) || !c10.i(c31Var.a().c, obj2)) {
                c31Var.b(obj, false);
            }
        } else {
            boolean z = c31Var.j;
            zg0 zg0Var = c31Var.h;
            zg0 zg0Var2 = c31Var.e;
            zg0 zg0Var3 = c31Var.k;
            vg0 vg0Var = c31Var.i;
            if ((!z || !obj2.equals(null)) && (!c10.i(zg0Var2.getValue(), obj2) || vg0Var.g() != -1.0f)) {
                zg0Var2.setValue(obj2);
                c31Var.f.setValue(jtVar);
                c31Var.b(vg0Var.g() == -3.0f ? obj2 : zg0Var3.getValue(), !((Boolean) zg0Var.getValue()).booleanValue());
                zg0Var.setValue(Boolean.valueOf(vg0Var.g() == -3.0f));
                if (vg0Var.g() >= 0.0f) {
                    zg0Var3.setValue(c31Var.a().b((long) (vg0Var.g() * c31Var.a().c())));
                } else if (vg0Var.g() == -3.0f) {
                    zg0Var3.setValue(obj2);
                }
                c31Var.j = false;
                vg0Var.h(-1.0f);
            }
        }
        boolean zF2 = ciVar.f(e31Var) | ciVar.f(c31Var);
        Object objK2 = ciVar.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new d31(e31Var, c31Var);
            ciVar.e0(objK2);
        }
        l81.c(c31Var, (iw) objK2, ciVar);
        return c31Var;
    }
}
