package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eu extends jy0 implements kw {
    public /* synthetic */ int h;

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        return ((eu) k((lk) obj2, Integer.valueOf(((Number) obj).intValue()))).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        eu euVar = new eu(2, lkVar);
        euVar.h = ((Number) obj).intValue();
        return euVar;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        c10.X(obj);
        return Boolean.valueOf(this.h > 0);
    }
}
