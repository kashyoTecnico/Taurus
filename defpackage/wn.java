package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wn {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn) && this.a == ((wn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b8.h(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
