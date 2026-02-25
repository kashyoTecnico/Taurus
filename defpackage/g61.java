package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g61 {
    public final kc0 a = new kc0(20);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                b8.n(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
