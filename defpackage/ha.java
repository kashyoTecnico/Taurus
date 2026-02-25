package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ha extends d90 implements l30, qq, et0, qj0, g90, ah0, b30, xw, iu, tu, wu, fg0, jc {
    public c90 r;
    public HashSet s;

    public final void A0(boolean z) {
        if (!this.q) {
            pz.b("initializeModifier called on unattached node");
        }
        c90 c90Var = this.r;
        if ((this.f & 32) != 0 && (c90Var instanceof ij)) {
            ga gaVar = new ga(this, 0);
            ma0 ma0Var = ((p3) d80.A(this)).w0;
            if (ma0Var.f(gaVar) < 0) {
                ma0Var.a(gaVar);
            }
        }
        if ((this.f & 4) != 0 && !z) {
            d80.x(this, 2).V0();
        }
        if ((this.f & 2) != 0) {
            xy0 xy0Var = d80.z(this).G.e;
            c10.n(xy0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (xy0Var.r) {
                nc0 nc0Var = this.k;
                c10.m(nc0Var);
                ((n30) nc0Var).q1(this);
                dg0 dg0Var = nc0Var.L;
                if (dg0Var != null) {
                    ((gx) dg0Var).invalidate();
                }
            }
            if (!z) {
                d80.x(this, 2).V0();
                d80.z(this).D();
            }
        }
        if ((this.f & 8) != 0) {
            ((p3) d80.A(this)).x();
        }
    }

    @Override // defpackage.fg0
    public final boolean B() {
        return this.q;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [gw, y20] */
    public final void B0() {
        if (!this.q) {
            pz.b("unInitializeModifier called on unattached node");
        }
        c90 c90Var = this.r;
        if ((this.f & 32) != 0 && (c90Var instanceof ij)) {
            ij ijVar = (ij) c90Var;
            u61 u61Var = (u61) q71.a.a.a();
            if (!c10.i(u61Var, ijVar.b)) {
                ijVar.b = u61Var;
                ijVar.a.g(u61Var);
            }
        }
        if ((this.f & 8) != 0) {
            ((p3) d80.A(this)).x();
        }
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j30) c90Var).e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, o80.d, p80.e, 1), hj.b(i, 0, 13)).c();
    }

    public final void C0() {
        if (this.q) {
            this.s.clear();
            ((p3) d80.A(this)).getSnapshotObserver().a(this, e3.p, new ga(this, 1));
        }
    }

    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) c90Var;
        ct0 ct0Var2 = new ct0();
        ct0Var2.f = appendedSemanticsElement.a;
        appendedSemanticsElement.b.g(ct0Var2);
        c10.n(ct0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ta0 ta0Var = ct0Var.d;
        if (ct0Var2.f) {
            ct0Var.f = true;
        }
        if (ct0Var2.g) {
            ct0Var.g = true;
        }
        ta0 ta0Var2 = ct0Var2.d;
        Object[] objArr = ta0Var2.b;
        Object[] objArr2 = ta0Var2.c;
        long[] jArr = ta0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ot0 ot0Var = (ot0) obj;
                        if (!ta0Var.b(ot0Var)) {
                            ta0Var.l(ot0Var, obj2);
                        } else if (obj2 instanceof j0) {
                            Object objG = ta0Var.g(ot0Var);
                            c10.n(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            j0 j0Var = (j0) objG;
                            String str = j0Var.a;
                            if (str == null) {
                                str = ((j0) obj2).a;
                            }
                            ow owVar = j0Var.b;
                            if (owVar == null) {
                                owVar = ((j0) obj2).b;
                            }
                            ta0Var.l(ot0Var, new j0(str, owVar));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j30) c90Var).e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, o80.d, p80.d, 1), hj.b(0, i, 7)).e();
    }

    @Override // defpackage.tu
    public final void Q(ru ruVar) {
        c90 c90Var = this.r;
        pz.b("applyFocusProperties called on wrong node");
        c90Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.iu
    public final void S(yu yuVar) {
        c90 c90Var = this.r;
        pz.b("onFocusEvent called on wrong node");
        c90Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.qj0
    public final boolean U() {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.jc
    public final xn b() {
        return d80.z(this).z;
    }

    @Override // defpackage.qj0
    public final void b0() {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.jc
    public final long c() {
        return d80.F(d80.x(this, 128).f);
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((pq) c90Var).d(v30Var);
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j30) c90Var).e(n80Var, g80Var, j);
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j30) c90Var).e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, o80.e, p80.d, 1), hj.b(0, i, 7)).e();
    }

    @Override // defpackage.ah0
    public final Object g0(Object obj) {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.jc
    public final e30 getLayoutDirection() {
        return d80.z(this).A;
    }

    @Override // defpackage.qq
    public final void h0() {
        m20.F(this);
    }

    @Override // defpackage.g90
    public final g2 i() {
        return g2.B;
    }

    @Override // defpackage.qj0
    public final boolean i0() {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        c90 c90Var = this.r;
        c10.n(c90Var, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((j30) c90Var).e(new i10(v60Var, v60Var.getLayoutDirection()), new an(g80Var, o80.e, p80.e, 1), hj.b(i, 0, 13)).c();
    }

    @Override // defpackage.d90
    public final void s0() {
        A0(true);
    }

    @Override // defpackage.d90
    public final void t0() {
        B0();
    }

    public final String toString() {
        return this.r.toString();
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        c10.n(this.r, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [gw, y20] */
    @Override // defpackage.g90
    public final Object v(rq rqVar) {
        jc0 jc0Var;
        this.s.add(rqVar);
        if (!this.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var = this.d.h;
        t30 t30VarZ = d80.z(this);
        while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 32) != 0) {
                while (d90Var != null) {
                    if ((d90Var.f & 32) != 0) {
                        mn mnVarI = d90Var;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof g90) {
                                g90 g90Var = (g90) mnVarI;
                                if (g90Var.i().j()) {
                                    g90Var.i().k();
                                    throw null;
                                }
                            } else if ((mnVarI.f & 32) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var2 = mnVarI.s;
                                int i = 0;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                                while (d90Var2 != null) {
                                    if ((d90Var2.f & 32) != 0) {
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
                    d90Var = d90Var.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        return rqVar.a.a();
    }

    @Override // defpackage.ln, defpackage.qj0
    public final void a() {
    }

    @Override // defpackage.b30
    public final void n(d30 d30Var) {
    }

    @Override // defpackage.b30
    public final void r(long j) {
    }
}
