package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class i11 implements Executor {
    public final /* synthetic */ Choreographer d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.postFrameCallback(new ok0(runnable));
    }
}
