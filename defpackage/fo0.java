package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fo0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        d80.g(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public fo0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0)) {
            return false;
        }
        fo0 fo0Var = (fo0) obj;
        return Float.compare(this.a, fo0Var.a) == 0 && Float.compare(this.b, fo0Var.b) == 0 && Float.compare(this.c, fo0Var.c) == 0 && Float.compare(this.d, fo0Var.d) == 0 && c10.C(this.e, fo0Var.e) && c10.C(this.f, fo0Var.f) && c10.C(this.g, fo0Var.g) && c10.C(this.h, fo0Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + b8.e(this.g, b8.e(this.f, b8.e(this.e, b8.b(this.d, b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = c4.I(this.a) + ", " + c4.I(this.b) + ", " + c4.I(this.c) + ", " + c4.I(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zC = c10.C(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zC || !c10.C(j2, j3) || !c10.C(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) c10.Z(j)) + ", topRight=" + ((Object) c10.Z(j2)) + ", bottomRight=" + ((Object) c10.Z(j3)) + ", bottomLeft=" + ((Object) c10.Z(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + c4.I(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c4.I(Float.intBitsToFloat(i)) + ", y=" + c4.I(Float.intBitsToFloat(i2)) + ')';
    }
}
