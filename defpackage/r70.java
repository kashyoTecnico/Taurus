package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class r70 {
    public static final sx a;

    static {
        String property;
        int i = wy0.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new g5()).iterator();
            c10.p(it, "<this>");
            Iterator it2 = zt0.v(new fj(new bu0(it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((g5) next).getClass();
                    do {
                        ((g5) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((g5) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            a = new sx(tx.a(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
