package defpackage;

import androidx.compose.ui.input.key.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m01 extends y20 implements lw {
    public final /* synthetic */ r40 e;
    public final /* synthetic */ u01 f;
    public final /* synthetic */ a11 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ hd0 j;
    public final /* synthetic */ h41 k;
    public final /* synthetic */ iw l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(r40 r40Var, u01 u01Var, a11 a11Var, boolean z, boolean z2, hd0 hd0Var, h41 h41Var, iw iwVar, int i) {
        super(3);
        this.e = r40Var;
        this.f = u01Var;
        this.g = a11Var;
        this.h = z;
        this.i = z2;
        this.j = hd0Var;
        this.k = h41Var;
        this.l = iwVar;
        this.m = i;
    }

    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        ci ciVar = (ci) obj2;
        ((Number) obj3).intValue();
        ciVar.V(851809892);
        Object objK = ciVar.K();
        v71 v71Var = vh.a;
        if (objK == v71Var) {
            objK = new v11();
            ciVar.e0(objK);
        }
        v11 v11Var = (v11) objK;
        Object objK2 = ciVar.K();
        if (objK2 == v71Var) {
            objK2 = new lm();
            ciVar.e0(objK2);
        }
        iw iwVar = this.l;
        int i = this.m;
        l01 l01Var = new l01(this.e, this.f, this.g, this.h, this.i, v11Var, this.j, this.k, (lm) objK2, iwVar, i);
        boolean zH = ciVar.h(l01Var);
        Object objK3 = ciVar.K();
        if (zH || objK3 == v71Var) {
            zu zuVar = new zu(1, l01Var, l01.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 2);
            ciVar.e0(zuVar);
            objK3 = zuVar;
        }
        e90 e90VarA = a.a(b90.a, (iw) ((rw) objK3));
        ciVar.p(false);
        return e90VarA;
    }
}
