package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ix0 implements u41 {
    public final Object a;

    public ix0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.u41
    public final Object a(wh0 wh0Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix0) && c10.i(this.a, ((ix0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
