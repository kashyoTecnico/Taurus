package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ky extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ly[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(ly[] lyVarArr, int i) {
        super(2);
        this.e = i;
        this.f = lyVarArr;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Float.valueOf(no0.c((ni0) obj, true, this.f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(no0.c((ni0) obj, false, this.f, ((Number) obj2).floatValue()));
        }
    }
}
