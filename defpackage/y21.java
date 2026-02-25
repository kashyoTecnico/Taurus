package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class y21 {
    public final q8 a;
    public final hd0 b;

    public y21(q8 q8Var, hd0 hd0Var) {
        this.a = q8Var;
        this.b = hd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return c10.i(this.a, y21Var.a) && c10.i(this.b, y21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
