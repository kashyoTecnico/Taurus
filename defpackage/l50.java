package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l50 implements LineHeightSpan {
    public final float d;

    public l50(float f) {
        this.d = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.d));
    }
}
