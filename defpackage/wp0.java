package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wp0 extends y20 implements kw {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ zg g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(int i, kw kwVar, zg zgVar, kw kwVar2, kw kwVar3, gb0 gb0Var, kw kwVar4) {
        super(2);
        this.f = i;
        this.h = kwVar;
        this.g = zgVar;
        this.i = kwVar2;
        this.j = kwVar3;
        this.l = gb0Var;
        this.k = kwVar4;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        ArrayList arrayList;
        at atVar;
        Object obj6;
        int i2;
        ArrayList arrayList2;
        Integer numValueOf;
        int i3;
        int iIntValue;
        int iN;
        int iA;
        Object obj7;
        Object obj8;
        int i4;
        int iN2;
        int iN3;
        switch (this.e) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    aq0.b(this.f, (kw) this.h, this.g, (kw) this.i, (kw) this.j, (gb0) this.l, (kw) this.k, ciVar, 0);
                }
                return j41.a;
            case 1:
                ci ciVar2 = (ci) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                xx0 xx0Var = (xx0) this.i;
                if ((iIntValue2 & 3) == 2 && ciVar2.z()) {
                    ciVar2.Q();
                } else {
                    u61 u61Var = (u61) this.h;
                    float fJ0 = ((ArrayList) this.j).isEmpty() ? xx0Var.j0(u61Var.b(xx0Var)) : xx0Var.j0(this.f);
                    float fJ02 = (((ArrayList) this.k).isEmpty() || (num = (Integer) this.l) == null) ? xx0Var.j0(u61Var.a(xx0Var)) : xx0Var.j0(num.intValue());
                    e30 layoutDirection = xx0Var.getLayoutDirection();
                    e30 e30Var = e30.d;
                    float fJ03 = layoutDirection == e30Var ? xx0Var.j0(u61Var.d(xx0Var, layoutDirection)) : xx0Var.j0(u61Var.c(xx0Var, layoutDirection));
                    e30 layoutDirection2 = xx0Var.getLayoutDirection();
                    this.g.c(new jg0(fJ03, fJ0, layoutDirection2 == e30Var ? xx0Var.j0(u61Var.c(xx0Var, layoutDirection2)) : xx0Var.j0(u61Var.d(xx0Var, layoutDirection2)), fJ02), ciVar2, 0);
                }
                return j41.a;
            default:
                xx0 xx0Var2 = (xx0) obj;
                long j = ((gj) obj2).a;
                u61 u61Var2 = (u61) this.l;
                int iH = gj.h(j);
                int iG = gj.g(j);
                long jA = gj.a(j, 0, 0, 0, 0, 10);
                List listG = xx0Var2.G((kw) this.h, bq0.d);
                ArrayList arrayList3 = new ArrayList(listG.size());
                int size = listG.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList3.add(((g80) listG.get(i5)).e(jA));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i6 = ((oi0) obj3).e;
                    int iL = ve.L(arrayList3);
                    if (1 <= iL) {
                        int i7 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i7);
                            int i8 = ((oi0) obj9).e;
                            if (i6 < i8) {
                                i6 = i8;
                                obj3 = obj9;
                            }
                            if (i7 != iL) {
                                i7++;
                            }
                        }
                    }
                }
                oi0 oi0Var = (oi0) obj3;
                int i9 = oi0Var != null ? oi0Var.e : 0;
                List listG2 = xx0Var2.G((kw) this.i, bq0.f);
                ArrayList arrayList4 = new ArrayList(listG2.size());
                int size2 = listG2.size();
                int i10 = 0;
                while (i10 < size2) {
                    arrayList4.add(((g80) listG2.get(i10)).e(hj.i(jA, (-u61Var2.d(xx0Var2, xx0Var2.getLayoutDirection())) - u61Var2.c(xx0Var2, xx0Var2.getLayoutDirection()), -u61Var2.a(xx0Var2))));
                    i10++;
                    listG2 = listG2;
                }
                if (arrayList4.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList4.get(0);
                    int i11 = ((oi0) obj4).e;
                    int iL2 = ve.L(arrayList4);
                    if (1 <= iL2) {
                        Object obj10 = obj4;
                        int i12 = i11;
                        int i13 = 1;
                        while (true) {
                            Object obj11 = arrayList4.get(i13);
                            int i14 = ((oi0) obj11).e;
                            if (i12 < i14) {
                                obj10 = obj11;
                                i12 = i14;
                            }
                            if (i13 != iL2) {
                                i13++;
                            } else {
                                obj4 = obj10;
                            }
                        }
                    }
                }
                oi0 oi0Var2 = (oi0) obj4;
                int i15 = oi0Var2 != null ? oi0Var2.e : 0;
                if (arrayList4.isEmpty()) {
                    i = i15;
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int i16 = ((oi0) obj5).d;
                    int iL3 = ve.L(arrayList4);
                    if (1 <= iL3) {
                        Object obj12 = obj5;
                        int i17 = i16;
                        int i18 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i18);
                            i = i15;
                            int i19 = ((oi0) obj13).d;
                            if (i17 < i19) {
                                i17 = i19;
                                obj12 = obj13;
                            }
                            if (i18 != iL3) {
                                i18++;
                                i15 = i;
                            } else {
                                obj5 = obj12;
                            }
                        }
                    } else {
                        i = i15;
                    }
                }
                oi0 oi0Var3 = (oi0) obj5;
                int i20 = oi0Var3 != null ? oi0Var3.d : 0;
                List listG3 = xx0Var2.G((kw) this.j, bq0.g);
                ArrayList arrayList5 = new ArrayList(listG3.size());
                int size3 = listG3.size();
                int i21 = 0;
                while (i21 < size3) {
                    List list = listG3;
                    ArrayList arrayList6 = arrayList4;
                    oi0 oi0VarE = ((g80) listG3.get(i21)).e(hj.i(jA, (-u61Var2.d(xx0Var2, xx0Var2.getLayoutDirection())) - u61Var2.c(xx0Var2, xx0Var2.getLayoutDirection()), -u61Var2.a(xx0Var2)));
                    if (oi0VarE.e == 0 || oi0VarE.d == 0) {
                        oi0VarE = null;
                    }
                    if (oi0VarE != null) {
                        arrayList5.add(oi0VarE);
                    }
                    i21++;
                    listG3 = list;
                    arrayList4 = arrayList6;
                }
                ArrayList arrayList7 = arrayList4;
                boolean zIsEmpty = arrayList5.isEmpty();
                int i22 = this.f;
                if (zIsEmpty) {
                    arrayList = arrayList3;
                    atVar = null;
                } else {
                    if (arrayList5.isEmpty()) {
                        arrayList = arrayList3;
                        obj7 = null;
                    } else {
                        obj7 = arrayList5.get(0);
                        int i23 = ((oi0) obj7).d;
                        int iL4 = ve.L(arrayList5);
                        if (1 <= iL4) {
                            int i24 = i23;
                            int i25 = 1;
                            while (true) {
                                Object obj14 = arrayList5.get(i25);
                                arrayList = arrayList3;
                                int i26 = ((oi0) obj14).d;
                                if (i24 < i26) {
                                    i24 = i26;
                                    obj7 = obj14;
                                }
                                if (i25 != iL4) {
                                    i25++;
                                    arrayList3 = arrayList;
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    c10.m(obj7);
                    int i27 = ((oi0) obj7).d;
                    if (arrayList5.isEmpty()) {
                        i4 = i27;
                        obj8 = null;
                    } else {
                        obj8 = arrayList5.get(0);
                        int i28 = ((oi0) obj8).e;
                        int iL5 = ve.L(arrayList5);
                        if (1 <= iL5) {
                            Object obj15 = obj8;
                            int i29 = i28;
                            int i30 = 1;
                            while (true) {
                                Object obj16 = arrayList5.get(i30);
                                i4 = i27;
                                int i31 = ((oi0) obj16).e;
                                if (i29 < i31) {
                                    i29 = i31;
                                    obj15 = obj16;
                                }
                                if (i30 != iL5) {
                                    i30++;
                                    i27 = i4;
                                } else {
                                    obj8 = obj15;
                                }
                            }
                        } else {
                            i4 = i27;
                        }
                    }
                    c10.m(obj8);
                    int i32 = ((oi0) obj8).e;
                    e30 e30Var2 = e30.d;
                    if (i22 != 0) {
                        if (i22 != 2 && i22 != 3) {
                            iN2 = (iH - i4) / 2;
                        } else if (xx0Var2.getLayoutDirection() == e30Var2) {
                            iN3 = xx0Var2.N(aq0.a);
                            iN2 = (iH - iN3) - i4;
                        } else {
                            iN2 = xx0Var2.N(aq0.a);
                        }
                        atVar = new at(iN2, i32);
                    } else if (xx0Var2.getLayoutDirection() == e30Var2) {
                        iN2 = xx0Var2.N(aq0.a);
                        atVar = new at(iN2, i32);
                    } else {
                        iN3 = xx0Var2.N(aq0.a);
                        iN2 = (iH - iN3) - i4;
                        atVar = new at(iN2, i32);
                    }
                }
                List listG4 = xx0Var2.G(new zg(-2146438447, true, new u1(2, (kw) this.k)), bq0.h);
                ArrayList arrayList8 = new ArrayList(listG4.size());
                int size4 = listG4.size();
                int i33 = 0;
                while (i33 < size4) {
                    arrayList8.add(((g80) listG4.get(i33)).e(jA));
                    i33++;
                    listG4 = listG4;
                }
                if (arrayList8.isEmpty()) {
                    arrayList2 = arrayList8;
                    i2 = i9;
                    obj6 = null;
                } else {
                    obj6 = arrayList8.get(0);
                    int i34 = ((oi0) obj6).e;
                    int iL6 = ve.L(arrayList8);
                    i2 = i9;
                    if (1 <= iL6) {
                        int i35 = i34;
                        int i36 = 1;
                        while (true) {
                            Object obj17 = arrayList8.get(i36);
                            arrayList2 = arrayList8;
                            int i37 = ((oi0) obj17).e;
                            if (i35 < i37) {
                                i35 = i37;
                                obj6 = obj17;
                            }
                            if (i36 != iL6) {
                                i36++;
                                arrayList8 = arrayList2;
                            }
                        }
                    } else {
                        arrayList2 = arrayList8;
                    }
                }
                oi0 oi0Var4 = (oi0) obj6;
                Integer numValueOf2 = oi0Var4 != null ? Integer.valueOf(oi0Var4.e) : null;
                if (atVar != null) {
                    int i38 = atVar.e;
                    if (numValueOf2 == null || i22 == 3) {
                        iN = xx0Var2.N(aq0.a) + i38;
                        iA = u61Var2.a(xx0Var2);
                    } else {
                        iN = numValueOf2.intValue() + i38;
                        iA = xx0Var2.N(aq0.a);
                    }
                    numValueOf = Integer.valueOf(iA + iN);
                } else {
                    numValueOf = null;
                }
                if (i != 0) {
                    iIntValue = i + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : u61Var2.a(xx0Var2));
                    i3 = iH;
                } else {
                    i3 = iH;
                    iIntValue = 0;
                }
                at atVar2 = atVar;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList10 = arrayList2;
                List listG5 = xx0Var2.G(new zg(-1213360416, true, new wp0((u61) this.l, xx0Var2, arrayList9, i2, arrayList10, numValueOf2, this.g)), bq0.e);
                ArrayList arrayList11 = new ArrayList(listG5.size());
                int size5 = listG5.size();
                int i39 = 0;
                while (i39 < size5) {
                    arrayList11.add(((g80) listG5.get(i39)).e(jA));
                    i39++;
                    i3 = i3;
                }
                int i40 = i3;
                return xx0Var2.a0(i40, iG, ls.d, new yp0(arrayList11, arrayList9, arrayList7, arrayList10, atVar2, i40, i20, (u61) this.l, xx0Var2, iG, iIntValue, numValueOf2, arrayList5, numValueOf));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(kw kwVar, kw kwVar2, kw kwVar3, int i, u61 u61Var, kw kwVar4, zg zgVar) {
        super(2);
        this.h = kwVar;
        this.i = kwVar2;
        this.j = kwVar3;
        this.f = i;
        this.l = u61Var;
        this.k = kwVar4;
        this.g = zgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(u61 u61Var, xx0 xx0Var, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, zg zgVar) {
        super(2);
        this.h = u61Var;
        this.i = xx0Var;
        this.j = arrayList;
        this.f = i;
        this.k = arrayList2;
        this.l = num;
        this.g = zgVar;
    }
}
