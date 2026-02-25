package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z11 {
    public final String a;
    public String b;
    public boolean c = false;
    public sg0 d = null;

    public z11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z11)) {
            return false;
        }
        z11 z11Var = (z11) obj;
        return c10.i(this.a, z11Var.a) && c10.i(this.b, z11Var.b) && this.c == z11Var.c && c10.i(this.d, z11Var.d);
    }

    public final int hashCode() {
        int iD = b8.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        sg0 sg0Var = this.d;
        return iD + (sg0Var == null ? 0 : sg0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
