package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class zi {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zi.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(zi.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public zi(or0 or0Var) {
        this._prev$volatile = or0Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final zi b() {
        Object obj = a.get(this);
        if (obj == c4.c) {
            return null;
        }
        return (zi) obj;
    }

    public abstract boolean c();

    public final void d() {
        zi ziVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            zi ziVar = (zi) atomicReferenceFieldUpdater.get(this);
            while (ziVar != null && ziVar.c()) {
                ziVar = (zi) atomicReferenceFieldUpdater.get(ziVar);
            }
            zi ziVarB2 = b();
            c10.m(ziVarB2);
            while (ziVarB2.c() && (ziVarB = ziVarB2.b()) != null) {
                ziVarB2 = ziVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(ziVarB2);
                zi ziVar2 = ((zi) obj) == null ? null : ziVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(ziVarB2, obj, ziVar2)) {
                    if (atomicReferenceFieldUpdater.get(ziVarB2) != obj) {
                        break;
                    }
                }
            }
            if (ziVar != null) {
                a.set(ziVar, ziVarB2);
            }
            if (!ziVarB2.c() || ziVarB2.b() == null) {
                if (ziVar == null || !ziVar.c()) {
                    return;
                }
            }
        }
    }
}
