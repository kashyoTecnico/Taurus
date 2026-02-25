package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p0 extends o0 {
    public static p0 e;
    public static p0 f;
    public static p0 g;
    public static final um0 h = um0.e;
    public static final um0 i = um0.d;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ p0(int i2) {
        this.c = i2;
    }

    @Override // defpackage.o0
    public final int[] a(int i2) {
        int iF;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (breakIterator2 == null) {
                            c10.Y("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i2, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.d;
                    if (breakIterator4 == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    i2 = breakIterator4.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.d;
                if (breakIterator5 == null) {
                    c10.Y("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i2);
                if (iFollowing2 == -1 || !g(iFollowing2)) {
                    return null;
                }
                return b(i2, iFollowing2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                um0 um0Var = h;
                if (i2 < 0) {
                    o11 o11Var = (o11) this.d;
                    if (o11Var == null) {
                        c10.Y("layoutResult");
                        throw null;
                    }
                    iF = o11Var.f(0);
                } else {
                    o11 o11Var2 = (o11) this.d;
                    if (o11Var2 == null) {
                        c10.Y("layoutResult");
                        throw null;
                    }
                    int iF2 = o11Var2.f(i2);
                    iF = e(iF2, um0Var) == i2 ? iF2 : iF2 + 1;
                }
                o11 o11Var3 = (o11) this.d;
                if (o11Var3 == null) {
                    c10.Y("layoutResult");
                    throw null;
                }
                if (iF >= o11Var3.b.f) {
                    return null;
                }
                return b(e(iF, um0Var), e(iF, i) + 1);
        }
    }

    @Override // defpackage.o0
    public final int[] d(int i2) {
        int iF;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (breakIterator2 == null) {
                            c10.Y("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i2);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.d;
                    if (breakIterator4 == null) {
                        c10.Y("impl");
                        throw null;
                    }
                    i2 = breakIterator4.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.d;
                if (breakIterator5 == null) {
                    c10.Y("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i2);
                if (iPreceding2 == -1 || !h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !h(iPreceding2 - 1)) {
                    return b(iPreceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                um0 um0Var = i;
                if (i2 > length3) {
                    o11 o11Var = (o11) this.d;
                    if (o11Var == null) {
                        c10.Y("layoutResult");
                        throw null;
                    }
                    iF = o11Var.f(c().length());
                } else {
                    o11 o11Var2 = (o11) this.d;
                    if (o11Var2 == null) {
                        c10.Y("layoutResult");
                        throw null;
                    }
                    int iF2 = o11Var2.f(i2);
                    iF = e(iF2, um0Var) + 1 == i2 ? iF2 : iF2 - 1;
                }
                if (iF < 0) {
                    return null;
                }
                return b(e(iF, h), e(iF, um0Var) + 1);
        }
    }

    public int e(int i2, um0 um0Var) {
        o11 o11Var = (o11) this.d;
        if (o11Var == null) {
            c10.Y("layoutResult");
            throw null;
        }
        int i3 = o11Var.i(i2);
        o11 o11Var2 = (o11) this.d;
        if (o11Var2 == null) {
            c10.Y("layoutResult");
            throw null;
        }
        if (um0Var != o11Var2.j(i3)) {
            o11 o11Var3 = (o11) this.d;
            if (o11Var3 != null) {
                return o11Var3.i(i2);
            }
            c10.Y("layoutResult");
            throw null;
        }
        if (((o11) this.d) != null) {
            return r4.e(i2, false) - 1;
        }
        c10.Y("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    c10.Y("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    c10.Y("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 <= 0 || !h(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !h(i2);
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
