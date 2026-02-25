package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bx0 extends jy0 implements kw {
    public final /* synthetic */ int h = 0;
    public float i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(ce ceVar, float f, e8 e8Var, lk lkVar) {
        super(2, lkVar);
        this.k = ceVar;
        this.i = f;
        this.l = e8Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((bx0) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new bx0((ce) this.k, this.i, (e8) this.l, lkVar);
            default:
                bx0 bx0Var = new bx0((e31) this.l, lkVar);
                bx0Var.k = obj;
                return bx0Var;
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        float fH;
        wl wlVar;
        switch (this.h) {
            case 0:
                int i = this.j;
                if (i == 0) {
                    c10.X(obj);
                    x7 x7Var = (x7) ((ce) this.k).c;
                    Float f = new Float(this.i);
                    e8 e8Var = (e8) this.l;
                    this.j = 1;
                    Object objB = x7.b(x7Var, f, e8Var, this);
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
            default:
                int i2 = this.j;
                if (i2 == 0) {
                    c10.X(obj);
                    wl wlVar2 = (wl) this.k;
                    fH = dq0.h(wlVar2.g());
                    wlVar = wlVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fH = this.i;
                    wlVar = (wl) this.k;
                    c10.X(obj);
                }
                while (nm.w(wlVar)) {
                    e01 e01Var = new e01((e31) this.l, fH);
                    this.k = wlVar;
                    this.i = fH;
                    this.j = 1;
                    ml mlVar = this.e;
                    c10.m(mlVar);
                    Object objE = b10.J(mlVar).e(e01Var, this);
                    xl xlVar2 = xl.d;
                    if (objE == xlVar2) {
                        return xlVar2;
                    }
                }
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(e31 e31Var, lk lkVar) {
        super(2, lkVar);
        this.l = e31Var;
    }
}
