package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class or0 extends zi implements wc0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(or0.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public or0(long j, or0 or0Var, int i) {
        super(or0Var);
        this.c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.zi
    public final boolean c() {
        return d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, ml mlVar);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
