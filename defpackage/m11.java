package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m11 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public ch0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final q50[] o;
    public final Rect p = new Rect();
    public g30 q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m11(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, boolean r30, int r31, int r32, int r33, int r34, int r35, int r36, defpackage.i30 r37) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, i30):void");
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final g30 c() {
        g30 g30Var = this.q;
        if (g30Var != null) {
            return g30Var;
        }
        g30 g30Var2 = new g30(this.f);
        this.q = g30Var2;
        return g30Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        qz0 qz0Var = r11.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().f(i, false, z);
    }

    public final ch0 j() {
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            return ch0Var;
        }
        Layout layout = this.f;
        ch0 ch0Var2 = new ch0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = ch0Var2;
        return ch0Var2;
    }
}
