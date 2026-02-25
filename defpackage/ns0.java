package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ns0 extends jy0 implements kw {
    public final /* synthetic */ int h = 1;
    public int i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(long j, oy0 oy0Var, lk lkVar) {
        super(2, lkVar);
        this.j = j;
        this.k = oy0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((ns0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new ns0((x7) this.k, this.j, lkVar);
            default:
                return new ns0(this.j, (oy0) this.k, lkVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.h
            switch(r0) {
                case 0: goto L53;
                default: goto L5;
            }
        L5:
            int r0 = r10.i
            r1 = 8
            long r3 = r10.j
            r5 = 2
            r6 = 1
            xl r7 = defpackage.xl.d
            if (r0 == 0) goto L25
            if (r0 == r6) goto L21
            if (r0 != r5) goto L19
            defpackage.c10.X(r11)
            goto L3c
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L21:
            defpackage.c10.X(r11)
            goto L33
        L25:
            defpackage.c10.X(r11)
            long r8 = r3 - r1
            r10.i = r6
            java.lang.Object r11 = defpackage.m20.p(r8, r10)
            if (r11 != r7) goto L33
            goto L52
        L33:
            r10.i = r5
            java.lang.Object r11 = defpackage.m20.p(r1, r10)
            if (r11 != r7) goto L3c
            goto L52
        L3c:
            java.lang.Object r10 = r10.k
            oy0 r10 = (defpackage.oy0) r10
            ad r10 = r10.f
            if (r10 == 0) goto L50
            ij0 r11 = new ij0
            r11.<init>(r3)
            ym0 r11 = defpackage.c10.z(r11)
            r10.h(r11)
        L50:
            j41 r7 = defpackage.j41.a
        L52:
            return r7
        L53:
            int r0 = r10.i
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L5e
            defpackage.c10.X(r11)
            goto L81
        L5e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L66:
            defpackage.c10.X(r11)
            java.lang.Object r11 = r10.k
            x7 r11 = (defpackage.x7) r11
            ed0 r0 = new ed0
            long r2 = r10.j
            r0.<init>(r2)
            ow0 r2 = defpackage.os0.d
            r10.i = r1
            java.lang.Object r10 = defpackage.x7.b(r11, r0, r2, r10)
            xl r11 = defpackage.xl.d
            if (r10 != r11) goto L81
            goto L83
        L81:
            j41 r11 = defpackage.j41.a
        L83:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(x7 x7Var, long j, lk lkVar) {
        super(2, lkVar);
        this.k = x7Var;
        this.j = j;
    }
}
