package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h8 extends k8 {
    public float a;
    public float b;

    public h8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.k8
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.k8
    public final int b() {
        return 2;
    }

    @Override // defpackage.k8
    public final k8 c() {
        return new h8(0.0f, 0.0f);
    }

    @Override // defpackage.k8
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.k8
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return h8Var.a == this.a && h8Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
