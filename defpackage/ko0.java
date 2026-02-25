package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ko0 {
    public static final lo0 a = new lo0(o9.a, g2.n);

    public static final lo0 a(j9 j9Var, ra raVar, ci ciVar, int i) {
        if (c10.i(j9Var, o9.a) && c10.i(raVar, g2.n)) {
            ciVar.V(-849160037);
            ciVar.p(false);
            return a;
        }
        ciVar.V(-849109166);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ciVar.f(j9Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ciVar.f(raVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ciVar.K();
        if (z3 || objK == vh.a) {
            objK = new lo0(j9Var, raVar);
            ciVar.e0(objK);
        }
        lo0 lo0Var = (lo0) objK;
        ciVar.p(false);
        return lo0Var;
    }
}
