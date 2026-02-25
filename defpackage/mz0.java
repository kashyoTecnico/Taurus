package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class mz0 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g2 f;

    static {
        String property;
        int i = wy0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = n2.m("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = wy0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = n2.n(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = n2.n(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(n2.m("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g2.H;
    }
}
