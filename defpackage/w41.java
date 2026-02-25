package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w41 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ x41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w41(x41 x41Var, int i) {
        super(1);
        this.e = i;
        this.f = x41Var;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [gw, y20] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                x41 x41Var = this.f;
                x41Var.d = true;
                x41Var.f.a();
                return j41.a;
            default:
                sq sqVar = (sq) obj;
                x41 x41Var2 = this.f;
                jx jxVar = x41Var2.b;
                float f = x41Var2.k;
                float f2 = x41Var2.l;
                e9 e9VarD = sqVar.D();
                long jS = e9VarD.s();
                e9VarD.o().l();
                try {
                    ((r1) e9VarD.a).r(f, f2, 0L);
                    jxVar.a(sqVar);
                    b8.m(e9VarD, jS);
                    return j41.a;
                } catch (Throwable th) {
                    b8.m(e9VarD, jS);
                    throw th;
                }
        }
    }
}
