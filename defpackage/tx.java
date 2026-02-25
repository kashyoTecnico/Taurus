package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class tx {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objZ;
        try {
            objZ = new sx(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objZ = c10.z(th);
        }
        if (objZ instanceof ym0) {
            objZ = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        c10.n(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
