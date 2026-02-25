package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uo0 implements lk, yl {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(uo0.class, Object.class, "result");
    public final lk d;
    private volatile Object result;

    public uo0(lk lkVar) {
        xl xlVar = xl.d;
        this.d = lkVar;
        this.result = xlVar;
    }

    @Override // defpackage.yl
    public final yl d() {
        lk lkVar = this.d;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.d.f();
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            xl xlVar = xl.e;
            if (obj2 == xlVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xlVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != xlVar) {
                        break;
                    }
                }
                return;
            }
            xl xlVar2 = xl.d;
            if (obj2 != xlVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            xl xlVar3 = xl.f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, xlVar2, xlVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != xlVar2) {
                    break;
                }
            }
            this.d.h(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}
