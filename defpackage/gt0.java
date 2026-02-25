package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gt0 {
    public final d90 a;
    public final boolean b;
    public final t30 c;
    public final ct0 d;
    public boolean e;
    public gt0 f;
    public final int g;

    public gt0(d90 d90Var, boolean z, t30 t30Var, ct0 ct0Var) {
        this.a = d90Var;
        this.b = z;
        this.c = t30Var;
        this.d = ct0Var;
        this.g = t30Var.e;
    }

    public static /* synthetic */ List j(int i, gt0 gt0Var) {
        return gt0Var.i((i & 1) != 0 ? !gt0Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final xl0 a(nc0 nc0Var) {
        mn mnVarI;
        gt0 gt0VarL = l();
        if (gt0VarL == null) {
            return xl0.e;
        }
        d90 d90Var = gt0VarL.c.G.f;
        if ((d90Var.g & 8) != 0) {
            loop0: while (d90Var != null) {
                if ((d90Var.f & 8) != 0) {
                    mnVarI = d90Var;
                    ?? eb0Var = 0;
                    while (mnVarI != 0) {
                        if (mnVarI instanceof et0) {
                            if (mnVarI.h()) {
                                break loop0;
                            }
                        } else if ((mnVarI.f & 8) != 0 && (mnVarI instanceof mn)) {
                            d90 d90Var2 = mnVarI.s;
                            int i = 0;
                            mnVarI = mnVarI;
                            eb0Var = eb0Var;
                            while (d90Var2 != null) {
                                if ((d90Var2.f & 8) != 0) {
                                    i++;
                                    eb0Var = eb0Var;
                                    if (i == 1) {
                                        mnVarI = d90Var2;
                                    } else {
                                        if (eb0Var == 0) {
                                            eb0Var = new eb0(new d90[16]);
                                        }
                                        if (mnVarI != 0) {
                                            eb0Var.b(mnVarI);
                                            mnVarI = 0;
                                        }
                                        eb0Var.b(d90Var2);
                                    }
                                }
                                d90Var2 = d90Var2.i;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        mnVarI = d80.i(eb0Var);
                    }
                }
                if ((d90Var.g & 8) == 0) {
                    break;
                }
                d90Var = d90Var.i;
            }
            mnVarI = 0;
        } else {
            mnVarI = 0;
        }
        et0 et0Var = (et0) mnVarI;
        nc0 nc0VarX = et0Var != null ? d80.x(et0Var, 8) : null;
        return nc0VarX == null ? gt0VarL.a(nc0Var) : nc0VarX.P(nc0Var, true);
    }

    public final gt0 b(zn0 zn0Var, iw iwVar) {
        ct0 ct0Var = new ct0();
        ct0Var.f = false;
        ct0Var.g = false;
        iwVar.g(ct0Var);
        gt0 gt0Var = new gt0(new ft0(iwVar), false, new t30(this.g + (zn0Var != null ? 1000000000 : 2000000000), true), ct0Var);
        gt0Var.e = true;
        gt0Var.f = this;
        return gt0Var;
    }

    public final void c(t30 t30Var, ArrayList arrayList) {
        eb0 eb0VarW = t30Var.w();
        Object[] objArr = eb0VarW.d;
        int i = eb0VarW.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (t30Var2.H() && !t30Var2.P) {
                if (t30Var2.G.d(8)) {
                    arrayList.add(mq0.a(t30Var2, this.b));
                } else {
                    c(t30Var2, arrayList);
                }
            }
        }
    }

    public final nc0 d() {
        if (!this.e) {
            et0 et0VarF = f();
            return et0VarF != null ? d80.x(et0VarF, 8) : this.c.G.c;
        }
        gt0 gt0VarL = l();
        if (gt0VarL != null) {
            return gt0VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            gt0 gt0Var = (gt0) arrayList.get(size2);
            if (gt0Var.n()) {
                arrayList2.add(gt0Var);
            } else if (!gt0Var.d.g) {
                gt0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v14, types: [et0] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [eb0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [eb0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public final et0 f() {
        d90 d90VarI;
        boolean z = this.d.f;
        t30 t30Var = this.c;
        Object obj = null;
        if (z) {
            d90 d90Var = t30Var.G.f;
            if ((d90Var.g & 8) != 0) {
                d90VarI = null;
                while (d90Var != null) {
                    if ((d90Var.f & 8) != 0) {
                        mn mnVarI = d90Var;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof et0) {
                                ?? r5 = (et0) mnVarI;
                                if (r5.h()) {
                                    if (r5.e0()) {
                                        return r5;
                                    }
                                    if (d90VarI == null) {
                                        d90VarI = r5;
                                    }
                                }
                            } else if ((mnVarI.f & 8) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var2 = mnVarI.s;
                                int i = 0;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                                while (d90Var2 != null) {
                                    if ((d90Var2.f & 8) != 0) {
                                        i++;
                                        eb0Var = eb0Var;
                                        if (i == 1) {
                                            mnVarI = d90Var2;
                                        } else {
                                            if (eb0Var == 0) {
                                                eb0Var = new eb0(new d90[16]);
                                            }
                                            if (mnVarI != 0) {
                                                eb0Var.b(mnVarI);
                                                mnVarI = 0;
                                            }
                                            eb0Var.b(d90Var2);
                                        }
                                    }
                                    d90Var2 = d90Var2.i;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            mnVarI = d80.i(eb0Var);
                        }
                    }
                    if ((d90Var.g & 8) == 0) {
                        break;
                    }
                    d90Var = d90Var.i;
                }
                obj = d90VarI;
            }
        } else {
            d90 d90Var3 = t30Var.G.f;
            if ((d90Var3.g & 8) != 0) {
                loop3: while (d90Var3 != null) {
                    if ((d90Var3.f & 8) != 0) {
                        d90VarI = d90Var3;
                        eb0 eb0Var2 = null;
                        while (d90VarI != null) {
                            if (d90VarI instanceof et0) {
                                if (((et0) d90VarI).h()) {
                                    obj = d90VarI;
                                }
                            } else if ((d90VarI.f & 8) != 0 && (d90VarI instanceof mn)) {
                                int i2 = 0;
                                for (d90 d90Var4 = ((mn) d90VarI).s; d90Var4 != null; d90Var4 = d90Var4.i) {
                                    if ((d90Var4.f & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            d90VarI = d90Var4;
                                        } else {
                                            if (eb0Var2 == null) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var2.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var2.b(d90Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            d90VarI = d80.i(eb0Var2);
                        }
                    }
                    if ((d90Var3.g & 8) == 0) {
                        break;
                    }
                    d90Var3 = d90Var3.i;
                }
            }
        }
        return (et0) obj;
    }

    public final xl0 g() {
        nc0 nc0VarD = d();
        if (nc0VarD != null) {
            if (!nc0VarD.O0().q) {
                nc0VarD = null;
            }
            if (nc0VarD != null) {
                return l81.C(nc0VarD).P(nc0VarD, true);
            }
        }
        return xl0.e;
    }

    public final xl0 h() {
        nc0 nc0VarD = d();
        if (nc0VarD != null) {
            if (!nc0VarD.O0().q) {
                nc0VarD = null;
            }
            if (nc0VarD != null) {
                return l81.s(nc0VarD);
            }
        }
        return xl0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.g) {
            return ks.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final ct0 k() {
        boolean zN = n();
        ct0 ct0Var = this.d;
        if (!zN) {
            return ct0Var;
        }
        ct0 ct0VarA = ct0Var.a();
        p(new ArrayList(), ct0VarA);
        return ct0VarA;
    }

    public final gt0 l() {
        t30 t30VarT;
        gt0 gt0Var = this.f;
        if (gt0Var != null) {
            return gt0Var;
        }
        t30 t30Var = this.c;
        boolean z = this.b;
        if (z) {
            t30VarT = t30Var.t();
            while (t30VarT != null) {
                ct0 ct0VarV = t30VarT.v();
                if (ct0VarV != null && ct0VarV.f) {
                    break;
                }
                t30VarT = t30VarT.t();
            }
            t30VarT = null;
        } else {
            t30VarT = null;
        }
        if (t30VarT == null) {
            t30 t30VarT2 = t30Var.t();
            while (true) {
                if (t30VarT2 == null) {
                    t30VarT = null;
                    break;
                }
                if (t30VarT2.G.d(8)) {
                    t30VarT = t30VarT2;
                    break;
                }
                t30VarT2 = t30VarT2.t();
            }
        }
        if (t30VarT == null) {
            return null;
        }
        return mq0.a(t30VarT, z);
    }

    public final ct0 m() {
        return this.d;
    }

    public final boolean n() {
        return this.b && this.d.f;
    }

    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        t30 t30VarT = this.c.t();
        while (true) {
            if (t30VarT == null) {
                t30VarT = null;
                break;
            }
            ct0 ct0VarV = t30VarT.v();
            if (ct0VarV != null && ct0VarV.f) {
                break;
            }
            t30VarT = t30VarT.t();
        }
        return t30VarT == null;
    }

    public final void p(ArrayList arrayList, ct0 ct0Var) {
        if (this.d.g) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            gt0 gt0Var = (gt0) arrayList.get(size2);
            if (!gt0Var.n()) {
                ct0Var.c(gt0Var.d);
                gt0Var.p(arrayList, ct0Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return ks.d;
        }
        c(this.c, arrayList);
        if (z) {
            ct0 ct0Var = this.d;
            ta0 ta0Var = ct0Var.d;
            Object objG = ta0Var.g(lt0.x);
            if (objG == null) {
                objG = null;
            }
            zn0 zn0Var = (zn0) objG;
            if (zn0Var != null && ct0Var.f && !arrayList.isEmpty()) {
                arrayList.add(b(zn0Var, new h(26, zn0Var)));
            }
            ot0 ot0Var = lt0.a;
            if (ta0Var.c(ot0Var) && !arrayList.isEmpty() && ct0Var.f) {
                Object objG2 = ta0Var.g(ot0Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) ue.T(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new c2(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
