package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kh0 extends nh0 {
    public final float b;

    public kh0(float f) {
        super(3);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh0) && Float.compare(this.b, ((kh0) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.b + ')';
    }
}
