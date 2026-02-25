package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x4 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(long j, int i) {
        super(1);
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                rc rcVar = (rc) obj;
                float fD = yu0.d(rcVar.d.c()) / 2.0f;
                return rcVar.a(new w4(fD, m20.o(rcVar, fD), new ta(this.f, 5)));
            default:
                ((ct0) obj).d(js0.c, new is0(nx.d, this.f, 2, true));
                return j41.a;
        }
    }
}
