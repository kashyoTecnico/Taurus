package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class on0 {
    public final long a = bf.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof on0) {
            return bf.c(this.a, ((on0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) bf.i(this.a)) + ", rippleAlpha=null)";
    }
}
