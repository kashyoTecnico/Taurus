package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class wm0 extends ia {
    public wm0(lk lkVar) {
        super(lkVar);
        if (lkVar != null && lkVar.f() != is.d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.lk
    public final ml f() {
        return is.d;
    }
}
