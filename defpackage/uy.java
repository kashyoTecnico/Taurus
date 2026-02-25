package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uy {
    public static int j;
    public static final v71 k = new v71(22);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final z41 f;
    public final long g;
    public final int h;
    public final int i;

    public uy(String str, float f, float f2, float f3, float f4, z41 z41Var, long j2, int i) {
        int i2;
        synchronized (k) {
            i2 = j;
            j = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z41Var;
        this.g = j2;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) obj;
        return c10.i(this.a, uyVar.a) && kp.a(this.b, uyVar.b) && kp.a(this.c, uyVar.c) && this.d == uyVar.d && this.e == uyVar.e && this.f.equals(uyVar.f) && bf.c(this.g, uyVar.g) && this.h == uyVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + b8.b(this.e, b8.b(this.d, b8.b(this.c, b8.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = bf.h;
        return Boolean.hashCode(false) + b8.c(this.h, b8.e(this.g, iHashCode, 31), 31);
    }
}
