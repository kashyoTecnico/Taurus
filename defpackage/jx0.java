package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jx0 implements m8 {
    public final String a;

    public /* synthetic */ jx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jx0) {
            return c10.i(this.a, ((jx0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}
