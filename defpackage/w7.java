package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w7 extends jy0 implements iw {
    public final /* synthetic */ x7 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x7 x7Var, Object obj, lk lkVar) {
        super(1, lkVar);
        this.h = x7Var;
        this.i = obj;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) throws Throwable {
        w7 w7Var = new w7(this.h, this.i, (lk) obj);
        j41 j41Var = j41.a;
        w7Var.o(j41Var);
        return j41Var;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        c10.X(obj);
        x7 x7Var = this.h;
        f8 f8Var = x7Var.c;
        f8Var.f.d();
        f8Var.g = Long.MIN_VALUE;
        x7Var.d.setValue(Boolean.FALSE);
        Object objA = x7.a(x7Var, this.i);
        f8Var.e.setValue(objA);
        x7Var.e.setValue(objA);
        return j41.a;
    }
}
