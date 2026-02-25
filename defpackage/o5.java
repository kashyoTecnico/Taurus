package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o5 implements xi0 {
    public final int d;

    public o5(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5) && this.d == ((o5) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return b8.h(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.d, ')');
    }
}
