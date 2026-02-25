package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uw0 extends jy0 implements lw {
    public int h;
    public /* synthetic */ wt i;
    public /* synthetic */ int j;
    public final /* synthetic */ vw0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(vw0 vw0Var, lk lkVar) {
        super(3, lkVar);
        this.k = vw0Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        uw0 uw0Var = new uw0(this.k, (lk) obj3);
        uw0Var.i = (wt) obj;
        uw0Var.j = iIntValue;
        return uw0Var.o(j41.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.i(defpackage.su0.d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.i(defpackage.su0.f, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r0
  0x0062: PHI (r0v3 wt) = (r0v2 wt), (r0v6 wt) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 wt) = (r0v3 wt), (r0v7 wt) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.h
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            xl r6 = defpackage.xl.d
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            wt r0 = r7.i
            defpackage.c10.X(r8)
            goto L72
        L24:
            wt r0 = r7.i
            defpackage.c10.X(r8)
            goto L62
        L2a:
            wt r0 = r7.i
            defpackage.c10.X(r8)
            goto L55
        L30:
            defpackage.c10.X(r8)
            goto L80
        L34:
            defpackage.c10.X(r8)
            wt r0 = r7.i
            int r8 = r7.j
            if (r8 <= 0) goto L48
            r7.h = r5
            su0 r8 = defpackage.su0.d
            java.lang.Object r7 = r0.i(r8, r7)
            if (r7 != r6) goto L80
            goto L7f
        L48:
            r7.i = r0
            r7.h = r4
            r4 = 0
            java.lang.Object r8 = defpackage.m20.p(r4, r7)
            if (r8 != r6) goto L55
            goto L7f
        L55:
            r7.i = r0
            r7.h = r3
            su0 r8 = defpackage.su0.e
            java.lang.Object r8 = r0.i(r8, r7)
            if (r8 != r6) goto L62
            goto L7f
        L62:
            r7.i = r0
            r7.h = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = defpackage.m20.p(r2, r7)
            if (r8 != r6) goto L72
            goto L7f
        L72:
            r8 = 0
            r7.i = r8
            r7.h = r1
            su0 r8 = defpackage.su0.f
            java.lang.Object r7 = r0.i(r8, r7)
            if (r7 != r6) goto L80
        L7f:
            return r6
        L80:
            j41 r7 = defpackage.j41.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw0.o(java.lang.Object):java.lang.Object");
    }
}
