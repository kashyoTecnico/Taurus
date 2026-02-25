package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class k21 {
    public static final ThreadLocal a = new ThreadLocal();

    public static xs a() {
        ThreadLocal threadLocal = a;
        xs xsVar = (xs) threadLocal.get();
        if (xsVar != null) {
            return xsVar;
        }
        wa waVar = new wa(Thread.currentThread());
        threadLocal.set(waVar);
        return waVar;
    }
}
