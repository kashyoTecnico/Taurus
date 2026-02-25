package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ck {
    public final zg0 a = qo0.n(zj.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ck) {
            return c10.i((bk) ((ck) obj).a.getValue(), (bk) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((bk) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((bk) this.a.getValue()) + ')';
    }
}
