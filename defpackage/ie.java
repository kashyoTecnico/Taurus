package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.d;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ie extends y20 implements lw {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ie(jk jkVar, boolean z, gw gwVar) {
        super(3);
        this.g = jkVar;
        this.f = z;
        this.h = (y20) gwVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [gw, y20] */
    @Override // defpackage.lw
    public final Object c(Object obj, Object obj2, Object obj3) {
        fa0 fa0Var;
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj2;
                ((Number) obj3).intValue();
                ciVar.V(-756081143);
                fz fzVar = (fz) ciVar.j(d.a);
                if (fzVar instanceof jz) {
                    ciVar.V(617140216);
                    ciVar.p(false);
                    fa0Var = null;
                } else {
                    ciVar.V(617248189);
                    Object objK = ciVar.K();
                    if (objK == vh.a) {
                        objK = new fa0();
                        ciVar.e0(objK);
                    }
                    fa0Var = (fa0) objK;
                    ciVar.p(false);
                }
                e90 e90VarB = a.b(b90.a, fa0Var, fzVar, this.f, (String) this.g, (gw) this.h);
                ciVar.p(false);
                return e90VarB;
            case 1:
                uj ujVar = (uj) obj;
                ci ciVar2 = (ci) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ciVar2.f(ujVar) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    String str = (String) ((jk) this.g).e(ciVar2, 0);
                    if (px0.t(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    gk.b(str, this.f, ujVar, b90.a, (y20) this.h, ciVar2, (iIntValue << 6) & 896);
                }
                return j41.a;
            default:
                ci ciVar3 = (ci) obj2;
                ((Number) obj3).intValue();
                s01 s01Var = (s01) this.g;
                ciVar3.V(805428266);
                boolean z = ((if0) s01Var.e.getValue()) == if0.d || !(ciVar3.j(ti.n) == e30.e);
                boolean zF = ciVar3.f(s01Var);
                Object objK2 = ciVar3.K();
                Object obj4 = vh.a;
                if (zF || objK2 == obj4) {
                    objK2 = new ey0(4, s01Var);
                    ciVar3.e0(objK2);
                }
                za0 za0VarQ = qo0.q((iw) objK2, ciVar3);
                Object objK3 = ciVar3.K();
                if (objK3 == obj4) {
                    Object inVar = new in(new e4(za0VarQ, 1));
                    ciVar3.e0(inVar);
                    objK3 = inVar;
                }
                er0 er0Var = (er0) objK3;
                boolean zF2 = ciVar3.f(er0Var) | ciVar3.f(s01Var);
                Object objK4 = ciVar3.K();
                if (zF2 || objK4 == obj4) {
                    objK4 = new r01(er0Var, s01Var);
                    ciVar3.e0(objK4);
                }
                e90 e90VarB2 = androidx.compose.foundation.gestures.a.b(b90.a, (r01) objK4, (if0) s01Var.e.getValue(), null, this.f && s01Var.b.g() != 0.0f, z, (fa0) this.h);
                ciVar3.p(false);
                return e90VarB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(s01 s01Var, boolean z, fa0 fa0Var) {
        super(3);
        this.g = s01Var;
        this.f = z;
        this.h = fa0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(boolean z, String str, gw gwVar) {
        super(3);
        this.f = z;
        this.g = str;
        this.h = gwVar;
    }
}
