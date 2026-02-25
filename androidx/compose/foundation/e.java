package androidx.compose.foundation;

import android.content.Context;
import defpackage.ag0;
import defpackage.bg0;
import defpackage.cg0;
import defpackage.ci;
import defpackage.e90;
import defpackage.fa0;
import defpackage.g2;
import defpackage.if0;
import defpackage.k5;
import defpackage.lw;
import defpackage.m4;
import defpackage.oe;
import defpackage.tq0;
import defpackage.vh;
import defpackage.y20;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e extends y20 implements lw {
    public final /* synthetic */ tq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tq0 tq0Var) {
        super(3);
        this.e = tq0Var;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        cg0 cg0Var;
        ci ciVar = (ci) obj2;
        ((Number) obj3).intValue();
        ciVar.V(1478351300);
        tq0 tq0Var = this.e;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(tq0Var);
        fa0 fa0Var = tq0Var.c;
        Context context = (Context) ciVar.j(m4.b);
        ag0 ag0Var = (ag0) ciVar.j(bg0.a);
        if (ag0Var != null) {
            ciVar.V(1586021609);
            boolean zF = ciVar.f(context) | ciVar.f(ag0Var);
            Object objK = ciVar.K();
            if (zF || objK == vh.a) {
                objK = new k5(context, ag0Var);
                ciVar.e0(objK);
            }
            cg0Var = (k5) objK;
            ciVar.p(false);
        } else {
            ciVar.V(1586120933);
            ciVar.p(false);
            cg0Var = g2.K;
        }
        cg0 cg0Var2 = cg0Var;
        e90 e90VarC = scrollSemanticsElement.c(oe.b).c(cg0Var2.f());
        e90 e90VarC2 = androidx.compose.foundation.gestures.a.b(e90VarC, tq0Var, if0.d, cg0Var2, true, true, fa0Var).c(new ScrollingLayoutElement(tq0Var));
        ciVar.p(false);
        return e90VarC2;
    }
}
