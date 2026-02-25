package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lp implements jl {
    public final float a;

    public lp(float f) {
        this.a = f;
    }

    @Override // defpackage.jl
    public final float a(long j, xn xnVar) {
        return xnVar.A(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp) && kp.a(this.a, ((lp) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
