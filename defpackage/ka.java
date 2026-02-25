package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ka extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final float e;

    public /* synthetic */ ka(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.e);
                break;
        }
    }
}
