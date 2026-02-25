package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mv extends MetricAffectingSpan {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ mv(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.e);
                break;
        }
    }
}
