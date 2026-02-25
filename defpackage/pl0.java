package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pl0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl0(int i, lk lkVar, int i2) {
        super(i, lkVar);
        this.h = i2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return ((pl0) k((lk) obj2, (ol0) obj)).o(j41.a);
            default:
                return ((pl0) k((lk) obj2, (su0) obj)).o(j41.a);
        }
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                pl0 pl0Var = new pl0(2, lkVar, 0);
                pl0Var.i = obj;
                return pl0Var;
            default:
                pl0 pl0Var2 = new pl0(2, lkVar, 1);
                pl0Var2.i = obj;
                return pl0Var2;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                c10.X(obj);
                return Boolean.valueOf(((ol0) this.i) == ol0.d);
            default:
                c10.X(obj);
                return Boolean.valueOf(((su0) this.i) != su0.d);
        }
    }
}
