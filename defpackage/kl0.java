package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kl0 implements xw0, vt, sw {
    public final /* synthetic */ zw0 d;

    public kl0(zw0 zw0Var) {
        this.d = zw0Var;
    }

    @Override // defpackage.vt
    public final Object b(wt wtVar, lk lkVar) throws Throwable {
        this.d.b(wtVar, lkVar);
        return xl.d;
    }

    @Override // defpackage.sw
    public final vt e(ml mlVar, int i, ec ecVar) {
        return ((((i < 0 || i >= 2) && i != -2) || ecVar != ec.e) && !((i == 0 || i == -3) && ecVar == ec.d)) ? new od(this, mlVar, i, ecVar) : this;
    }

    @Override // defpackage.xw0
    public final Object getValue() {
        return this.d.getValue();
    }
}
