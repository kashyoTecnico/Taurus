package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l4 implements ComponentCallbacks2 {
    public final /* synthetic */ vm0 d;

    public l4(vm0 vm0Var) {
        this.d = vm0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        vm0 vm0Var = this.d;
        synchronized (vm0Var) {
            vm0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        vm0 vm0Var = this.d;
        synchronized (vm0Var) {
            vm0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        vm0 vm0Var = this.d;
        synchronized (vm0Var) {
            vm0Var.a.c();
        }
    }
}
