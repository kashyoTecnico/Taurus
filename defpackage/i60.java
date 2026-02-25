package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class i60 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(i60.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new k60(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            k60 k60Var = (k60) atomicReferenceFieldUpdater.get(this);
            int iA = k60Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                k60 k60VarC = k60Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, k60Var, k60VarC) && atomicReferenceFieldUpdater.get(this) == k60Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            k60 k60Var = (k60) atomicReferenceFieldUpdater.get(this);
            if (k60Var.b()) {
                return;
            }
            k60 k60VarC = k60Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, k60Var, k60VarC) && atomicReferenceFieldUpdater.get(this) == k60Var) {
            }
        }
    }

    public final int c() {
        k60 k60Var = (k60) a.get(this);
        k60Var.getClass();
        long j = k60.f.get(k60Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            k60 k60Var = (k60) atomicReferenceFieldUpdater.get(this);
            Object objD = k60Var.d();
            if (objD != k60.g) {
                return objD;
            }
            k60 k60VarC = k60Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, k60Var, k60VarC) && atomicReferenceFieldUpdater.get(this) == k60Var) {
            }
        }
    }
}
