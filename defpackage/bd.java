package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bd extends eg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(bd.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public bd(ad adVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + adVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
