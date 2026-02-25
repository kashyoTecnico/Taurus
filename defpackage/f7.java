package defpackage;

import androidx.compose.ui.draw.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class f7 extends y20 implements lw {
    public final /* synthetic */ gw e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(gw gwVar, boolean z) {
        super(3);
        this.e = gwVar;
        this.f = z;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        e90 e90Var = (e90) obj;
        ci ciVar = (ci) obj2;
        ((Number) obj3).intValue();
        ciVar.V(-196777734);
        long j = ((x11) ciVar.j(y11.a)).a;
        boolean zE = ciVar.e(j);
        gw gwVar = this.e;
        boolean zF = zE | ciVar.f(gwVar);
        boolean z = this.f;
        boolean zG = zF | ciVar.g(z);
        Object objK = ciVar.K();
        if (zG || objK == vh.a) {
            objK = new e7(j, gwVar, z);
            ciVar.e0(objK);
        }
        e90 e90VarB = a.b(e90Var, (iw) objK);
        ciVar.p(false);
        return e90VarB;
    }
}
