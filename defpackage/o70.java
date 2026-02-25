package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o70 implements kw {
    public final /* synthetic */ iw d;
    public final /* synthetic */ za0 e;
    public final /* synthetic */ za0 f;

    public o70(iw iwVar, za0 za0Var, za0 za0Var2) {
        this.d = iwVar;
        this.e = za0Var;
        this.f = za0Var2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            ciVar.V(692294058);
            iw iwVar = this.d;
            boolean zF = ciVar.f(iwVar);
            Object objK = ciVar.K();
            if (zF || objK == vh.a) {
                objK = new xh(iwVar, this.e, this.f, 1);
                ciVar.e0(objK);
            }
            ciVar.p(false);
            c10.b((gw) objK, null, false, null, null, null, null, fh.b, ciVar, 805306368, 510);
        }
        return j41.a;
    }
}
