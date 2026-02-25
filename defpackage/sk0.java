package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sk0 {
    public static final sk0 b = new sk0(new re());
    public final re a;

    public sk0(re reVar) {
        this.a = reVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final re a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk0) && this.a.equals(((sk0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}
