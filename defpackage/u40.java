package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u40 extends MetricAffectingSpan {
    public final float d;

    public u40(float f) {
        this.d = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.d);
    }
}
