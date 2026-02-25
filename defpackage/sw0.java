package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sw0 implements e8 {
    public final e8 a;
    public final long b;

    public sw0(jt jtVar, long j) {
        this.a = jtVar;
        this.b = j;
    }

    @Override // defpackage.e8
    public final e51 a(q31 q31Var) {
        return new tw0(this.a.a(q31Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sw0)) {
            return false;
        }
        sw0 sw0Var = (sw0) obj;
        return sw0Var.b == this.b && c10.i(sw0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
