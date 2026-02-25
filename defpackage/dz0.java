package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dz0 extends xm0 implements kw {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wl i;
    public final /* synthetic */ dk0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Serializable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(wl wlVar, qk qkVar, dm0 dm0Var, dk0 dk0Var, lk lkVar) {
        super(lkVar);
        this.i = wlVar;
        this.k = qkVar;
        this.l = dm0Var;
        this.j = dk0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        oy0 oy0Var = (oy0) obj;
        lk lkVar = (lk) obj2;
        switch (this.f) {
        }
        return ((dz0) k(lkVar, oy0Var)).o(j41.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [jy0, lw] */
    /* JADX WARN: Type inference failed for: r5v1, types: [iw, y20] */
    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.f) {
            case 0:
                dz0 dz0Var = new dz0(this.i, (lw) this.k, (iw) this.l, this.j, lkVar);
                dz0Var.h = obj;
                return dz0Var;
            default:
                dz0 dz0Var2 = new dz0(this.i, (qk) this.k, (dm0) this.l, this.j, lkVar);
                dz0Var2.h = obj;
                return dz0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Type inference failed for: r4v2, types: [jy0, lw] */
    /* JADX WARN: Type inference failed for: r9v2, types: [iw, y20] */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dz0(wl wlVar, lw lwVar, iw iwVar, dk0 dk0Var, lk lkVar) {
        super(lkVar);
        this.i = wlVar;
        this.k = (jy0) lwVar;
        this.l = (y20) iwVar;
        this.j = dk0Var;
    }
}
