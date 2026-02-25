package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g41 extends iq0 {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public g41(ml mlVar, jy0 jy0Var) {
        cd cdVar = cd.f;
        super(jy0Var, mlVar.n(cdVar) == null ? mlVar.k(cdVar) : mlVar);
        this.h = new ThreadLocal();
        ml mlVar2 = jy0Var.e;
        c10.m(mlVar2);
        if (mlVar2.n(g2.v) instanceof pl) {
            return;
        }
        Object objK0 = b10.k0(mlVar, null);
        b10.f0(mlVar, objK0);
        i0(mlVar, objK0);
    }

    public final boolean h0() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void i0(ml mlVar, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new ng0(mlVar, obj));
    }

    @Override // defpackage.iq0, defpackage.y10
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            ng0 ng0Var = (ng0) this.h.get();
            if (ng0Var != null) {
                b10.f0((ml) ng0Var.d, ng0Var.e);
            }
            this.h.remove();
        }
        Object objB = nm.B(obj);
        lk lkVar = this.g;
        ml mlVarF = lkVar.f();
        Object objK0 = b10.k0(mlVarF, null);
        g41 g41VarE0 = objK0 != b10.n ? r31.e0(lkVar, mlVarF, objK0) : null;
        try {
            this.g.h(objB);
            if (g41VarE0 == null || g41VarE0.h0()) {
                b10.f0(mlVarF, objK0);
            }
        } catch (Throwable th) {
            if (g41VarE0 == null || g41VarE0.h0()) {
                b10.f0(mlVarF, objK0);
            }
            throw th;
        }
    }
}
