package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e7 extends y20 implements iw {
    public final /* synthetic */ long e;
    public final /* synthetic */ gw f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(long j, gw gwVar, boolean z) {
        super(1);
        this.e = j;
        this.f = gwVar;
        this.g = z;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        rc rcVar = (rc) obj;
        return rcVar.a(new d7(this.f, this.g, m20.o(rcVar, yu0.d(rcVar.d.c()) / 2.0f), new ta(this.e, 5)));
    }
}
