package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class my implements j30 {
    public final s01 a;
    public final int b;
    public final y21 c;
    public final gw d;

    public my(s01 s01Var, int i, y21 y21Var, gw gwVar) {
        this.a = s01Var;
        this.b = i;
        this.c = y21Var;
        this.d = gwVar;
    }

    @Override // defpackage.j30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        long j2;
        if (g80Var.X(gj.g(j)) < gj.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = gj.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        oi0 oi0VarE = g80Var.e(j);
        int iMin = Math.min(oi0VarE.d, gj.h(j2));
        return n80Var.a0(iMin, oi0VarE.e, ls.d, new x1(n80Var, this, oi0VarE, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my)) {
            return false;
        }
        my myVar = (my) obj;
        return c10.i(this.a, myVar.a) && this.b == myVar.b && c10.i(this.c, myVar.c) && c10.i(this.d, myVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + b8.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
