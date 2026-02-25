package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hb implements l80 {
    public final sa a;
    public final boolean b;

    public hb(sa saVar, boolean z) {
        this.a = saVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return this.a.equals(hbVar.a) && this.b == hbVar.b;
    }

    @Override // defpackage.l80
    public final m80 g(n80 n80Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        ls lsVar = ls.d;
        if (zIsEmpty) {
            return n80Var.a0(gj.j(j), gj.i(j), lsVar, e3.u);
        }
        long jA = this.b ? j : gj.a(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            g80 g80Var = (g80) list.get(0);
            g80Var.l();
            oi0 oi0VarE = g80Var.e(jA);
            int iMax = Math.max(gj.j(j), oi0VarE.d);
            int iMax2 = Math.max(gj.i(j), oi0VarE.e);
            return n80Var.a0(iMax, iMax2, lsVar, new fb(oi0VarE, g80Var, n80Var, iMax, iMax2, this));
        }
        oi0[] oi0VarArr = new oi0[list.size()];
        bm0 bm0Var = new bm0();
        bm0Var.d = gj.j(j);
        bm0 bm0Var2 = new bm0();
        bm0Var2.d = gj.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g80 g80Var2 = (g80) list.get(i);
            g80Var2.l();
            oi0 oi0VarE2 = g80Var2.e(jA);
            oi0VarArr[i] = oi0VarE2;
            bm0Var.d = Math.max(bm0Var.d, oi0VarE2.d);
            bm0Var2.d = Math.max(bm0Var2.d, oi0VarE2.e);
        }
        return n80Var.a0(bm0Var.d, bm0Var2.d, lsVar, new gb(oi0VarArr, list, n80Var, bm0Var, bm0Var2, this));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
