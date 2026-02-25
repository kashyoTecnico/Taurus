package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kn0 extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ mn0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn0(mn0 mn0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = mn0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((kn0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new kn0(this.j, lkVar, 0);
            case 1:
                return new kn0(this.j, lkVar, 1);
            case 2:
                return new kn0(this.j, lkVar, 2);
            default:
                return new kn0(this.j, lkVar, 3);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    c10.X(obj);
                    x7 x7Var = this.j.f;
                    Float f = new Float(1.0f);
                    p31 p31VarC0 = r31.c0(75, 2, zq.b);
                    this.i = 1;
                    Object objB = x7.b(x7Var, f, p31VarC0, this);
                    xl xlVar = xl.d;
                    if (objB == xlVar) {
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
                    x7 x7Var2 = this.j.g;
                    Float f2 = new Float(1.0f);
                    p31 p31VarC02 = r31.c0(225, 2, zq.a);
                    this.i = 1;
                    Object objB2 = x7.b(x7Var2, f2, p31VarC02, this);
                    xl xlVar2 = xl.d;
                    if (objB2 == xlVar2) {
                        return xlVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
            case 2:
                int i3 = this.i;
                if (i3 == 0) {
                    c10.X(obj);
                    x7 x7Var3 = this.j.h;
                    Float f3 = new Float(1.0f);
                    p31 p31VarC03 = r31.c0(225, 2, zq.b);
                    this.i = 1;
                    Object objB3 = x7.b(x7Var3, f3, p31VarC03, this);
                    xl xlVar3 = xl.d;
                    if (objB3 == xlVar3) {
                        return xlVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
            default:
                int i4 = this.i;
                if (i4 == 0) {
                    c10.X(obj);
                    x7 x7Var4 = this.j.f;
                    Float f4 = new Float(0.0f);
                    p31 p31VarC04 = r31.c0(150, 2, zq.b);
                    this.i = 1;
                    Object objB4 = x7.b(x7Var4, f4, p31VarC04, this);
                    xl xlVar4 = xl.d;
                    if (objB4 == xlVar4) {
                        return xlVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41.a;
        }
    }
}
