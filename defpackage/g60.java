package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class g60 extends zk0 implements g20 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g60(Object obj, Class cls, String str, String str2, int i, int i2) {
        super(i, cls, obj, str, str2);
        this.k = i2;
    }

    @Override // defpackage.gw
    public final Object a() {
        return get();
    }

    @Override // defpackage.uc
    public final a20 d() {
        em0.a.getClass();
        return this;
    }

    @Override // defpackage.g20
    public final Object get() {
        switch (this.k) {
            case 0:
                return this.e.getClass().getSimpleName();
            default:
                return ((ww0) this.e).getValue();
        }
    }
}
