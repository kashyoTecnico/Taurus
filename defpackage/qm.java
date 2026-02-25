package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qm extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm(Object obj, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = obj;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
            case 2:
                ((qm) k(lkVar, wlVar)).o(j41.a);
                break;
        }
        return ((qm) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new qm((rm) this.j, lkVar, 0);
            case 1:
                return new qm((ev) this.j, lkVar, 1);
            case 2:
                return new qm((f70) this.j, lkVar, 2);
            case 3:
                return new qm((py0) this.j, lkVar, 3);
            default:
                return new qm((im) this.j, lkVar, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (defpackage.b10.J(r1).e(new defpackage.ax(r9, 1), r8) == r4) goto L53;
     */
    /* JADX WARN: Path cross not found for [B:46:0x009d, B:49:0x00a6], limit reached: 76 */
    /* JADX WARN: Path cross not found for [B:49:0x00a6, B:46:0x009d], limit reached: 76 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Type inference failed for: r9v19, types: [jy0, kw] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a8 -> B:44:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c1 -> B:54:0x00c4). Please report as a decompilation issue!!! */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm.o(java.lang.Object):java.lang.Object");
    }
}
