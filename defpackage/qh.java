package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qh {
    public final Integer a;

    public qh(dq0 dq0Var, Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qh) {
            return c10.i(null, null) && c10.i(this.a, ((qh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.a + ')';
    }
}
