package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class td extends ud {
    public final Throwable a;

    public td(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td) {
            return c10.i(this.a, ((td) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ud
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
