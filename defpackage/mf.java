package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class mf {
    public final String a;
    public final long b;
    public final int c;

    public mf(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mf mfVar = (mf) obj;
        if (this.c == mfVar.c && c10.i(this.a, mfVar.a)) {
            return ff.a(this.b, mfVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, mf mfVar);

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = ff.e;
        return b8.e(this.b, iHashCode, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) ff.b(this.b)) + ')';
    }
}
