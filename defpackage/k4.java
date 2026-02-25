package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k4 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration d;
    public final /* synthetic */ vy e;

    public k4(Configuration configuration, vy vyVar) {
        this.d = configuration;
        this.e = vyVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.d;
        configuration2.updateFrom(configuration);
        Iterator it = this.e.a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                throw new ClassCastException();
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.e.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.e.a.clear();
    }
}
