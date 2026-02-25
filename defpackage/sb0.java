package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class sb0 {
    public qb0 a;
    public boolean b;

    public final void a() {
        qb0 qb0Var = this.a;
        if (qb0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.b) {
            qb0Var.c(this, null);
        }
        tb0 tb0Var = qb0Var.b;
        pd0 pd0Var = qb0Var.a;
        tb0Var.getClass();
        if (equals(tb0Var.h) && -1 == tb0Var.g) {
            nd0 nd0VarC = tb0Var.f;
            if (nd0VarC == null) {
                nd0VarC = tb0Var.c(-1);
            }
            tb0Var.f = null;
            tb0Var.g = 0;
            tb0Var.h = null;
            if (nd0VarC == null) {
                ((sd0) pd0Var.d).a.run();
            } else {
                td0 td0Var = nd0VarC.d;
                td0Var.d.g(td0Var);
            }
            zw0 zw0Var = tb0Var.a;
            ub0 ub0Var = ub0.j;
            zw0Var.getClass();
            zw0Var.h(null, ub0Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
