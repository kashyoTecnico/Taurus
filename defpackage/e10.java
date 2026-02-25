package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e10 extends mk {
    public int g;
    public final /* synthetic */ kw h;
    public final /* synthetic */ lk i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(lk lkVar, ml mlVar, kw kwVar, lk lkVar2) {
        super(lkVar, mlVar);
        this.h = kwVar;
        this.i = lkVar2;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.g = 2;
            c10.X(obj);
            return obj;
        }
        this.g = 1;
        c10.X(obj);
        kw kwVar = this.h;
        c10.n(kwVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r31.m(2, kwVar);
        return kwVar.e(this.i, this);
    }
}
