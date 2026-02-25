package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u51 implements j30 {
    public final s01 a;
    public final int b;
    public final y21 c;
    public final gw d;

    public u51(s01 s01Var, int i, y21 y21Var, gw gwVar) {
        this.a = s01Var;
        this.b = i;
        this.c = y21Var;
        this.d = gwVar;
    }

    @Override // defpackage.j30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        oi0 oi0VarE = g80Var.e(gj.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(oi0VarE.e, gj.g(j));
        return n80Var.a0(oi0VarE.d, iMin, ls.d, new x1(n80Var, this, oi0VarE, iMin, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u51)) {
            return false;
        }
        u51 u51Var = (u51) obj;
        return c10.i(this.a, u51Var.a) && this.b == u51Var.b && c10.i(this.c, u51Var.c) && c10.i(this.d, u51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + b8.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
