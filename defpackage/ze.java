package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ze extends ye {
    public static void P(List list, Comparator comparator) {
        c10.p(list, "<this>");
        c10.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
