package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ik0 extends gs {
    final /* synthetic */ jk0 this$0;

    /* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
    public static final class a extends gs {
        final /* synthetic */ jk0 this$0;

        public a(jk0 jk0Var) {
            this.this$0 = jk0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            c10.p(activity, "activity");
            jk0 jk0Var = this.this$0;
            int i = jk0Var.e + 1;
            jk0Var.e = i;
            if (i == 1) {
                if (jk0Var.f) {
                    jk0Var.i.e(y40.ON_RESUME);
                    jk0Var.f = false;
                } else {
                    Handler handler = jk0Var.h;
                    c10.m(handler);
                    handler.removeCallbacks(jk0Var.j);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            c10.p(activity, "activity");
            jk0 jk0Var = this.this$0;
            int i = jk0Var.d + 1;
            jk0Var.d = i;
            if (i == 1 && jk0Var.g) {
                jk0Var.i.e(y40.ON_START);
                jk0Var.g = false;
            }
        }
    }

    public ik0(jk0 jk0Var) {
        this.this$0 = jk0Var;
    }

    @Override // defpackage.gs, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c10.p(activity, "activity");
    }

    @Override // defpackage.gs, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c10.p(activity, "activity");
        jk0 jk0Var = this.this$0;
        int i = jk0Var.e - 1;
        jk0Var.e = i;
        if (i == 0) {
            Handler handler = jk0Var.h;
            c10.m(handler);
            handler.postDelayed(jk0Var.j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        c10.p(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.gs, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c10.p(activity, "activity");
        jk0 jk0Var = this.this$0;
        int i = jk0Var.d - 1;
        jk0Var.d = i;
        if (i == 0 && jk0Var.f) {
            jk0Var.i.e(y40.ON_STOP);
            jk0Var.g = true;
        }
    }
}
