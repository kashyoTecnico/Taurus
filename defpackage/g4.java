package defpackage;

import androidx.compose.ui.layout.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g4 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(zs0 zs0Var, ss0 ss0Var, zg zgVar) {
        super(2);
        this.e = 4;
        this.h = zs0Var;
        this.f = ss0Var;
        this.g = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        j41 j41Var = j41.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ciVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ciVar.Q();
                    break;
                } else {
                    ti.a((p3) obj5, (p7) obj4, (kw) obj3, ciVar, 0);
                    break;
                }
            case 1:
                ((Number) obj2).intValue();
                ti.a((eg0) obj5, (p7) obj4, (kw) obj3, (ci) obj, d80.I(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                b10.h((e90) obj5, (u01) obj4, (zg) obj3, (ci) obj, d80.I(385));
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                am0 am0Var = (am0) obj5;
                mr0 mr0Var = (mr0) obj4;
                long jG = mr0Var.g(mr0Var.c(fFloatValue - am0Var.d));
                mr0 mr0Var2 = ((kr0) obj3).a;
                am0Var.d += mr0Var.c(mr0Var.f(mr0.a(mr0Var2, mr0Var2.h, jG, 1)));
                break;
            case 4:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar2.z()) {
                    c4.b(at0.a.a((zs0) obj5), b10.b0(935424596, new ik((ss0) obj4, (zg) obj3), ciVar2), ciVar2, 56);
                    break;
                } else {
                    ciVar2.Q();
                    break;
                }
                break;
            default:
                ci ciVar3 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar3.z()) {
                    e90 e90VarC = a.c(b90.a, "Container");
                    float f = xf0.a;
                    e90 e90VarC2 = androidx.compose.ui.draw.a.c(e90VarC, new j4(17, new f01(0, za0.class, (za0) obj5, "value", "getValue()Ljava/lang/Object;"), (jg0) obj4));
                    zg zgVar = (zg) obj3;
                    l80 l80VarD = eb.d(g2.e, true);
                    int iJ = c10.J(ciVar3);
                    wh0 wh0VarL = ciVar3.l();
                    e90 e90VarP = r31.P(ciVar3, e90VarC2);
                    sh.b.getClass();
                    si siVar = rh.b;
                    ciVar3.X();
                    if (ciVar3.S) {
                        ciVar3.k(siVar);
                    } else {
                        ciVar3.h0();
                    }
                    dq0.m(ciVar3, rh.e, l80VarD);
                    dq0.m(ciVar3, rh.d, wh0VarL);
                    n9 n9Var = rh.f;
                    if (ciVar3.S || !c10.i(ciVar3.K(), Integer.valueOf(iJ))) {
                        b8.k(iJ, ciVar3, iJ, n9Var);
                    }
                    dq0.m(ciVar3, rh.c, e90VarP);
                    zgVar.e(ciVar3, 0);
                    ciVar3.p(true);
                    break;
                } else {
                    ciVar3.Q();
                    break;
                }
                break;
        }
        return j41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, Object obj2, kw kwVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.h = obj;
        this.f = obj2;
        this.g = kwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.e = i;
        this.h = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
