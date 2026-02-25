package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n10 extends u10 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(n10.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final zu h;

    public n10(zu zuVar) {
        this.h = zuVar;
    }

    @Override // defpackage.u10
    public final boolean k() {
        return true;
    }

    @Override // defpackage.u10
    public final void l(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.h.g(th);
        }
    }
}
