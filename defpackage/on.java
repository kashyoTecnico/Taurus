package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class on implements gf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gf
    public final long a() {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                long jA = qnVar.w.a();
                if (jA != 16) {
                    return jA;
                }
                on0 on0Var = (on0) l81.A(qnVar, sn0.b);
                if (on0Var != null) {
                    long j = on0Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((bf) l81.A(qnVar, mj.a)).a;
            default:
                return ((vn0) this.b).b;
        }
    }
}
