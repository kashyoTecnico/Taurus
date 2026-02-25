package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jg0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public jg0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final float a() {
        return this.d;
    }

    public final float b(e30 e30Var) {
        return e30Var == e30.d ? this.a : this.c;
    }

    public final float c(e30 e30Var) {
        return e30Var == e30.d ? this.c : this.a;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jg0)) {
            return false;
        }
        jg0 jg0Var = (jg0) obj;
        return kp.a(this.a, jg0Var.a) && kp.a(this.b, jg0Var.b) && kp.a(this.c, jg0Var.c) && kp.a(this.d, jg0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) kp.b(this.a)) + ", top=" + ((Object) kp.b(this.b)) + ", end=" + ((Object) kp.b(this.c)) + ", bottom=" + ((Object) kp.b(this.d)) + ')';
    }
}
