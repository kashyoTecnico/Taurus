package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j5 extends xm0 implements kw {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(Object obj, lk lkVar, int i) {
        super(lkVar);
        this.f = i;
        this.i = obj;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        oy0 oy0Var = (oy0) obj;
        lk lkVar = (lk) obj2;
        switch (this.f) {
            case 0:
                return ((j5) k(lkVar, oy0Var)).o(j41.a);
            case 1:
                return ((j5) k(lkVar, oy0Var)).o(j41.a);
            case 2:
                ((j5) k(lkVar, oy0Var)).o(j41.a);
                return xl.d;
            default:
                return ((j5) k(lkVar, oy0Var)).o(j41.a);
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.f) {
            case 0:
                j5 j5Var = new j5((k5) this.i, lkVar, 0);
                j5Var.h = obj;
                return j5Var;
            case 1:
                j5 j5Var2 = new j5((h) this.i, lkVar, 1);
                j5Var2.h = obj;
                return j5Var2;
            case 2:
                j5 j5Var3 = new j5((iw) this.i, lkVar, 2);
                j5Var3.h = obj;
                return j5Var3;
            default:
                j5 j5Var4 = new j5((h) this.i, lkVar, 3);
                j5Var4.h = obj;
                return j5Var4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:28:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x013d -> B:63:0x0141). Please report as a decompilation issue!!! */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5.o(java.lang.Object):java.lang.Object");
    }
}
