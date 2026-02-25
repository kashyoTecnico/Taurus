package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j8 extends k8 {
    public float a;
    public float b;
    public float c;
    public float d;

    public j8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.k8
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.k8
    public final int b() {
        return 4;
    }

    @Override // defpackage.k8
    public final k8 c() {
        return new j8(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.k8
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.k8
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return j8Var.a == this.a && j8Var.b == this.b && j8Var.c == this.c && j8Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b8.b(this.c, b8.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
