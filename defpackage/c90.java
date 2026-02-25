package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface c90 extends e90 {
    @Override // defpackage.e90
    default Object a(kw kwVar, Object obj) {
        return kwVar.e(obj, this);
    }

    @Override // defpackage.e90
    default boolean b(iw iwVar) {
        return ((Boolean) iwVar.g(this)).booleanValue();
    }
}
