package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pn extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ qn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn(qn qnVar, int i) {
        super(0);
        this.e = i;
        this.f = qnVar;
    }

    @Override // defpackage.gw
    public final Object a() {
        int i = this.e;
        qn qnVar = this.f;
        switch (i) {
            case 0:
                return b10.l;
            default:
                if (((on0) l81.A(qnVar, sn0.b)) == null) {
                    un0 un0Var = qnVar.x;
                    if (un0Var != null) {
                        qnVar.B0(un0Var);
                    }
                } else if (qnVar.x == null) {
                    int i2 = 0;
                    on onVar = new on(i2, qnVar);
                    pn pnVar = new pn(qnVar, i2);
                    fa0 fa0Var = qnVar.t;
                    boolean z = qnVar.u;
                    float f = qnVar.v;
                    p31 p31Var = tn0.a;
                    un0 yfVar = yn0.a ? new yf(fa0Var, z, f, onVar, pnVar) : new w6(fa0Var, z, f, onVar, pnVar);
                    qnVar.A0(yfVar);
                    qnVar.x = yfVar;
                }
                return j41.a;
        }
    }
}
