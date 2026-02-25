package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wz0 {
    public final q8 a;
    public final c21 b;
    public final boolean e;
    public final xn g;
    public final jv h;
    public g30 j;
    public e30 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = ks.d;

    public wz0(q8 q8Var, c21 c21Var, boolean z, xn xnVar, jv jvVar, int i) {
        this.a = q8Var;
        this.b = c21Var;
        this.e = z;
        this.g = xnVar;
        this.h = jvVar;
    }

    public final void a(e30 e30Var) {
        g30 g30Var = this.j;
        if (g30Var == null || e30Var != this.k || g30Var.b()) {
            this.k = e30Var;
            g30Var = new g30(this.a, dp0.i(this.b, e30Var), this.i, this.g, this.h);
        }
        this.j = g30Var;
    }
}
