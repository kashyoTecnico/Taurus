package defpackage;

import java.util.Collection;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class we extends ve {
    public static int O(Iterable iterable) {
        c10.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
