package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ej {
    public static final da0 a;

    static {
        hn0 hn0Var = pf.e;
        int i = hn0Var.c;
        bj bjVar = new bj(hn0Var, hn0Var, 1);
        int i2 = hn0Var.c;
        jd0 jd0Var = pf.x;
        int i3 = (jd0Var.c << 6) | i2;
        dj djVar = new dj(hn0Var, jd0Var, 0);
        int i4 = (i2 << 6) | jd0Var.c;
        dj djVar2 = new dj(jd0Var, hn0Var, 0);
        da0 da0Var = l00.a;
        da0 da0Var2 = new da0();
        da0Var2.g(i | (i << 6), bjVar);
        da0Var2.g(i3, djVar);
        da0Var2.g(i4, djVar2);
        a = da0Var2;
    }
}
