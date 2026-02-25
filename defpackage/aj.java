package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class aj extends gc {
    public final ec n;

    public aj(int i, ec ecVar) {
        super(i);
        this.n = ecVar;
        if (ecVar == ec.d) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + em0.a(gc.class).b() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            ec r1 = r15.n
            ec r2 = defpackage.ec.f
            j41 r8 = defpackage.j41.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.u(r16)
            boolean r1 = r0 instanceof defpackage.ud
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.td
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            cs r6 = defpackage.ic.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.gc.i
            java.lang.Object r1 = r1.get(r15)
            vd r1 = (defpackage.vd) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.gc.e
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.t(r2, r7)
            int r9 = defpackage.ic.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            vd r2 = defpackage.gc.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.gc.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.gc.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L90:
            if (r7 == 0) goto L9f
            r1.h()
            java.lang.Throwable r0 = r15.p()
            td r1 = new td
            r1.<init>(r0)
            return r1
        L9f:
            boolean r3 = r6 instanceof defpackage.n61
            if (r3 == 0) goto La6
            n61 r6 = (defpackage.n61) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.j(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj.F(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.gc, defpackage.vt0
    public final Object c(lk lkVar, Object obj) throws Throwable {
        if (F(obj, true) instanceof td) {
            throw p();
        }
        return j41.a;
    }

    @Override // defpackage.gc, defpackage.vt0
    public final Object u(Object obj) {
        return F(obj, false);
    }

    @Override // defpackage.gc
    public final boolean v() {
        return this.n == ec.e;
    }
}
