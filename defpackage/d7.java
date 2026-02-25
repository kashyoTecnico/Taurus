package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d7 extends y20 implements iw {
    public final /* synthetic */ gw e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ r5 g;
    public final /* synthetic */ ta h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(gw gwVar, boolean z, r5 r5Var, ta taVar) {
        super(1);
        this.e = gwVar;
        this.f = z;
        this.g = r5Var;
        this.h = taVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        v30 v30Var = (v30) obj;
        v30Var.a();
        fd fdVar = v30Var.d;
        if (((Boolean) this.e.a()).booleanValue()) {
            boolean z = this.f;
            ta taVar = this.h;
            r5 r5Var = this.g;
            if (z) {
                long jT = fdVar.T();
                e9 e9Var = fdVar.e;
                long jS = e9Var.s();
                e9Var.o().l();
                try {
                    ((r1) e9Var.a).r(-1.0f, 1.0f, jT);
                    fdVar.e(r5Var, taVar);
                } finally {
                    b8.m(e9Var, jS);
                }
            } else {
                fdVar.e(r5Var, taVar);
            }
        }
        return j41.a;
    }
}
