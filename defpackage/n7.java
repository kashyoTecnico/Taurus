package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n7 implements Choreographer.FrameCallback {
    public final /* synthetic */ ad d;
    public final /* synthetic */ iw e;

    public n7(ad adVar, o7 o7Var, iw iwVar) {
        this.d = adVar;
        this.e = iwVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objZ;
        try {
            objZ = this.e.g(Long.valueOf(j));
        } catch (Throwable th) {
            objZ = c10.z(th);
        }
        this.d.h(objZ);
    }
}
