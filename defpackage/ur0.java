package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ur0 extends y20 implements gw {
    public final /* synthetic */ pr0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ks0 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(pr0 pr0Var, int i, int i2, ks0 ks0Var, h40 h40Var) {
        super(0);
        this.e = pr0Var;
        this.f = i;
        this.g = i2;
        this.h = ks0Var;
        this.i = h40Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h40, java.lang.Object] */
    @Override // defpackage.gw
    public final Object a() {
        int iIntValue = ((Number) this.i.getValue()).intValue();
        ks0 ks0Var = this.h;
        boolean zA = ks0Var.a();
        boolean z = ks0Var.k() == 1;
        pr0 pr0Var = this.e;
        o11 o11Var = pr0Var.f;
        int i = this.f;
        long jL = o11Var.l(i);
        o11 o11Var2 = pr0Var.f;
        int i2 = w11.c;
        int i3 = (int) (jL >> 32);
        int iF = o11Var2.f(i3);
        int i4 = o11Var2.b.f;
        if (iF != iIntValue) {
            i3 = iIntValue >= i4 ? o11Var2.i(i4 - 1) : o11Var2.i(iIntValue);
        }
        int iE = (int) (jL & 4294967295L);
        if (o11Var2.f(iE) != iIntValue) {
            iE = iIntValue >= i4 ? o11Var2.e(i4 - 1, false) : o11Var2.e(iIntValue, false);
        }
        int i5 = this.g;
        if (i3 == i5) {
            return pr0Var.a(iE);
        }
        if (iE == i5) {
            return pr0Var.a(i3);
        }
        if (!(zA ^ z) ? i >= i3 : i > iE) {
            i3 = iE;
        }
        return pr0Var.a(i3);
    }
}
