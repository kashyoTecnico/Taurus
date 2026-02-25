package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a5 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ qo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(qo qoVar, int i) {
        super(1);
        this.e = i;
        this.f = qoVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                return new f4(1, this.f);
            default:
                qo qoVar = this.f;
                if (qoVar.i.a) {
                    qoVar.h.a();
                }
                return j41.a;
        }
    }
}
