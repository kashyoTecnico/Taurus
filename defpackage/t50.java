package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t50 extends u50 {
    public final String a;
    public final s11 b;

    public t50(String str, s11 s11Var) {
        this.a = str;
        this.b = s11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return c10.i(this.a, t50Var.a) && c10.i(this.b, t50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s11 s11Var = this.b;
        return (iHashCode + (s11Var != null ? s11Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}
