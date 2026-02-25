package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rz0 {
    public final q8 a;
    public q8 b;
    public boolean c = false;
    public w90 d = null;

    public rz0(q8 q8Var, q8 q8Var2) {
        this.a = q8Var;
        this.b = q8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz0)) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return c10.i(this.a, rz0Var.a) && c10.i(this.b, rz0Var.b) && this.c == rz0Var.c && c10.i(this.d, rz0Var.d);
    }

    public final int hashCode() {
        int iD = b8.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        w90 w90Var = this.d;
        return iD + (w90Var == null ? 0 : w90Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
