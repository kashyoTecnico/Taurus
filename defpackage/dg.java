package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dg implements lk {
    public static final dg e = new dg(0);
    public static final dg f = new dg(1);
    public final /* synthetic */ int d;

    public /* synthetic */ dg(int i) {
        this.d = i;
    }

    @Override // defpackage.lk
    public final ml f() {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return is.d;
        }
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
