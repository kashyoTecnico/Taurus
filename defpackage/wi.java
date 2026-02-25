package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wi implements u41 {
    public final y20 a;

    /* JADX WARN: Multi-variable type inference failed */
    public wi(iw iwVar) {
        this.a = (y20) iwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iw, y20] */
    @Override // defpackage.u41
    public final Object a(wh0 wh0Var) {
        return this.a.g(wh0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi) && this.a.equals(((wi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
