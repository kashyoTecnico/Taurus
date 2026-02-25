package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u90 {
    public final g30 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public u90(g30 g30Var, long j, int i, boolean z) {
        int i2;
        int iG;
        boolean z2 = true;
        int i3 = z ? 2 : 1;
        this.a = g30Var;
        this.b = i;
        if (gj.j(j) != 0 || gj.i(j) != 0) {
            qz.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) g30Var.a;
        int size = arrayList2.size();
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            qg0 qg0Var = (qg0) arrayList2.get(i4);
            h6 h6Var = qg0Var.a;
            int iH = gj.h(j);
            if (gj.c(j)) {
                iG = gj.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                iG = gj.g(j);
            }
            d6 d6Var = new d6(h6Var, this.b - i5, i3, hj.b(iH, iG, 5));
            float fB = d6Var.b() + f;
            m11 m11Var = d6Var.d;
            int i6 = i5 + m11Var.g;
            int i7 = qg0Var.b;
            int i8 = qg0Var.c;
            int i9 = i4;
            pg0 pg0Var = new pg0(d6Var, i7, i8, i5, i6, f, fB);
            i2 = i6;
            arrayList.add(pg0Var);
            if (m11Var.d || (i2 == this.b && i9 != ve.L((ArrayList) this.a.a))) {
                f = fB;
                break;
            } else {
                i4 = i9 + 1;
                i5 = i2;
                f = fB;
            }
        }
        z2 = false;
        i2 = i5;
        this.e = f;
        this.f = i2;
        this.c = z2;
        this.h = arrayList;
        this.d = gj.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            pg0 pg0Var2 = (pg0) arrayList.get(i10);
            ?? r7 = pg0Var2.a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i11 = 0; i11 < size3; i11++) {
                xl0 xl0Var = (xl0) r7.get(i11);
                arrayList4.add(xl0Var != null ? pg0Var2.a(xl0Var) : null);
            }
            af.Q(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = 0; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = ue.a0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void g(u90 u90Var, dd ddVar, long j, hu0 hu0Var, uz0 uz0Var, tq tqVar) {
        ddVar.l();
        ArrayList arrayList = u90Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pg0 pg0Var = (pg0) arrayList.get(i);
            pg0Var.a.f(ddVar, j, hu0Var, uz0Var, tqVar);
            ddVar.f(0.0f, pg0Var.a.b());
        }
        ddVar.i();
    }

    public static void h(u90 u90Var, dd ddVar, ac acVar, float f, hu0 hu0Var, uz0 uz0Var, tq tqVar) {
        ddVar.l();
        ArrayList arrayList = u90Var.h;
        if (arrayList.size() <= 1 || (acVar instanceof fw0)) {
            b10.A(u90Var, ddVar, acVar, f, hu0Var, uz0Var, tqVar);
            ddVar.i();
            return;
        }
        if (!(acVar instanceof bc)) {
            throw new fg();
        }
        int size = arrayList.size();
        float fMax = 0.0f;
        float fB = 0.0f;
        for (int i = 0; i < size; i++) {
            pg0 pg0Var = (pg0) arrayList.get(i);
            fB += pg0Var.a.b();
            fMax = Math.max(fMax, pg0Var.a.d());
        }
        Float.floatToRawIntBits(fMax);
        Float.floatToRawIntBits(fB);
        throw null;
    }

    public final void a(final long j, final float[] fArr) {
        i(w11.e(j));
        j(w11.d(j));
        final bm0 bm0Var = new bm0();
        bm0Var.d = 0;
        final am0 am0Var = new am0();
        c10.I(this.h, j, new iw() { // from class: s90
            @Override // defpackage.iw
            public final Object g(Object obj) {
                long j2;
                d6 d6Var;
                boolean z;
                float fA;
                float fA2;
                pg0 pg0Var = (pg0) obj;
                int i = pg0Var.b;
                d6 d6Var2 = pg0Var.a;
                int iD = pg0Var.c;
                long j3 = j;
                int iE = i > w11.e(j3) ? pg0Var.b : w11.e(j3);
                if (iD >= w11.d(j3)) {
                    iD = w11.d(j3);
                }
                long jA = no0.a(pg0Var.d(iE), pg0Var.d(iD));
                bm0 bm0Var2 = bm0Var;
                int i2 = bm0Var2.d;
                m11 m11Var = d6Var2.d;
                int iE2 = w11.e(jA);
                int iD2 = w11.d(jA);
                Layout layout = m11Var.f;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    qz.a("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    qz.a("startOffset must be less than text length");
                }
                if (iD2 <= iE2) {
                    qz.a("endOffset must be greater than startOffset");
                }
                if (iD2 > length) {
                    qz.a("endOffset must be smaller or equal to text length");
                }
                int i3 = (iD2 - iE2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i2 < i3) {
                    qz.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD2 - 1);
                jy jyVar = new jy(m11Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF = m11Var.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD2, iF);
                        float fG = m11Var.g(lineForOffset);
                        float fE = m11Var.e(lineForOffset);
                        j2 = jA;
                        d6Var = d6Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = jyVar.a(iMax, false, false, false);
                                    z = z3;
                                    fA = jyVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = jyVar.a(iMax, false, false, false);
                                        fA2 = jyVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = jyVar.a(iMax, false, false, true);
                                        fA = jyVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr2[i2] = fA;
                                fArr2[i2 + 1] = fG;
                                fArr2[i2 + 2] = fA2;
                                fArr2[i2 + 3] = fE;
                                i2 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = jyVar.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = jyVar.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr2[i2] = fA;
                            fArr2[i2 + 1] = fG;
                            fArr2[i2 + 2] = fA2;
                            fArr2[i2 + 3] = fE;
                            i2 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        d6Var2 = d6Var;
                        jA = j2;
                    }
                } else {
                    j2 = jA;
                    d6Var = d6Var2;
                }
                int iC = (w11.c(j2) * 4) + bm0Var2.d;
                int i4 = bm0Var2.d;
                while (true) {
                    am0 am0Var2 = am0Var;
                    if (i4 >= iC) {
                        bm0Var2.d = iC;
                        am0Var2.d = d6Var.b() + am0Var2.d;
                        return j41.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = am0Var2.d;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        k(i);
        ArrayList arrayList = this.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        return d6Var.d.e(i - pg0Var.d) + pg0Var.f;
    }

    public final int c(float f) {
        ArrayList arrayList = this.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.H(arrayList, f));
        int i = pg0Var.c - pg0Var.b;
        int i2 = pg0Var.d;
        if (i == 0) {
            return i2;
        }
        d6 d6Var = pg0Var.a;
        float f2 = f - pg0Var.f;
        m11 m11Var = d6Var.d;
        return m11Var.f.getLineForVertical(((int) f2) - m11Var.h) + i2;
    }

    public final float d(int i) {
        k(i);
        ArrayList arrayList = this.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        return d6Var.d.g(i - pg0Var.d) + pg0Var.f;
    }

    public final int e(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.H(arrayList, fIntBitsToFloat));
        int i2 = pg0Var.c;
        int i3 = pg0Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        d6 d6Var = pg0Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - pg0Var.f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
        m11 m11Var = d6Var.d;
        int lineForVertical = m11Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - m11Var.h);
        return m11Var.f.getOffsetForHorizontal(lineForVertical, (m11Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long f(xl0 xl0Var, int i, of ofVar) {
        long jB;
        long j;
        float f = xl0Var.b;
        ArrayList arrayList = this.h;
        int iH = c10.H(arrayList, f);
        float f2 = ((pg0) arrayList.get(iH)).g;
        float f3 = xl0Var.d;
        if (f2 >= f3 || iH == ve.L(arrayList)) {
            pg0 pg0Var = (pg0) arrayList.get(iH);
            return pg0Var.b(pg0Var.a.c(pg0Var.c(xl0Var), i, ofVar), true);
        }
        int iH2 = c10.H(arrayList, f3);
        long jB2 = w11.b;
        while (true) {
            jB = w11.b;
            if (!w11.a(jB2, jB) || iH > iH2) {
                break;
            }
            pg0 pg0Var2 = (pg0) arrayList.get(iH);
            jB2 = pg0Var2.b(pg0Var2.a.c(pg0Var2.c(xl0Var), i, ofVar), true);
            iH++;
        }
        if (w11.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = w11.b;
            if (!w11.a(jB, j) || iH > iH2) {
                break;
            }
            pg0 pg0Var3 = (pg0) arrayList.get(iH2);
            jB = pg0Var3.b(pg0Var3.a.c(pg0Var3.c(xl0Var), i, ofVar), true);
            iH2--;
        }
        return w11.a(jB, j) ? jB2 : no0.a((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(int i) {
        boolean z = false;
        g30 g30Var = this.a;
        if (i >= 0 && i < ((q8) g30Var.b).e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbI = b8.i("offset(", i, ") is out of bounds [0, ");
        sbI.append(((q8) g30Var.b).e.length());
        sbI.append(')');
        qz.a(sbI.toString());
    }

    public final void j(int i) {
        boolean z = false;
        g30 g30Var = this.a;
        if (i >= 0 && i <= ((q8) g30Var.b).e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbI = b8.i("offset(", i, ") is out of bounds [0, ");
        sbI.append(((q8) g30Var.b).e.length());
        sbI.append(']');
        qz.a(sbI.toString());
    }

    public final void k(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        qz.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
