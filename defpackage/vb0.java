package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vb0 extends d80 {
    public final pb0 j;

    public vb0(pb0 pb0Var) {
        c10.p(pb0Var, "latestEvent");
        this.j = pb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vb0.class == obj.getClass() && c10.i(this.j, ((vb0) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.j + ", direction=-1)";
    }
}
