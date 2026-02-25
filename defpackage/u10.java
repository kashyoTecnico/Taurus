package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class u10 extends h60 implements cp, bz {
    public y10 g;

    @Override // defpackage.cp
    public final void a() {
        y10 y10VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y10.d;
            Object obj = atomicReferenceFieldUpdater.get(y10VarJ);
            if (obj instanceof u10) {
                if (obj != this) {
                    return;
                }
                fs fsVar = m20.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(y10VarJ, obj, fsVar)) {
                    if (atomicReferenceFieldUpdater.get(y10VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof bz) || ((bz) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h60.d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof nm0) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                c10.n(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                h60 h60Var = (h60) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = h60.f;
                nm0 nm0Var = (nm0) atomicReferenceFieldUpdater3.get(h60Var);
                if (nm0Var == null) {
                    nm0Var = new nm0(h60Var);
                    atomicReferenceFieldUpdater3.set(h60Var, nm0Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nm0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                h60Var.f();
                return;
            }
        }
    }

    @Override // defpackage.bz
    public final boolean b() {
        return true;
    }

    @Override // defpackage.bz
    public final pc0 d() {
        return null;
    }

    public r10 getParent() {
        return j();
    }

    public final y10 j() {
        y10 y10Var = this.g;
        if (y10Var != null) {
            return y10Var;
        }
        c10.Y("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.h60
    public final String toString() {
        return getClass().getSimpleName() + '@' + nm.t(this) + "[job@" + nm.t(j()) + ']';
    }
}
