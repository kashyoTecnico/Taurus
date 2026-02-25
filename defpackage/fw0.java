package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fw0 extends ac {
    public final long a;

    public fw0(long j) {
        this.a = j;
    }

    @Override // defpackage.ac
    public final void a(float f, long j, a6 a6Var) {
        a6Var.c(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = bf.b(jB, bf.d(jB) * f);
        }
        a6Var.e(jB);
        if (a6Var.c != null) {
            a6Var.c = null;
            a6Var.a.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fw0) {
            return bf.c(this.a, ((fw0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = bf.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) bf.i(this.a)) + ')';
    }
}
