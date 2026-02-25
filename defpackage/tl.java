package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tl extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(tl.class, "workerCtl$volatile");
    public final d81 d;
    public final dm0 e;
    public ul f;
    public long g;
    public long h;
    public int i;
    private volatile int indexInArray;
    public boolean j;
    public final /* synthetic */ vl k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public tl(vl vlVar, int i) {
        this.k = vlVar;
        setDaemon(true);
        setContextClassLoader(vl.class.getClassLoader());
        this.d = new d81();
        this.e = new dm0();
        this.f = ul.g;
        this.nextParkedWorker = vl.n;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = defpackage.d81.d.get(r9);
        r0 = defpackage.d81.c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (defpackage.d81.e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kz0 a(boolean r12) {
        /*
            r11 = this;
            ul r0 = r11.f
            vl r2 = r11.k
            r7 = 0
            r8 = 1
            d81 r9 = r11.d
            ul r10 = defpackage.ul.d
            if (r0 != r10) goto Le
            goto L85
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.vl.l
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L74
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.d81.b
            java.lang.Object r0 = r12.get(r9)
            kz0 r0 = (defpackage.kz0) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.e
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.d81.d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.d81.c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.d81.e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            kz0 r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L73
            yw r12 = r2.i
            java.lang.Object r12 = r12.d()
            kz0 r12 = (defpackage.kz0) r12
            if (r12 != 0) goto L72
            kz0 r11 = r11.i(r8)
            return r11
        L72:
            return r12
        L73:
            return r7
        L74:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.vl.l
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f = r10
        L85:
            if (r12 == 0) goto Lb9
            int r12 = r2.d
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L92
            goto L93
        L92:
            r8 = 0
        L93:
            if (r8 == 0) goto L9c
            kz0 r12 = r11.e()
            if (r12 == 0) goto L9c
            return r12
        L9c:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.d81.b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            kz0 r12 = (defpackage.kz0) r12
            if (r12 != 0) goto Lad
            kz0 r12 = r9.b()
        Lad:
            if (r12 == 0) goto Lb0
            return r12
        Lb0:
            if (r8 != 0) goto Lc0
            kz0 r12 = r11.e()
            if (r12 == 0) goto Lc0
            return r12
        Lb9:
            kz0 r12 = r11.e()
            if (r12 == 0) goto Lc0
            return r12
        Lc0:
            r12 = 3
            kz0 r11 = r11.i(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.a(boolean):kz0");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final kz0 e() {
        int iD = d(2);
        vl vlVar = this.k;
        if (iD == 0) {
            kz0 kz0Var = (kz0) vlVar.h.d();
            return kz0Var != null ? kz0Var : (kz0) vlVar.i.d();
        }
        kz0 kz0Var2 = (kz0) vlVar.i.d();
        return kz0Var2 != null ? kz0Var2 : (kz0) vlVar.h.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ul ulVar) {
        ul ulVar2 = this.f;
        boolean z = ulVar2 == ul.d;
        if (z) {
            vl.l.addAndGet(this.k, 4398046511104L);
        }
        if (ulVar2 != ulVar) {
            this.f = ulVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kz0 i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.i(int):kz0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.run():void");
    }
}
