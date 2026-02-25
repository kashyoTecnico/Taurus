package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import defpackage.rm0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class pm0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, y40 y40Var) {
        c10.p(y40Var, "event");
        if (activity instanceof f50) {
            a50 lifecycle = ((f50) activity).getLifecycle();
            if (lifecycle instanceof h50) {
                ((h50) lifecycle).e(y40Var);
            }
        }
    }

    public static void b(Activity activity) {
        rm0.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new rm0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new rm0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
