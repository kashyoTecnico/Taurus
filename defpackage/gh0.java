package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gh0 extends nh0 {
    public final float b;
    public final float c;

    public gh0(float f, float f2) {
        super(3);
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj;
        return Float.compare(this.b, gh0Var.b) == 0 && Float.compare(this.c, gh0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.b + ", y=" + this.c + ')';
    }
}
