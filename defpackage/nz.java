package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nz {
    public final eb0 a = new eb0(new lz[16]);
    public final zg0 b = qo0.n(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final zg0 d = qo0.n(Boolean.TRUE);

    public final void a(int i, ci ciVar) {
        ciVar.W(-318043801);
        if ((((ciVar.h(this) ? 4 : 2) | i) & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            Object objK = ciVar.K();
            v71 v71Var = vh.a;
            if (objK == v71Var) {
                objK = qo0.n(null);
                ciVar.e0(objK);
            }
            za0 za0Var = (za0) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                ciVar.V(1719915818);
                boolean zH = ciVar.h(this);
                Object objK2 = ciVar.K();
                if (zH || objK2 == v71Var) {
                    objK2 = new y5(za0Var, this, null);
                    ciVar.e0(objK2);
                }
                l81.d(ciVar, (kw) objK2, this);
                ciVar.p(false);
            } else {
                ciVar.V(1721436120);
                ciVar.p(false);
            }
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new j(i, 9, this);
        }
    }
}
