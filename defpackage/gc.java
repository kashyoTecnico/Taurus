package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class gc implements ld {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(gc.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(gc.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(gc.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(gc.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public gc(int i2) {
        this.d = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        vd vdVar = ic.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = g.get(this);
        vd vdVar2 = new vd(0L, null, this, 3);
        this.sendSegment$volatile = vdVar2;
        this.receiveSegment$volatile = vdVar2;
        if (w()) {
            vdVar2 = ic.a;
            c10.n(vdVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = vdVar2;
        this._closeCause$volatile = ic.s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof yc)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        yc ycVar = (yc) obj;
        vd vdVar = ic.a;
        cs csVarL = ycVar.l(j41.a, null);
        if (csVarL == null) {
            return false;
        }
        ycVar.B(csVarL);
        return true;
    }

    public static final vd b(gc gcVar, long j2, vd vdVar) {
        Object objP;
        gc gcVar2;
        vd vdVar2 = ic.a;
        hc hcVar = hc.l;
        loop0: while (true) {
            objP = c4.p(vdVar, j2, hcVar);
            if (!no0.s(objP)) {
                or0 or0VarL = no0.l(objP);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    or0 or0Var = (or0) atomicReferenceFieldUpdater.get(gcVar);
                    if (or0Var.c >= or0VarL.c) {
                        break loop0;
                    }
                    if (!or0VarL.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gcVar, or0Var, or0VarL)) {
                        if (atomicReferenceFieldUpdater.get(gcVar) != or0Var) {
                            if (or0VarL.e()) {
                                or0VarL.d();
                            }
                        }
                    }
                    if (or0Var.e()) {
                        or0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zS = no0.s(objP);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (zS) {
            gcVar.i();
            if (vdVar.c * ic.b < atomicLongFieldUpdater.get(gcVar)) {
                vdVar.a();
                return null;
            }
        } else {
            vd vdVar3 = (vd) no0.l(objP);
            long j3 = vdVar3.c;
            if (j3 <= j2) {
                return vdVar3;
            }
            long j4 = ic.b * j3;
            while (true) {
                long j5 = e.get(gcVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    gcVar2 = gcVar;
                    break;
                }
                gcVar2 = gcVar;
                if (e.compareAndSet(gcVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                gcVar = gcVar2;
            }
            if (j3 * ic.b < atomicLongFieldUpdater.get(gcVar2)) {
                vdVar3.a();
            }
        }
        return null;
    }

    public static final void d(gc gcVar, Object obj, ad adVar) {
        adVar.h(c10.z(gcVar.p()));
    }

    public static final int e(gc gcVar, vd vdVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        vdVar.m(i2, obj);
        if (z) {
            return gcVar.D(vdVar, i2, obj, j2, obj2, z);
        }
        Object objK = vdVar.k(i2);
        if (objK == null) {
            if (gcVar.f(j2)) {
                if (vdVar.j(i2, null, ic.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (vdVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof n61) {
            vdVar.m(i2, null);
            if (gcVar.A(objK, obj)) {
                vdVar.n(i2, ic.i);
                return 0;
            }
            cs csVar = ic.k;
            if (vdVar.f.getAndSet((i2 * 2) + 1, csVar) == csVar) {
                return 5;
            }
            vdVar.l(i2, true);
            return 5;
        }
        return gcVar.D(vdVar, i2, obj, j2, obj2, z);
    }

    public static void r(gc gcVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if ((atomicLongFieldUpdater.addAndGet(gcVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(gcVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof fc)) {
            if (!(obj instanceof yc)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            yc ycVar = (yc) obj;
            vd vdVar = ic.a;
            cs csVarL = ycVar.l(obj2, null);
            if (csVarL == null) {
                return false;
            }
            ycVar.B(csVarL);
            return true;
        }
        fc fcVar = (fc) obj;
        ad adVar = fcVar.e;
        c10.m(adVar);
        fcVar.e = null;
        fcVar.d = obj2;
        Boolean bool = Boolean.TRUE;
        fcVar.f.getClass();
        vd vdVar2 = ic.a;
        cs csVarL2 = adVar.l(bool, null);
        if (csVarL2 == null) {
            return false;
        }
        adVar.B(csVarL2);
        return true;
    }

    public final Object C(vd vdVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = vdVar.f;
        Object objK = vdVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ic.n;
                }
                if (vdVar.j(i2, objK, obj)) {
                    k();
                    return ic.m;
                }
            }
        } else if (objK == ic.d && vdVar.j(i2, objK, ic.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            vdVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = vdVar.k(i2);
            if (objK2 == null || objK2 == ic.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (vdVar.j(i2, objK2, ic.h)) {
                        k();
                        return ic.o;
                    }
                } else {
                    if (obj == null) {
                        return ic.n;
                    }
                    if (vdVar.j(i2, objK2, obj)) {
                        k();
                        return ic.m;
                    }
                }
            } else if (objK2 != ic.d) {
                cs csVar = ic.j;
                if (objK2 == csVar) {
                    return ic.o;
                }
                if (objK2 == ic.h) {
                    return ic.o;
                }
                if (objK2 == ic.l) {
                    k();
                    return ic.o;
                }
                if (objK2 != ic.g && vdVar.j(i2, objK2, ic.f)) {
                    boolean z = objK2 instanceof o61;
                    if (z) {
                        objK2 = ((o61) objK2).a;
                    }
                    if (B(objK2)) {
                        vdVar.n(i2, ic.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        vdVar.m(i2, null);
                        return obj3;
                    }
                    vdVar.n(i2, csVar);
                    vdVar.h();
                    if (z) {
                        k();
                    }
                    return ic.o;
                }
            } else if (vdVar.j(i2, objK2, ic.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                vdVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int D(vd vdVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objK = vdVar.k(i2);
            if (objK == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (vdVar.j(i2, null, ic.j)) {
                            vdVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (vdVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (vdVar.j(i2, null, ic.d)) {
                    break;
                }
            } else {
                if (objK != ic.e) {
                    cs csVar = ic.k;
                    if (objK == csVar) {
                        vdVar.m(i2, null);
                        return 5;
                    }
                    if (objK == ic.h) {
                        vdVar.m(i2, null);
                        return 5;
                    }
                    if (objK == ic.l) {
                        vdVar.m(i2, null);
                        i();
                        return 4;
                    }
                    vdVar.m(i2, null);
                    if (objK instanceof o61) {
                        objK = ((o61) objK).a;
                    }
                    if (A(objK, obj)) {
                        vdVar.n(i2, ic.i);
                        return 0;
                    }
                    if (vdVar.f.getAndSet((i2 * 2) + 1, csVar) != csVar) {
                        vdVar.l(i2, true);
                    }
                    return 5;
                }
                if (vdVar.j(i2, objK, ic.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        gc gcVar = this;
        if (gcVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater.get(gcVar) > j2) {
                break;
            } else {
                gcVar = this;
            }
        }
        int i2 = ic.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(gcVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(gcVar)) && j3 == atomicLongFieldUpdater.get(gcVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(gcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(gcVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        gcVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(gcVar);
                    long j6 = atomicLongFieldUpdater2.get(gcVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(gcVar)) {
                        break;
                    }
                    if (z) {
                        gcVar = this;
                    } else {
                        gcVar = this;
                        atomicLongFieldUpdater2.compareAndSet(gcVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(gcVar);
                    if (atomicLongFieldUpdater2.compareAndSet(gcVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        gcVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ll0
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144 A[RETURN] */
    @Override // defpackage.vt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.lk r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.c(lk, java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j2) {
        return j2 < g.get(this) || j2 < f.get(this) + ((long) this.d);
    }

    public final boolean g(Throwable th, boolean z) {
        gc gcVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (z) {
            while (true) {
                long j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                vd vdVar = ic.a;
                gcVar = this;
                if (atomicLongFieldUpdater.compareAndSet(gcVar, j6, (j6 & 1152921504606846975L) + (1 << 60))) {
                    break;
                }
                this = gcVar;
            }
        } else {
            gcVar = this;
        }
        cs csVar = ic.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(gcVar, csVar, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(gcVar) != csVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(gcVar);
            } while (!atomicLongFieldUpdater.compareAndSet(gcVar, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(gcVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(gcVar, j2, (j4 << 60) + j3));
        }
        gcVar.i();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                obj = atomicReferenceFieldUpdater2.get(gcVar);
                cs csVar2 = obj == null ? ic.q : ic.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(gcVar, obj, csVar2)) {
                    if (atomicReferenceFieldUpdater2.get(gcVar) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                r31.m(1, obj);
                ((iw) obj).g(gcVar.m());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (defpackage.vd) ((defpackage.zi) defpackage.zi.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vd h(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.h(long):vd");
    }

    public final void i() {
        t(e.get(this), false);
    }

    @Override // defpackage.ll0
    public final fc iterator() {
        return new fc(this);
    }

    public final void j(long j2) {
        vd vdVar = (vd) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.d + j3, g.get(this))) {
                return;
            }
            gc gcVar = this;
            if (atomicLongFieldUpdater.compareAndSet(gcVar, j3, 1 + j3)) {
                long j4 = ic.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (vdVar.c != j5) {
                    vd vdVarL = gcVar.l(j5, vdVar);
                    if (vdVarL != null) {
                        vdVar = vdVarL;
                    }
                }
                vd vdVar2 = vdVar;
                if (gcVar.C(vdVar2, i2, j3, null) != ic.o || j3 < gcVar.q()) {
                    vdVar2.a();
                }
                this = gcVar;
                vdVar = vdVar2;
            }
            this = gcVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.k():void");
    }

    public final vd l(long j2, vd vdVar) {
        Object objP;
        gc gcVar;
        vd vdVar2 = ic.a;
        hc hcVar = hc.l;
        loop0: while (true) {
            objP = c4.p(vdVar, j2, hcVar);
            if (!no0.s(objP)) {
                or0 or0VarL = no0.l(objP);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    or0 or0Var = (or0) atomicReferenceFieldUpdater.get(this);
                    if (or0Var.c >= or0VarL.c) {
                        break loop0;
                    }
                    if (!or0VarL.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, or0Var, or0VarL)) {
                        if (atomicReferenceFieldUpdater.get(this) != or0Var) {
                            if (or0VarL.e()) {
                                or0VarL.d();
                            }
                        }
                    }
                    if (or0Var.e()) {
                        or0Var.d();
                    }
                }
            } else {
                break;
            }
        }
        if (no0.s(objP)) {
            i();
            if (vdVar.c * ic.b < q()) {
                vdVar.a();
                return null;
            }
        } else {
            vd vdVar3 = (vd) no0.l(objP);
            long j3 = vdVar3.c;
            if (!w() && j2 <= g.get(this) / ic.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    or0 or0Var2 = (or0) atomicReferenceFieldUpdater2.get(this);
                    if (or0Var2.c >= j3 || !vdVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, or0Var2, vdVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != or0Var2) {
                            if (vdVar3.e()) {
                                vdVar3.d();
                            }
                        }
                    }
                    if (or0Var2.e()) {
                        or0Var2.d();
                    }
                }
            }
            if (j3 <= j2) {
                return vdVar3;
            }
            long j4 = j3 * ic.b;
            while (true) {
                long j5 = f.get(this);
                if (j5 >= j4) {
                    gcVar = this;
                    break;
                }
                gcVar = this;
                if (f.compareAndSet(gcVar, j5, j4)) {
                    break;
                }
                this = gcVar;
            }
            if (j3 * ic.b < gcVar.q()) {
                vdVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) l.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new se("Channel was closed") : thM;
    }

    @Override // defpackage.ll0
    public final Object o(jy0 jy0Var) throws Throwable {
        vd vdVar;
        Throwable th;
        vd vdVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        vd vdVar3 = (vd) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            if (this.t(atomicLongFieldUpdater.get(this), true)) {
                Throwable thN = this.n();
                int i2 = qw0.a;
                throw thN;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j2 = ic.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (vdVar3.c != j3) {
                vd vdVarL = this.l(j3, vdVar3);
                if (vdVarL == null) {
                    continue;
                } else {
                    vdVar = vdVarL;
                }
            } else {
                vdVar = vdVar3;
            }
            gc gcVar = this;
            Object objC = gcVar.C(vdVar, i3, andIncrement, null);
            cs csVar = ic.m;
            if (objC == csVar) {
                throw new IllegalStateException("unexpected");
            }
            cs csVar2 = ic.o;
            if (objC == csVar2) {
                if (andIncrement < gcVar.q()) {
                    vdVar.a();
                }
                this = gcVar;
                vdVar3 = vdVar;
            } else {
                if (objC != ic.n) {
                    vdVar.a();
                    return objC;
                }
                ad adVarB = m20.B(r31.I(jy0Var));
                try {
                    Object objC2 = gcVar.C(vdVar, i3, andIncrement, adVarB);
                    if (objC2 == csVar) {
                        adVarB.a(vdVar, i3);
                    } else {
                        if (objC2 == csVar2) {
                            if (andIncrement < gcVar.q()) {
                                vdVar.a();
                            }
                            vd vdVar4 = (vd) atomicReferenceFieldUpdater.get(gcVar);
                            while (true) {
                                if (gcVar.t(atomicLongFieldUpdater.get(gcVar), true)) {
                                    adVarB.h(c10.z(gcVar.n()));
                                    break;
                                }
                                ad adVar = adVarB;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(gcVar);
                                    long j4 = ic.b;
                                    long j5 = andIncrement2 / j4;
                                    int i4 = (int) (andIncrement2 % j4);
                                    if (vdVar4.c != j5) {
                                        try {
                                            vd vdVarL2 = gcVar.l(j5, vdVar4);
                                            if (vdVarL2 == null) {
                                                adVarB = adVar;
                                            } else {
                                                vdVar2 = vdVarL2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            adVarB = adVar;
                                            adVarB.A();
                                            throw th;
                                        }
                                    } else {
                                        vdVar2 = vdVar4;
                                    }
                                    gc gcVar2 = gcVar;
                                    objC2 = gcVar2.C(vdVar2, i4, andIncrement2, adVar);
                                    gcVar = gcVar2;
                                    vd vdVar5 = vdVar2;
                                    adVarB = adVar;
                                    if (objC2 == ic.m) {
                                        adVarB.a(vdVar5, i4);
                                        break;
                                    }
                                    if (objC2 == ic.o) {
                                        if (andIncrement2 < gcVar.q()) {
                                            vdVar5.a();
                                        }
                                        vdVar4 = vdVar5;
                                    } else {
                                        if (objC2 == ic.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        vdVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    adVarB = adVar;
                                    th = th;
                                    adVarB.A();
                                    throw th;
                                }
                            }
                        } else {
                            vdVar.a();
                        }
                        adVarB.C(objC2, null);
                    }
                    return adVarB.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    public final Throwable p() {
        Throwable thM = m();
        return thM == null ? new te("Channel was closed") : thM;
    }

    public final long q() {
        return e.get(this) & 1152921504606846975L;
    }

    @Override // defpackage.ll0
    public final Object s() {
        vd vdVar;
        ud udVar = d80.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (t(j3, true)) {
            return new td(m());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return udVar;
        }
        Object obj = ic.k;
        vd vdVar2 = (vd) j.get(this);
        while (!this.t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = ic.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (vdVar2.c != j5) {
                vd vdVarL = this.l(j5, vdVar2);
                if (vdVarL == null) {
                    continue;
                } else {
                    vdVar = vdVarL;
                }
            } else {
                vdVar = vdVar2;
            }
            gc gcVar = this;
            Object objC = gcVar.C(vdVar, i2, andIncrement, obj);
            vdVar2 = vdVar;
            if (objC == ic.m) {
                n61 n61Var = obj instanceof n61 ? (n61) obj : null;
                if (n61Var != null) {
                    n61Var.a(vdVar2, i2);
                }
                gcVar.E(andIncrement);
                vdVar2.h();
                return udVar;
            }
            if (objC != ic.o) {
                if (objC == ic.n) {
                    throw new IllegalStateException("unexpected");
                }
                vdVar2.a();
                return objC;
            }
            if (andIncrement < gcVar.q()) {
                vdVar2.a();
            }
            this = gcVar;
        }
        return new td(this.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.vd) ((defpackage.zi) defpackage.zi.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        r3 = (defpackage.vd) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be A[SYNTHETIC] */
    @Override // defpackage.vt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.lang.Object r16) {
        /*
            r15 = this;
            ud r8 = defpackage.d80.a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = defpackage.gc.e
            long r1 = r9.get(r15)
            r10 = 0
            boolean r3 = r15.t(r1, r10)
            r11 = 1
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L17
            r1 = r10
            goto L1d
        L17:
            long r1 = r1 & r12
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r11
        L1d:
            if (r1 == 0) goto L20
            return r8
        L20:
            cs r6 = defpackage.ic.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.gc.i
            java.lang.Object r1 = r1.get(r15)
            vd r1 = (defpackage.vd) r1
        L2a:
            long r2 = r9.getAndIncrement(r15)
            long r4 = r2 & r12
            boolean r7 = r15.t(r2, r10)
            int r14 = defpackage.ic.b
            long r2 = (long) r14
            long r12 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r10 = r1.c
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L5d
            vd r3 = b(r15, r12, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        L54:
            r10 = 0
            r11 = 1
        L56:
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r10 = e(r0, r1, r2, r3, r4, r6, r7)
            j41 r3 = defpackage.j41.a
            if (r10 == 0) goto Lbe
            r11 = 1
            if (r10 == r11) goto Lbd
            r3 = 2
            if (r10 == r3) goto L9c
            r2 = 3
            if (r10 == r2) goto L94
            r2 = 4
            if (r10 == r2) goto L7d
            r2 = 5
            if (r10 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r10 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.gc.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L9c:
            if (r7 == 0) goto Lab
            r1.h()
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        Lab:
            boolean r0 = r6 instanceof defpackage.n61
            if (r0 == 0) goto Lb2
            n61 r6 = (defpackage.n61) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.h()
            return r8
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.u(java.lang.Object):java.lang.Object");
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j2 = g.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r5, defpackage.vd r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            zi r0 = r7.b()
            vd r0 = (defpackage.vd) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            zi r5 = r7.b()
            vd r5 = (defpackage.vd) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.gc.k
            java.lang.Object r6 = r5.get(r4)
            or0 r6 = (defpackage.or0) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.e()
            if (r4 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.x(long, vd):void");
    }

    public final Object y(lk lkVar, Object obj) {
        ad adVar = new ad(1, r31.I(lkVar));
        adVar.t();
        adVar.h(c10.z(p()));
        Object objS = adVar.s();
        return objS == xl.d ? objS : j41.a;
    }

    public final void z(n61 n61Var, boolean z) {
        if (n61Var instanceof yc) {
            ((lk) n61Var).h(c10.z(z ? n() : p()));
            return;
        }
        if (!(n61Var instanceof fc)) {
            throw new IllegalStateException(("Unexpected waiter: " + n61Var).toString());
        }
        fc fcVar = (fc) n61Var;
        ad adVar = fcVar.e;
        c10.m(adVar);
        fcVar.e = null;
        fcVar.d = ic.l;
        Throwable thM = fcVar.f.m();
        if (thM == null) {
            adVar.h(Boolean.FALSE);
        } else {
            adVar.h(c10.z(thM));
        }
    }
}
