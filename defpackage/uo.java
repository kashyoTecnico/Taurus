package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uo extends iq0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(uo.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.iq0, defpackage.y10
    public final void y(Object obj) {
        z(obj);
    }

    @Override // defpackage.iq0, defpackage.y10
    public final void z(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = h;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                m20.K(r31.I(this.g), nm.B(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
