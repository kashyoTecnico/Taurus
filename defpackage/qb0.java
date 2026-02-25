package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qb0 {
    public final pd0 a;
    public final tb0 b = new tb0();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public qb0(pd0 pd0Var) {
        this.a = pd0Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public final void a(sb0 sb0Var) {
        if (this.d.add(sb0Var)) {
            this.b.a(this, sb0Var, -1);
        }
    }

    public final void b(ld0 ld0Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(("Unsupported priority value: " + i).toString());
        }
        if (this.d.add(ld0Var)) {
            this.b.a(this, ld0Var, i);
        }
    }

    public final void c(sb0 sb0Var, pb0 pb0Var) {
        tb0 tb0Var = this.b;
        tb0Var.getClass();
        if (tb0Var.g != 0) {
            return;
        }
        tb0Var.f = tb0Var.c(-1);
        tb0Var.g = -1;
        tb0Var.h = sb0Var;
        if (pb0Var != null) {
            zw0 zw0Var = tb0Var.a;
            vb0 vb0Var = new vb0(pb0Var);
            zw0Var.getClass();
            zw0Var.h(null, vb0Var);
        }
    }
}
