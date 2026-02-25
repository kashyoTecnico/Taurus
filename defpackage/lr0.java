package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lr0 extends jy0 implements kw {
    public long h;
    public int i;
    public /* synthetic */ long j;
    public final /* synthetic */ mr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(mr0 mr0Var, lk lkVar) {
        super(2, lkVar);
        this.k = mr0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        long j = ((l51) obj).a;
        lr0 lr0Var = new lr0(this.k, (lk) obj2);
        lr0Var.j = j;
        return lr0Var.o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        lr0 lr0Var = new lr0(this.k, lkVar);
        lr0Var.j = ((l51) obj).a;
        return lr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 3
            r2 = 2
            r3 = 1
            mr0 r4 = r14.k
            xl r5 = defpackage.xl.d
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.h
            long r2 = r14.j
            defpackage.c10.X(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L21:
            long r2 = r14.h
            long r6 = r14.j
            defpackage.c10.X(r15)
            goto L57
        L29:
            long r6 = r14.j
            defpackage.c10.X(r15)
            goto L41
        L2f:
            defpackage.c10.X(r15)
            long r6 = r14.j
            q2 r15 = r4.f
            r14.j = r6
            r14.i = r3
            java.lang.Object r15 = r15.d(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            l51 r15 = (defpackage.l51) r15
            long r8 = r15.a
            long r8 = defpackage.l51.d(r6, r8)
            r14.j = r6
            r14.h = r8
            r14.i = r2
            java.lang.Object r15 = r4.b(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            l51 r15 = (defpackage.l51) r15
            long r11 = r15.a
            q2 r8 = r4.f
            long r9 = defpackage.l51.d(r2, r11)
            r14.j = r6
            r14.h = r11
            r14.i = r1
            r13 = r14
            java.lang.Object r15 = r8.c(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            l51 r15 = (defpackage.l51) r15
            long r14 = r15.a
            long r14 = defpackage.l51.d(r0, r14)
            long r14 = defpackage.l51.d(r2, r14)
            l51 r0 = new l51
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr0.o(java.lang.Object):java.lang.Object");
    }
}
