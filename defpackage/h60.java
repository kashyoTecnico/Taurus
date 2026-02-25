package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class h60 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h60.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(h60.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(h60.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(h60 h60Var, int i) {
        while (true) {
            h60 h60VarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (h60VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    h60VarF = (h60) obj;
                    if (!h60VarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(h60VarF);
                }
            }
            if (h60VarF instanceof y50) {
                return (((y50) h60VarF).g & i) == 0 && h60VarF.e(h60Var, i);
            }
            atomicReferenceFieldUpdater.set(h60Var, h60VarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            atomicReferenceFieldUpdater2.set(h60Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(h60VarF, this, h60Var)) {
                if (atomicReferenceFieldUpdater2.get(h60VarF) != this) {
                    break;
                }
            }
            h60Var.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.nm0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h60 f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.h60.e
            java.lang.Object r1 = r0.get(r9)
            h60 r1 = (defpackage.h60) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.h60.d
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.nm0
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            nm0 r6 = (defpackage.nm0) r6
            h60 r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            h60 r3 = (defpackage.h60) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.c10.n(r6, r4)
            r4 = r6
            h60 r4 = (defpackage.h60) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h60.f():h60");
    }

    public final void g(h60 h60Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            h60 h60Var2 = (h60) atomicReferenceFieldUpdater.get(h60Var);
            if (d.get(this) != h60Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(h60Var, h60Var2, this)) {
                if (atomicReferenceFieldUpdater.get(h60Var) != h60Var2) {
                    break;
                }
            }
            if (i()) {
                h60Var.f();
                return;
            }
            return;
        }
    }

    public final h60 h() {
        h60 h60Var;
        Object obj = d.get(this);
        nm0 nm0Var = obj instanceof nm0 ? (nm0) obj : null;
        if (nm0Var != null && (h60Var = nm0Var.a) != null) {
            return h60Var;
        }
        c10.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (h60) obj;
    }

    public boolean i() {
        return d.get(this) instanceof nm0;
    }

    public String toString() {
        return new g60(this, nm.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, 0) + '@' + nm.t(this);
    }
}
