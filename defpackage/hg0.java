package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hg0 implements de {
    public final Class a;

    public hg0(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.de
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hg0) {
            return c10.i(this.a, ((hg0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
