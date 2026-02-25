package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class xu0 {
    static {
        r31.W(7, null);
    }

    public static final ww0 a(long j, p31 p31Var, ci ciVar) {
        boolean zF = ciVar.f(bf.f(j));
        Object objK = ciVar.K();
        if (zF || objK == vh.a) {
            mf mfVarF = bf.f(j);
            e3 e3Var = e3.x;
            h hVar = new h(10, mfVarF);
            q31 q31Var = y41.a;
            q31 q31Var2 = new q31(e3Var, hVar);
            ciVar.e0(q31Var2);
            objK = q31Var2;
        }
        return z7.a(new bf(j), (q31) objK, p31Var, "ColorAnimation", ciVar, 384);
    }
}
