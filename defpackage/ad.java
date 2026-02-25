package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class ad extends vo implements yc, yl, n61 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(ad.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ad.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(ad.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final lk g;
    public final ml h;

    public ad(int i2, lk lkVar) {
        super(i2);
        this.g = lkVar;
        this.h = lkVar.f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = i1.a;
    }

    public static Object F(wc0 wc0Var, Object obj, int i2, lw lwVar) {
        if (obj instanceof eg) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (lwVar != null || (wc0Var instanceof wc)) {
            return new cg(obj, wc0Var instanceof wc ? (wc) wc0Var : null, lwVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(wc0 wc0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + wc0Var + ", already has " + obj).toString());
    }

    public final void A() {
        lk lkVar = this.g;
        Throwable th = null;
        to toVar = lkVar instanceof to ? (to) lkVar : null;
        if (toVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = to.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(toVar);
                cs csVar = m20.c;
                if (obj == csVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(toVar, csVar, this)) {
                        if (atomicReferenceFieldUpdater.get(toVar) != csVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(toVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(toVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            m(th);
        }
    }

    @Override // defpackage.yc
    public final void B(Object obj) {
        q(this.f);
    }

    public final void C(Object obj, lw lwVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        D(obj, this.f, lwVar);
    }

    public final void D(Object obj, int i2, lw lwVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof wc0) {
                Object objF = F((wc0) obj2, obj, i2, lwVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i2);
                return;
            }
            if (obj2 instanceof bd) {
                bd bdVar = (bd) obj2;
                if (bd.c.compareAndSet(bdVar, 0, 1)) {
                    if (lwVar != null) {
                        n(lwVar, bdVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(pl plVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lk lkVar = this.g;
        to toVar = lkVar instanceof to ? (to) lkVar : null;
        D(j41.a, (toVar != null ? toVar.g : null) == plVar ? 4 : this.f, null);
    }

    @Override // defpackage.n61
    public final void a(or0 or0Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        w(or0Var);
    }

    @Override // defpackage.vo
    public final void b(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof wc0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof eg) {
                return;
            }
            if (!(obj instanceof cg)) {
                cancellationException2 = cancellationException;
                cg cgVar = new cg(obj, (wc) null, (lw) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cgVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            cg cgVar2 = (cg) obj;
            if (cgVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            cg cgVarA = cg.a(cgVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cgVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            wc wcVar = cgVar2.b;
            if (wcVar != null) {
                k(wcVar, cancellationException);
            }
            lw lwVar = cgVar2.c;
            if (lwVar != null) {
                n(lwVar, cancellationException, cgVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.vo
    public final lk c() {
        return this.g;
    }

    @Override // defpackage.yl
    public final yl d() {
        lk lkVar = this.g;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    @Override // defpackage.vo
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.h;
    }

    @Override // defpackage.vo
    public final Object g(Object obj) {
        return obj instanceof cg ? ((cg) obj).a : obj;
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        Throwable thA = zm0.a(obj);
        if (thA != null) {
            obj = new eg(thA, false);
        }
        D(obj, this.f, null);
    }

    @Override // defpackage.vo
    public final Object j() {
        return j.get(this);
    }

    public final void k(wc wcVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            switch (wcVar.a) {
                case 0:
                    ((iw) wcVar.b).g(th);
                    break;
                default:
                    ((cp) wcVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            c4.u(this.h, new fg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.yc
    public final cs l(Object obj, lw lwVar) {
        cs csVar = m20.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof wc0)) {
                return null;
            }
            Object objF = F((wc0) obj2, obj, this.f, lwVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return csVar;
        }
    }

    @Override // defpackage.yc
    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof wc0)) {
                return false;
            }
            bd bdVar = new bd(this, th, (obj instanceof wc) || (obj instanceof or0));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bdVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            wc0 wc0Var = (wc0) obj;
            if (wc0Var instanceof wc) {
                k((wc) obj, th);
            } else if (wc0Var instanceof or0) {
                o((or0) obj, th);
            }
            if (!x()) {
                p();
            }
            q(this.f);
            return true;
        }
    }

    public final void n(lw lwVar, Throwable th, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ml mlVar = this.h;
        try {
            lwVar.c(th, obj, mlVar);
        } catch (Throwable th2) {
            c4.u(mlVar, new fg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o(or0 or0Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ml mlVar = this.h;
        int i2 = i.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            or0Var.g(i2, mlVar);
        } catch (Throwable th2) {
            c4.u(mlVar, new fg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        cp cpVar = (cp) atomicReferenceFieldUpdater.get(this);
        if (cpVar == null) {
            return;
        }
        cpVar.a();
        atomicReferenceFieldUpdater.set(this, uc0.d);
    }

    public final void q(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                lk lkVar = this.g;
                if (!z && (lkVar instanceof to)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.f;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        to toVar = (to) lkVar;
                        pl plVar = toVar.g;
                        ml mlVarF = toVar.h.f();
                        if (plVar.f(mlVarF)) {
                            plVar.d(mlVarF, this);
                            return;
                        }
                        xs xsVarA = k21.a();
                        if (xsVarA.f >= 4294967296L) {
                            xsVarA.l(this);
                            return;
                        }
                        xsVarA.o(true);
                        try {
                            l81.W(this, lkVar, true);
                            do {
                            } while (xsVarA.u());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                l81.W(this, lkVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable r(y10 y10Var) {
        return y10Var.q();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        r10 r10Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = i;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = j.get(this);
                if (obj instanceof eg) {
                    throw ((eg) obj).a;
                }
                int i4 = this.f;
                if ((i4 != 1 && i4 != 2) || (r10Var = (r10) this.h.n(g2.E)) == null || r10Var.b()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionQ = r10Var.q();
                b(cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((cp) k.get(this)) == null) {
            u();
        }
        if (zX) {
            A();
        }
        return xl.d;
    }

    public final void t() {
        cp cpVarU = u();
        if (cpVarU == null || (j.get(this) instanceof wc0)) {
            return;
        }
        cpVarU.a();
        k.set(this, uc0.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(nm.G(this.g));
        sb.append("){");
        Object obj = j.get(this);
        sb.append(obj instanceof wc0 ? "Active" : obj instanceof bd ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(nm.t(this));
        return sb.toString();
    }

    public final cp u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r10 r10Var = (r10) this.h.n(g2.E);
        if (r10Var == null) {
            return null;
        }
        cp cpVarV = c4.v(r10Var, true, new zd(this, 0));
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cpVarV)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return cpVarV;
    }

    public final void v(iw iwVar) {
        w(new wc(0, iwVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.wc0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ad.j
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.i1
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.wc
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.or0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.eg
            if (r1 == 0) goto L4d
            r0 = r2
            eg r0 = (defpackage.eg) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.eg.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof defpackage.bd
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.a
            boolean r1 = r8 instanceof defpackage.wc
            if (r1 == 0) goto L43
            wc r8 = (defpackage.wc) r8
            r7.k(r8, r0)
            return
        L43:
            or0 r8 = (defpackage.or0) r8
            r7.o(r8, r0)
            return
        L49:
            y(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof defpackage.cg
            if (r1 == 0) goto L80
            r1 = r2
            cg r1 = (defpackage.cg) r1
            wc r4 = r1.b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof defpackage.or0
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            wc r4 = (defpackage.wc) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L68
            r7.k(r4, r5)
            return
        L68:
            r5 = 29
            cg r1 = defpackage.cg.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            y(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof defpackage.or0
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            wc r3 = (defpackage.wc) r3
            cg r1 = new cg
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.w(wc0):void");
    }

    public final boolean x() {
        if (this.f != 2) {
            return false;
        }
        lk lkVar = this.g;
        c10.n(lkVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return to.k.get((to) lkVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
