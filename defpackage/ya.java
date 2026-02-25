package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ya extends y20 implements iw {
    public final /* synthetic */ ac e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ tq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(fw0 fw0Var, long j, long j2, tq tqVar) {
        super(1);
        this.e = fw0Var;
        this.f = j;
        this.g = j2;
        this.h = tqVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        v30 v30Var = (v30) obj;
        v30Var.a();
        long j = (104 & 2) != 0 ? 0L : this.f;
        long jN0 = (104 & 4) != 0 ? sq.n0(v30Var.d.c(), j) : this.g;
        float f = (104 & 8) != 0 ? 1.0f : 0.0f;
        tq tqVar = (104 & 16) != 0 ? dt.a : this.h;
        fd fdVar = v30Var.d;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        fdVar.d.c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jN0 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jN0 & 4294967295L)) + Float.intBitsToFloat(i2), fdVar.d(this.e, tqVar, f, null, 3));
        return j41.a;
    }
}
