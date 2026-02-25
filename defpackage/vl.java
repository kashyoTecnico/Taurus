package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vl implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(vl.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(vl.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(vl.class, "_isTerminated$volatile");
    public static final cs n = new cs("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final yw h;
    public final yw i;
    public final sm0 j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public vl(int i, int i2, long j, String str) {
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(b8.g("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.h = new yw();
        this.i = new yw();
        this.j = new sm0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(vl vlVar, Runnable runnable, int i) {
        vlVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.j) {
            try {
                if (m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.j.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                tl tlVar = new tl(this, i3);
                this.j.c(i3, tlVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                tlVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        kz0 lz0Var;
        ul ulVar;
        mz0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof kz0) {
            lz0Var = (kz0) runnable;
            lz0Var.d = jNanoTime;
            lz0Var.e = z;
        } else {
            lz0Var = new lz0(runnable, jNanoTime, z);
        }
        boolean z3 = lz0Var.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        tl tlVar = threadCurrentThread instanceof tl ? (tl) threadCurrentThread : null;
        if (tlVar == null || !c10.i(tlVar.k, this)) {
            tlVar = null;
        }
        if (tlVar != null && (ulVar = tlVar.f) != ul.h && (lz0Var.e || ulVar != ul.e)) {
            tlVar.j = true;
            d81 d81Var = tlVar.d;
            if (z2) {
                lz0Var = d81Var.a(lz0Var);
            } else {
                d81Var.getClass();
                kz0 kz0Var = (kz0) d81.b.getAndSet(d81Var, lz0Var);
                lz0Var = kz0Var == null ? null : d81Var.a(kz0Var);
            }
        }
        if (lz0Var != null) {
            if (!(lz0Var.e ? this.i.a(lz0Var) : this.h.a(lz0Var))) {
                throw new RejectedExecutionException(this.g + " was terminated");
            }
        }
        boolean z4 = z2 && tlVar != null;
        if (z3) {
            if (z4 || f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.vl.m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.tl
            r3 = 0
            if (r1 == 0) goto L17
            tl r0 = (defpackage.tl) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            vl r1 = r0.k
            boolean r1 = defpackage.c10.i(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            sm0 r1 = r8.j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.vl.l     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            sm0 r5 = r8.j
            java.lang.Object r5 = r5.b(r1)
            defpackage.c10.m(r5)
            tl r5 = (defpackage.tl) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            d81 r5 = r5.d
            yw r6 = r8.i
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.d81.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            kz0 r7 = (defpackage.kz0) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            kz0 r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            yw r1 = r8.i
            r1.b()
            yw r1 = r8.h
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            kz0 r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            yw r1 = r8.h
            java.lang.Object r1 = r1.d()
            kz0 r1 = (defpackage.kz0) r1
            if (r1 != 0) goto Lb2
            yw r1 = r8.i
            java.lang.Object r1 = r1.d()
            kz0 r1 = (defpackage.kz0) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            ul r1 = defpackage.ul.h
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.vl.k
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.vl.l
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl.close():void");
    }

    public final void d(tl tlVar, int i, int i2) {
        while (true) {
            long j = k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = tlVar.c();
                    while (true) {
                        if (objC == n) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        tl tlVar2 = (tl) objC;
                        int iB = tlVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = tlVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                vl vlVar = this;
                if (k.compareAndSet(vlVar, j, i3 | j2)) {
                    return;
                } else {
                    this = vlVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        vl vlVar;
        cs csVar;
        int iB;
        while (true) {
            long j = k.get(this);
            tl tlVar = (tl) this.j.b((int) (2097151 & j));
            if (tlVar == null) {
                tlVar = null;
                vlVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = tlVar.c();
                while (true) {
                    csVar = n;
                    if (objC == csVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    tl tlVar2 = (tl) objC;
                    iB = tlVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = tlVar2.c();
                    j = j;
                }
                if (iB >= 0) {
                    vl vlVar2 = this;
                    boolean zCompareAndSet = k.compareAndSet(vlVar2, j, iB | j2);
                    vlVar = vlVar2;
                    if (zCompareAndSet) {
                        tlVar.g(csVar);
                    }
                    this = vlVar;
                } else {
                    continue;
                }
            }
            if (tlVar == null) {
                return false;
            }
            if (tl.l.compareAndSet(tlVar, -1, 0)) {
                LockSupport.unpark(tlVar);
                return true;
            }
            this = vlVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        sm0 sm0Var = this.j;
        int iA = sm0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            tl tlVar = (tl) sm0Var.b(i6);
            if (tlVar != null) {
                d81 d81Var = tlVar.d;
                d81Var.getClass();
                int i7 = d81.b.get(d81Var) != null ? (d81.c.get(d81Var) - d81.d.get(d81Var)) + 1 : d81.c.get(d81Var) - d81.d.get(d81Var);
                int iOrdinal = tlVar.f.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new fg();
                    }
                    i5++;
                }
            }
        }
        long j = l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        sb4.append('@');
        sb4.append(nm.t(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.d;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
