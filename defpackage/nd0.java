package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nd0 {
    public final od0 a;
    public boolean b;
    public qb0 c;
    public final td0 d;

    public nd0(td0 td0Var, od0 od0Var) {
        boolean z = td0Var.b;
        this.a = od0Var;
        this.b = z;
        this.d = td0Var;
    }

    public final void a(boolean z) {
        tb0 tb0Var;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        qb0 qb0Var = this.c;
        if (qb0Var == null || (tb0Var = qb0Var.b) == null) {
            return;
        }
        tb0Var.b();
    }
}
