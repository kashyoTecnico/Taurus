package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class va0 extends xm0 implements kw {
    public vw f;
    public wa0 g;
    public long[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ wa0 p;
    public final /* synthetic */ vw q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(wa0 wa0Var, vw vwVar, lk lkVar) {
        super(lkVar);
        this.p = wa0Var;
        this.q = vwVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((va0) k((lk) obj2, (yt0) obj)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        va0 va0Var = new va0(this.p, this.q, lkVar);
        va0Var.o = obj;
        return va0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.l
            int r5 = r0.k
            long r6 = r0.m
            int r8 = r0.j
            int r9 = r0.i
            long[] r10 = r0.h
            wa0 r11 = r0.g
            vw r12 = r0.f
            java.lang.Object r13 = r0.o
            yt0 r13 = (defpackage.yt0) r13
            defpackage.c10.X(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            defpackage.c10.X(r21)
            java.lang.Object r1 = r0.o
            yt0 r1 = (defpackage.yt0) r1
            wa0 r5 = r0.p
            ua0 r6 = r5.e
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            vw r8 = r0.q
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.e = r2
            ua0 r3 = r11.e
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.o = r13
            r0.f = r12
            r0.g = r11
            r0.h = r10
            r0.i = r9
            r0.j = r8
            r0.m = r6
            r0.k = r5
            r0.l = r1
            r0.n = r4
            r13.b(r2, r0)
            xl r0 = defpackage.xl.d
            return r0
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            j41 r0 = defpackage.j41.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.o(java.lang.Object):java.lang.Object");
    }
}
