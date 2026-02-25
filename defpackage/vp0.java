package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class vp0 implements kw {
    public final /* synthetic */ int d;

    public /* synthetic */ vp0(int i) {
        this.d = i;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                u11 u11Var = (u11) obj2;
                t11 t11Var = new t11(u11Var.a);
                xz xzVar = up0.a;
                return ve.K(t11Var, Boolean.valueOf(u11Var.b));
            case 1:
                kl klVar = (kl) obj2;
                if (!(klVar instanceof j21)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? klVar : Integer.valueOf(iIntValue + 1);
            case 2:
                j21 j21Var = (j21) obj;
                kl klVar2 = (kl) obj2;
                if (j21Var != null) {
                    return j21Var;
                }
                if (klVar2 instanceof j21) {
                    return (j21) klVar2;
                }
                return null;
            default:
                return (n21) obj;
        }
    }
}
