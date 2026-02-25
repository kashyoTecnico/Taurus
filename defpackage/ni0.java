package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ni0 implements xn {
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ni0 ni0Var, oi0 oi0Var) {
        ni0Var.getClass();
        if (oi0Var instanceof o90) {
            ((o90) oi0Var).n(ni0Var.d);
        }
    }

    public static void h(ni0 ni0Var, oi0 oi0Var, int i, int i2) {
        ni0Var.getClass();
        a(ni0Var, oi0Var);
        oi0Var.g0(m00.c((i2 & 4294967295L) | (i << 32), oi0Var.h), 0.0f, null);
    }

    public static void i(ni0 ni0Var, oi0 oi0Var, long j) {
        ni0Var.getClass();
        a(ni0Var, oi0Var);
        oi0Var.g0(m00.c(j, oi0Var.h), 0.0f, null);
    }

    public static void j(ni0 ni0Var, oi0 oi0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (ni0Var.e() == e30.d || ni0Var.f() == 0) {
            a(ni0Var, oi0Var);
            oi0Var.g0(m00.c(j, oi0Var.h), 0.0f, null);
        } else {
            int iF = (ni0Var.f() - oi0Var.d) - ((int) (j >> 32));
            a(ni0Var, oi0Var);
            oi0Var.g0(m00.c((iF << 32) | (((int) (j & 4294967295L)) & 4294967295L), oi0Var.h), 0.0f, null);
        }
    }

    public static void l(ni0 ni0Var, oi0 oi0Var, int i, int i2) {
        int i3 = pi0.b;
        s40 s40Var = s40.u;
        long j = (i << 32) | (i2 & 4294967295L);
        if (ni0Var.e() == e30.d || ni0Var.f() == 0) {
            a(ni0Var, oi0Var);
            oi0Var.g0(m00.c(j, oi0Var.h), 0.0f, s40Var);
        } else {
            int iF = (ni0Var.f() - oi0Var.d) - ((int) (j >> 32));
            a(ni0Var, oi0Var);
            oi0Var.g0(m00.c((iF << 32) | (((int) (j & 4294967295L)) & 4294967295L), oi0Var.h), 0.0f, s40Var);
        }
    }

    public static void m(ni0 ni0Var, oi0 oi0Var, iw iwVar) {
        ni0Var.getClass();
        long j = 0;
        a(ni0Var, oi0Var);
        oi0Var.g0(m00.c((j & 4294967295L) | (j << 32), oi0Var.h), 0.0f, iwVar);
    }

    public float d(ly lyVar) {
        return Float.NaN;
    }

    public abstract e30 e();

    public abstract int f();
}
