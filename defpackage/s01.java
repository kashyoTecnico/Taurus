package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s01 {
    public static final xz f;
    public final vg0 a;
    public final vg0 b = new vg0(0.0f);
    public xl0 c = xl0.e;
    public long d = w11.b;
    public final zg0 e;

    static {
        k01 k01Var = k01.k;
        nl nlVar = new nl(3);
        r31.m(1, k01Var);
        f = new xz(21, nlVar, k01Var);
    }

    public s01(if0 if0Var, float f2) {
        this.a = new vg0(f2);
        this.e = new zg0(if0Var, g2.V);
    }

    public final void a(if0 if0Var, xl0 xl0Var, int i, int i2) {
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = xl0Var.a;
        float f4 = xl0Var.b;
        xl0 xl0Var2 = this.c;
        float f5 = xl0Var2.a;
        vg0 vg0Var = this.a;
        if (f3 != f5 || f4 != xl0Var2.b) {
            boolean z = if0Var == if0.d;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? xl0Var.d : xl0Var.c;
            float fG = vg0Var.g();
            float f7 = i;
            float f8 = fG + f7;
            vg0Var.h(vg0Var.g() + ((f6 <= f8 && (f3 >= fG || f6 - f3 <= f7)) ? (f3 >= fG || f6 - f3 > f7) ? 0.0f : f3 - fG : f6 - f8));
            this.c = xl0Var;
        }
        vg0Var.h(c10.t(vg0Var.g(), 0.0f, f2));
    }
}
