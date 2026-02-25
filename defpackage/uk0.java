package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uk0 extends y20 implements iw {
    public final /* synthetic */ long e;
    public final /* synthetic */ qx0 f;
    public final /* synthetic */ ww0 g;
    public final /* synthetic */ ww0 h;
    public final /* synthetic */ ww0 i;
    public final /* synthetic */ ww0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk0(long j, qx0 qx0Var, lz lzVar, lz lzVar2, lz lzVar3, lz lzVar4, float f, long j2) {
        super(1);
        this.e = j;
        this.f = qx0Var;
        this.g = lzVar;
        this.h = lzVar2;
        this.i = lzVar3;
        this.j = lzVar4;
        this.k = f;
        this.l = j2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        float f;
        sq sqVar = (sq) obj;
        long j = this.e;
        qx0 qx0Var = this.f;
        wk0.b(sqVar, 0.0f, 360.0f, j, qx0Var);
        float fFloatValue = (((Number) this.g.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.h.getValue()).floatValue();
        ww0 ww0Var = this.i;
        float fAbs = Math.abs(fFloatValue2 - ((Number) ww0Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) ww0Var.getValue()).floatValue() + ((Number) this.j.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (qx0Var.c == 0) {
            f = 0.0f;
        } else {
            f = ((this.k / (wk0.b / 2)) * 57.29578f) / 2.0f;
        }
        wk0.b(sqVar, fFloatValue3 + f, Math.max(fAbs, 0.1f), this.l, qx0Var);
        return j41.a;
    }
}
