package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t6 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ oi0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(oi0 oi0Var, int i) {
        super(1);
        this.e = i;
        this.f = oi0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
            case 1:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
            case 2:
                ni0 ni0Var = (ni0) obj;
                e30 e30VarE = ni0Var.e();
                e30 e30Var = e30.d;
                oi0 oi0Var = this.f;
                if (e30VarE == e30Var || ni0Var.f() == 0) {
                    ni0.a(ni0Var, oi0Var);
                    oi0Var.g0(m00.c(0L, oi0Var.h), 0.0f, null);
                } else {
                    long jF = ((ni0Var.f() - oi0Var.d) - r1) << 32;
                    ni0.a(ni0Var, oi0Var);
                    oi0Var.g0(m00.c((((int) 0) & 4294967295L) | jF, oi0Var.h), 0.0f, null);
                }
                break;
            case 3:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
            case 4:
                ni0.l((ni0) obj, this.f, 0, 0);
                break;
            case 5:
                ni0.h((ni0) obj, this.f, 0, 0);
                break;
            case 6:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
            case 7:
                ni0.h((ni0) obj, this.f, 0, 0);
                break;
            case 8:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
            case 9:
                ni0.h((ni0) obj, this.f, 0, 0);
                break;
            default:
                ni0.j((ni0) obj, this.f, 0, 0);
                break;
        }
        return j41.a;
    }
}
