package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bz0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ dk0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(dk0 dk0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = dk0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((bz0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new bz0(this.j, lkVar, 0);
            case 1:
                return new bz0(this.j, lkVar, 1);
            default:
                return new bz0(this.j, lkVar, 2);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    this.i = 1;
                    Object objA = this.j.a(this);
                    xl xlVar = xl.d;
                    if (objA == xlVar) {
                        return xlVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
            case 1:
                int i2 = this.i;
                if (i2 == 0) {
                    c10.X(obj);
                    this.i = 1;
                    Object objA2 = this.j.a(this);
                    xl xlVar2 = xl.d;
                    if (objA2 == xlVar2) {
                        return xlVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
            default:
                int i3 = this.i;
                if (i3 == 0) {
                    c10.X(obj);
                    this.i = 1;
                    Object objA3 = this.j.a(this);
                    xl xlVar3 = xl.d;
                    if (objA3 == xlVar3) {
                        return xlVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
        }
    }
}
