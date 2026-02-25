package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ws extends xs implements kn {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ws.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(ws.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ws.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public final void A() {
        us usVarB;
        vs vsVar = (vs) k.get(this);
        if (vsVar == null || m21.b.get(vsVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (vsVar) {
                try {
                    us[] usVarArr = vsVar.a;
                    us usVar = usVarArr != null ? usVarArr[0] : null;
                    if (usVar != null) {
                        usVarB = ((jNanoTime - usVar.d) > 0L ? 1 : ((jNanoTime - usVar.d) == 0L ? 0 : -1)) >= 0 ? B(usVar) : false ? vsVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (usVarB != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ws.j
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ws.l
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.k60
            if (r4 == 0) goto L47
            r4 = r1
            k60 r4 = (defpackage.k60) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            k60 r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            cs r4 = defpackage.nm.f
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            k60 r3 = new k60
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.B(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r7 = this;
            q9 r0 = r7.h
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ws.k
            java.lang.Object r0 = r0.get(r7)
            vs r0 = (defpackage.vs) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.m21.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ws.j
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof defpackage.k60
            if (r0 == 0) goto L4f
            k60 r7 = (defpackage.k60) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.k60.f
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            cs r0 = defpackage.nm.f
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.C():boolean");
    }

    public final void D(long j2, us usVar) {
        int iB;
        Thread threadM;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        if (l.get(this) != 0) {
            iB = 1;
        } else {
            vs vsVar = (vs) atomicReferenceFieldUpdater.get(this);
            if (vsVar == null) {
                vs vsVar2 = new vs();
                vsVar2.c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vsVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                c10.m(obj);
                vsVar = (vs) obj;
            }
            iB = usVar.b(j2, vsVar, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                y(j2, usVar);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        vs vsVar3 = (vs) atomicReferenceFieldUpdater.get(this);
        if (vsVar3 != null) {
            synchronized (vsVar3) {
                us[] usVarArr = vsVar3.a;
                usVar = usVarArr != null ? usVarArr[0] : null;
            }
        }
        if (usVar != usVar || Thread.currentThread() == (threadM = m())) {
            return;
        }
        LockSupport.unpark(threadM);
    }

    @Override // defpackage.kn
    public final void c(long j2, ad adVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ts tsVar = new ts(this, j3 + jNanoTime, adVar);
            D(jNanoTime, tsVar);
            adVar.w(new wc(1, tsVar));
        }
    }

    @Override // defpackage.pl
    public final void d(ml mlVar, Runnable runnable) {
        z(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // defpackage.xs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s() {
        /*
            r10 = this;
            cs r0 = defpackage.nm.f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ws.j
            boolean r2 = r10.u()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.A()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof defpackage.k60
            if (r6 == 0) goto L3e
            r6 = r2
            k60 r6 = (defpackage.k60) r6
            java.lang.Object r7 = r6.d()
            cs r8 = defpackage.k60.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            k60 r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            q9 r2 = r10.h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof defpackage.k60
            if (r2 == 0) goto L8d
            k60 r1 = (defpackage.k60) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.k60.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ws.k
            java.lang.Object r10 = r0.get(r10)
            vs r10 = (defpackage.vs) r10
            if (r10 == 0) goto Lb8
            monitor-enter(r10)
            us[] r0 = r10.a     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La5
            r1 = 0
            r5 = r0[r1]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto Lb6
        La5:
            monitor-exit(r10)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.d
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r10)
            throw r0
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.s():long");
    }

    @Override // defpackage.xs
    public void shutdown() {
        us usVarB;
        k21.a.set(null);
        l.set(this, 1);
        cs csVar = nm.f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof k60)) {
                    if (obj != csVar) {
                        k60 k60Var = new k60(8, true);
                        k60Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k60Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((k60) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, csVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (s() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            vs vsVar = (vs) k.get(this);
            if (vsVar == null) {
                return;
            }
            synchronized (vsVar) {
                usVarB = m21.b.get(vsVar) > 0 ? vsVar.b(0) : null;
            }
            if (usVarB == null) {
                return;
            } else {
                y(jNanoTime, usVarB);
            }
        }
    }

    public void z(Runnable runnable) {
        A();
        if (!B(runnable)) {
            tm.m.z(runnable);
            return;
        }
        Thread threadM = m();
        if (Thread.currentThread() != threadM) {
            LockSupport.unpark(threadM);
        }
    }
}
