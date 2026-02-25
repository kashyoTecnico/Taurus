package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class eg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(eg.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public eg(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
