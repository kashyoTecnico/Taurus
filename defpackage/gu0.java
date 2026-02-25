package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gu0 extends CharacterStyle implements UpdateAppearance {
    public final float d;
    public final zg0 e = qo0.n(new yu0(9205357640488583168L));
    public final fo f = qo0.g(new g7(4, this));

    public gu0(bc bcVar, float f) {
        this.d = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        d80.D(textPaint, this.d);
        textPaint.setShader((Shader) this.f.getValue());
    }
}
