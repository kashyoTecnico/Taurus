package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ea extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ea(qb qbVar, nc0 nc0Var, gw gwVar) {
        super(0);
        this.e = 1;
        this.f = qbVar;
        this.g = nc0Var;
        this.h = (y20) gwVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [gw, y20] */
    @Override // defpackage.gw
    public final Object a() {
        j41 j41Var;
        switch (this.e) {
            case 0:
                dm0 dm0Var = (dm0) this.f;
                ju0 ju0Var = ((fa) this.g).s;
                v30 v30Var = (v30) this.h;
                dm0Var.d = ju0Var.a(v30Var.d.c(), v30Var.getLayoutDirection(), v30Var);
                return j41.a;
            case 1:
                qb qbVar = (qb) this.f;
                xl0 xl0VarA0 = qb.A0(qbVar, (nc0) this.g, (y20) this.h);
                if (xl0VarA0 == null) {
                    return null;
                }
                oj ojVar = qbVar.r;
                if (t00.a(ojVar.y, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return xl0VarA0.h(ojVar.E0(xl0VarA0, ojVar.y) ^ (-9223372034707292160L));
            case 2:
                oj ojVar2 = (oj) this.f;
                r1 r1Var = ojVar2.u;
                while (true) {
                    eb0 eb0Var = (eb0) r1Var.e;
                    int i = eb0Var.f;
                    j41Var = j41.a;
                    if (i != 0) {
                        if (i == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        xl0 xl0Var = (xl0) ((nj) eb0Var.d[i - 1]).a.a();
                        if (xl0Var == null ? true : ojVar2.C0(xl0Var, ojVar2.y)) {
                            eb0 eb0Var2 = (eb0) r1Var.e;
                            ((nj) eb0Var2.k(eb0Var2.f - 1)).b.h(j41Var);
                        }
                    }
                }
                if (ojVar2.x) {
                    xl0 xl0VarB0 = ojVar2.B0();
                    if (xl0VarB0 != null && ojVar2.C0(xl0VarB0, ojVar2.y)) {
                        ojVar2.x = false;
                    }
                }
                ((r41) this.g).e = oj.A0(ojVar2, (ub) this.h);
                return j41Var;
            default:
                k kVar = (k) this.f;
                kVar.removeOnAttachStateChangeListener((s3) this.g);
                of ofVar = (of) this.h;
                c10.p(ofVar, "listener");
                m20.C(kVar).a.remove(ofVar);
                return j41.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
