package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e31 {
    public final xz a;
    public final zg0 b = qo0.n(c());
    public final zg0 c = qo0.n(new b31(c(), c()));
    public final xg0 d = new xg0(0);
    public final xg0 e = new xg0(Long.MIN_VALUE);
    public final zg0 f;
    public final zv0 g;
    public final zv0 h;
    public final zg0 i;

    public e31(c00 c00Var) {
        this.a = new xz(c00Var);
        Boolean bool = Boolean.FALSE;
        this.f = qo0.n(bool);
        this.g = new zv0();
        this.h = new zv0();
        this.i = qo0.n(bool);
        qo0.g(new b(26, this));
    }

    public final void a(c00 c00Var, ci ciVar, int i) {
        ciVar.W(-1493585151);
        if ((((ciVar.f(c00Var) ? 4 : 2) | i) & 19) == 18 && ciVar.z()) {
            ciVar.Q();
        } else if (((Boolean) this.i.getValue()).booleanValue()) {
            ciVar.V(1823861403);
            ciVar.p(false);
        } else {
            ciVar.V(1822376658);
            zg0 zg0Var = this.b;
            boolean zI = c10.i(zg0Var.getValue(), c00Var);
            zg0 zg0Var2 = this.f;
            xg0 xg0Var = this.e;
            if (!zI) {
                this.c.setValue(new b31(zg0Var.getValue(), c00Var));
                if (!c10.i(c(), zg0Var.getValue())) {
                    ((zg0) this.a.f).setValue(zg0Var.getValue());
                }
                zg0Var.setValue(c00Var);
                if (((rv0) ov0.t(xg0Var.e, xg0Var)).c == Long.MIN_VALUE) {
                    zg0Var2.setValue(Boolean.TRUE);
                }
                g();
            }
            if (c00Var.equals(c()) && ((rv0) ov0.t(xg0Var.e, xg0Var)).c == Long.MIN_VALUE && !((Boolean) zg0Var2.getValue()).booleanValue()) {
                ciVar.V(1823851483);
                ciVar.p(false);
            } else {
                ciVar.V(1822607949);
                Object objK = ciVar.K();
                v71 v71Var = vh.a;
                if (objK == v71Var) {
                    ui uiVar = new ui(l81.x(ciVar));
                    ciVar.e0(uiVar);
                    objK = uiVar;
                }
                wl wlVar = ((ui) objK).d;
                boolean zH = ciVar.h(wlVar);
                Object objK2 = ciVar.K();
                if (zH || objK2 == v71Var) {
                    objK2 = new d31(0, wlVar, this);
                    ciVar.e0(objK2);
                }
                iw iwVar = (iw) objK2;
                boolean zF = ciVar.f(wlVar) | ciVar.f(this);
                Object objK3 = ciVar.K();
                if (zF || objK3 == v71Var) {
                    objK3 = new zo(iwVar);
                    ciVar.e0(objK3);
                }
                ciVar.p(false);
            }
            ciVar.p(false);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new h4(i, 14, this, c00Var);
        }
    }

    public final long b() {
        zv0 zv0Var = this.g;
        int size = zv0Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            xg0 xg0Var = ((c31) zv0Var.get(i)).m;
            jMax = Math.max(jMax, ((rv0) ov0.t(xg0Var.e, xg0Var)).c);
        }
        zv0 zv0Var2 = this.h;
        int size2 = zv0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((e31) zv0Var2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return ((zg0) this.a.f).getValue();
    }

    public final long d() {
        xg0 xg0Var = this.d;
        return ((rv0) ov0.t(xg0Var.e, xg0Var)).c;
    }

    public final void e(long j, boolean z) {
        xg0 xg0Var = this.e;
        long j2 = ((rv0) ov0.t(xg0Var.e, xg0Var)).c;
        xz xzVar = this.a;
        if (j2 == Long.MIN_VALUE) {
            xg0Var.g(j);
            ((zg0) xzVar.e).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((zg0) xzVar.e).getValue()).booleanValue()) {
            ((zg0) xzVar.e).setValue(Boolean.TRUE);
        }
        this.f.setValue(Boolean.FALSE);
        zv0 zv0Var = this.g;
        int size = zv0Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            c31 c31Var = (c31) zv0Var.get(i);
            zg0 zg0Var = c31Var.h;
            zg0 zg0Var2 = c31Var.h;
            if (!((Boolean) zg0Var.getValue()).booleanValue()) {
                long jC = z ? c31Var.a().c() : j;
                c31Var.k.setValue(c31Var.a().b(jC));
                c31Var.l = c31Var.a().f(jC);
                if (c31Var.a().g(jC)) {
                    zg0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) zg0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        zv0 zv0Var2 = this.h;
        int size2 = zv0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e31 e31Var = (e31) zv0Var2.get(i2);
            if (!c10.i(e31Var.b.getValue(), e31Var.c())) {
                e31Var.e(j, z);
            }
            if (!c10.i(e31Var.b.getValue(), e31Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            f();
        }
    }

    public final void f() {
        this.e.g(Long.MIN_VALUE);
        xz xzVar = this.a;
        if (xzVar != null) {
            ((zg0) xzVar.f).setValue(this.b.getValue());
        }
        this.d.g(0L);
        ((zg0) xzVar.e).setValue(Boolean.FALSE);
        zv0 zv0Var = this.h;
        int size = zv0Var.size();
        for (int i = 0; i < size; i++) {
            ((e31) zv0Var.get(i)).f();
        }
    }

    public final void g() {
        zv0 zv0Var = this.g;
        int size = zv0Var.size();
        for (int i = 0; i < size; i++) {
            ((c31) zv0Var.get(i)).i.h(-2.0f);
        }
        zv0 zv0Var2 = this.h;
        int size2 = zv0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((e31) zv0Var2.get(i2)).g();
        }
    }

    public final String toString() {
        zv0 zv0Var = this.g;
        int size = zv0Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((c31) zv0Var.get(i)) + ", ";
        }
        return str;
    }
}
