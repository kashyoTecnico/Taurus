package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wc implements wc0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((iw) this.b).getClass().getSimpleName() + '@' + nm.t(this) + ']';
            default:
                return "DisposeOnCancel[" + ((cp) this.b) + ']';
        }
    }
}
