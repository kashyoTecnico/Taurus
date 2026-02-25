package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p11 {
    public final o11 a;
    public d30 b = null;
    public d30 c;

    public p11(o11 o11Var, d30 d30Var) {
        this.a = o11Var;
        this.c = d30Var;
    }

    public final long a(long j) {
        xl0 xl0VarP;
        d30 d30Var = this.b;
        xl0 xl0Var = xl0.e;
        if (d30Var != null) {
            if (d30Var.H()) {
                d30 d30Var2 = this.c;
                xl0VarP = d30Var2 != null ? d30Var2.P(d30Var, true) : null;
            } else {
                xl0VarP = xl0Var;
            }
            if (xl0VarP != null) {
                xl0Var = xl0VarP;
            }
        }
        float fD = ed0.d(j);
        float fD2 = xl0Var.a;
        if (fD >= fD2) {
            float fD3 = ed0.d(j);
            fD2 = xl0Var.c;
            if (fD3 <= fD2) {
                fD2 = ed0.d(j);
            }
        }
        float fE = ed0.e(j);
        float fE2 = xl0Var.b;
        if (fE >= fE2) {
            float fE3 = ed0.e(j);
            fE2 = xl0Var.d;
            if (fE3 <= fE2) {
                fE2 = ed0.e(j);
            }
        }
        return nm.f(fD2, fE2);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.e(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fE = ed0.e(jD);
        o11 o11Var = this.a;
        int iC = o11Var.b.c(fE);
        return ed0.d(jD) >= o11Var.g(iC) && ed0.d(jD) <= o11Var.h(iC);
    }

    public final long d(long j) {
        d30 d30Var;
        d30 d30Var2 = this.b;
        if (d30Var2 != null) {
            if (!d30Var2.H()) {
                d30Var2 = null;
            }
            if (d30Var2 != null && (d30Var = this.c) != null) {
                d30 d30Var3 = d30Var.H() ? d30Var : null;
                if (d30Var3 != null) {
                    return d30Var2.v(d30Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        d30 d30Var;
        d30 d30Var2 = this.b;
        if (d30Var2 != null) {
            if (!d30Var2.H()) {
                d30Var2 = null;
            }
            if (d30Var2 != null && (d30Var = this.c) != null) {
                d30 d30Var3 = d30Var.H() ? d30Var : null;
                if (d30Var3 != null) {
                    return d30Var3.v(d30Var2, j);
                }
            }
        }
        return j;
    }
}
