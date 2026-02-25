package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fk extends y20 implements lw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk(int i, Object obj, Object obj2) {
        super(3);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [iw, y20] */
    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    Object objK = ciVar.K();
                    if (objK == vh.a) {
                        objK = new xj();
                        ciVar.e0(objK);
                    }
                    xj xjVar = (xj) objK;
                    ?? r11 = (y20) this.f;
                    uj ujVar = (uj) this.g;
                    xjVar.a.clear();
                    r11.g(xjVar);
                    xjVar.a(ujVar, ciVar, 0);
                }
                return j41.a;
            case 1:
                ci ciVar2 = (ci) obj2;
                ((Number) obj3).intValue();
                ciVar2.V(-353972293);
                gz gzVarA = ((fz) this.f).a((fa0) this.g, ciVar2);
                boolean zF = ciVar2.f(gzVarA);
                Object objK2 = ciVar2.K();
                if (zF || objK2 == vh.a) {
                    objK2 = new hz(gzVarA);
                    ciVar2.e0(objK2);
                }
                hz hzVar = (hz) objK2;
                ciVar2.p(false);
                return hzVar;
            case 2:
                ci ciVar3 = (ci) obj2;
                ((Number) obj3).intValue();
                ciVar3.V(759876635);
                gw gwVar = (gw) this.f;
                Object objK3 = ciVar3.K();
                v71 v71Var = vh.a;
                if (objK3 == v71Var) {
                    objK3 = qo0.g(gwVar);
                    ciVar3.e0(objK3);
                }
                ww0 ww0Var = (ww0) objK3;
                Object objK4 = ciVar3.K();
                if (objK4 == v71Var) {
                    objK4 = new x7(new ed0(((ed0) ww0Var.getValue()).a), os0.b, new ed0(os0.c), 8);
                    ciVar3.e0(objK4);
                }
                x7 x7Var = (x7) objK4;
                boolean zH = ciVar3.h(x7Var);
                Object objK5 = ciVar3.K();
                if (zH || objK5 == v71Var) {
                    objK5 = new ob(ww0Var, x7Var, (lk) null, 12);
                    ciVar3.e0(objK5);
                }
                l81.d(ciVar3, (kw) objK5, j41.a);
                f8 f8Var = x7Var.c;
                iw iwVar = (iw) this.g;
                boolean zF2 = ciVar3.f(f8Var);
                Object objK6 = ciVar3.K();
                if (zF2 || objK6 == v71Var) {
                    objK6 = new ms0(f8Var, 0);
                    ciVar3.e0(objK6);
                }
                e90 e90Var = (e90) iwVar.g((gw) objK6);
                ciVar3.p(false);
                return e90Var;
            default:
                ci ciVar4 = (ci) obj2;
                ((Number) obj3).intValue();
                fa0 fa0Var = (fa0) this.g;
                ciVar4.V(-102778667);
                Object objK7 = ciVar4.K();
                v71 v71Var2 = vh.a;
                if (objK7 == v71Var2) {
                    ui uiVar = new ui(l81.x(ciVar4));
                    ciVar4.e0(uiVar);
                    objK7 = uiVar;
                }
                wl wlVar = ((ui) objK7).d;
                Object objK8 = ciVar4.K();
                if (objK8 == v71Var2) {
                    objK8 = qo0.n(null);
                    ciVar4.e0(objK8);
                }
                za0 za0Var = (za0) objK8;
                za0 za0VarQ = qo0.q((iw) this.f, ciVar4);
                boolean zF3 = ciVar4.f(fa0Var);
                Object objK9 = ciVar4.K();
                if (zF3 || objK9 == v71Var2) {
                    objK9 = new j4(28, za0Var, fa0Var);
                    ciVar4.e0(objK9);
                }
                l81.c(fa0Var, (iw) objK9, ciVar4);
                boolean zH2 = ciVar4.h(wlVar) | ciVar4.f(fa0Var) | ciVar4.f(za0VarQ);
                fa0 fa0Var2 = (fa0) this.g;
                Object objK10 = ciVar4.K();
                if (zH2 || objK10 == v71Var2) {
                    x5 x5Var = new x5(wlVar, za0Var, fa0Var2, za0VarQ, null, 6);
                    ciVar4.e0(x5Var);
                    objK10 = x5Var;
                }
                e90 e90VarC = b90.a.c(new SuspendPointerInputElement(fa0Var, null, new ky0((kw) objK10), 6));
                ciVar4.p(false);
                return e90VarC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fk(uj ujVar, iw iwVar) {
        super(3);
        this.e = 0;
        this.f = (y20) iwVar;
        this.g = ujVar;
    }
}
