package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g30 implements rg0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public g30(Map map) {
        c10.p(map, "initialState");
        this.b = new LinkedHashMap(map);
        this.a = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new lg(2, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h40, java.lang.Object] */
    @Override // defpackage.rg0
    public float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.rg0
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((qg0) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h40, java.lang.Object] */
    @Override // defpackage.rg0
    public float c() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi d(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.h(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.d(int):java.text.Bidi");
    }

    public float e(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float f(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return e(i, z);
        }
        int iD = r31.D(layout, i, z2);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (i != lineStart && i != lineEnd) {
            return e(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return e(i, z);
        }
        int iG = g(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(h(iG))) == -1;
        int i4 = i(lineEnd, lineStart);
        int iH = h(iG);
        int i5 = lineStart - iH;
        int i6 = i4 - iH;
        Bidi bidiD = d(iG);
        Bidi bidiCreateLineBidi = bidiD != null ? bidiD.createLineBidi(i5, i6) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        f30[] f30VarArr = new f30[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            f30VarArr[i7] = new f30(bidiCreateLineBidi.getRunStart(i7) + lineStart, bidiCreateLineBidi.getRunLimit(i7) + lineStart, bidiCreateLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) bidiCreateLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, f30VarArr, 0, runCount);
        if (i == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (f30VarArr[i9].a == i) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == f30VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iD) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(f30VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(f30VarArr[i3 + 1].a) : layout.getLineRight(iD);
        }
        int i10 = i > i4 ? i(i, lineStart) : i;
        int i11 = 0;
        while (true) {
            if (i11 >= runCount) {
                i2 = -1;
                break;
            }
            if (f30VarArr[i11].b == i10) {
                i2 = i11;
                break;
            }
            i11++;
        }
        boolean z5 = (z || z3 == f30VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iD) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(f30VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(f30VarArr[i2 + 1].b) : layout.getLineRight(iD);
    }

    public int g(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.a;
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        c10.p(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int iM = c4.m((Comparable) arrayList.get(i2), numValueOf);
            if (iM >= 0) {
                if (iM <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        int i5 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                return i6;
            }
        }
        return i5;
    }

    public int h(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.a).get(i - 1)).intValue();
    }

    public int i(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((c10.w(cCharAt, 8192) < 0 || c10.w(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void j(Object obj, String str) {
        cs csVar = b10.k;
        c10.p(str, "key");
        ((LinkedHashMap) this.b).put(str, obj);
        ab0 ab0Var = (ab0) ((LinkedHashMap) this.c).get(str);
        if (ab0Var != null) {
            ((zw0) ab0Var).h(null, obj == null ? csVar : obj);
        }
        ab0 ab0Var2 = (ab0) ((LinkedHashMap) this.d).get(str);
        if (ab0Var2 != null) {
            zw0 zw0Var = (zw0) ab0Var2;
            if (obj == null) {
                obj = csVar;
            }
            zw0Var.h(null, obj);
        }
    }

    public g30(Layout layout) {
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iR = px0.r(((Layout) this.b).getText(), '\n', length, 4);
            length = iR < 0 ? ((Layout) this.b).getText().length() : iR + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.b).getText().length());
        this.a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.a).size()];
        ((ArrayList) this.a).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public g30(q8 q8Var, c21 c21Var, List list, xn xnVar, jv jvVar) {
        String strSubstring;
        int i;
        String str;
        c21 c21Var2;
        q8 q8Var2 = q8Var;
        c21 c21Var3 = c21Var;
        this.b = q8Var2;
        this.c = list;
        final int i2 = 0;
        this.d = m20.I(new gw(this) { // from class: v90
            public final /* synthetic */ g30 e;

            {
                this.e = this;
            }

            @Override // defpackage.gw
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.e.a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((qg0) obj3).a.a();
                            int iL = ve.L(arrayList);
                            int i3 = 1;
                            if (1 <= iL) {
                                while (true) {
                                    Object obj4 = arrayList.get(i3);
                                    float fA2 = ((qg0) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i3 != iL) {
                                        i3++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        qg0 qg0Var = (qg0) obj;
                        return Float.valueOf(qg0Var != null ? qg0Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((qg0) obj5).a.i.c();
                            int iL2 = ve.L(arrayList2);
                            int i4 = 1;
                            if (1 <= iL2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float fC2 = ((qg0) obj6).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i4 != iL2) {
                                        i4++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        qg0 qg0Var2 = (qg0) obj2;
                        return Float.valueOf(qg0Var2 != null ? qg0Var2.a.i.c() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.e = m20.I(new gw(this) { // from class: v90
            public final /* synthetic */ g30 e;

            {
                this.e = this;
            }

            @Override // defpackage.gw
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.e.a;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((qg0) obj3).a.a();
                            int iL = ve.L(arrayList);
                            int i32 = 1;
                            if (1 <= iL) {
                                while (true) {
                                    Object obj4 = arrayList.get(i32);
                                    float fA2 = ((qg0) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i32 != iL) {
                                        i32++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        qg0 qg0Var = (qg0) obj;
                        return Float.valueOf(qg0Var != null ? qg0Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.a;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((qg0) obj5).a.i.c();
                            int iL2 = ve.L(arrayList2);
                            int i4 = 1;
                            if (1 <= iL2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float fC2 = ((qg0) obj6).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i4 != iL2) {
                                        i4++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        qg0 qg0Var2 = (qg0) obj2;
                        return Float.valueOf(qg0Var2 != null ? qg0Var2.a.i.c() : 0.0f);
                }
            }
        });
        tg0 tg0Var = c21Var3.b;
        q8 q8Var3 = s8.a;
        ArrayList arrayList = q8Var2.g;
        String str2 = q8Var2.e;
        ks ksVar = ks.d;
        List listC0 = arrayList != null ? ue.c0(arrayList, new bv(6)) : ksVar;
        ArrayList arrayList2 = new ArrayList();
        q9 q9Var = new q9();
        int size = listC0.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            p8 p8Var = (p8) listC0.get(i4);
            tg0 tg0VarA = tg0Var.a((tg0) p8Var.a);
            int i6 = p8Var.b;
            int i7 = p8Var.c;
            if (i6 > i7) {
                qz.a("Reversed range is not supported");
            }
            while (i5 < i6 && !q9Var.isEmpty()) {
                p8 p8Var2 = (p8) q9Var.last();
                List list2 = listC0;
                int i8 = p8Var2.c;
                ks ksVar2 = ksVar;
                Object obj = p8Var2.a;
                if (i6 < i8) {
                    arrayList2.add(new p8(i5, i6, obj));
                    i5 = i6;
                    listC0 = list2;
                    ksVar = ksVar2;
                } else {
                    int i9 = size;
                    arrayList2.add(new p8(i5, i8, obj));
                    i5 = p8Var2.c;
                    while (!q9Var.isEmpty() && i5 == ((p8) q9Var.last()).c) {
                        q9Var.removeLast();
                    }
                    listC0 = list2;
                    ksVar = ksVar2;
                    size = i9;
                }
            }
            List list3 = listC0;
            ks ksVar3 = ksVar;
            int i10 = size;
            if (i5 < i6) {
                arrayList2.add(new p8(i5, i6, tg0Var));
                i5 = i6;
            }
            p8 p8Var3 = (p8) (q9Var.isEmpty() ? null : q9Var.e[q9Var.h(ve.L(q9Var) + q9Var.d)]);
            if (p8Var3 != null) {
                int i11 = p8Var3.c;
                Object obj2 = p8Var3.a;
                int i12 = p8Var3.b;
                if (i12 == i6 && i11 == i7) {
                    q9Var.removeLast();
                    q9Var.addLast(new p8(i6, i7, ((tg0) obj2).a(tg0VarA)));
                } else if (i12 == i11) {
                    arrayList2.add(new p8(i12, i11, obj2));
                    q9Var.removeLast();
                    q9Var.addLast(new p8(i6, i7, tg0VarA));
                } else if (i11 >= i7) {
                    q9Var.addLast(new p8(i6, i7, ((tg0) obj2).a(tg0VarA)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                q9Var.addLast(new p8(i6, i7, tg0VarA));
            }
            i4++;
            listC0 = list3;
            ksVar = ksVar3;
            size = i10;
        }
        ks ksVar4 = ksVar;
        while (i5 <= str2.length() && !q9Var.isEmpty()) {
            p8 p8Var4 = (p8) q9Var.last();
            Object obj3 = p8Var4.a;
            int i13 = p8Var4.c;
            arrayList2.add(new p8(i5, i13, obj3));
            while (!q9Var.isEmpty() && i13 == ((p8) q9Var.last()).c) {
                q9Var.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str2.length()) {
            arrayList2.add(new p8(i5, str2.length(), tg0Var));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new p8(0, 0, tg0Var));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = 0;
        while (i14 < size2) {
            p8 p8Var5 = (p8) arrayList2.get(i14);
            int i15 = p8Var5.b;
            int i16 = p8Var5.c;
            if (i15 != i16) {
                strSubstring = str2.substring(i15, i16);
                c10.o(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = s8.a(q8Var2, i15, i16, new r8(0));
            q8 q8Var4 = new q8(strSubstring, listA == null ? ksVar4 : listA);
            tg0 tg0Var2 = (tg0) p8Var5.a;
            if (tg0Var2.b == Integer.MIN_VALUE) {
                i = size2;
                str = str2;
                tg0Var2 = new tg0(tg0Var2.a, tg0Var.b, tg0Var2.c, tg0Var2.d, tg0Var2.e, tg0Var2.f, tg0Var2.g, tg0Var2.h, tg0Var2.i);
            } else {
                i = size2;
                str = str2;
            }
            c21 c21Var4 = new c21(c21Var3.a, tg0Var.a(tg0Var2));
            ?? r6 = q8Var4.d;
            ks ksVar5 = r6 == 0 ? ksVar4 : r6;
            List list4 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list4.size());
            int size3 = list4.size();
            int i17 = 0;
            while (i17 < size3) {
                p8 p8Var6 = (p8) list4.get(i17);
                int i18 = p8Var6.b;
                tg0 tg0Var3 = tg0Var;
                int i19 = p8Var6.c;
                if (s8.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        qz.a("placeholder can not overlap with paragraph.");
                    }
                    c21Var2 = c21Var4;
                    arrayList4.add(new p8(i18 - i15, i19 - i15, p8Var6.a));
                } else {
                    c21Var2 = c21Var4;
                }
                i17++;
                c21Var4 = c21Var2;
                tg0Var = tg0Var3;
            }
            arrayList3.add(new qg0(new h6(strSubstring, c21Var4, ksVar5, arrayList4, jvVar, xnVar), i15, i16));
            i14++;
            q8Var2 = q8Var;
            c21Var3 = c21Var;
            str2 = str;
            size2 = i;
        }
        this.a = arrayList3;
    }
}
