package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class th0 implements jl {
    public final float a;

    public th0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.jl
    public final float a(long j, xn xnVar) {
        return (this.a / 100.0f) * yu0.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th0) && Float.compare(this.a, ((th0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
