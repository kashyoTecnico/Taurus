package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mu0 {
    public final go0 a;
    public final go0 b;
    public final go0 c;
    public final go0 d;
    public final go0 e;

    public mu0() {
        go0 go0Var = ku0.a;
        go0 go0Var2 = ku0.b;
        go0 go0Var3 = ku0.c;
        go0 go0Var4 = ku0.d;
        go0 go0Var5 = ku0.e;
        this.a = go0Var;
        this.b = go0Var2;
        this.c = go0Var3;
        this.d = go0Var4;
        this.e = go0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu0)) {
            return false;
        }
        mu0 mu0Var = (mu0) obj;
        return c10.i(this.a, mu0Var.a) && c10.i(this.b, mu0Var.b) && c10.i(this.c, mu0Var.c) && c10.i(this.d, mu0Var.d) && c10.i(this.e, mu0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
