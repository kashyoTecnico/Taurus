package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ob0 extends st0 implements mb0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(ob0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = nm.g;

    public final Object c(mk mkVar) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = st0.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                j41 j41Var = j41.a;
                if (i2 <= 0) {
                    ad adVarB = m20.B(r31.I(mkVar));
                    try {
                        a(new nb0(this, adVarB));
                        Object objS = adVarB.s();
                        xl xlVar = xl.d;
                        if (objS != xlVar) {
                            objS = j41Var;
                        }
                        return objS == xlVar ? objS : j41Var;
                    } catch (Throwable th) {
                        adVarB.A();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    return j41Var;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(st0.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            cs csVar = nm.g;
            if (obj2 != csVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, csVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(nm.t(this));
        sb.append("[isLocked=");
        sb.append(Math.max(st0.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
