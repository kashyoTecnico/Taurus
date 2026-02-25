package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class px0 extends ox0 {
    public static boolean o(CharSequence charSequence, char c) {
        c10.p(charSequence, "<this>");
        return r(charSequence, c, 0, 2) >= 0;
    }

    public static final int p(CharSequence charSequence) {
        c10.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int q(CharSequence charSequence, String str, int i, boolean z) {
        c10.p(charSequence, "<this>");
        c10.p(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        p00 p00Var = new p00(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = p00Var.f;
        int i3 = p00Var.e;
        int i4 = p00Var.d;
        if (!z2 || str == null) {
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            while (!v(str, charSequence, i4, str.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
            }
        } else {
            if ((i2 <= 0 || i4 > i3) && (i2 >= 0 || i3 > i4)) {
                return -1;
            }
            while (!u(str, (String) charSequence, i4, str.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
            }
        }
        return i4;
    }

    public static int r(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c10.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iP = p(charSequence);
        if (i > iP) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == iP) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int s(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return q(charSequence, str, i, false);
    }

    public static boolean t(String str) {
        c10.p(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (!b10.P(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean u(String str, String str2, int i, int i2, boolean z) {
        c10.p(str, "<this>");
        c10.p(str2, "other");
        return !z ? str.regionMatches(0, str2, i, i2) : str.regionMatches(z, 0, str2, i, i2);
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        c10.p(charSequence, "<this>");
        c10.p(charSequence2, "other");
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence2.charAt(i + i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String w() {
        char cCharAt = "H".charAt(0);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = cCharAt;
        }
        return new String(cArr);
    }

    public static String x(String str, String str2) {
        c10.p(str2, "delimiter");
        int iS = s(str, str2, 0, 6);
        if (iS == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iS, str.length());
        c10.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y(String str) {
        c10.p(str, "<this>");
        c10.p(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, p(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        c10.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence z(String str) {
        c10.p(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zP = b10.P(str.charAt(!z ? i : length));
            if (z) {
                if (!zP) {
                    break;
                }
                length--;
            } else if (zP) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
