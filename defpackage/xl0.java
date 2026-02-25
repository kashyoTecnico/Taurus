package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xl0 {
    public static final xl0 e = new xl0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xl0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static xl0 a(xl0 xl0Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = xl0Var.a;
        }
        float f4 = xl0Var.b;
        if ((i & 4) != 0) {
            f2 = xl0Var.c;
        }
        if ((i & 8) != 0) {
            f3 = xl0Var.d;
        }
        return new xl0(f, f4, f2, f3);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final xl0 d(xl0 xl0Var) {
        return new xl0(Math.max(this.a, xl0Var.a), Math.max(this.b, xl0Var.b), Math.min(this.c, xl0Var.c), Math.min(this.d, xl0Var.d));
    }

    public final boolean e() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        return Float.compare(this.a, xl0Var.a) == 0 && Float.compare(this.b, xl0Var.b) == 0 && Float.compare(this.c, xl0Var.c) == 0 && Float.compare(this.d, xl0Var.d) == 0;
    }

    public final boolean f(xl0 xl0Var) {
        return (this.a < xl0Var.c) & (xl0Var.a < this.c) & (this.b < xl0Var.d) & (xl0Var.b < this.d);
    }

    public final xl0 g(float f, float f2) {
        return new xl0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final xl0 h(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new xl0(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + c4.I(this.a) + ", " + c4.I(this.b) + ", " + c4.I(this.c) + ", " + c4.I(this.d) + ')';
    }
}
