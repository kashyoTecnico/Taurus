package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wv implements uv {
    public final float[] a;
    public final float[] b;

    public wv(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.uv
    public final float a(float f) {
        return v71.h(f, this.b, this.a);
    }

    @Override // defpackage.uv
    public final float b(float f) {
        return v71.h(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        return Arrays.equals(this.a, wvVar.a) && Arrays.equals(this.b, wvVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        c10.o(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        c10.o(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
