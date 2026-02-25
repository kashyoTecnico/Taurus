package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class rm0 extends Fragment {
    public static final /* synthetic */ int d = 0;

    /* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final qm0 Companion = new qm0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            c10.p(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            c10.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            c10.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            c10.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            c10.p(activity, "activity");
            int i = rm0.d;
            pm0.a(activity, y40.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            c10.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            c10.p(activity, "activity");
            c10.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            c10.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            c10.p(activity, "activity");
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
