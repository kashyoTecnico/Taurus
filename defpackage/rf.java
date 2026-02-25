package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class rf {
    public static final tf a = new tf(o9.c, g2.p);

    public static final tf a(m9 m9Var, qa qaVar, ci ciVar, int i) {
        if (c10.i(m9Var, o9.c) && qaVar.equals(g2.p)) {
            ciVar.V(345884104);
            ciVar.p(false);
            return a;
        }
        ciVar.V(345937951);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ciVar.f(m9Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ciVar.f(qaVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ciVar.K();
        if (z3 || objK == vh.a) {
            objK = new tf(m9Var, qaVar);
            ciVar.e0(objK);
        }
        tf tfVar = (tf) objK;
        ciVar.p(false);
        return tfVar;
    }
}
