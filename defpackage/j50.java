package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j50 extends pl implements kn {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(j50.class, "runningWorkers$volatile");
    public final /* synthetic */ kn f;
    public final pl g;
    public final int h;
    public final i60 i;
    public final Object j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public j50(pl plVar, int i) {
        kn knVar = plVar instanceof kn ? (kn) plVar : null;
        this.f = knVar == null ? um.a : knVar;
        this.g = plVar;
        this.h = i;
        this.i = new i60();
        this.j = new Object();
    }

    @Override // defpackage.kn
    public final void c(long j, ad adVar) {
        this.f.c(j, adVar);
    }

    @Override // defpackage.pl
    public final void d(ml mlVar, Runnable runnable) {
        boolean z;
        Runnable runnableH;
        this.i.a(runnable);
        if (k.get(this) < this.h) {
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableH = h()) == null) {
                return;
            }
            this.g.d(this, new rx(this, runnableH));
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.pl
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append(".limitedParallelism(");
        return b8.h(sb, this.h, ')');
    }
}
