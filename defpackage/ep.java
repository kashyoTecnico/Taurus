package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ep extends y20 implements gw {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ mp0 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(boolean z, mp0 mp0Var, String str) {
        super(0);
        this.e = z;
        this.f = mp0Var;
        this.g = str;
    }

    @Override // defpackage.gw
    public final Object a() {
        if (this.e) {
            mp0 mp0Var = this.f;
            String str = this.g;
            np0 np0Var = mp0Var.a;
            synchronized (np0Var.c) {
            }
        }
        return j41.a;
    }
}
