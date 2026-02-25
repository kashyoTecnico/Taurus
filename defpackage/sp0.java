package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sp0 implements iw {
    public static final sp0 d = new sp0();

    @Override // defpackage.iw
    public final Object g(Object obj) {
        if (c10.i(obj, Boolean.FALSE)) {
            return new bf(bf.g);
        }
        c10.n(obj, "null cannot be cast to non-null type kotlin.Int");
        return new bf(r31.c(((Integer) obj).intValue()));
    }
}
