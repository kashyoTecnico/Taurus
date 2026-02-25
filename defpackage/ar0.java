package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ar0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ dr0 j;
    public /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(dr0 dr0Var, long j, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = dr0Var;
        this.k = j;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((ar0) k((lk) obj2, (wl) obj)).o(j41.a);
            case 1:
                return ((ar0) k((lk) obj2, (wl) obj)).o(j41.a);
            case 2:
                return ((ar0) k((lk) obj2, (wl) obj)).o(j41.a);
            default:
                long j = ((ed0) obj).a;
                ar0 ar0Var = new ar0(this.j, (lk) obj2);
                ar0Var.k = j;
                return ar0Var.o(j41.a);
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new ar0(this.j, this.k, lkVar, 0);
            case 1:
                return new ar0(this.j, this.k, lkVar, 1);
            case 2:
                return new ar0(this.j, this.k, lkVar, 2);
            default:
                ar0 ar0Var = new ar0(this.j, lkVar);
                ar0Var.k = ((ed0) obj).a;
                return ar0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(dr0 dr0Var, lk lkVar) {
        super(2, lkVar);
        this.h = 3;
        this.j = dr0Var;
    }
}
