package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class sn0 {
    public static final hx0 a = new hx0(si.x);
    public static final vi b = new vi(si.w);
    public static final vn0 c;

    static {
        long j = bf.g;
        c = new vn0(j, true);
        new vn0(j, false);
    }

    public static final fz a(ci ciVar) {
        fz vn0Var;
        long j = bf.g;
        ciVar.V(-1280632857);
        if (((Boolean) ciVar.j(a)).booleanValue()) {
            p31 p31Var = tn0.a;
            za0 za0VarQ = qo0.q(new bf(j), ciVar);
            boolean zG = ciVar.g(true) | ciVar.c(Float.NaN);
            Object objK = ciVar.K();
            if (zG || objK == vh.a) {
                objK = new yi0(za0VarQ);
                ciVar.e0(objK);
            }
            vn0Var = (yi0) objK;
        } else {
            vn0Var = (kp.a(Float.NaN, Float.NaN) && bf.c(j, j)) ? c : new vn0(j, true);
        }
        ciVar.p(false);
        return vn0Var;
    }
}
