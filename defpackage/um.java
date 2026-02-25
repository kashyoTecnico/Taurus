package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class um {
    public static final kn a;

    static {
        String property;
        kn knVar;
        int i = wy0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            fn fnVar = xo.a;
            sx sxVar = r70.a;
            sx sxVar2 = sxVar.i;
            knVar = sxVar;
            if (sxVar == null) {
                knVar = tm.m;
            }
        } else {
            knVar = tm.m;
        }
        a = knVar;
    }
}
