package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c31 implements ww0 {
    public final q31 d;
    public final zg0 e;
    public final zg0 f;
    public final zg0 g;
    public final zg0 h;
    public final vg0 i;
    public boolean j;
    public final zg0 k;
    public k8 l;
    public final xg0 m;
    public boolean n;
    public final ow0 o;
    public final /* synthetic */ e31 p;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public c31(e31 e31Var, Object obj, k8 k8Var, q31 q31Var) {
        this.p = e31Var;
        this.d = q31Var;
        zg0 zg0VarN = qo0.n(obj);
        this.e = zg0VarN;
        Object objG = null;
        zg0 zg0VarN2 = qo0.n(r31.W(7, null));
        this.f = zg0VarN2;
        this.g = qo0.n(new jz0((jt) zg0VarN2.getValue(), q31Var, obj, zg0VarN.getValue(), k8Var));
        this.h = qo0.n(Boolean.TRUE);
        this.i = new vg0(-1.0f);
        this.k = qo0.n(obj);
        this.l = k8Var;
        this.m = new xg0(a().c());
        Float f = (Float) m61.a.get(q31Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            k8 k8Var2 = (k8) q31Var.a.g(obj);
            int iB = k8Var2.b();
            for (int i = 0; i < iB; i++) {
                k8Var2.e(fFloatValue, i);
            }
            objG = this.d.b.g(k8Var2);
        }
        this.o = r31.W(3, objG);
    }

    public final jz0 a() {
        return (jz0) this.g.getValue();
    }

    public final void b(Object obj, boolean z) {
        e31 e31Var = this.p;
        zg0 zg0Var = e31Var.f;
        zg0 zg0Var2 = this.e;
        boolean zI = c10.i(null, zg0Var2.getValue());
        xg0 xg0Var = this.m;
        zg0 zg0Var3 = this.g;
        jt jtVar = this.o;
        if (zI) {
            zg0Var3.setValue(new jz0(jtVar, this.d, obj, obj, this.l.c()));
            this.j = true;
            xg0Var.g(a().c());
            return;
        }
        zg0 zg0Var4 = this.f;
        if (!z || this.n || (((jt) zg0Var4.getValue()) instanceof ow0)) {
            jtVar = (jt) zg0Var4.getValue();
        }
        zg0Var3.setValue(new jz0(e31Var.d() <= 0 ? jtVar : new sw0(jtVar, e31Var.d()), this.d, obj, zg0Var2.getValue(), this.l));
        xg0Var.g(a().c());
        this.j = false;
        zg0Var.setValue(Boolean.TRUE);
        if (((Boolean) e31Var.i.getValue()).booleanValue()) {
            zv0 zv0Var = e31Var.g;
            int size = zv0Var.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                c31 c31Var = (c31) zv0Var.get(i);
                xg0 xg0Var2 = c31Var.m;
                zg0 zg0Var5 = c31Var.k;
                jMax = Math.max(jMax, ((rv0) ov0.t(xg0Var2.e, xg0Var2)).c);
                if (c31Var.i.g() == -1.0f) {
                    c31Var.n = true;
                    if (c10.i(c31Var.a().c, c31Var.a().d)) {
                        zg0Var5.setValue(c31Var.a().c);
                    } else {
                        zg0Var5.setValue(c31Var.a().b(0L));
                        c31Var.l = c31Var.a().f(0L);
                    }
                }
            }
            zg0Var.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.ww0
    public final Object getValue() {
        return this.k.getValue();
    }

    public final String toString() {
        return "current value: " + this.k.getValue() + ", target: " + this.e.getValue() + ", spec: " + ((jt) this.f.getValue());
    }
}
