package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ab extends y20 implements iw {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ac f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ qx0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(boolean z, fw0 fw0Var, long j, float f, float f2, long j2, long j3, qx0 qx0Var) {
        super(1);
        this.e = z;
        this.f = fw0Var;
        this.g = j;
        this.h = f;
        this.i = f2;
        this.j = j2;
        this.k = j3;
        this.l = qx0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        v30 v30Var = (v30) obj;
        v30Var.a();
        fd fdVar = v30Var.d;
        if (this.e) {
            sq.F(v30Var, this.f, 0L, 0L, this.g, null, 246);
        } else {
            long j = this.g;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.h;
            if (fIntBitsToFloat < f) {
                float f2 = this.i;
                float fD = yu0.d(fdVar.c());
                float f3 = this.i;
                float f4 = fD - f3;
                float fB = yu0.b(fdVar.c()) - f3;
                ac acVar = this.f;
                long j2 = this.g;
                e9 e9Var = fdVar.e;
                long jS = e9Var.s();
                e9Var.o().l();
                try {
                    ((e9) ((r1) e9Var.a).e).o().e(f2, f2, f4, fB, 0);
                    sq.F(v30Var, acVar, 0L, 0L, j2, null, 246);
                } finally {
                    b8.m(e9Var, jS);
                }
            } else {
                sq.F(v30Var, this.f, this.j, this.k, c4.G(j, f), this.l, 208);
            }
        }
        return j41.a;
    }
}
