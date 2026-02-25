package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rb0 {
    public final List a;
    public final int b;

    public rb0(int i, List list) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbI = b8.i("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        sbI.append(new p00(0, list.size() - 1, 1));
        sbI.append("'.");
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rb0.class != obj.getClass()) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return this.b == rb0Var.b && c10.i(this.a, rb0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public rb0() {
        this(-1, ks.d);
    }
}
