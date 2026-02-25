package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vn0 implements jz {
    public final boolean a;
    public final long b;

    public vn0(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.jz
    public final ln b(fa0 fa0Var) {
        return new qn(fa0Var, this.a, new on(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn0)) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        if (this.a == vn0Var.a && kp.a(Float.NaN, Float.NaN)) {
            return bf.c(this.b, vn0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int iB = b8.b(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = bf.h;
        return Long.hashCode(this.b) + iB;
    }
}
