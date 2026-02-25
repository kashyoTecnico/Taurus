package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gr0 extends d90 implements l30 {
    public tq0 r;
    public boolean s;

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        return this.s ? g80Var.b0(i) : g80Var.b0(Integer.MAX_VALUE);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        return this.s ? g80Var.S(Integer.MAX_VALUE) : g80Var.S(i);
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        boolean z = this.s;
        if0 if0Var = if0.d;
        if ((z ? if0Var : if0.e) == if0Var) {
            if (gj.g(j) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (gj.h(j) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        oi0 oi0VarE = g80Var.e(gj.a(j, 0, this.s ? gj.h(j) : Integer.MAX_VALUE, 0, this.s ? Integer.MAX_VALUE : gj.g(j), 5));
        int i = oi0VarE.d;
        int iH = gj.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = oi0VarE.e;
        int iG = gj.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = oi0VarE.e - i2;
        int i4 = oi0VarE.d - i;
        if (!this.s) {
            i3 = i4;
        }
        tq0 tq0Var = this.r;
        wg0 wg0Var = tq0Var.d;
        wg0 wg0Var2 = tq0Var.a;
        wg0Var.h(i3);
        gv0 gv0VarG = h9.g();
        iw iwVarE = gv0VarG != null ? gv0VarG.e() : null;
        gv0 gv0VarJ = h9.j(gv0VarG);
        try {
            if (wg0Var2.g() > i3) {
                wg0Var2.h(i3);
            }
            h9.l(gv0VarG, gv0VarJ, iwVarE);
            this.r.b.h(this.s ? i2 : i);
            return n80Var.a0(i, i2, ls.d, new fr0(this, i3, oi0VarE));
        } catch (Throwable th) {
            h9.l(gv0VarG, gv0VarJ, iwVarE);
            throw th;
        }
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        return this.s ? g80Var.X(Integer.MAX_VALUE) : g80Var.X(i);
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        return this.s ? g80Var.f(i) : g80Var.f(Integer.MAX_VALUE);
    }
}
