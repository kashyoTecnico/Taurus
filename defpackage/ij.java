package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ij implements c90 {
    public final iw a;
    public u61 b;

    public ij(iw iwVar) {
        this.a = iwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij) && ((ij) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
