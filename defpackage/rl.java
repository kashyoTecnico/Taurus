package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class rl {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new l5()).iterator();
            c10.p(it, "<this>");
            a = zt0.v(new fj(new bu0(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
