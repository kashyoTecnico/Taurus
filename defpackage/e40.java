package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e40 implements ux0 {
    public final /* synthetic */ f40 a;
    public final /* synthetic */ bq0 b;

    public e40(f40 f40Var, bq0 bq0Var) {
        this.a = f40Var;
        this.b = bq0Var;
        int[] iArr = s00.a;
        new ea0();
    }

    @Override // defpackage.ux0
    public final void a() {
        f40 f40Var = this.a;
        t30 t30Var = f40Var.d;
        f40Var.d();
        t30 t30Var2 = (t30) f40Var.l.j(this.b);
        if (t30Var2 != null) {
            if (f40Var.q <= 0) {
                pz.b("No pre-composed items to dispose");
            }
            int i = ((bb0) t30Var.n()).d.i(t30Var2);
            if (i < ((bb0) t30Var.n()).d.f - f40Var.q) {
                pz.b("Item is not in pre-composed item range");
            }
            f40Var.p++;
            f40Var.q--;
            y30 y30Var = (y30) f40Var.h.g(t30Var2);
            if (y30Var != null) {
                y30Var.getClass();
            }
            int i2 = (((bb0) t30Var.n()).d.f - f40Var.q) - f40Var.p;
            t30Var.r = true;
            t30Var.K(i, i2, 1);
            t30Var.r = false;
            f40Var.c(i2);
        }
    }
}
