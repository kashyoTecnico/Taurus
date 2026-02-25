package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l41 implements Spannable {
    public boolean d = false;
    public Spannable e;

    public l41(Spannable spannable) {
        this.e = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.e.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.e.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.e;
        if (!this.d && (spannable instanceof PrecomputedText)) {
            this.e = new SpannableString(spannable);
        }
        this.d = true;
        this.e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.e;
        if (!this.d && (spannable instanceof PrecomputedText)) {
            this.e = new SpannableString(spannable);
        }
        this.d = true;
        this.e.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e.toString();
    }
}
