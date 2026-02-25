package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x7 {
    public final q31 a;
    public final Object b;
    public final f8 c;
    public final zg0 d;
    public final zg0 e;
    public final lb0 f;
    public final k8 g;
    public final k8 h;
    public final k8 i;
    public final k8 j;

    public x7(Object obj, q31 q31Var, Object obj2) {
        this.a = q31Var;
        this.b = obj2;
        f8 f8Var = new f8(q31Var, obj, null, 60);
        this.c = f8Var;
        this.d = qo0.n(Boolean.FALSE);
        this.e = qo0.n(obj);
        this.f = new lb0();
        new ow0(obj2);
        k8 k8Var = f8Var.f;
        boolean z = k8Var instanceof g8;
        k8 k8Var2 = z ? b10.e : k8Var instanceof h8 ? b10.f : k8Var instanceof i8 ? b10.g : b10.h;
        this.g = k8Var2;
        k8 k8Var3 = z ? b10.a : k8Var instanceof h8 ? b10.b : k8Var instanceof i8 ? b10.c : b10.d;
        this.h = k8Var3;
        this.i = k8Var2;
        this.j = k8Var3;
    }

    public static final Object a(x7 x7Var, Object obj) {
        q31 q31Var = x7Var.a;
        k8 k8Var = x7Var.j;
        k8 k8Var2 = x7Var.i;
        if (!c10.i(k8Var2, x7Var.g) || !c10.i(k8Var, x7Var.h)) {
            k8 k8Var3 = (k8) q31Var.a.g(obj);
            int iB = k8Var3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (k8Var3.a(i) < k8Var2.a(i) || k8Var3.a(i) > k8Var.a(i)) {
                    k8Var3.e(c10.t(k8Var3.a(i), k8Var2.a(i), k8Var.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return q31Var.b.g(k8Var3);
            }
        }
        return obj;
    }

    public static Object b(x7 x7Var, Object obj, e8 e8Var, jy0 jy0Var) {
        Object objG = x7Var.a.b.g(x7Var.c.f);
        Object objC = x7Var.c();
        q31 q31Var = x7Var.a;
        jz0 jz0Var = new jz0(e8Var, q31Var, objC, obj, (k8) q31Var.a.g(objG));
        long j = x7Var.c.g;
        lb0 lb0Var = x7Var.f;
        v7 v7Var = new v7(x7Var, objG, jz0Var, j, null);
        lb0Var.getClass();
        return nm.q(new y7(lb0Var, v7Var, null), jy0Var);
    }

    public final Object c() {
        return this.c.e.getValue();
    }

    public final Object d(lk lkVar, Object obj) {
        w7 w7Var = new w7(this, obj, null);
        lb0 lb0Var = this.f;
        lb0Var.getClass();
        Object objQ = nm.q(new y7(lb0Var, w7Var, null), lkVar);
        return objQ == xl.d ? objQ : j41.a;
    }

    public /* synthetic */ x7(Object obj, q31 q31Var, Object obj2, int i) {
        this(obj, q31Var, (i & 4) != 0 ? null : obj2);
    }
}
