package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z10 {
    public final Integer a;
    public final Object b;

    public z10(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z10)) {
            return false;
        }
        z10 z10Var = (z10) obj;
        return this.a.equals(z10Var.a) && c10.i(this.b, z10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
