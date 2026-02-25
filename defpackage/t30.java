package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t30 implements kh, fg0, sh {
    public static final co0 Q = new co0("Undefined intrinsics block and it is required", 1);
    public static final o30 R = new o30();
    public static final di S = new di(3);
    public e30 A;
    public c61 B;
    public ri C;
    public r30 D;
    public r30 E;
    public boolean F;
    public final jc0 G;
    public final w30 H;
    public f40 I;
    public nc0 J;
    public boolean K;
    public e90 L;
    public e90 M;
    public boolean N;
    public int O;
    public boolean P;
    public final boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public t30 j;
    public int k;
    public final xz l;
    public eb0 m;
    public boolean n;
    public t30 o;
    public eg0 p;
    public int q;
    public boolean r;
    public boolean s;
    public ct0 t;
    public boolean u;
    public final eb0 v;
    public boolean w;
    public l80 x;
    public xz y;
    public xn z;

    public t30(int i) {
        this(dt0.a.addAndGet(1), (i & 1) == 0);
    }

    public static boolean O(t30 t30Var) {
        k80 k80Var = t30Var.H.p;
        gj gjVar = k80Var.m ? new gj(k80Var.g) : null;
        if (gjVar == null) {
            t30Var.getClass();
            return false;
        }
        if (t30Var.D == r30.f) {
            t30Var.e();
        }
        return t30Var.H.p.v0(gjVar.a);
    }

    public static void S(t30 t30Var, boolean z, int i) {
        t30 t30VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (t30Var.j == null) {
            pz.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        eg0 eg0Var = t30Var.p;
        if (eg0Var == null || t30Var.r || t30Var.d) {
            return;
        }
        ((p3) eg0Var).v(t30Var, true, z);
        if (z2) {
            c70 c70Var = t30Var.H.q;
            c10.m(c70Var);
            w30 w30Var = c70Var.i;
            t30 t30VarT2 = w30Var.a.t();
            r30 r30Var = w30Var.a.D;
            if (t30VarT2 == null || r30Var == r30.f) {
                return;
            }
            while (t30VarT2.D == r30Var && (t30VarT = t30VarT2.t()) != null) {
                t30VarT2 = t30VarT;
            }
            int iOrdinal = r30Var.ordinal();
            if (iOrdinal == 0) {
                if (t30VarT2.j != null) {
                    S(t30VarT2, z, 6);
                    return;
                } else {
                    U(t30VarT2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (t30VarT2.j != null) {
                t30VarT2.R(z);
            } else {
                t30VarT2.T(z);
            }
        }
    }

    public static void U(t30 t30Var, boolean z, int i) {
        eg0 eg0Var;
        t30 t30VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        if (t30Var.r || t30Var.d || (eg0Var = t30Var.p) == null) {
            return;
        }
        ((p3) eg0Var).v(t30Var, false, z);
        if (z2) {
            w30 w30Var = t30Var.H.p.i;
            t30 t30VarT2 = w30Var.a.t();
            r30 r30Var = w30Var.a.D;
            if (t30VarT2 == null || r30Var == r30.f) {
                return;
            }
            while (t30VarT2.D == r30Var && (t30VarT = t30VarT2.t()) != null) {
                t30VarT2 = t30VarT;
            }
            int iOrdinal = r30Var.ordinal();
            if (iOrdinal == 0) {
                U(t30VarT2, z, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                t30VarT2.T(z);
            }
        }
    }

    public static void V(t30 t30Var) {
        w30 w30Var = t30Var.H;
        if (s30.a[w30Var.d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + w30Var.d);
        }
        if (w30Var.e) {
            S(t30Var, true, 6);
            return;
        }
        if (w30Var.f) {
            t30Var.R(true);
        }
        if (t30Var.p()) {
            U(t30Var, true, 6);
        } else if (t30Var.o()) {
            t30Var.T(true);
        }
    }

    private final String j(t30 t30Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(t30Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        t30 t30Var2 = t30Var.o;
        sb.append(t30Var2 != null ? t30Var2.g(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.K) {
            jc0 jc0Var = this.G;
            nc0 nc0Var = jc0Var.c;
            nc0 nc0Var2 = jc0Var.d.t;
            this.J = null;
            while (true) {
                if (c10.i(nc0Var, nc0Var2)) {
                    break;
                }
                if ((nc0Var != null ? nc0Var.L : null) != null) {
                    this.J = nc0Var;
                    break;
                }
                nc0Var = nc0Var != null ? nc0Var.t : null;
            }
        }
        nc0 nc0Var3 = this.J;
        if (nc0Var3 != null && nc0Var3.L == null) {
            throw b8.f("layer was not set");
        }
        if (nc0Var3 != null) {
            nc0Var3.V0();
            return;
        }
        t30 t30VarT = t();
        if (t30VarT != null) {
            t30VarT.A();
        }
    }

    @Override // defpackage.fg0
    public final boolean B() {
        return H();
    }

    public final void C() {
        jc0 jc0Var = this.G;
        nc0 nc0Var = jc0Var.d;
        vz vzVar = jc0Var.c;
        while (nc0Var != vzVar) {
            c10.n(nc0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            n30 n30Var = (n30) nc0Var;
            dg0 dg0Var = n30Var.L;
            if (dg0Var != null) {
                dg0Var.invalidate();
            }
            nc0Var = n30Var.s;
        }
        dg0 dg0Var2 = jc0Var.c.L;
        if (dg0Var2 != null) {
            dg0Var2.invalidate();
        }
    }

    public final void D() {
        if (this.d) {
            t30 t30VarT = t();
            if (t30VarT != null) {
                t30VarT.D();
                return;
            }
            return;
        }
        if (this.j != null) {
            S(this, false, 7);
        } else {
            U(this, false, 7);
        }
    }

    public final void E() {
        if (m00.a(this.f, 9223372034707292159L)) {
            return;
        }
        this.f = 9223372034707292159L;
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((t30) objArr[i2]).E();
        }
    }

    public final void F() {
        if (this.u) {
            return;
        }
        if (this.G.b.i != null || this.M != null) {
            this.s = true;
            return;
        }
        ct0 ct0Var = this.t;
        this.u = true;
        dm0 dm0Var = new dm0();
        dm0Var.d = new ct0();
        gg0 snapshotObserver = ((p3) r31.U(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new g3(10, this, dm0Var));
        this.u = false;
        this.t = (ct0) dm0Var.d;
        this.s = false;
        p3 p3Var = (p3) r31.U(this);
        p3Var.getSemanticsOwner().b(this, ct0Var);
        p3Var.x();
    }

    public final void G() {
        t30 t30Var;
        if (this.k > 0) {
            this.n = true;
        }
        if (!this.d || (t30Var = this.o) == null) {
            return;
        }
        t30Var.G();
    }

    public final boolean H() {
        return this.p != null;
    }

    public final boolean I() {
        return this.H.p.u;
    }

    public final Boolean J() {
        c70 c70Var = this.H.q;
        if (c70Var != null) {
            return Boolean.valueOf(c70Var.u());
        }
        return null;
    }

    public final void K(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            xz xzVar = this.l;
            eb0 eb0Var = (eb0) xzVar.e;
            b bVar = (b) xzVar.f;
            Object objK = eb0Var.k(i5);
            bVar.a();
            ((eb0) xzVar.e).a(i6, (t30) objK);
            bVar.a();
        }
        N();
        G();
        D();
    }

    public final void L(t30 t30Var) {
        if (t30Var.H.l > 0) {
            this.H.d(r0.l - 1);
        }
        if (this.p != null) {
            t30Var.h();
        }
        t30Var.o = null;
        if (t30Var.O > 0) {
            Z(this.O - 1);
        }
        t30Var.G.d.t = null;
        if (t30Var.d) {
            this.k--;
            eb0 eb0Var = (eb0) t30Var.l.e;
            Object[] objArr = eb0Var.d;
            int i = eb0Var.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((t30) objArr[i2]).G.d.t = null;
            }
        }
        G();
        N();
    }

    public final void M() {
        this.i = true;
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((t30) objArr[i2]).E();
        }
    }

    public final void N() {
        if (!this.d) {
            this.w = true;
            return;
        }
        t30 t30VarT = t();
        if (t30VarT != null) {
            t30VarT.N();
        }
    }

    public final void P() {
        xz xzVar = this.l;
        eb0 eb0Var = (eb0) xzVar.e;
        eb0 eb0Var2 = (eb0) xzVar.e;
        int i = eb0Var.f;
        while (true) {
            i--;
            if (-1 >= i) {
                eb0Var2.g();
                ((b) xzVar.f).a();
                return;
            }
            L((t30) eb0Var2.d[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            pz.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            xz xzVar = this.l;
            L((t30) ((eb0) xzVar.e).d[i3]);
            Object objK = ((eb0) xzVar.e).k(i3);
            ((b) xzVar.f).a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R(boolean z) {
        eg0 eg0Var;
        if (this.d || (eg0Var = this.p) == null) {
            return;
        }
        ((p3) eg0Var).w(this, true, z);
    }

    public final void T(boolean z) {
        eg0 eg0Var;
        if (this.d || (eg0Var = this.p) == null) {
            return;
        }
        ((p3) eg0Var).w(this, false, z);
    }

    public final void W() {
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var = (t30) objArr[i2];
            r30 r30Var = t30Var.E;
            t30Var.D = r30Var;
            if (r30Var != r30.f) {
                t30Var.W();
            }
        }
    }

    public final void X(Throwable th) throws Throwable {
        ri riVar = this.C;
        hx0 hx0Var = ni.a;
        vh0 vh0Var = (vh0) riVar;
        vh0Var.getClass();
        li liVar = (li) nm.A(vh0Var, hx0Var);
        if (liVar == null) {
            throw th;
        }
        d80.H(th, new ki(0, liVar, this));
        throw th;
    }

    public final void Y(xn xnVar) {
        if (c10.i(this.z, xnVar)) {
            return;
        }
        this.z = xnVar;
        D();
        t30 t30VarT = t();
        if (t30VarT != null) {
            t30VarT.A();
        }
        C();
        for (d90 d90Var = this.G.f; d90Var != null; d90Var = d90Var.i) {
            d90Var.a();
        }
    }

    public final void Z(int i) {
        t30 t30VarT;
        t30 t30VarT2;
        int i2 = this.O;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (t30VarT2 = t()) != null) {
                t30VarT2.Z(t30VarT2.O + 1);
            }
            if (i == 0 && this.O > 0 && (t30VarT = t()) != null) {
                t30VarT.Z(t30VarT.O - 1);
            }
            this.O = i;
        }
    }

    @Override // defpackage.kh
    public final void a() {
        f40 f40Var = this.I;
        if (f40Var != null) {
            f40Var.a();
        }
        jc0 jc0Var = this.G;
        nc0 nc0Var = jc0Var.c.s;
        for (nc0 nc0Var2 = jc0Var.d; !c10.i(nc0Var2, nc0Var) && nc0Var2 != null; nc0Var2 = nc0Var2.s) {
            nc0Var2.b1();
        }
    }

    public final void a0(t30 t30Var) {
        if (c10.i(t30Var, this.j)) {
            return;
        }
        this.j = t30Var;
        w30 w30Var = this.H;
        if (t30Var != null) {
            if (w30Var.q == null) {
                w30Var.q = new c70(w30Var);
            }
            jc0 jc0Var = this.G;
            nc0 nc0Var = jc0Var.c.s;
            for (nc0 nc0Var2 = jc0Var.d; !c10.i(nc0Var2, nc0Var) && nc0Var2 != null; nc0Var2 = nc0Var2.s) {
                nc0Var2.J0();
            }
        } else {
            w30Var.q = null;
            w30Var.f = false;
            w30Var.e = false;
        }
        D();
    }

    @Override // defpackage.kh
    public final void b() {
        f40 f40Var = this.I;
        if (f40Var != null) {
            f40Var.e(true);
        }
        this.P = true;
        d90 d90Var = this.G.e;
        for (d90 d90Var2 = d90Var; d90Var2 != null; d90Var2 = d90Var2.h) {
            if (d90Var2.q) {
                d90Var2.v0();
            }
        }
        for (d90 d90Var3 = d90Var; d90Var3 != null; d90Var3 = d90Var3.h) {
            if (d90Var3.q) {
                d90Var3.x0();
            }
        }
        while (d90Var != null) {
            if (d90Var.q) {
                d90Var.r0();
            }
            d90Var = d90Var.h;
        }
        if (H()) {
            this.t = null;
            this.s = false;
        }
        eg0 eg0Var = this.p;
        if (eg0Var != null) {
            p3 p3Var = (p3) eg0Var;
            p3Var.getRectManager().j(this);
            s2 s2Var = p3Var.H;
            if (s2Var == null || !s2Var.g.e(this.e)) {
                return;
            }
            s2Var.a.n(s2Var.c, this.e, false);
        }
    }

    public final void b0(l80 l80Var) {
        if (c10.i(this.x, l80Var)) {
            return;
        }
        this.x = l80Var;
        xz xzVar = this.y;
        if (xzVar != null) {
            ((zg0) xzVar.f).setValue(l80Var);
        }
        D();
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [d90, nc0] */
    public final void c(e90 e90Var) {
        ?? r7;
        jc0 jc0Var;
        ic0 ic0Var;
        eb0 eb0Var;
        boolean z;
        boolean z2;
        boolean z3;
        eb0 eb0Var2;
        boolean z4;
        h hVar;
        jc0 jc0Var2 = this.G;
        boolean zD = jc0Var2.d(16);
        d90 d90Var = jc0Var2.e;
        boolean zD2 = jc0Var2.d(1024);
        this.L = e90Var;
        vz vzVar = jc0Var2.c;
        t30 t30Var = jc0Var2.a;
        d90 d90Var2 = jc0Var2.f;
        ic0 ic0Var2 = jc0Var2.b;
        if (d90Var2 == ic0Var2) {
            pz.b("padChain called on already padded chain");
        }
        d90 d90Var3 = jc0Var2.f;
        d90Var3.h = ic0Var2;
        ic0Var2.i = d90Var3;
        eb0 eb0Var3 = jc0Var2.g;
        int i = eb0Var3 != null ? eb0Var3.f : 0;
        eb0 eb0Var4 = jc0Var2.h;
        if (eb0Var4 == null) {
            eb0Var4 = new eb0(new c90[16]);
        }
        eb0 eb0Var5 = jc0Var2.i;
        eb0Var5.b(e90Var);
        h hVar2 = null;
        while (true) {
            int i2 = eb0Var5.f;
            if (i2 == 0) {
                break;
            }
            e90 e90Var2 = (e90) eb0Var5.k(i2 - 1);
            if (e90Var2 instanceof wf) {
                wf wfVar = (wf) e90Var2;
                eb0Var5.b(wfVar.b);
                eb0Var5.b(wfVar.a);
            } else if (e90Var2 instanceof c90) {
                eb0Var4.b(e90Var2);
            } else {
                if (hVar2 == null) {
                    hVar = new h(20, eb0Var4);
                    hVar2 = hVar;
                } else {
                    hVar = hVar2;
                }
                e90Var2.b(hVar);
            }
        }
        int i3 = eb0Var4.f;
        if (i3 == i) {
            d90 d90Var4 = ic0Var2.i;
            int i4 = 0;
            while (d90Var4 != null && i4 < i) {
                if (eb0Var3 == null) {
                    throw b8.f("expected prior modifier list to be non-empty");
                }
                c90 c90Var = (c90) eb0Var3.d[i4];
                c90 c90Var2 = (c90) eb0Var4.d[i4];
                if (c10.i(c90Var, c90Var2)) {
                    eb0Var2 = eb0Var3;
                    z4 = 2;
                } else {
                    eb0Var2 = eb0Var3;
                    z4 = c90Var.getClass() == c90Var2.getClass();
                }
                if (!z4) {
                    d90Var4 = d90Var4.h;
                    break;
                }
                if (z4) {
                    jc0.h(c90Var, c90Var2, d90Var4);
                }
                d90Var4 = d90Var4.i;
                i4++;
                eb0Var3 = eb0Var2;
            }
            eb0Var2 = eb0Var3;
            if (i4 >= i) {
                jc0Var2 = jc0Var2;
                eb0Var3 = eb0Var2;
                z2 = false;
                jc0Var = jc0Var2;
                ic0Var = ic0Var2;
                eb0Var = eb0Var4;
                z = false;
                r7 = z2;
            } else {
                if (eb0Var2 == null) {
                    throw b8.f("expected prior modifier list to be non-empty");
                }
                if (d90Var4 == null) {
                    throw b8.f("structuralUpdate requires a non-null tail");
                }
                boolean z5 = t30Var.M != null;
                d90 d90Var5 = d90Var4;
                jc0Var = jc0Var2;
                eb0Var = eb0Var4;
                eb0Var3 = eb0Var2;
                z3 = false;
                jc0Var.f(i4, eb0Var3, eb0Var, d90Var5, !z5);
                ic0Var = ic0Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            e90 e90Var3 = t30Var.M;
            if (e90Var3 != null && i == 0) {
                d90 d90VarB = ic0Var2;
                for (int i5 = 0; i5 < eb0Var4.f; i5++) {
                    d90VarB = jc0.b((c90) eb0Var4.d[i5], d90VarB);
                }
                int i6 = 0;
                for (d90 d90Var6 = d90Var.h; d90Var6 != null && d90Var6 != ic0Var2; d90Var6 = d90Var6.h) {
                    i6 |= d90Var6.f;
                    d90Var6.g = i6;
                }
                jc0Var = jc0Var2;
                ic0Var = ic0Var2;
                eb0Var = eb0Var4;
                z = true;
                r7 = z3;
            } else if (i3 != 0) {
                if (eb0Var3 == null) {
                    eb0Var3 = new eb0(new c90[16]);
                }
                jc0Var = jc0Var2;
                ic0Var = ic0Var2;
                eb0Var = eb0Var4;
                jc0Var.f(0, eb0Var3, eb0Var, ic0Var, !(e90Var3 != null));
                z = true;
            } else {
                if (eb0Var3 == null) {
                    throw b8.f("expected prior modifier list to be non-empty");
                }
                d90 d90Var7 = ic0Var2.i;
                for (int i7 = 0; d90Var7 != null && i7 < eb0Var3.f; i7++) {
                    d90Var7 = jc0.c(d90Var7).i;
                }
                t30 t30VarT = t30Var.t();
                vzVar.t = t30VarT != null ? t30VarT.G.c : null;
                jc0Var2.d = vzVar;
                jc0Var = jc0Var2;
                ic0Var = ic0Var2;
                eb0Var = eb0Var4;
                z = false;
                r7 = z2;
            }
        }
        jc0Var.g = eb0Var;
        if (eb0Var3 != null) {
            eb0Var3.g();
        } else {
            eb0Var3 = r7;
        }
        jc0Var.h = eb0Var3;
        d90 d90Var8 = ic0Var.i;
        if (d90Var8 != null) {
            d90Var = d90Var8;
        }
        d90Var.h = r7;
        ic0Var.i = r7;
        ic0Var.g = -1;
        ic0Var.k = r7;
        if (d90Var == ic0Var) {
            pz.b("trimChain did not update the head");
        }
        jc0Var.f = d90Var;
        if (z) {
            jc0Var.g();
        }
        boolean zD3 = jc0Var.d(16);
        boolean zD4 = jc0Var.d(1024);
        this.H.j();
        if (this.j == null && jc0Var.d(512)) {
            a0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        yl0 rectManager = ((p3) r31.U(this)).getRectManager();
        rectManager.getClass();
        if (H()) {
            me meVar = rectManager.a;
            int i8 = this.e & 67108863;
            long[] jArr = (long[]) meVar.b;
            int i9 = meVar.a;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 67108863) == i8) {
                    jArr[i11] = (4611686018427387903L & j) | ((zD4 ? 1L : 0L) * 4611686018427387904L) | ((zD3 ? 1L : 0L) * Long.MIN_VALUE);
                    return;
                }
            }
        }
    }

    public final void c0(e90 e90Var) {
        if (this.d && this.L != b90.a) {
            pz.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.P) {
            pz.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.M = e90Var;
            return;
        }
        c(e90Var);
        if (this.s) {
            F();
        }
    }

    public final void d(eg0 eg0Var) {
        t30 t30Var;
        ct0 ct0VarV;
        if (this.p != null) {
            pz.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        t30 t30Var2 = this.o;
        if (t30Var2 != null && !c10.i(t30Var2.p, eg0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(eg0Var);
            sb.append(") than the parent's owner(");
            t30 t30VarT = t();
            sb.append(t30VarT != null ? t30VarT.p : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            t30 t30Var3 = this.o;
            sb.append(t30Var3 != null ? t30Var3.g(0) : null);
            pz.b(sb.toString());
        }
        t30 t30VarT2 = t();
        w30 w30Var = this.H;
        if (t30VarT2 == null) {
            w30Var.p.u = true;
            c70 c70Var = w30Var.q;
            if (c70Var != null) {
                c70Var.s = z60.d;
            }
        }
        jc0 jc0Var = this.G;
        jc0Var.d.t = t30VarT2 != null ? t30VarT2.G.c : null;
        this.p = eg0Var;
        this.q = (t30VarT2 != null ? t30VarT2.q : -1) + 1;
        e90 e90Var = this.M;
        if (e90Var != null) {
            c(e90Var);
        }
        this.M = null;
        p3 p3Var = (p3) eg0Var;
        p3Var.m4getLayoutNodes().g(this.e, this);
        t30 t30Var4 = this.o;
        if (t30Var4 == null || (t30Var = t30Var4.j) == null) {
            t30Var = this.j;
        }
        a0(t30Var);
        if (this.j == null && jc0Var.d(512)) {
            a0(this);
        }
        if (!this.P) {
            for (d90 d90Var = jc0Var.f; d90Var != null; d90Var = d90Var.i) {
                d90Var.q0();
            }
        }
        eb0 eb0Var = (eb0) this.l.e;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((t30) objArr[i2]).d(eg0Var);
        }
        if (!this.P) {
            jc0Var.e();
        }
        D();
        if (t30VarT2 != null) {
            t30VarT2.D();
        }
        w30Var.j();
        if (!this.P && jc0Var.d(8)) {
            F();
        }
        s2 s2Var = p3Var.H;
        if (s2Var == null || (ct0VarV = v()) == null || !ct0VarV.d.b(lt0.q)) {
            return;
        }
        s2Var.g.a(this.e);
        s2Var.a.n(s2Var.c, this.e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void d0(c61 c61Var) {
        if (c10.i(this.B, c61Var)) {
            return;
        }
        this.B = c61Var;
        d90 d90Var = this.G.f;
        if ((d90Var.g & 16) != 0) {
            while (d90Var != null) {
                if ((d90Var.f & 16) != 0) {
                    mn mnVarI = d90Var;
                    ?? eb0Var = 0;
                    while (mnVarI != 0) {
                        if (mnVarI instanceof qj0) {
                            ((qj0) mnVarI).X();
                        } else if ((mnVarI.f & 16) != 0 && (mnVarI instanceof mn)) {
                            d90 d90Var2 = mnVarI.s;
                            int i = 0;
                            mnVarI = mnVarI;
                            eb0Var = eb0Var;
                            while (d90Var2 != null) {
                                if ((d90Var2.f & 16) != 0) {
                                    i++;
                                    eb0Var = eb0Var;
                                    if (i == 1) {
                                        mnVarI = d90Var2;
                                    } else {
                                        if (eb0Var == 0) {
                                            eb0Var = new eb0(new d90[16]);
                                        }
                                        if (mnVarI != 0) {
                                            eb0Var.b(mnVarI);
                                            mnVarI = 0;
                                        }
                                        eb0Var.b(d90Var2);
                                    }
                                }
                                d90Var2 = d90Var2.i;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                            }
                            if (i == 1) {
                            }
                        }
                        mnVarI = d80.i(eb0Var);
                    }
                }
                if ((d90Var.g & 16) == 0) {
                    return;
                } else {
                    d90Var = d90Var.i;
                }
            }
        }
    }

    public final void e() {
        this.E = this.D;
        this.D = r30.f;
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var = (t30) objArr[i2];
            if (t30Var.D != r30.f) {
                t30Var.e();
            }
        }
    }

    public final void e0() {
        if (this.k <= 0 || !this.n) {
            return;
        }
        this.n = false;
        eb0 eb0Var = this.m;
        if (eb0Var == null) {
            eb0Var = new eb0(new t30[16]);
            this.m = eb0Var;
        }
        eb0Var.g();
        eb0 eb0Var2 = (eb0) this.l.e;
        Object[] objArr = eb0Var2.d;
        int i = eb0Var2.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var = (t30) objArr[i2];
            if (t30Var.d) {
                eb0Var.c(eb0Var.f, t30Var.x());
            } else {
                eb0Var.b(t30Var);
            }
        }
        w30 w30Var = this.H;
        w30Var.p.B = true;
        c70 c70Var = w30Var.q;
        if (c70Var != null) {
            c70Var.v = true;
        }
    }

    public final void f() {
        this.E = this.D;
        this.D = r30.f;
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var = (t30) objArr[i2];
            if (t30Var.D == r30.e) {
                t30Var.f();
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        eb0 eb0VarX = x();
        Object[] objArr = eb0VarX.d;
        int i3 = eb0VarX.f;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((t30) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        c10.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void h() {
        u30 u30Var;
        eg0 eg0Var = this.p;
        if (eg0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            t30 t30VarT = t();
            sb.append(t30VarT != null ? t30VarT.g(0) : null);
            pz.c(sb.toString());
            throw new fg();
        }
        t30 t30VarT2 = t();
        w30 w30Var = this.H;
        if (t30VarT2 != null) {
            t30VarT2.A();
            t30VarT2.D();
            k80 k80Var = w30Var.p;
            r30 r30Var = r30.f;
            k80Var.o = r30Var;
            c70 c70Var = w30Var.q;
            if (c70Var != null) {
                c70Var.m = r30Var;
            }
        }
        u30 u30Var2 = w30Var.p.z;
        u30Var2.b = true;
        u30Var2.c = false;
        u30Var2.d = false;
        u30Var2.e = false;
        u30Var2.f = null;
        c70 c70Var2 = w30Var.q;
        if (c70Var2 != null && (u30Var = c70Var2.t) != null) {
            u30Var.b = true;
            u30Var.c = false;
            u30Var.d = false;
            u30Var.e = false;
            u30Var.f = null;
        }
        jc0 jc0Var = this.G;
        d90 d90Var = jc0Var.e;
        nc0 nc0Var = jc0Var.c.s;
        for (nc0 nc0Var2 = jc0Var.d; !c10.i(nc0Var2, nc0Var) && nc0Var2 != null; nc0Var2 = nc0Var2.s) {
            nc0Var2.g1();
        }
        for (d90 d90Var2 = d90Var; d90Var2 != null; d90Var2 = d90Var2.h) {
            if (d90Var2.q) {
                d90Var2.x0();
            }
        }
        this.r = true;
        eb0 eb0Var = (eb0) this.l.e;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((t30) objArr[i2]).h();
        }
        this.r = false;
        while (d90Var != null) {
            if (d90Var.q) {
                d90Var.r0();
            }
            d90Var = d90Var.h;
        }
        p3 p3Var = (p3) eg0Var;
        p3Var.m4getLayoutNodes().f(this.e);
        i80 i80Var = p3Var.P;
        e9 e9Var = i80Var.b;
        ((r1) e9Var.a).p(this);
        ((r1) e9Var.b).p(this);
        ((r1) e9Var.c).p(this);
        ((eb0) i80Var.e.e).j(this);
        p3Var.I = true;
        p3Var.getRectManager().j(this);
        s2 s2Var = p3Var.H;
        if (s2Var != null && s2Var.g.e(this.e)) {
            s2Var.a.n(s2Var.c, this.e, false);
        }
        this.p = null;
        this.f = 9223372034707292159L;
        a0(null);
        this.q = 0;
        k80 k80Var2 = w30Var.p;
        k80Var2.l = Integer.MAX_VALUE;
        k80Var2.k = Integer.MAX_VALUE;
        k80Var2.u = false;
        c70 c70Var3 = w30Var.q;
        if (c70Var3 != null) {
            c70Var3.l = Integer.MAX_VALUE;
            c70Var3.k = Integer.MAX_VALUE;
            c70Var3.s = z60.f;
        }
        if (jc0Var.d(8)) {
            ct0 ct0Var = this.t;
            this.t = null;
            this.s = false;
            p3Var.getSemanticsOwner().b(this, ct0Var);
            p3Var.x();
        }
    }

    public final void i(dd ddVar, fx fxVar) {
        try {
            this.G.d.H0(ddVar, fxVar);
        } catch (Throwable th) {
            X(th);
            throw null;
        }
    }

    public final List k() {
        c70 c70Var = this.H.q;
        c10.m(c70Var);
        eb0 eb0Var = c70Var.u;
        w30 w30Var = c70Var.i;
        w30Var.a.m();
        if (!c70Var.v) {
            return eb0Var.f();
        }
        t30 t30Var = w30Var.a;
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (eb0Var.f <= i2) {
                c70 c70Var2 = t30Var2.H.q;
                c10.m(c70Var2);
                eb0Var.b(c70Var2);
            } else {
                c70 c70Var3 = t30Var2.H.q;
                c10.m(c70Var3);
                Object[] objArr2 = eb0Var.d;
                Object obj = objArr2[i2];
                objArr2[i2] = c70Var3;
            }
        }
        eb0Var.l(((bb0) t30Var.m()).d.f, eb0Var.f);
        c70Var.v = false;
        return eb0Var.f();
    }

    public final List l() {
        return this.H.p.k0();
    }

    public final List m() {
        return x().f();
    }

    public final List n() {
        return ((eb0) this.l.e).f();
    }

    public final boolean o() {
        return this.H.p.x;
    }

    public final boolean p() {
        return this.H.p.w;
    }

    public final r30 q() {
        return this.H.p.o;
    }

    public final r30 r() {
        r30 r30Var;
        c70 c70Var = this.H.q;
        return (c70Var == null || (r30Var = c70Var.m) == null) ? r30.f : r30Var;
    }

    public final xz s() {
        xz xzVar = this.y;
        if (xzVar != null) {
            return xzVar;
        }
        xz xzVar2 = new xz(this, this.x);
        this.y = xzVar2;
        return xzVar2;
    }

    public final t30 t() {
        t30 t30Var = this.o;
        while (t30Var != null && t30Var.d) {
            t30Var = t30Var.o;
        }
        return t30Var;
    }

    public final String toString() {
        return nm.E(this) + " children: " + ((bb0) m()).d.f + " measurePolicy: " + this.x + " deactivated: " + this.P;
    }

    public final int u() {
        return this.H.p.l;
    }

    public final ct0 v() {
        if (H() && !this.P && this.G.d(8)) {
            return this.t;
        }
        return null;
    }

    public final eb0 w() {
        boolean z = this.w;
        eb0 eb0Var = this.v;
        if (z) {
            eb0Var.g();
            eb0Var.c(eb0Var.f, x());
            y9.z0(eb0Var.d, S, 0, eb0Var.f);
            this.w = false;
        }
        return eb0Var;
    }

    public final eb0 x() {
        e0();
        if (this.k == 0) {
            return (eb0) this.l.e;
        }
        eb0 eb0Var = this.m;
        c10.m(eb0Var);
        return eb0Var;
    }

    public final void y(long j, gy gyVar, int i, boolean z) {
        jc0 jc0Var = this.G;
        nc0 nc0Var = jc0Var.d;
        an0 an0Var = nc0.M;
        jc0Var.d.T0(nc0.P, nc0Var.L0(j), gyVar, i, z);
    }

    public final void z(int i, t30 t30Var) {
        if (t30Var.o != null && t30Var.p != null) {
            pz.b(j(t30Var));
        }
        t30Var.o = this;
        xz xzVar = this.l;
        ((eb0) xzVar.e).a(i, t30Var);
        ((b) xzVar.f).a();
        N();
        if (t30Var.d) {
            this.k++;
        }
        G();
        eg0 eg0Var = this.p;
        if (eg0Var != null) {
            t30Var.d(eg0Var);
        }
        if (t30Var.H.l > 0) {
            w30 w30Var = this.H;
            w30Var.d(w30Var.l + 1);
        }
        if (t30Var.O > 0) {
            Z(this.O + 1);
        }
    }

    public t30(int i, boolean z) {
        this.d = z;
        this.e = i;
        this.f = 9223372034707292159L;
        this.g = 0L;
        this.h = 9223372034707292159L;
        this.i = true;
        int i2 = 13;
        this.l = new xz(i2, new eb0(new t30[16]), new b(i2, this));
        this.v = new eb0(new t30[16]);
        this.w = true;
        this.x = Q;
        this.z = r31.c;
        this.A = e30.d;
        this.B = R;
        ri.c.getClass();
        this.C = qi.b;
        r30 r30Var = r30.f;
        this.D = r30Var;
        this.E = r30Var;
        this.G = new jc0(this);
        this.H = new w30(this);
        this.K = true;
        this.L = b90.a;
    }
}
