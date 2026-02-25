package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class va extends l {
    public final Thread g;
    public final xs h;

    public va(ml mlVar, Thread thread, xs xsVar) {
        super(mlVar, true);
        this.g = thread;
        this.h = xsVar;
    }

    @Override // defpackage.y10
    public final void y(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.g;
        if (c10.i(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
