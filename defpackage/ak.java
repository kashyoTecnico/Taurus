package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ak extends bk {
    public final long a;

    public ak(long j) {
        this.a = j;
        if (!nm.x(j)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        return ed0.b(this.a, ((ak) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) ed0.i(this.a)) + ')';
    }
}
