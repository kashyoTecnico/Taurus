package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tf implements l80, io0 {
    public final m9 a;
    public final qa b;

    public tf(m9 m9Var, qa qaVar) {
        this.a = m9Var;
        this.b = qaVar;
    }

    @Override // defpackage.io0
    public final m80 a(oi0[] oi0VarArr, n80 n80Var, int[] iArr, int i, int i2) {
        return n80Var.a0(i2, i, ls.d, new sf(oi0VarArr, this, i2, n80Var, iArr));
    }

    @Override // defpackage.l80
    public final int b(x00 x00Var, List list, int i) {
        int iN = x00Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            g80 g80Var = (g80) list.get(i3);
            float fG = r31.G(r31.F(g80Var));
            int iF = g80Var.f(i);
            if (fG == 0.0f) {
                i2 += iF;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iF / fG));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.io0
    public final void c(int i, n80 n80Var, int[] iArr, int[] iArr2) {
        this.a.b(i, n80Var, iArr, iArr2);
    }

    @Override // defpackage.l80
    public final int d(x00 x00Var, List list, int i) {
        int iN = x00Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            g80 g80Var = (g80) list.get(i2);
            float fG = r31.G(r31.F(g80Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(g80Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, g80Var.X(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g80 g80Var2 = (g80) list.get(i3);
            float fG2 = r31.G(r31.F(g80Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, g80Var2.X(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.io0
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? hj.a(0, i3, i, i2) : b10.B(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return c10.i(this.a, tfVar.a) && this.b.equals(tfVar.b);
    }

    @Override // defpackage.io0
    public final int f(oi0 oi0Var) {
        return oi0Var.d;
    }

    @Override // defpackage.l80
    public final m80 g(n80 n80Var, List list, long j) {
        return l81.N(this, gj.i(j), gj.j(j), gj.g(j), gj.h(j), n80Var.N(this.a.a()), n80Var, list, new oi0[list.size()], list.size());
    }

    @Override // defpackage.l80
    public final int h(x00 x00Var, List list, int i) {
        int iN = x00Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            g80 g80Var = (g80) list.get(i3);
            float fG = r31.G(r31.F(g80Var));
            int iB0 = g80Var.b0(i);
            if (fG == 0.0f) {
                i2 += iB0;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iB0 / fG));
            }
        }
        return ((list.size() - 1) * iN) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.io0
    public final int i(oi0 oi0Var) {
        return oi0Var.e;
    }

    @Override // defpackage.l80
    public final int j(x00 x00Var, List list, int i) {
        int iN = x00Var.N(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            g80 g80Var = (g80) list.get(i2);
            float fG = r31.G(r31.F(g80Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(g80Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, g80Var.S(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g80 g80Var2 = (g80) list.get(i3);
            float fG2 = r31.G(r31.F(g80Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, g80Var2.S(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
