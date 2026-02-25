package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ax implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ ow e;

    /* JADX WARN: Multi-variable type inference failed */
    public ax(iw iwVar, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = (y20) iwVar;
                break;
            default:
                this.e = iwVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [iw, y20] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        long j;
        switch (this.d) {
            case 0:
                lv0 lv0Var = (lv0) obj;
                synchronized (ov0.c) {
                    j = ov0.e;
                    ov0.e = 1 + j;
                }
                return new jl0(j, lv0Var, (iw) this.e);
            default:
                return ((y20) this.e).g(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
