package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uq extends CharacterStyle implements UpdateAppearance {
    public final tq d;

    public uq(tq tqVar) {
        this.d = tqVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            dt dtVar = dt.a;
            tq tqVar = this.d;
            if (c10.i(tqVar, dtVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(tqVar instanceof qx0)) {
                throw new fg();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            qx0 qx0Var = (qx0) tqVar;
            textPaint.setStrokeWidth(qx0Var.a);
            textPaint.setStrokeMiter(qx0Var.b);
            int i = qx0Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = qx0Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
