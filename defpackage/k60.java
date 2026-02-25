package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k60 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(k60.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(k60.class, "_state$volatile");
    public static final cs g = new cs("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public k60(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                k60 k60Var = this;
                if (f.compareAndSet(k60Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    k60 k60VarC = k60Var;
                    while ((atomicLongFieldUpdater.get(k60VarC) & 1152921504606846976L) != 0) {
                        k60VarC = k60VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = k60VarC.d;
                        int i4 = k60VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof j60) && ((j60) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            k60VarC = null;
                        }
                        if (k60VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = k60Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            k60 k60Var = this;
            if (atomicLongFieldUpdater.compareAndSet(k60Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = k60Var;
        }
    }

    public final k60 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        k60 k60Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                k60Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            k60Var = this;
            if (atomicLongFieldUpdater.compareAndSet(k60Var, j, j2)) {
                j = j2;
                break;
            }
            this = k60Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            k60 k60Var2 = (k60) atomicReferenceFieldUpdater.get(k60Var);
            if (k60Var2 != null) {
                return k60Var2;
            }
            k60 k60Var3 = new k60(k60Var.a * 2, k60Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = k60Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object j60Var = k60Var.d.get(i4);
                if (j60Var == null) {
                    j60Var = new j60(i);
                }
                k60Var3.d.set(k60Var3.c & i, j60Var);
                i++;
            }
            atomicLongFieldUpdater.set(k60Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(k60Var, null, k60Var3) && atomicReferenceFieldUpdater.get(k60Var) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.k60.f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            cs r0 = defpackage.k60.g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof defpackage.j60
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.k60.f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            k60 r0 = r1.c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = defpackage.k60.f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
            int r2 = r2.c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k60.d():java.lang.Object");
    }
}
