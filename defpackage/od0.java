package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class od0 {
    public final td0 a;
    public final f50 b;

    public od0(td0 td0Var, f50 f50Var) {
        this.a = td0Var;
        this.b = f50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od0)) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return this.a.equals(od0Var.a) && c10.i(this.b, od0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f50 f50Var = this.b;
        return iHashCode + (f50Var == null ? 0 : f50Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
