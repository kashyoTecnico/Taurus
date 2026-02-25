package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dm {
    public final qa a;

    public dm(qa qaVar) {
        this.a = qaVar;
    }

    public final int a(int i, e30 e30Var) {
        return this.a.a(i, e30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm) && c10.i(this.a, ((dm) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
    }
}
