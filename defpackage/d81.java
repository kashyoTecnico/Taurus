package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d81.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(d81.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(d81.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(d81.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final kz0 a(kz0 kz0Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return kz0Var;
        }
        if (kz0Var.e) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, kz0Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final kz0 b() {
        kz0 kz0Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (kz0Var = (kz0) this.a.getAndSet(i2, null)) != null) {
                if (kz0Var.e) {
                    e.decrementAndGet(this);
                }
                return kz0Var;
            }
        }
    }

    public final kz0 c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        kz0 kz0Var = (kz0) atomicReferenceArray.get(i2);
        if (kz0Var != null && kz0Var.e == z) {
            while (!atomicReferenceArray.compareAndSet(i2, kz0Var, null)) {
                if (atomicReferenceArray.get(i2) != kz0Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return kz0Var;
        }
        return null;
    }
}
