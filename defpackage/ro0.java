package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ro0 extends mk implements wt {
    public final wt g;
    public final ml h;
    public final int i;
    public ml j;
    public lk k;

    public ro0(wt wtVar, ml mlVar) {
        super(dg.f, is.d);
        this.g = wtVar;
        this.h = mlVar;
        this.i = ((Number) mlVar.r(new nl(4), 0)).intValue();
    }

    @Override // defpackage.ia, defpackage.yl
    public final yl d() {
        lk lkVar = this.k;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    @Override // defpackage.mk, defpackage.lk
    public final ml f() {
        ml mlVar = this.j;
        return mlVar == null ? is.d : mlVar;
    }

    @Override // defpackage.wt
    public final Object i(Object obj, lk lkVar) {
        try {
            Object objQ = q(lkVar, obj);
            return objQ == xl.d ? objQ : j41.a;
        } catch (Throwable th) {
            this.j = new jp(lkVar.f(), th);
            throw th;
        }
    }

    @Override // defpackage.ia
    public final StackTraceElement n() {
        return null;
    }

    @Override // defpackage.ia
    public final Object o(Object obj) {
        Throwable thA = zm0.a(obj);
        if (thA != null) {
            this.j = new jp(f(), thA);
        }
        lk lkVar = this.k;
        if (lkVar != null) {
            lkVar.h(obj);
        }
        return xl.d;
    }

    public final Object q(lk lkVar, Object obj) {
        ml mlVarF = lkVar.f();
        c4.o(mlVarF);
        ml mlVar = this.j;
        if (mlVar != mlVarF) {
            if (mlVar instanceof jp) {
                throw new IllegalStateException(kx0.n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((jp) mlVar).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) mlVarF.r(new c6(3, this), 0)).intValue() != this.i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.h + ",\n\t\tbut emission happened in " + mlVarF + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.j = mlVarF;
        }
        this.k = lkVar;
        lw lwVar = to0.a;
        wt wtVar = this.g;
        c10.n(wtVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objC = lwVar.c(wtVar, obj, this);
        if (!c10.i(objC, xl.d)) {
            this.k = null;
        }
        return objC;
    }
}
