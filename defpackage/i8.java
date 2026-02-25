package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i8 extends k8 {
    public float a;
    public float b;
    public float c;

    public i8(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.k8
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.k8
    public final int b() {
        return 3;
    }

    @Override // defpackage.k8
    public final k8 c() {
        return new i8(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.k8
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.k8
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return i8Var.a == this.a && i8Var.b == this.b && i8Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + b8.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
