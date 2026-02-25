package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rd0 implements d50, AutoCloseable {
    public final /* synthetic */ nd0 d;
    public final /* synthetic */ a50 e;

    public rd0(nd0 nd0Var, sd0 sd0Var, a50 a50Var) {
        this.d = nd0Var;
        this.e = a50Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.b(this);
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        y40 y40Var2 = y40.ON_START;
        nd0 nd0Var = this.d;
        if (y40Var == y40Var2) {
            nd0Var.a(true);
        } else if (y40Var == y40.ON_STOP) {
            nd0Var.a(false);
        }
        if (y40Var == y40.ON_DESTROY) {
            qb0 qb0Var = nd0Var.c;
            if (qb0Var != null && qb0Var.c.remove(nd0Var)) {
                tb0 tb0Var = qb0Var.b;
                tb0Var.getClass();
                if (nd0Var.equals(tb0Var.f)) {
                    tb0Var.f = null;
                    tb0Var.g = 0;
                    tb0Var.h = null;
                }
                tb0Var.d.remove(nd0Var);
                tb0Var.e.remove(nd0Var);
                nd0Var.c = null;
                tb0Var.b();
            }
            this.e.b(this);
        }
    }
}
