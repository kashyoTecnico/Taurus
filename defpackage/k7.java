package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k7 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ k7(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                m7 m7Var = new m7(choreographer, Handler.createAsync(looperMyLooper));
                return d80.v(m7Var, m7Var.o);
            case 1:
                return new Random();
            default:
                return new ku();
        }
    }
}
