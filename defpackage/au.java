package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class au extends jy0 implements lw {
    public int h;
    public /* synthetic */ wt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(y5 y5Var, lk lkVar) {
        super(3, lkVar);
        this.k = y5Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        au auVar = new au(this.k, (lk) obj3);
        auVar.i = (wt) obj;
        auVar.j = obj2;
        return auVar.o(j41.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.i(r5, r4) == r3) goto L15;
     */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.h
            r1 = 2
            r2 = 1
            xl r3 = defpackage.xl.d
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.c10.X(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            wt r0 = r4.i
            defpackage.c10.X(r5)
            goto L32
        L1e:
            defpackage.c10.X(r5)
            wt r0 = r4.i
            java.lang.Object r5 = r4.j
            r4.i = r0
            r4.h = r2
            y5 r2 = r4.k
            java.lang.Object r5 = r2.e(r5, r4)
            if (r5 != r3) goto L32
            goto L3d
        L32:
            r2 = 0
            r4.i = r2
            r4.h = r1
            java.lang.Object r4 = r0.i(r5, r4)
            if (r4 != r3) goto L3e
        L3d:
            return r3
        L3e:
            j41 r4 = defpackage.j41.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au.o(java.lang.Object):java.lang.Object");
    }
}
