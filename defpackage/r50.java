package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r50 implements uv {
    public final float a;

    public r50(float f) {
        this.a = f;
    }

    @Override // defpackage.uv
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.uv
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r50) && Float.compare(this.a, ((r50) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
