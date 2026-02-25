package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ch0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public CharSequence d;
    public Object e;

    public /* synthetic */ ch0() {
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        qz.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public int b() {
        tw twVar = (tw) this.e;
        if (twVar == null) {
            return ((String) this.d).length();
        }
        return (twVar.b - twVar.a()) + (((String) this.d).length() - (this.c - this.b));
    }

    public boolean c(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!tr.d()) {
                    return false;
                }
                tr trVarA = tr.a();
                if (trVarA.c() != 1 || trVarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return dp0.g(Character.codePointBefore(this.d, i));
    }

    public boolean e(int i) {
        a(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.d.length() - 1 || !(f(i) || f(i + 1));
    }

    public boolean f(int i) {
        CharSequence charSequence = this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (c10.i(unicodeBlockOf, unicodeBlock) && c10.i(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return c10.i(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && c10.i(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!tr.d()) {
                return false;
            }
            tr trVarA = tr.a();
            if (trVarA.c() != 1 || trVarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return dp0.g(Character.codePointAt(this.d, i));
    }

    public int i(int i) {
        a(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (g(iFollowing + (-1)) && g(iFollowing) && !f(iFollowing)) ? i(iFollowing) : iFollowing;
    }

    public int j(int i) {
        a(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (g(iPreceding) && c(iPreceding) && !f(iPreceding)) ? j(iPreceding) : iPreceding;
    }

    public void k(int i, int i2, String str) {
        if (i > i2) {
            qz.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            qz.a("start must be non-negative, but was " + i);
        }
        tw twVar = (tw) this.e;
        if (twVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            c10.n(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            c10.n(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            tw twVar2 = new tw();
            twVar2.b = iMax;
            twVar2.e = cArr;
            twVar2.c = length;
            twVar2.d = i4;
            this.e = twVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > twVar.b - twVar.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            k(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > twVar.a()) {
            int iA = length2 - twVar.a();
            int i9 = twVar.b;
            do {
                i9 *= 2;
            } while (i9 - twVar.b < iA);
            char[] cArr2 = new char[i9];
            y9.o0((char[]) twVar.e, cArr2, 0, 0, twVar.c);
            int i10 = twVar.b;
            int i11 = twVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            y9.o0((char[]) twVar.e, cArr2, i13, i11, i12 + i11);
            twVar.e = cArr2;
            twVar.b = i9;
            twVar.d = i13;
        }
        int i14 = twVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) twVar.e;
            y9.o0(cArr3, cArr3, twVar.d - i15, i8, i14);
            twVar.c = i7;
            twVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = twVar.a() + i7;
            int iA3 = twVar.a() + i8;
            int i16 = twVar.d;
            char[] cArr4 = (char[]) twVar.e;
            y9.o0(cArr4, cArr4, twVar.c, i16, iA2);
            twVar.c += iA2 - i16;
            twVar.d = iA3;
        } else {
            twVar.d = twVar.a() + i8;
            twVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) twVar.e, twVar.c);
        twVar.c = str.length() + twVar.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                tw twVar = (tw) this.e;
                if (twVar == null) {
                    return (String) this.d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.d, 0, this.b);
                sb.append((char[]) twVar.e, 0, twVar.c);
                char[] cArr = (char[]) twVar.e;
                int i = twVar.d;
                sb.append(cArr, i, twVar.b - i);
                String str = (String) this.d;
                sb.append((CharSequence) str, this.c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ch0(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            qz.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            qz.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new wd(charSequence, i));
    }
}
