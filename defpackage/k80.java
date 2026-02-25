package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k80 extends oi0 implements g80, l2, o90 {
    public boolean C;
    public float G;
    public boolean H;
    public iw I;
    public float K;
    public boolean M;
    public final w30 i;
    public boolean j;
    public boolean m;
    public boolean n;
    public iw q;
    public float r;
    public Object t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public r30 o = r30.f;
    public long p = 0;
    public boolean s = true;
    public final u30 z = new u30(this, 0);
    public final eb0 A = new eb0(new k80[16]);
    public boolean B = true;
    public long D = hj.b(0, 0, 15);
    public final j80 E = new j80(this, 1);
    public final j80 F = new j80(this, 0);
    public long J = 0;
    public final j80 L = new j80(this, 2);

    public k80(w30 w30Var) {
        this.i = w30Var;
    }

    @Override // defpackage.g80
    public final int S(int i) {
        w30 w30Var = this.i;
        if (!b10.N(w30Var.a)) {
            r0();
            return w30Var.a().S(i);
        }
        c70 c70Var = w30Var.q;
        c10.m(c70Var);
        return c70Var.S(i);
    }

    @Override // defpackage.l2
    public final void U() {
        t30.U(this.i.a, false, 7);
    }

    @Override // defpackage.g80
    public final int X(int i) {
        w30 w30Var = this.i;
        if (!b10.N(w30Var.a)) {
            r0();
            return w30Var.a().X(i);
        }
        c70 c70Var = w30Var.q;
        c10.m(c70Var);
        return c70Var.X(i);
    }

    @Override // defpackage.l2
    public final u30 a() {
        return this.z;
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        w30 w30Var = this.i;
        if (!b10.N(w30Var.a)) {
            r0();
            return w30Var.a().b0(i);
        }
        c70 c70Var = w30Var.q;
        c10.m(c70Var);
        return c70Var.b0(i);
    }

    @Override // defpackage.oi0
    public final int c0() {
        return this.i.a().c0();
    }

    @Override // defpackage.oi0
    public final int d0() {
        return this.i.a().d0();
    }

    @Override // defpackage.g80
    public final oi0 e(long j) throws Throwable {
        r30 r30Var;
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        r30 r30Var2 = t30Var.D;
        r30 r30Var3 = r30.f;
        if (r30Var2 == r30Var3) {
            t30Var.e();
        }
        if (b10.N(w30Var.a)) {
            c70 c70Var = w30Var.q;
            c10.m(c70Var);
            c70Var.m = r30Var3;
            c70Var.e(j);
        }
        t30 t30Var2 = w30Var.a;
        t30 t30VarT = t30Var2.t();
        if (t30VarT != null) {
            w30 w30Var2 = t30VarT.H;
            if (this.o != r30Var3 && !t30Var2.F) {
                pz.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = w30Var2.d.ordinal();
            if (iOrdinal == 0) {
                r30Var = r30.d;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + w30Var2.d);
                }
                r30Var = r30.e;
            }
            this.o = r30Var;
        } else {
            this.o = r30Var3;
        }
        v0(j);
        return this;
    }

    @Override // defpackage.g80
    public final int f(int i) {
        w30 w30Var = this.i;
        if (!b10.N(w30Var.a)) {
            r0();
            return w30Var.a().f(i);
        }
        c70 c70Var = w30Var.q;
        c10.m(c70Var);
        return c70Var.f(i);
    }

    @Override // defpackage.oi0
    public final void g0(long j, float f, iw iwVar) throws Throwable {
        boolean z;
        ni0 placementScope;
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        boolean z2 = true;
        try {
            this.v = true;
            if (!m00.a(j, this.p) || this.M) {
                if (w30Var.k || w30Var.j || this.M) {
                    this.x = true;
                    this.M = false;
                }
                q0();
            }
            c70 c70Var = w30Var.q;
            if (c70Var != null) {
                w30 w30Var2 = c70Var.i;
                if (b10.N(w30Var2.a)) {
                    z = true;
                } else {
                    if (c70Var.s == z60.f && !w30Var2.b) {
                        w30Var2.c = true;
                    }
                    z = w30Var2.c;
                }
                if (z) {
                    nc0 nc0Var = w30Var.a().t;
                    if (nc0Var == null || (placementScope = nc0Var.o) == null) {
                        placementScope = ((p3) r31.U(t30Var)).getPlacementScope();
                    }
                    c70 c70Var2 = w30Var.q;
                    c10.m(c70Var2);
                    t30 t30VarT = t30Var.t();
                    if (t30VarT != null) {
                        t30VarT.H.h = 0;
                    }
                    c70Var2.l = Integer.MAX_VALUE;
                    ni0.h(placementScope, c70Var2, (int) (j >> 32), (int) (4294967295L & j));
                }
            }
            c70 c70Var3 = w30Var.q;
            if (c70Var3 == null || c70Var3.n) {
                z2 = false;
            }
            if (z2) {
                pz.b("Error: Placement happened before lookahead.");
            }
            u0(j, f, iwVar);
        } catch (Throwable th) {
            t30Var.X(th);
            throw null;
        }
    }

    @Override // defpackage.l2
    public final void j(h hVar) {
        eb0 eb0VarX = this.i.a.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            hVar.g(((t30) objArr[i2]).H.p);
        }
    }

    public final List k0() {
        w30 w30Var = this.i;
        w30Var.a.e0();
        boolean z = this.B;
        eb0 eb0Var = this.A;
        if (!z) {
            return eb0Var.f();
        }
        t30 t30Var = w30Var.a;
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (eb0Var.f <= i2) {
                eb0Var.b(t30Var2.H.p);
            } else {
                k80 k80Var = t30Var2.H.p;
                Object[] objArr2 = eb0Var.d;
                Object obj = objArr2[i2];
                objArr2[i2] = k80Var;
            }
        }
        eb0Var.l(((bb0) t30Var.m()).d.f, eb0Var.f);
        this.B = false;
        return eb0Var.f();
    }

    @Override // defpackage.oi0, defpackage.g80
    public final Object l() {
        return this.t;
    }

    @Override // defpackage.o90
    public final void n(boolean z) {
        w30 w30Var = this.i;
        if (z != w30Var.a().l) {
            w30Var.a().l = z;
            this.M = true;
        }
    }

    @Override // defpackage.l2
    public final vz o() {
        return this.i.a.G.c;
    }

    public final void o0() {
        boolean z = this.u;
        this.u = true;
        t30 t30Var = this.i.a;
        jc0 jc0Var = t30Var.G;
        if (!z) {
            jc0Var.c.a1();
            if (t30Var.p()) {
                t30.U(t30Var, true, 6);
            } else if (t30Var.H.e) {
                t30.S(t30Var, true, 6);
            }
        }
        nc0 nc0Var = jc0Var.c.s;
        for (nc0 nc0Var2 = jc0Var.d; !c10.i(nc0Var2, nc0Var) && nc0Var2 != null; nc0Var2 = nc0Var2.s) {
            if (nc0Var2.K) {
                nc0Var2.V0();
            }
        }
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (t30Var2.u() != Integer.MAX_VALUE) {
                t30Var2.H.p.o0();
                t30.V(t30Var2);
            }
        }
    }

    public final void p0() {
        if (this.u) {
            this.u = false;
            w30 w30Var = this.i;
            jc0 jc0Var = w30Var.a.G;
            nc0 nc0Var = jc0Var.c.s;
            for (nc0 nc0Var2 = jc0Var.d; !c10.i(nc0Var2, nc0Var) && nc0Var2 != null; nc0Var2 = nc0Var2.s) {
                d90 d90VarQ0 = nc0Var2.Q0(oc0.g(1048576));
                if (d90VarQ0 != null && (d90VarQ0.d.g & 1048576) != 0) {
                    boolean zG = oc0.g(1048576);
                    d90 d90VarO0 = nc0Var2.O0();
                    if (zG || (d90VarO0 = d90VarO0.h) != null) {
                        for (d90 d90VarQ02 = nc0Var2.Q0(zG); d90VarQ02 != null && (d90VarQ02.g & 1048576) != 0; d90VarQ02 = d90VarQ02.i) {
                            if ((d90VarQ02.f & 1048576) != 0) {
                                d90 d90VarI = d90VarQ02;
                                eb0 eb0Var = null;
                                while (d90VarI != null) {
                                    if ((d90VarI.f & 1048576) != 0 && (d90VarI instanceof mn)) {
                                        int i = 0;
                                        for (d90 d90Var = ((mn) d90VarI).s; d90Var != null; d90Var = d90Var.i) {
                                            if ((d90Var.f & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    d90VarI = d90Var;
                                                } else {
                                                    if (eb0Var == null) {
                                                        eb0Var = new eb0(new d90[16]);
                                                    }
                                                    if (d90VarI != null) {
                                                        eb0Var.b(d90VarI);
                                                        d90VarI = null;
                                                    }
                                                    eb0Var.b(d90Var);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    d90VarI = d80.i(eb0Var);
                                }
                            }
                            if (d90VarQ02 != d90VarO0) {
                            }
                        }
                    }
                }
                nc0Var2.g1();
            }
            eb0 eb0VarX = w30Var.a.x();
            Object[] objArr = eb0VarX.d;
            int i2 = eb0VarX.f;
            for (int i3 = 0; i3 < i2; i3++) {
                ((t30) objArr[i3]).H.p.p0();
            }
        }
    }

    @Override // defpackage.l2
    public final l2 q() {
        w30 w30Var;
        t30 t30VarT = this.i.a.t();
        if (t30VarT == null || (w30Var = t30VarT.H) == null) {
            return null;
        }
        return w30Var.p;
    }

    public final void q0() {
        w30 w30Var = this.i;
        if (w30Var.l > 0) {
            eb0 eb0VarX = w30Var.a.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                t30 t30Var = (t30) objArr[i2];
                w30 w30Var2 = t30Var.H;
                boolean z = w30Var2.j;
                k80 k80Var = w30Var2.p;
                if ((z || w30Var2.k) && !k80Var.x) {
                    t30Var.T(false);
                }
                k80Var.q0();
            }
        }
    }

    @Override // defpackage.l2
    public final void r() {
        this.C = true;
        u30 u30Var = this.z;
        u30Var.h();
        boolean z = this.x;
        w30 w30Var = this.i;
        if (z) {
            eb0 eb0VarX = w30Var.a.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                t30 t30Var = (t30) objArr[i2];
                if (t30Var.p() && t30Var.q() == r30.d && t30.O(t30Var)) {
                    t30.U(w30Var.a, false, 7);
                }
            }
        }
        if (this.y || (!o().n && this.x)) {
            this.x = false;
            p30 p30Var = w30Var.d;
            w30Var.d = p30.f;
            w30Var.g(false);
            t30 t30Var2 = w30Var.a;
            gg0 snapshotObserver = ((p3) r31.U(t30Var2)).getSnapshotObserver();
            snapshotObserver.a(t30Var2, snapshotObserver.e, this.F);
            w30Var.d = p30Var;
            if (o().n && w30Var.j) {
                requestLayout();
            }
            this.y = false;
        }
        if (u30Var.b && u30Var.e()) {
            u30Var.g();
        }
        this.C = false;
    }

    public final void r0() {
        w30 w30Var = this.i;
        t30.U(w30Var.a, false, 7);
        t30 t30Var = w30Var.a;
        t30 t30VarT = t30Var.t();
        if (t30VarT == null || t30Var.D != r30.f) {
            return;
        }
        int iOrdinal = t30VarT.H.d.ordinal();
        t30Var.D = iOrdinal != 0 ? iOrdinal != 2 ? t30VarT.D : r30.e : r30.d;
    }

    @Override // defpackage.l2
    public final void requestLayout() {
        this.i.a.T(false);
    }

    public final void s0() {
        this.H = true;
        w30 w30Var = this.i;
        t30 t30VarT = w30Var.a.t();
        float f = o().D;
        t30 t30Var = w30Var.a;
        jc0 jc0Var = t30Var.G;
        nc0 nc0Var = jc0Var.d;
        vz vzVar = jc0Var.c;
        while (nc0Var != vzVar) {
            c10.n(nc0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            n30 n30Var = (n30) nc0Var;
            f += n30Var.D;
            nc0Var = n30Var.s;
        }
        if (f != this.G) {
            this.G = f;
            if (t30VarT != null) {
                t30VarT.N();
            }
            if (t30VarT != null) {
                t30VarT.A();
            }
        }
        if (this.u) {
            t30Var.G.c.a1();
        } else {
            if (t30VarT != null) {
                t30VarT.A();
            }
            o0();
            if (this.j && t30VarT != null) {
                t30VarT.T(false);
            }
        }
        if (t30VarT != null) {
            w30 w30Var2 = t30VarT.H;
            if (!this.j && w30Var2.d == p30.f) {
                if (this.l != Integer.MAX_VALUE) {
                    pz.b("Place was called on a node which was placed already");
                }
                int i = w30Var2.i;
                this.l = i;
                w30Var2.i = i + 1;
            }
        } else {
            this.l = 0;
        }
        r();
    }

    public final void t0(long j) {
        w30 w30Var = this.i;
        p30 p30Var = w30Var.d;
        t30 t30Var = w30Var.a;
        p30 p30Var2 = p30.h;
        if (p30Var != p30Var2) {
            pz.b("layout state is not idle before measure starts");
        }
        this.D = j;
        p30 p30Var3 = p30.d;
        w30Var.d = p30Var3;
        this.w = false;
        gg0 snapshotObserver = ((p3) r31.U(t30Var)).getSnapshotObserver();
        snapshotObserver.a(t30Var, snapshotObserver.c, this.E);
        if (w30Var.d == p30Var3) {
            this.x = true;
            this.y = true;
            w30Var.d = p30Var2;
        }
    }

    @Override // defpackage.l2
    public final boolean u() {
        return this.u;
    }

    public final void u0(long j, float f, iw iwVar) {
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        t30 t30Var2 = w30Var.a;
        if (t30Var.P) {
            pz.a("place is called on a deactivated node");
        }
        w30Var.d = p30.f;
        this.p = j;
        this.r = f;
        this.q = iwVar;
        this.H = false;
        eg0 eg0VarU = r31.U(t30Var2);
        if (this.x || !this.u) {
            this.z.e = false;
            w30Var.f(false);
            this.I = iwVar;
            this.J = j;
            this.K = f;
            gg0 snapshotObserver = ((p3) eg0VarU).getSnapshotObserver();
            snapshotObserver.a(t30Var2, snapshotObserver.f, this.L);
        } else {
            nc0 nc0VarA = w30Var.a();
            nc0VarA.e1(m00.c(j, nc0VarA.h), f, iwVar);
            s0();
        }
        w30Var.d = p30.h;
        this.n = true;
    }

    public final boolean v0(long j) throws Throwable {
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        t30 t30Var2 = w30Var.a;
        try {
            if (t30Var.P) {
                pz.a("measure is called on a deactivated node");
            }
            eg0 eg0VarU = r31.U(t30Var2);
            t30 t30VarT = t30Var2.t();
            boolean z = true;
            t30Var2.F = t30Var2.F || (t30VarT != null && t30VarT.F);
            if (!t30Var2.p() && gj.b(this.g, j)) {
                ((p3) eg0VarU).i(t30Var2, false);
                t30Var2.W();
                return false;
            }
            this.z.d = false;
            eb0 eb0VarX = t30Var2.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((t30) objArr[i2]).H.p.z.getClass();
            }
            this.m = true;
            long j2 = w30Var.a().f;
            i0(j);
            t0(j);
            if (t00.a(w30Var.a().f, j2) && w30Var.a().d == this.d && w30Var.a().e == this.e) {
                z = false;
            }
            h0((w30Var.a().e & 4294967295L) | (w30Var.a().d << 32));
            return z;
        } catch (Throwable th) {
            t30Var.X(th);
            throw null;
        }
    }
}
