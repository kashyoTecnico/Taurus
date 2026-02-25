package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kz implements e8 {
    public final wq a;
    public final long b;

    public kz(wq wqVar, long j) {
        this.a = wqVar;
        this.b = j;
    }

    @Override // defpackage.e8
    public final e51 a(q31 q31Var) {
        return new h51(this.a.a(q31Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return kzVar.a.equals(this.a) && kzVar.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + ((b8.p(1) + (this.a.hashCode() * 31)) * 31);
    }
}
