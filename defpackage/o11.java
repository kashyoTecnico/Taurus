package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class o11 {
    public final n11 a;
    public final u90 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public o11(n11 n11Var, u90 u90Var, long j) {
        this.a = n11Var;
        this.b = u90Var;
        this.c = j;
        ArrayList arrayList = u90Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((pg0) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            pg0 pg0Var = (pg0) ue.X(arrayList);
            fD = pg0Var.a.d.d(r4.g - 1) + pg0Var.f;
        }
        this.e = fD;
        this.f = u90Var.g;
    }

    public final um0 a(int i) {
        u90 u90Var = this.b;
        ArrayList arrayList = u90Var.h;
        u90Var.j(i);
        pg0 pg0Var = (pg0) arrayList.get(i == ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : c10.F(i, arrayList));
        return pg0Var.a.d.f.isRtlCharAt(pg0Var.d(i)) ? um0.e : um0.d;
    }

    public final xl0 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        u90 u90Var = this.b;
        u90Var.i(i);
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.F(i, arrayList));
        d6 d6Var = pg0Var.a;
        int iD = pg0Var.d(i);
        CharSequence charSequence = d6Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbI = b8.i("offset(", iD, ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(')');
            qz.a(sbI.toString());
        }
        m11 m11Var = d6Var.d;
        Layout layout = m11Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = m11Var.g(lineForOffset);
        float fE = m11Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = m11Var.i(iD, false);
                fH2 = m11Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = m11Var.h(iD, false);
                fH2 = m11Var.h(iD + 1, true);
            } else {
                fI = m11Var.i(iD, false);
                fI2 = m11Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = m11Var.h(iD, false);
            fI2 = m11Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return pg0Var.a(new xl0(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final xl0 c(int i) {
        u90 u90Var = this.b;
        ArrayList arrayList = u90Var.h;
        u90Var.j(i);
        pg0 pg0Var = (pg0) arrayList.get(i == ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : c10.F(i, arrayList));
        d6 d6Var = pg0Var.a;
        int iD = pg0Var.d(i);
        CharSequence charSequence = d6Var.e;
        m11 m11Var = d6Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbI = b8.i("offset(", iD, ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(']');
            qz.a(sbI.toString());
        }
        float fH = m11Var.h(iD, false);
        int lineForOffset = m11Var.f.getLineForOffset(iD);
        return pg0Var.a(new xl0(fH, m11Var.g(lineForOffset), fH, m11Var.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        u90 u90Var = this.b;
        return f < u90Var.d || u90Var.c || ((float) ((int) (j & 4294967295L))) < u90Var.e;
    }

    public final int e(int i, boolean z) {
        int iF;
        u90 u90Var = this.b;
        u90Var.k(i);
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        int i2 = i - pg0Var.d;
        m11 m11Var = d6Var.d;
        if (z) {
            Layout layout = m11Var.f;
            qz0 qz0Var = r11.a;
            if (layout.getEllipsisCount(i2) <= 0 || m11Var.b != TextUtils.TruncateAt.END) {
                g30 g30VarC = m11Var.c();
                Layout layout2 = (Layout) g30VarC.b;
                iF = g30VarC.i(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = m11Var.f(i2);
        }
        return iF + pg0Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11Var = (o11) obj;
        return c10.i(this.a, o11Var.a) && this.b.equals(o11Var.b) && t00.a(this.c, o11Var.c) && this.d == o11Var.d && this.e == o11Var.e && c10.i(this.f, o11Var.f);
    }

    public final int f(int i) {
        u90 u90Var = this.b;
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(i >= ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : i < 0 ? 0 : c10.F(i, arrayList));
        return pg0Var.a.d.f.getLineForOffset(pg0Var.d(i)) + pg0Var.d;
    }

    public final float g(int i) {
        u90 u90Var = this.b;
        u90Var.k(i);
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        int i2 = i - pg0Var.d;
        m11 m11Var = d6Var.d;
        return m11Var.f.getLineLeft(i2) + (i2 == m11Var.g + (-1) ? m11Var.j : 0.0f);
    }

    public final float h(int i) {
        u90 u90Var = this.b;
        u90Var.k(i);
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        int i2 = i - pg0Var.d;
        m11 m11Var = d6Var.d;
        return m11Var.f.getLineRight(i2) + (i2 == m11Var.g + (-1) ? m11Var.k : 0.0f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b8.b(this.e, b8.b(this.d, b8.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final int i(int i) {
        u90 u90Var = this.b;
        u90Var.k(i);
        ArrayList arrayList = u90Var.h;
        pg0 pg0Var = (pg0) arrayList.get(c10.G(i, arrayList));
        d6 d6Var = pg0Var.a;
        return d6Var.d.f.getLineStart(i - pg0Var.d) + pg0Var.b;
    }

    public final um0 j(int i) {
        u90 u90Var = this.b;
        ArrayList arrayList = u90Var.h;
        u90Var.j(i);
        pg0 pg0Var = (pg0) arrayList.get(i == ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : c10.F(i, arrayList));
        d6 d6Var = pg0Var.a;
        int iD = pg0Var.d(i);
        m11 m11Var = d6Var.d;
        return m11Var.f.getParagraphDirection(m11Var.f.getLineForOffset(iD)) == 1 ? um0.d : um0.e;
    }

    public final i6 k(final int i, final int i2) {
        u90 u90Var = this.b;
        q8 q8Var = (q8) u90Var.a.b;
        if (i < 0 || i > i2 || i2 > q8Var.e.length()) {
            qz.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + q8Var.e.length() + "), or start > end!");
        }
        if (i == i2) {
            return k6.a();
        }
        final i6 i6VarA = k6.a();
        c10.I(u90Var.h, no0.a(i, i2), new iw() { // from class: t90
            @Override // defpackage.iw
            public final Object g(Object obj) {
                pg0 pg0Var = (pg0) obj;
                d6 d6Var = pg0Var.a;
                int iD = pg0Var.d(i);
                int iD2 = pg0Var.d(i2);
                CharSequence charSequence = d6Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    qz.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                m11 m11Var = d6Var.d;
                m11Var.f.getSelectionPath(iD, iD2, path);
                int i3 = m11Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                float f = pg0Var.f;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i4 = (int) 0;
                i6VarA.a.addPath(path, Float.intBitsToFloat(i4), Float.intBitsToFloat(i4));
                return j41.a;
            }
        });
        return i6VarA;
    }

    public final long l(int i) {
        int iJ;
        int i2;
        int i3;
        u90 u90Var = this.b;
        ArrayList arrayList = u90Var.h;
        u90Var.j(i);
        pg0 pg0Var = (pg0) arrayList.get(i == ((q8) u90Var.a.b).e.length() ? ve.L(arrayList) : c10.F(i, arrayList));
        d6 d6Var = pg0Var.a;
        int iD = pg0Var.d(i);
        ch0 ch0VarJ = d6Var.d.j();
        if (ch0VarJ.h(ch0VarJ.j(iD))) {
            ch0VarJ.a(iD);
            iJ = iD;
            while (iJ != -1 && (!ch0VarJ.h(iJ) || ch0VarJ.d(iJ))) {
                iJ = ch0VarJ.j(iJ);
            }
        } else {
            ch0VarJ.a(iD);
            iJ = ch0VarJ.g(iD) ? (!ch0VarJ.e(iD) || ch0VarJ.c(iD)) ? ch0VarJ.j(iD) : iD : ch0VarJ.c(iD) ? ch0VarJ.j(iD) : -1;
        }
        if (iJ == -1) {
            iJ = iD;
        }
        if (ch0VarJ.d(ch0VarJ.i(iD))) {
            ch0VarJ.a(iD);
            i2 = iD;
            while (i2 != -1 && (ch0VarJ.h(i2) || !ch0VarJ.d(i2))) {
                i2 = ch0VarJ.i(i2);
            }
        } else {
            ch0VarJ.a(iD);
            if (ch0VarJ.c(iD)) {
                if (!ch0VarJ.e(iD) || ch0VarJ.g(iD)) {
                    i3 = ch0VarJ.i(iD);
                    i2 = i3;
                } else {
                    i2 = iD;
                }
            } else if (ch0VarJ.g(iD)) {
                i3 = ch0VarJ.i(iD);
                i2 = i3;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            iD = i2;
        }
        return pg0Var.b(no0.a(iJ, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) t00.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
