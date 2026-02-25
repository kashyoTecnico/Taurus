package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p70 implements kw {
    public final /* synthetic */ int d;
    public final /* synthetic */ za0 e;

    public /* synthetic */ p70(za0 za0Var, int i) {
        this.d = i;
        this.e = za0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.d;
        j41 j41Var = j41.a;
        v71 v71Var = vh.a;
        za0 za0Var = this.e;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !ciVar.z()) {
                    ciVar.V(692298219);
                    Object objK = ciVar.K();
                    if (objK == v71Var) {
                        objK = new m70(za0Var, 2);
                        ciVar.e0(objK);
                    }
                    ciVar.p(false);
                    zg zgVar = fh.a;
                    c10.e((gw) objK, null, false, null, null, null, ciVar, 805306374);
                    break;
                } else {
                    ciVar.Q();
                    break;
                }
                break;
            default:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar2.z()) {
                    String str = (String) za0Var.getValue();
                    ciVar2.V(692285862);
                    Object objK2 = ciVar2.K();
                    if (objK2 == v71Var) {
                        objK2 = new ir(3, za0Var);
                        ciVar2.e0(objK2);
                    }
                    ciVar2.p(false);
                    xf0.a(str, (iw) objK2, null, false, null, fh.e, null, new t20(123), null, 0, 0, null, null, ciVar2, 1572912);
                    break;
                } else {
                    ciVar2.Q();
                    break;
                }
                break;
        }
        return j41Var;
    }
}
