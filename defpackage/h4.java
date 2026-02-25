package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.layout.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h4 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [iw, y20] */
    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        b90 b90Var = b90.a;
        int i2 = 1;
        j41 j41Var = j41.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                m4.a((p3) obj4, (kw) obj3, (ci) obj, d80.I(1));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                gt0 gt0Var = (gt0) obj2;
                q4 q4Var = (q4) obj3;
                if (!((ht0) obj4).b.b(gt0Var.g)) {
                    q4Var.k(iIntValue, gt0Var);
                    q4Var.k.u(j41Var);
                    break;
                }
                break;
            case 2:
                ci ciVar = (ci) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                wj0 wj0Var = (wj0) obj4;
                if (!ciVar.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ciVar.Q();
                    break;
                } else {
                    Object objK = ciVar.K();
                    v71 v71Var = vh.a;
                    if (objK == v71Var) {
                        objK = e3.n;
                        ciVar.e0(objK);
                    }
                    e90 e90VarA = dt0.a(b90Var, false, (iw) objK);
                    boolean zH = ciVar.h(wj0Var);
                    Object objK2 = ciVar.K();
                    if (zH || objK2 == v71Var) {
                        objK2 = new q6(wj0Var, i2);
                        ciVar.e0(objK2);
                    }
                    e90 e90VarE = a.e(e90VarA, (iw) objK2);
                    float f = wj0Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        e90VarE = androidx.compose.ui.graphics.a.b(e90VarE, f, null, 520187);
                    }
                    kw kwVar = (kw) ((za0) obj3).getValue();
                    Object objK3 = ciVar.K();
                    if (objK3 == v71Var) {
                        objK3 = e5.c;
                        ciVar.e0(objK3);
                    }
                    l80 l80Var = (l80) objK3;
                    int iHashCode = Long.hashCode(ciVar.T);
                    wh0 wh0VarL = ciVar.l();
                    e90 e90VarP = r31.P(ciVar, e90VarE);
                    sh.b.getClass();
                    si siVar = rh.b;
                    ciVar.X();
                    if (ciVar.S) {
                        ciVar.k(siVar);
                    } else {
                        ciVar.h0();
                    }
                    dq0.m(ciVar, rh.e, l80Var);
                    dq0.m(ciVar, rh.d, wh0VarL);
                    n9 n9Var = rh.f;
                    if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iHashCode))) {
                        b8.k(iHashCode, ciVar, iHashCode, n9Var);
                    }
                    dq0.m(ciVar, rh.c, e90VarP);
                    kwVar.e(ciVar, 0);
                    ciVar.p(true);
                    break;
                }
                break;
            case 3:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar2.z()) {
                    e90 e90VarC = androidx.compose.foundation.layout.a.c(b.a(b90Var, lc.c, lc.d), (jg0) obj4);
                    zg zgVar = (zg) obj3;
                    lo0 lo0VarA = ko0.a(o9.d, g2.o, ciVar2, 54);
                    int iJ = c10.J(ciVar2);
                    wh0 wh0VarL2 = ciVar2.l();
                    e90 e90VarP2 = r31.P(ciVar2, e90VarC);
                    sh.b.getClass();
                    si siVar2 = rh.b;
                    ciVar2.X();
                    if (ciVar2.S) {
                        ciVar2.k(siVar2);
                    } else {
                        ciVar2.h0();
                    }
                    dq0.m(ciVar2, rh.e, lo0VarA);
                    dq0.m(ciVar2, rh.d, wh0VarL2);
                    n9 n9Var2 = rh.f;
                    if (ciVar2.S || !c10.i(ciVar2.K(), Integer.valueOf(iJ))) {
                        b8.k(iJ, ciVar2, iJ, n9Var2);
                    }
                    dq0.m(ciVar2, rh.c, e90VarP2);
                    zgVar.c(mo0.a, ciVar2, 6);
                    ciVar2.p(true);
                    break;
                } else {
                    ciVar2.Q();
                    break;
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                r31.a((e90) obj4, (iw) obj3, (ci) obj, d80.I(1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ((xj) obj4).a((uj) obj3, (ci) obj, d80.I(1));
                break;
            case 6:
                ((Number) obj2).intValue();
                gk.a((uj) obj4, (zg) obj3, (ci) obj, d80.I(385));
                break;
            case 7:
                ci ciVar3 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar3.z()) {
                    uj ujVar = (uj) obj4;
                    gk.a(ujVar, b10.b0(1156688164, new fk(ujVar, (y20) obj3), ciVar3), ciVar3, 384);
                    break;
                } else {
                    ciVar3.Q();
                    break;
                }
            case 8:
                long j = ((ed0) obj2).a;
                qo0.c((o51) obj4, (nj0) obj);
                gc gcVar = ((dr0) obj3).x;
                if (gcVar != null) {
                    gcVar.u(new sp(j));
                    break;
                }
                break;
            case 9:
                ci ciVar4 = (ci) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ciVar4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ciVar4.Q();
                    break;
                } else {
                    Boolean bool = (Boolean) ((y30) obj4).f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    kw kwVar2 = (kw) obj3;
                    if (!ciVar4.S && ciVar4.G.g() == 207 && !c10.i(ciVar4.G.f(), bool) && ciVar4.z < 0) {
                        ciVar4.z = ciVar4.G.g;
                        ciVar4.y = true;
                    }
                    ciVar4.R(207, null, 0, bool);
                    boolean zG = ciVar4.g(zBooleanValue);
                    if (zBooleanValue) {
                        kwVar2.e(ciVar4, 0);
                    } else {
                        if (ciVar4.l != 0) {
                            fi.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!ciVar4.S) {
                            if (zG) {
                                av0 av0Var = ciVar4.G;
                                int i3 = av0Var.g;
                                int i4 = av0Var.h;
                                wh whVar = ciVar4.M;
                                whVar.getClass();
                                whVar.d(false);
                                whVar.b.j.O(ee0.c);
                                fi.a(ciVar4.s, i3, i4);
                                ciVar4.G.t();
                            } else {
                                ciVar4.P();
                            }
                        }
                    }
                    if (ciVar4.y && ciVar4.G.i == ciVar4.z) {
                        ciVar4.z = -1;
                        ciVar4.y = false;
                    }
                    ciVar4.p(false);
                    break;
                }
                break;
            case 10:
                ci ciVar5 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar5.z()) {
                    l11.a(((b41) obj4).j, (zg) obj3, ciVar5, 0);
                    break;
                } else {
                    ciVar5.Q();
                    break;
                }
                break;
            case 11:
                dd ddVar = (dd) obj;
                fx fxVar = (fx) obj2;
                nc0 nc0Var = (nc0) obj4;
                t30 t30Var = nc0Var.r;
                if (!t30Var.I()) {
                    nc0Var.K = true;
                    break;
                } else {
                    nc0Var.H = ddVar;
                    nc0Var.G = fxVar;
                    gg0 snapshotObserver = ((p3) r31.U(t30Var)).getSnapshotObserver();
                    an0 an0Var = nc0.M;
                    snapshotObserver.a(nc0Var, s40.j, (mc0) obj3);
                    nc0Var.K = false;
                    break;
                }
            case 12:
                ((Number) obj2).intValue();
                l81.g((e90) obj4, (kw) obj3, (ci) obj, d80.I(1));
                break;
            case 13:
                ((Number) obj2).intValue();
                l11.a((c21) obj4, (zg) obj3, (ci) obj, d80.I(1));
                break;
            default:
                ((Number) obj2).intValue();
                ((e31) obj4).a((c00) obj3, (ci) obj, d80.I(49));
                break;
        }
        return j41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(int i, Object obj, Object obj2) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h4(uj ujVar, iw iwVar) {
        super(2);
        this.e = 7;
        this.f = ujVar;
        this.g = (y20) iwVar;
    }
}
