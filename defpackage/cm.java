package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class cm {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof cm) {
            return c10.i(this.a, ((cm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
