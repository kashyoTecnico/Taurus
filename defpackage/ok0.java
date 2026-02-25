package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ok0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new pk0((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
