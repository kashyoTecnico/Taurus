package androidx.compose.foundation;

import defpackage.ci;
import defpackage.e90;
import defpackage.fa0;
import defpackage.fz;
import defpackage.gw;
import defpackage.lw;
import defpackage.vh;
import defpackage.y20;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b extends y20 implements lw {
    public final /* synthetic */ fz e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ gw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fz fzVar, boolean z, String str, gw gwVar) {
        super(3);
        this.e = fzVar;
        this.f = z;
        this.g = str;
        this.h = gwVar;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        ci ciVar = (ci) obj2;
        ((Number) obj3).intValue();
        ciVar.V(-1525724089);
        Object objK = ciVar.K();
        if (objK == vh.a) {
            objK = new fa0();
            ciVar.e0(objK);
        }
        fa0 fa0Var = (fa0) objK;
        e90 e90VarC = d.a(fa0Var, this.e).c(new ClickableElement(fa0Var, null, this.f, this.g, this.h));
        ciVar.p(false);
        return e90VarC;
    }
}
