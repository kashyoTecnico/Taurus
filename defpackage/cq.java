package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cq extends jy0 implements kw {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ dr0 j;
    public final /* synthetic */ rj0 k;
    public final /* synthetic */ eq l;
    public final /* synthetic */ j4 m;
    public final /* synthetic */ dq n;
    public final /* synthetic */ dq o;
    public final /* synthetic */ h4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(dr0 dr0Var, rj0 rj0Var, eq eqVar, j4 j4Var, dq dqVar, dq dqVar2, h4 h4Var, lk lkVar) {
        super(2, lkVar);
        this.j = dr0Var;
        this.k = rj0Var;
        this.l = eqVar;
        this.m = j4Var;
        this.n = dqVar;
        this.o = dqVar2;
        this.p = h4Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((cq) k((lk) obj2, (wl) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        cq cqVar = new cq(this.j, this.k, this.l, this.m, this.n, this.o, this.p, lkVar);
        cqVar.i = obj;
        return cqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.h
            j41 r1 = defpackage.j41.a
            dr0 r2 = r13.j
            r3 = 1
            if (r0 == 0) goto L1e
            if (r0 != r3) goto L16
            java.lang.Object r13 = r13.i
            wl r13 = (defpackage.wl) r13
            defpackage.c10.X(r14)     // Catch: java.util.concurrent.CancellationException -> L13
            goto L62
        L13:
            r0 = move-exception
            r14 = r0
            goto L53
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1e:
            defpackage.c10.X(r14)
            java.lang.Object r14 = r13.i
            wl r14 = (defpackage.wl) r14
            if0 r6 = r2.t     // Catch: java.util.concurrent.CancellationException -> L50
            rj0 r0 = r13.k     // Catch: java.util.concurrent.CancellationException -> L50
            eq r7 = r13.l     // Catch: java.util.concurrent.CancellationException -> L50
            j4 r10 = r13.m     // Catch: java.util.concurrent.CancellationException -> L50
            dq r9 = r13.n     // Catch: java.util.concurrent.CancellationException -> L50
            dq r5 = r13.o     // Catch: java.util.concurrent.CancellationException -> L50
            h4 r8 = r13.p     // Catch: java.util.concurrent.CancellationException -> L50
            r13.i = r14     // Catch: java.util.concurrent.CancellationException -> L50
            r13.h = r3     // Catch: java.util.concurrent.CancellationException -> L50
            float r3 = defpackage.bq.a     // Catch: java.util.concurrent.CancellationException -> L50
            zp r4 = new zp     // Catch: java.util.concurrent.CancellationException -> L50
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L50
            java.lang.Object r13 = defpackage.l81.q(r0, r4, r13)     // Catch: java.util.concurrent.CancellationException -> L50
            xl r14 = defpackage.xl.d
            if (r13 != r14) goto L48
            goto L49
        L48:
            r13 = r1
        L49:
            if (r13 != r14) goto L62
            return r14
        L4c:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L53
        L50:
            r0 = move-exception
            r13 = r0
            goto L4c
        L53:
            gc r0 = r2.x
            if (r0 == 0) goto L5c
            rp r2 = defpackage.rp.a
            r0.u(r2)
        L5c:
            boolean r13 = defpackage.nm.w(r13)
            if (r13 == 0) goto L63
        L62:
            return r1
        L63:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.o(java.lang.Object):java.lang.Object");
    }
}
