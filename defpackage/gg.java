package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gg {
    public double a;
    public double b;

    public gg(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        return Double.compare(this.a, ggVar.a) == 0 && Double.compare(this.b, ggVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
