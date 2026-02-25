package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hl extends jy0 implements kw {
    public final /* synthetic */ int h;
    public int i;
    public final /* synthetic */ rj0 j;
    public final /* synthetic */ yz0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(rj0 rj0Var, yz0 yz0Var, lk lkVar, int i) {
        super(2, lkVar);
        this.h = i;
        this.j = rj0Var;
        this.k = yz0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        wl wlVar = (wl) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
        }
        return ((hl) k(lkVar, wlVar)).o(j41.a);
    }

    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                return new hl(this.j, this.k, lkVar, 0);
            case 1:
                return new hl(this.j, this.k, lkVar, 1);
            default:
                return new hl(this.j, this.k, lkVar, 2);
        }
    }

    @Override // defpackage.ia
    public final Object o(Object obj) throws Throwable {
        int i = this.h;
        yz0 yz0Var = this.k;
        rj0 rj0Var = this.j;
        xl xlVar = xl.d;
        j41 j41Var = j41.a;
        switch (i) {
            case 0:
                int i2 = this.i;
                if (i2 == 0) {
                    c10.X(obj);
                    this.i = 1;
                    if (c10.B(rj0Var, yz0Var, this) == xlVar) {
                        return xlVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41Var;
            case 1:
                int i3 = this.i;
                if (i3 == 0) {
                    c10.X(obj);
                    this.i = 1;
                    Object objQ = l81.q(rj0Var, new dw(yz0Var, null), this);
                    if (objQ != xlVar) {
                        objQ = j41Var;
                    }
                    if (objQ == xlVar) {
                        return xlVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41Var;
            default:
                int i4 = this.i;
                if (i4 == 0) {
                    c10.X(obj);
                    this.i = 1;
                    o60 o60Var = new o60(yz0Var, 0);
                    p60 p60Var = new p60(yz0Var, 0);
                    p60 p60Var2 = new p60(yz0Var, 1);
                    j jVar = new j(10, yz0Var);
                    float f = bq.a;
                    Object objQ2 = l81.q(rj0Var, new zp(si.l, null, new j(8, o60Var), jVar, p60Var2, new h(14, p60Var), null), this);
                    if (objQ2 != xlVar) {
                        objQ2 = j41Var;
                    }
                    if (objQ2 != xlVar) {
                        objQ2 = j41Var;
                    }
                    if (objQ2 != xlVar) {
                        objQ2 = j41Var;
                    }
                    if (objQ2 == xlVar) {
                        return xlVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10.X(obj);
                }
                return j41Var;
        }
    }
}
