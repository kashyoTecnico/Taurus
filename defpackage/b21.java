package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class b21 extends d90 implements l30, qq, et0 {
    public a21 A;
    public z11 B;
    public String r;
    public c21 s;
    public jv t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public Map y;
    public sg0 z;

    public final sg0 A0() {
        if (this.z == null) {
            this.z = new sg0(this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        }
        sg0 sg0Var = this.z;
        c10.m(sg0Var);
        return sg0Var;
    }

    public final sg0 B0(xn xnVar) {
        sg0 sg0Var;
        z11 z11Var = this.B;
        if (z11Var != null && z11Var.c && (sg0Var = z11Var.d) != null) {
            sg0Var.d(xnVar);
            return sg0Var;
        }
        sg0 sg0VarA0 = A0();
        sg0VarA0.d(xnVar);
        return sg0VarA0;
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        return B0(v60Var).a(i, v60Var.getLayoutDirection());
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        a21 a21Var = this.A;
        if (a21Var == null) {
            a21Var = new a21(this, 0);
            this.A = a21Var;
        }
        q8 q8Var = new q8(this.r, null, 6);
        h20[] h20VarArr = nt0.a;
        ct0Var.d(lt0.A, d80.t(q8Var));
        z11 z11Var = this.B;
        if (z11Var != null) {
            boolean z = z11Var.c;
            ot0 ot0Var = lt0.C;
            h20[] h20VarArr2 = nt0.a;
            h20 h20Var = h20VarArr2[16];
            ot0Var.a(ct0Var, Boolean.valueOf(z));
            q8 q8Var2 = new q8(z11Var.b, null, 6);
            ot0 ot0Var2 = lt0.B;
            h20 h20Var2 = h20VarArr2[15];
            ot0Var2.a(ct0Var, q8Var2);
        }
        ct0Var.d(bt0.j, new j0(null, new a21(this, 1)));
        ct0Var.d(bt0.k, new j0(null, new a21(this, 2)));
        ct0Var.d(bt0.l, new j0(null, new b(25, this)));
        nt0.a(ct0Var, a21Var);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        return mq0.e(B0(v60Var).e(v60Var.getLayoutDirection()).a());
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        if (!this.q) {
            return;
        }
        sg0 sg0VarB0 = B0(v30Var);
        d6 d6Var = sg0VarB0.j;
        if (d6Var == null) {
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.z + ", textSubstitution=" + this.B + ')').toString());
        }
        dd ddVarO = v30Var.d.e.o();
        boolean z = sg0VarB0.k;
        if (z) {
            long j = sg0VarB0.l;
            ddVarO.l();
            ddVarO.e(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            iw0 iw0Var = this.s.a;
            uz0 uz0Var = iw0Var.m;
            if (uz0Var == null) {
                uz0Var = uz0.b;
            }
            uz0 uz0Var2 = uz0Var;
            hu0 hu0Var = iw0Var.n;
            if (hu0Var == null) {
                hu0Var = hu0.d;
            }
            hu0 hu0Var2 = hu0Var;
            tq tqVar = iw0Var.p;
            if (tqVar == null) {
                tqVar = dt.a;
            }
            tq tqVar2 = tqVar;
            ac acVarB = iw0Var.a.b();
            if (acVarB != null) {
                d6Var.g(ddVarO, acVarB, this.s.a.a.c(), hu0Var2, uz0Var2, tqVar2);
            } else {
                long jB = bf.g;
                if (jB == 16) {
                    jB = this.s.b() != 16 ? this.s.b() : bf.b;
                }
                d6Var.f(ddVarO, jB, hu0Var2, uz0Var2, tqVar2);
            }
            if (z) {
                ddVarO.i();
            }
        } finally {
        }
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        long jA;
        boolean z;
        rg0 rg0Var;
        sg0 sg0VarB0 = B0(n80Var);
        e30 layoutDirection = n80Var.getLayoutDirection();
        if (sg0VarB0.g > 1) {
            x80 x80Var = sg0VarB0.m;
            c21 c21Var = sg0VarB0.b;
            xn xnVar = sg0VarB0.i;
            c10.m(xnVar);
            x80 x80VarR = nm.r(x80Var, layoutDirection, c21Var, xnVar, sg0VarB0.c);
            sg0VarB0.m = x80VarR;
            jA = x80VarR.a(j, sg0VarB0.g);
        } else {
            jA = j;
        }
        d6 d6Var = sg0VarB0.j;
        if (d6Var == null || (rg0Var = sg0VarB0.n) == null || rg0Var.b() || layoutDirection != sg0VarB0.o || (!gj.b(jA, sg0VarB0.p) && (gj.h(jA) != gj.h(sg0VarB0.p) || gj.g(jA) < d6Var.b() || d6Var.d.d))) {
            d6 d6VarB = sg0VarB0.b(jA, layoutDirection);
            sg0VarB0.p = jA;
            long jD = hj.d(jA, d80.e(mq0.e(d6VarB.d()), mq0.e(d6VarB.b())));
            sg0VarB0.l = jD;
            sg0VarB0.k = sg0VarB0.d != 3 && (((float) ((int) (jD >> 32))) < d6VarB.d() || ((float) ((int) (jD & 4294967295L))) < d6VarB.b());
            sg0VarB0.j = d6VarB;
            z = true;
        } else {
            if (!gj.b(jA, sg0VarB0.p)) {
                d6 d6Var2 = sg0VarB0.j;
                c10.m(d6Var2);
                long jD2 = hj.d(jA, d80.e(mq0.e(Math.min(d6Var2.a.i.c(), d6Var2.d())), mq0.e(d6Var2.b())));
                sg0VarB0.l = jD2;
                sg0VarB0.k = sg0VarB0.d != 3 && (((float) ((int) (jD2 >> 32))) < d6Var2.d() || ((float) ((int) (jD2 & 4294967295L))) < d6Var2.b());
                sg0VarB0.p = jA;
            }
            z = false;
        }
        rg0 rg0Var2 = sg0VarB0.n;
        if (rg0Var2 != null) {
            rg0Var2.b();
        }
        d6 d6Var3 = sg0VarB0.j;
        c10.m(d6Var3);
        m11 m11Var = d6Var3.d;
        long j2 = sg0VarB0.l;
        if (z) {
            d80.x(this, 2).V0();
            Map linkedHashMap = this.y;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(k2.a, Integer.valueOf(Math.round(m11Var.d(0))));
            linkedHashMap.put(k2.b, Integer.valueOf(Math.round(m11Var.d(m11Var.g - 1))));
            this.y = linkedHashMap;
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        oi0 oi0VarE = g80Var.e(b10.C(i, i, i2, i2));
        Map map = this.y;
        c10.m(map);
        return n80Var.a0(i, i2, map, new t6(oi0VarE, 9));
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        return mq0.e(B0(v60Var).e(v60Var.getLayoutDirection()).c());
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        return B0(v60Var).a(i, v60Var.getLayoutDirection());
    }
}
