package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vd extends or0 {
    public final gc e;
    public final /* synthetic */ AtomicReferenceArray f;

    public vd(long j, vd vdVar, gc gcVar, int i) {
        super(j, vdVar, i);
        this.e = gcVar;
        this.f = new AtomicReferenceArray(ic.b * 2);
    }

    @Override // defpackage.or0
    public final int f() {
        return ic.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        defpackage.c10.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.or0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, defpackage.ml r6) {
        /*
            r4 = this;
            int r6 = defpackage.ic.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof defpackage.n61
            gc r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof defpackage.o61
            if (r1 == 0) goto L21
            goto L62
        L21:
            cs r1 = defpackage.ic.j
            if (r6 == r1) goto L59
            cs r1 = defpackage.ic.k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            cs r1 = defpackage.ic.g
            if (r6 == r1) goto L11
            cs r1 = defpackage.ic.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            cs r4 = defpackage.ic.i
            if (r6 == r4) goto L7c
            cs r4 = defpackage.ic.d
            if (r6 != r4) goto L3c
            goto L7c
        L3c:
            cs r4 = defpackage.ic.l
            if (r6 != r4) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L59:
            r4.m(r5, r3)
            if (r0 == 0) goto L7c
            defpackage.c10.m(r2)
            return
        L62:
            if (r0 == 0) goto L67
            cs r1 = defpackage.ic.j
            goto L69
        L67:
            cs r1 = defpackage.ic.k
        L69:
            boolean r6 = r4.j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            defpackage.c10.m(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd.g(int, ml):void");
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            gc gcVar = this.e;
            c10.m(gcVar);
            gcVar.E((this.c * ic.b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
