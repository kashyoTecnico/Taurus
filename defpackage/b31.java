package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b31 {
    public final Object a;
    public final Object b;

    public b31(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean a(c00 c00Var, c00 c00Var2) {
        return c00Var.equals(this.a) && c00Var2.equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return c10.i(this.a, b31Var.a) && c10.i(this.b, b31Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
