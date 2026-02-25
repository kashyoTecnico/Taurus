package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p5 implements ComponentCallbacks2 {
    public final /* synthetic */ q5 d;

    public p5(q5 q5Var) {
        this.d = q5Var;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            this.d.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
