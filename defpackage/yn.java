package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yn implements xn {
    public final float d;
    public final float e;

    public yn(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return Float.compare(this.d, ynVar.d) == 0 && Float.compare(this.e, ynVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.e;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.d + ", fontScale=" + this.e + ')';
    }
}
