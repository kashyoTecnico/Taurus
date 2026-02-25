package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lh0 extends nh0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public lh0(float f, float f2, float f3, float f4) {
        super(2);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh0)) {
            return false;
        }
        lh0 lh0Var = (lh0) obj;
        return Float.compare(this.b, lh0Var.b) == 0 && Float.compare(this.c, lh0Var.c) == 0 && Float.compare(this.d, lh0Var.d) == 0 && Float.compare(this.e, lh0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + b8.b(this.d, b8.b(this.c, Float.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.b + ", dy1=" + this.c + ", dx2=" + this.d + ", dy2=" + this.e + ')';
    }
}
