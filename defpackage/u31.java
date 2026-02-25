package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class u31 {
    public static final kc0 a;
    public static Paint b;

    static {
        n2.b("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            a = new v31();
        } else {
            a = new kc0();
        }
        new r1(13);
        b = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, bw[] bwVarArr) {
        n2.b("TypefaceCompat.createFromFontInfo");
        try {
            kc0 kc0Var = a;
            kc0Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyO = kc0Var.o(bwVarArr, context.getContentResolver());
                if (fontFamilyO != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyO).setStyle(kc0.n(fontFamilyO).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    public static Font b(Typeface typeface) {
        if (b == null) {
            b = new Paint();
        }
        b.setTextSize(10.0f);
        b.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, b);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
