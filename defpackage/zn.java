package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zn implements xn {
    public final float d;
    public final float e;
    public final uv f;

    public zn(float f, float f2, uv uvVar) {
        this.d = f;
        this.e = f2;
        this.f = uvVar;
    }

    @Override // defpackage.xn
    public final float I(long j) {
        if (g21.a(f21.b(j), 4294967296L)) {
            return this.f.b(f21.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return Float.compare(this.d, znVar.d) == 0 && Float.compare(this.e, znVar.e) == 0 && c10.i(this.f, znVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b8.b(this.e, Float.hashCode(this.d) * 31, 31);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.e;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.f + ')';
    }

    @Override // defpackage.xn
    public final long x(float f) {
        return jp0.l(4294967296L, this.f.a(f));
    }
}
