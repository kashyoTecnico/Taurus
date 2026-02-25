package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c0 extends r31 {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.r31
    public final void R(e0 e0Var, e0 e0Var2) {
        this.g.lazySet(e0Var, e0Var2);
    }

    @Override // defpackage.r31
    public final void S(e0 e0Var, Thread thread) {
        this.f.lazySet(e0Var, thread);
    }

    @Override // defpackage.r31
    public final boolean n(f0 f0Var, b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, b0Var, b0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == b0Var);
        return false;
    }

    @Override // defpackage.r31
    public final boolean o(f0 f0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == obj);
        return false;
    }

    @Override // defpackage.r31
    public final boolean p(f0 f0Var, e0 e0Var, e0 e0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, e0Var, e0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == e0Var);
        return false;
    }
}
