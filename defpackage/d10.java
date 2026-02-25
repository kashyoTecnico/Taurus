package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d10 extends wm0 {
    public int e;
    public final /* synthetic */ kw f;
    public final /* synthetic */ lk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(lk lkVar, lk lkVar2, kw kwVar) {
        super(lkVar);
        this.f = kwVar;
        this.g = lkVar2;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.e = 2;
            c10.X(obj);
            return obj;
        }
        this.e = 1;
        c10.X(obj);
        kw kwVar = this.f;
        c10.n(kwVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r31.m(2, kwVar);
        return kwVar.e(this.g, this);
    }
}
