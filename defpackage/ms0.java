package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ms0 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ww0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms0(ww0 ww0Var, int i) {
        super(0);
        this.e = i;
        this.f = ww0Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        int i = this.e;
        ww0 ww0Var = this.f;
        switch (i) {
            case 0:
                return new ed0(((ed0) ww0Var.getValue()).a);
            case 1:
                h8 h8Var = os0.a;
                return new ed0(((ed0) ww0Var.getValue()).a);
            case 2:
                return Boolean.valueOf(((Number) ww0Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) ww0Var.getValue()).floatValue() > 0.0f);
        }
    }
}
