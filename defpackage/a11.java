package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a11 {
    public final q8 a;
    public final long b;
    public final w11 c;

    public a11(q8 q8Var, long j, w11 w11Var) {
        this.a = q8Var;
        this.b = no0.g(j, q8Var.e.length());
        this.c = w11Var != null ? new w11(no0.g(w11Var.a, q8Var.e.length())) : null;
    }

    public static a11 a(a11 a11Var, q8 q8Var, long j, int i) {
        if ((i & 1) != 0) {
            q8Var = a11Var.a;
        }
        if ((i & 2) != 0) {
            j = a11Var.b;
        }
        w11 w11Var = (i & 4) != 0 ? a11Var.c : null;
        a11Var.getClass();
        return new a11(q8Var, j, w11Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a11)) {
            return false;
        }
        a11 a11Var = (a11) obj;
        return w11.a(this.b, a11Var.b) && c10.i(this.c, a11Var.c) && c10.i(this.a, a11Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = w11.c;
        int iE = b8.e(this.b, iHashCode, 31);
        w11 w11Var = this.c;
        return iE + (w11Var != null ? Long.hashCode(w11Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) w11.g(this.b)) + ", composition=" + this.c + ')';
    }

    public a11(String str, long j, int i) {
        this(new q8((i & 1) != 0 ? "" : str), (i & 2) != 0 ? w11.b : j, (w11) null);
    }
}
