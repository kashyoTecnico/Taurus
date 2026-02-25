package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zf0 implements l80 {
    public final iw a;
    public final float b;
    public final jg0 c;

    public zf0(iw iwVar, float f, jg0 jg0Var) {
        this.a = iwVar;
        this.b = f;
        this.c = jg0Var;
    }

    public final int a(x00 x00Var, List list, int i, kw kwVar) {
        Object obj;
        int iX;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (c10.i(j01.c((g80) obj), "Leading")) {
                break;
            }
            i3++;
        }
        g80 g80Var = (g80) obj;
        if (g80Var != null) {
            iX = i == Integer.MAX_VALUE ? i : i - g80Var.X(Integer.MAX_VALUE);
            iIntValue = ((Number) kwVar.e(g80Var, Integer.valueOf(i))).intValue();
        } else {
            iX = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (c10.i(j01.c((g80) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        g80 g80Var2 = (g80) obj2;
        if (g80Var2 != null) {
            int iX2 = g80Var2.X(Integer.MAX_VALUE);
            if (iX != Integer.MAX_VALUE) {
                iX -= iX2;
            }
            iIntValue2 = ((Number) kwVar.e(g80Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (c10.i(j01.c((g80) obj3), "Label")) {
                break;
            }
            i5++;
        }
        Object obj8 = (g80) obj3;
        int iIntValue4 = obj8 != null ? ((Number) kwVar.e(obj8, Integer.valueOf(r31.L(this.b, iX, i)))).intValue() : 0;
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (c10.i(j01.c((g80) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        g80 g80Var3 = (g80) obj4;
        if (g80Var3 != null) {
            iIntValue3 = ((Number) kwVar.e(g80Var3, Integer.valueOf(iX))).intValue();
            int iX3 = g80Var3.X(Integer.MAX_VALUE);
            if (iX != Integer.MAX_VALUE) {
                iX -= iX3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (c10.i(j01.c((g80) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        g80 g80Var4 = (g80) obj5;
        if (g80Var4 != null) {
            int iIntValue5 = ((Number) kwVar.e(g80Var4, Integer.valueOf(iX))).intValue();
            int iX4 = g80Var4.X(Integer.MAX_VALUE);
            if (iX != Integer.MAX_VALUE) {
                iX -= iX4;
            }
            i2 = iIntValue5;
        } else {
            i2 = 0;
        }
        int size6 = list.size();
        for (int i8 = 0; i8 < size6; i8++) {
            Object obj9 = list.get(i8);
            if (c10.i(j01.c((g80) obj9), "TextField")) {
                int iIntValue6 = ((Number) kwVar.e(obj9, Integer.valueOf(iX))).intValue();
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    if (c10.i(j01.c((g80) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                }
                Object obj10 = (g80) obj6;
                int iIntValue7 = obj10 != null ? ((Number) kwVar.e(obj10, Integer.valueOf(iX))).intValue() : 0;
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i10);
                    if (c10.i(j01.c((g80) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i10++;
                }
                Object obj12 = (g80) obj7;
                return xf0.c(iIntValue, iIntValue2, iIntValue3, i2, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) kwVar.e(obj12, Integer.valueOf(i))).intValue() : 0, this.b, j01.a, x00Var.b(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.l80
    public final int b(x00 x00Var, List list, int i) {
        return a(x00Var, list, i, n9.v);
    }

    public final int c(x00 x00Var, List list, int i, kw kwVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (c10.i(j01.c((g80) obj7), "TextField")) {
                int iIntValue = ((Number) kwVar.e(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (c10.i(j01.c((g80) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                g80 g80Var = (g80) obj2;
                int iIntValue2 = g80Var != null ? ((Number) kwVar.e(g80Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (c10.i(j01.c((g80) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                g80 g80Var2 = (g80) obj3;
                int iIntValue3 = g80Var2 != null ? ((Number) kwVar.e(g80Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (c10.i(j01.c((g80) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                g80 g80Var3 = (g80) obj4;
                int iIntValue4 = g80Var3 != null ? ((Number) kwVar.e(g80Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (c10.i(j01.c((g80) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                g80 g80Var4 = (g80) obj5;
                int iIntValue5 = g80Var4 != null ? ((Number) kwVar.e(g80Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (c10.i(j01.c((g80) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                g80 g80Var5 = (g80) obj6;
                int iIntValue6 = g80Var5 != null ? ((Number) kwVar.e(g80Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (c10.i(j01.c((g80) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                g80 g80Var6 = (g80) obj;
                return xf0.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, g80Var6 != null ? ((Number) kwVar.e(g80Var6, Integer.valueOf(i))).intValue() : 0, this.b, j01.a, x00Var.b(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.l80
    public final int d(x00 x00Var, List list, int i) {
        return c(x00Var, list, i, n9.w);
    }

    @Override // defpackage.l80
    public final m80 g(n80 n80Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        oi0 oi0Var;
        oi0 oi0VarE;
        Object obj4;
        int i;
        oi0 oi0VarE2;
        int i2;
        Object obj5;
        Object obj6;
        Object obj7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zf0 zf0Var = this;
        List list2 = list;
        jg0 jg0Var = zf0Var.c;
        int iN = n80Var.N(jg0Var.a());
        long jA = gj.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i11);
            if (c10.i(a.a((g80) obj), "Leading")) {
                break;
            }
            i11++;
        }
        g80 g80Var = (g80) obj;
        oi0 oi0VarE3 = g80Var != null ? g80Var.e(jA) : null;
        float f = j01.b;
        int i12 = oi0VarE3 != null ? oi0VarE3.d : 0;
        int iMax = Math.max(0, oi0VarE3 != null ? oi0VarE3.e : 0);
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i13);
            if (c10.i(a.a((g80) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        g80 g80Var2 = (g80) obj2;
        oi0 oi0VarE4 = g80Var2 != null ? g80Var2.e(hj.j(jA, -i12, 0, 2)) : null;
        int i14 = i12 + (oi0VarE4 != null ? oi0VarE4.d : 0);
        int iMax2 = Math.max(iMax, oi0VarE4 != null ? oi0VarE4.e : 0);
        int size3 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i15);
            if (c10.i(a.a((g80) obj3), "Prefix")) {
                break;
            }
            i15++;
        }
        g80 g80Var3 = (g80) obj3;
        if (g80Var3 != null) {
            oi0Var = oi0VarE3;
            oi0VarE = g80Var3.e(hj.j(jA, -i14, 0, 2));
        } else {
            oi0Var = oi0VarE3;
            oi0VarE = null;
        }
        int i16 = i14 + (oi0VarE != null ? oi0VarE.d : 0);
        int iMax3 = Math.max(iMax2, oi0VarE != null ? oi0VarE.e : 0);
        int size4 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i17);
            if (c10.i(a.a((g80) obj4), "Suffix")) {
                break;
            }
            i17++;
        }
        g80 g80Var4 = (g80) obj4;
        if (g80Var4 != null) {
            i = i16;
            oi0VarE2 = g80Var4.e(hj.j(jA, -i16, 0, 2));
        } else {
            i = i16;
            oi0VarE2 = null;
        }
        int i18 = i + (oi0VarE2 != null ? oi0VarE2.d : 0);
        int iMax4 = Math.max(iMax3, oi0VarE2 != null ? oi0VarE2.e : 0);
        int iN2 = n80Var.N(jg0Var.c(n80Var.getLayoutDirection())) + n80Var.N(jg0Var.b(n80Var.getLayoutDirection()));
        int i19 = -i18;
        int iL = r31.L(zf0Var.b, i19 - iN2, -iN2);
        int i20 = -iN;
        long jI = hj.i(jA, iL, i20);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                i2 = iN;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i21);
            int i22 = i21;
            i2 = iN;
            if (c10.i(a.a((g80) obj5), "Label")) {
                break;
            }
            i21 = i22 + 1;
            iN = i2;
        }
        g80 g80Var5 = (g80) obj5;
        oi0 oi0VarE5 = g80Var5 != null ? g80Var5.e(jI) : null;
        zf0Var.a.g(new yu0(oi0VarE5 != null ? dq0.a(oi0VarE5.d, oi0VarE5.e) : 0L));
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i23);
            int i24 = size6;
            if (c10.i(a.a((g80) obj6), "Supporting")) {
                break;
            }
            i23++;
            size6 = i24;
        }
        g80 g80Var6 = (g80) obj6;
        int iB0 = g80Var6 != null ? g80Var6.b0(gj.j(j)) : 0;
        int iMax5 = Math.max((oi0VarE5 != null ? oi0VarE5.e : 0) / 2, n80Var.N(jg0Var.d()));
        long jA2 = gj.a(hj.i(j, i19, (i20 - iMax5) - iB0), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i25 = 0;
        while (i25 < size7) {
            g80 g80Var7 = (g80) list2.get(i25);
            int i26 = i25;
            int i27 = size7;
            if (c10.i(a.a(g80Var7), "TextField")) {
                oi0 oi0VarE6 = g80Var7.e(jA2);
                long jA3 = gj.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i28);
                    int i29 = size8;
                    int i30 = i28;
                    if (c10.i(a.a((g80) obj7), "Hint")) {
                        break;
                    }
                    i28 = i30 + 1;
                    size8 = i29;
                }
                g80 g80Var8 = (g80) obj7;
                oi0 oi0VarE7 = g80Var8 != null ? g80Var8.e(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(oi0VarE6.e, oi0VarE7 != null ? oi0VarE7.e : 0) + iMax5 + i2);
                oi0 oi0Var2 = oi0Var;
                int i31 = oi0Var != null ? oi0Var2.d : 0;
                int i32 = oi0VarE4 != null ? oi0VarE4.d : 0;
                if (oi0VarE != null) {
                    i3 = oi0VarE.d;
                    i31 = i31;
                } else {
                    i3 = 0;
                }
                if (oi0VarE2 != null) {
                    i4 = i31;
                    i5 = oi0VarE2.d;
                } else {
                    i4 = i31;
                    i5 = 0;
                }
                int i33 = oi0VarE6.d;
                if (oi0VarE5 != null) {
                    i8 = oi0VarE5.d;
                    i7 = i4;
                    i6 = i33;
                } else {
                    int i34 = i4;
                    i6 = i33;
                    i7 = i34;
                    i8 = 0;
                }
                if (oi0VarE7 != null) {
                    i9 = oi0VarE7.d;
                    i7 = i7;
                } else {
                    i9 = 0;
                }
                int iD = xf0.d(i7, i32, i3, i5, i6, i8, i9, zf0Var.b, j, n80Var.b(), zf0Var.c);
                int i35 = 0;
                int i36 = iD;
                oi0 oi0VarE8 = g80Var6 != null ? g80Var6.e(gj.a(hj.j(jA, 0, -iMax6, 1), 0, iD, 0, 0, 9)) : null;
                int i37 = oi0VarE8 != null ? oi0VarE8.e : 0;
                int i38 = oi0Var2 != null ? oi0Var2.e : 0;
                if (oi0VarE4 != null) {
                    i10 = 0;
                    i35 = oi0VarE4.e;
                } else {
                    i10 = 0;
                }
                oi0 oi0Var3 = oi0VarE;
                oi0 oi0Var4 = oi0VarE5;
                int iC = xf0.c(i38, i35, oi0VarE != null ? oi0VarE.e : i10, oi0VarE2 != null ? oi0VarE2.e : i10, oi0VarE6.e, oi0VarE5 != null ? oi0VarE5.e : i10, oi0VarE7 != null ? oi0VarE7.e : i10, oi0VarE8 != null ? oi0VarE8.e : i10, zf0Var.b, j, n80Var.b(), zf0Var.c);
                int i39 = iC - i37;
                int size9 = list2.size();
                int i40 = i10;
                while (i40 < size9) {
                    g80 g80Var9 = (g80) list2.get(i40);
                    if (c10.i(a.a(g80Var9), "Container")) {
                        oi0 oi0VarE9 = g80Var9.e(hj.a(i36 != Integer.MAX_VALUE ? i36 : i10, i36, i39 != Integer.MAX_VALUE ? i39 : i10, i39));
                        oi0 oi0Var5 = oi0VarE6;
                        oi0 oi0Var6 = oi0VarE8;
                        int i41 = i36;
                        return n80Var.a0(i41, iC, ls.d, new yf0(iC, i41, oi0Var2, oi0VarE4, oi0Var3, oi0VarE2, oi0Var5, oi0Var4, oi0VarE7, oi0VarE9, oi0Var6, zf0Var, n80Var));
                    }
                    i40++;
                    i36 = i36;
                    oi0VarE8 = oi0VarE8;
                    oi0VarE6 = oi0VarE6;
                    oi0Var3 = oi0Var3;
                    oi0VarE2 = oi0VarE2;
                    oi0Var2 = oi0Var2;
                    zf0Var = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25 = i26 + 1;
            zf0Var = this;
            list2 = list;
            oi0VarE2 = oi0VarE2;
            size7 = i27;
            jA2 = jA2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.l80
    public final int h(x00 x00Var, List list, int i) {
        return a(x00Var, list, i, n9.x);
    }

    @Override // defpackage.l80
    public final int j(x00 x00Var, List list, int i) {
        return c(x00Var, list, i, n9.y);
    }
}
