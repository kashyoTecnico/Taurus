package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ji {
    public final gi a;

    public ji(gi giVar) {
        this.a = giVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ji) {
            return c10.i(this.a, ((ji) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
