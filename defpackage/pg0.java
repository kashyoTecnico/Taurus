package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pg0 {
    public final d6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public pg0(d6 d6Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = d6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final xl0 a(xl0 xl0Var) {
        return xl0Var.h((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = w11.b;
            if (w11.a(j, j2)) {
                return j2;
            }
        }
        int i = w11.c;
        int i2 = this.b;
        return no0.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final xl0 c(xl0 xl0Var) {
        float f = -this.f;
        return xl0Var.h((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return c10.u(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return this.a.equals(pg0Var.a) && this.b == pg0Var.b && this.c == pg0Var.c && this.d == pg0Var.d && this.e == pg0Var.e && Float.compare(this.f, pg0Var.f) == 0 && Float.compare(this.g, pg0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + b8.b(this.f, b8.c(this.e, b8.c(this.d, b8.c(this.c, b8.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
