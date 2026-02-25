package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s11 {
    public final iw0 a;
    public final iw0 b;
    public final iw0 c;
    public final iw0 d;

    public s11(iw0 iw0Var, iw0 iw0Var2, iw0 iw0Var3, iw0 iw0Var4) {
        this.a = iw0Var;
        this.b = iw0Var2;
        this.c = iw0Var3;
        this.d = iw0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return c10.i(this.a, s11Var.a) && c10.i(this.b, s11Var.b) && c10.i(this.c, s11Var.c) && c10.i(this.d, s11Var.d);
    }

    public final int hashCode() {
        iw0 iw0Var = this.a;
        int iHashCode = (iw0Var != null ? iw0Var.hashCode() : 0) * 31;
        iw0 iw0Var2 = this.b;
        int iHashCode2 = (iHashCode + (iw0Var2 != null ? iw0Var2.hashCode() : 0)) * 31;
        iw0 iw0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (iw0Var3 != null ? iw0Var3.hashCode() : 0)) * 31;
        iw0 iw0Var4 = this.d;
        return iHashCode3 + (iw0Var4 != null ? iw0Var4.hashCode() : 0);
    }
}
