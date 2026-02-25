package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lf0 extends nf0 {
    public final xl0 a;

    public lf0(xl0 xl0Var) {
        this.a = xl0Var;
    }

    @Override // defpackage.nf0
    public final xl0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lf0) {
            return c10.i(this.a, ((lf0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
