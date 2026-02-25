package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ej0 {
    public final zi0 a;
    public final vi0 b;

    public ej0(zi0 zi0Var, vi0 vi0Var) {
        this.a = zi0Var;
        this.b = vi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        return c10.i(this.b, ej0Var.b) && c10.i(this.a, ej0Var.a);
    }

    public final int hashCode() {
        zi0 zi0Var = this.a;
        int iHashCode = (zi0Var != null ? zi0Var.hashCode() : 0) * 31;
        vi0 vi0Var = this.b;
        return iHashCode + (vi0Var != null ? vi0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
