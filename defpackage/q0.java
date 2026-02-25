package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q0 extends o0 {
    public static q0 e;
    public static final um0 f = um0.e;
    public static final um0 g = um0.d;
    public o11 c;
    public gt0 d;

    @Override // defpackage.o0
    public final int[] a(int i) {
        int iC;
        if (c().length() <= 0 || i >= c().length()) {
            return null;
        }
        try {
            gt0 gt0Var = this.d;
            if (gt0Var == null) {
                c10.Y("node");
                throw null;
            }
            xl0 xl0VarG = gt0Var.g();
            int iRound = Math.round(xl0VarG.d - xl0VarG.b);
            if (i <= 0) {
                i = 0;
            }
            o11 o11Var = this.c;
            if (o11Var == null) {
                c10.Y("layoutResult");
                throw null;
            }
            int iF = o11Var.f(i);
            o11 o11Var2 = this.c;
            if (o11Var2 == null) {
                c10.Y("layoutResult");
                throw null;
            }
            float fD = o11Var2.b.d(iF) + iRound;
            o11 o11Var3 = this.c;
            if (o11Var3 == null) {
                c10.Y("layoutResult");
                throw null;
            }
            if (o11Var3 == null) {
                c10.Y("layoutResult");
                throw null;
            }
            if (fD < o11Var3.b.d(r0.f - 1)) {
                o11 o11Var4 = this.c;
                if (o11Var4 == null) {
                    c10.Y("layoutResult");
                    throw null;
                }
                iC = o11Var4.b.c(fD);
            } else {
                o11 o11Var5 = this.c;
                if (o11Var5 == null) {
                    c10.Y("layoutResult");
                    throw null;
                }
                iC = o11Var5.b.f;
            }
            return b(i, e(iC - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.o0
    public final int[] d(int i) {
        int iC;
        if (c().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            gt0 gt0Var = this.d;
            if (gt0Var == null) {
                c10.Y("node");
                throw null;
            }
            xl0 xl0VarG = gt0Var.g();
            int iRound = Math.round(xl0VarG.d - xl0VarG.b);
            int length = c().length();
            if (length <= i) {
                i = length;
            }
            o11 o11Var = this.c;
            if (o11Var == null) {
                c10.Y("layoutResult");
                throw null;
            }
            int iF = o11Var.f(i);
            o11 o11Var2 = this.c;
            if (o11Var2 == null) {
                c10.Y("layoutResult");
                throw null;
            }
            float fD = o11Var2.b.d(iF) - iRound;
            if (fD > 0.0f) {
                o11 o11Var3 = this.c;
                if (o11Var3 == null) {
                    c10.Y("layoutResult");
                    throw null;
                }
                iC = o11Var3.b.c(fD);
            } else {
                iC = 0;
            }
            if (i == c().length() && iC < iF) {
                iC++;
            }
            return b(e(iC, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i, um0 um0Var) {
        o11 o11Var = this.c;
        if (o11Var == null) {
            c10.Y("layoutResult");
            throw null;
        }
        int i2 = o11Var.i(i);
        o11 o11Var2 = this.c;
        if (o11Var2 == null) {
            c10.Y("layoutResult");
            throw null;
        }
        if (um0Var != o11Var2.j(i2)) {
            o11 o11Var3 = this.c;
            if (o11Var3 != null) {
                return o11Var3.i(i);
            }
            c10.Y("layoutResult");
            throw null;
        }
        if (this.c != null) {
            return r4.e(i, false) - 1;
        }
        c10.Y("layoutResult");
        throw null;
    }
}
