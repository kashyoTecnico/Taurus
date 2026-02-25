package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class m70 implements gw {
    public final /* synthetic */ int d;
    public final /* synthetic */ za0 e;

    public /* synthetic */ m70(za0 za0Var, int i) {
        this.d = i;
        this.e = za0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        int i = this.d;
        j41 j41Var = j41.a;
        za0 za0Var = this.e;
        switch (i) {
            case 0:
                za0Var.setValue(Boolean.TRUE);
                break;
            case 1:
                za0Var.setValue(Boolean.FALSE);
                break;
            default:
                zg0 zg0Var = q70.a;
                za0Var.setValue(Boolean.FALSE);
                break;
        }
        return j41Var;
    }
}
