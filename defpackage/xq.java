package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xq implements u41 {
    public final zg0 a;

    public xq(zg0 zg0Var) {
        this.a = zg0Var;
    }

    @Override // defpackage.u41
    public final Object a(wh0 wh0Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq) && this.a.equals(((xq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
