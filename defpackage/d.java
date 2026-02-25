package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ long j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.l = obj;
        this.j = j;
        this.m = obj2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((d) k((lk) obj2, (wl) obj)).o(j41.a);
            case 1:
                return ((d) k((lk) obj2, (kr0) obj)).o(j41.a);
            default:
                return ((d) k((lk) obj2, (wl) obj)).o(j41.a);
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new d((ke) this.l, this.j, (fa0) this.m, lkVar, 0);
            case 1:
                d dVar = new d((mr0) this.l, this.j, (am0) this.m, lkVar, 1);
                dVar.k = obj;
                return dVar;
            default:
                return new d((za0) this.l, this.j, (fa0) this.m, lkVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0207, code lost:
    
        if (((defpackage.fa0) r10).a(r0, r19) == r7) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r10.a(r4, r19) == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r10.a(r0, r19) == r7) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [d90] */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.o(java.lang.Object):java.lang.Object");
    }
}
