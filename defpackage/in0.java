package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class in0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public in0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0)) {
            return false;
        }
        in0 in0Var = (in0) obj;
        return this.a == in0Var.a && this.b == in0Var.b && this.c == in0Var.c && this.d == in0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=" + this.a + ", focusedAlpha=" + this.b + ", hoveredAlpha=" + this.c + ", pressedAlpha=" + this.d + ')';
    }
}
