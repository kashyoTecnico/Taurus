package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g8 extends k8 {
    public float a;

    public g8(float f) {
        this.a = f;
    }

    @Override // defpackage.k8
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.k8
    public final int b() {
        return 1;
    }

    @Override // defpackage.k8
    public final k8 c() {
        return new g8(0.0f);
    }

    @Override // defpackage.k8
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.k8
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g8) && ((g8) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
