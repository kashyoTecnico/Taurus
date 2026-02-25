package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i80 {
    public final t30 a;
    public boolean c;
    public boolean d;
    public gj i;
    public final e9 b = new e9(3);
    public final xz e = new xz(15);
    public final eb0 f = new eb0(new t30[16]);
    public final long g = 1;
    public final eb0 h = new eb0(new h80[16]);

    public i80(t30 t30Var) {
        this.a = t30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.t30 r5, defpackage.gj r6) throws java.lang.Throwable {
        /*
            t30 r0 = r5.j
            w30 r1 = r5.H
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            c70 r0 = r1.q
            defpackage.c10.m(r0)
            long r3 = r6.a
            boolean r6 = r0.t0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            c70 r6 = r1.q
            if (r6 == 0) goto L21
            gj r1 = r6.p
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            defpackage.c10.m(r6)
            long r0 = r1.a
            boolean r6 = r6.t0(r0)
        L2f:
            t30 r0 = r5.t()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            t30 r1 = r0.j
            r3 = 3
            if (r1 != 0) goto L40
            defpackage.t30.U(r0, r2, r3)
            return r6
        L40:
            r30 r1 = r5.r()
            r30 r4 = defpackage.r30.d
            if (r1 != r4) goto L4c
            defpackage.t30.S(r0, r2, r3)
            return r6
        L4c:
            r30 r5 = r5.r()
            r30 r1 = defpackage.r30.e
            if (r5 != r1) goto L57
            r0.R(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i80.b(t30, gj):boolean");
    }

    public static boolean c(t30 t30Var, gj gjVar) throws Throwable {
        boolean zO;
        if (gjVar != null) {
            if (t30Var.D == r30.f) {
                t30Var.e();
            }
            zO = t30Var.H.p.v0(gjVar.a);
        } else {
            zO = t30.O(t30Var);
        }
        t30 t30VarT = t30Var.t();
        if (zO && t30VarT != null) {
            if (t30Var.q() == r30.d) {
                t30.U(t30VarT, false, 3);
                return zO;
            }
            if (t30Var.q() == r30.e) {
                t30VarT.T(false);
            }
        }
        return zO;
    }

    public static boolean f(t30 t30Var) {
        c70 c70Var;
        u30 u30Var;
        if (t30Var.H.e) {
            return (t30Var.r() == r30.f && ((c70Var = t30Var.H.q) == null || (u30Var = c70Var.t) == null || !u30Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean g(t30 t30Var) {
        if (!t30Var.p()) {
            return false;
        }
        do {
            if (t30Var.q() == r30.f && !t30Var.H.p.z.e()) {
                t30 t30VarT = t30Var.t();
                if ((t30VarT != null ? t30VarT.H.d : null) != p30.d) {
                    return false;
                }
            }
            t30Var = t30Var.t();
            if (t30Var == null) {
                return false;
            }
        } while (!t30Var.I());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            xz r1 = r6.e
            if (r7 == 0) goto L17
            java.lang.Object r7 = r1.e
            eb0 r7 = (defpackage.eb0) r7
            t30 r6 = r6.a
            int r2 = r6.O
            if (r2 <= 0) goto L17
            r7.g()
            r7.b(r6)
            r6.N = r0
        L17:
            java.lang.Object r6 = r1.e
            eb0 r6 = (defpackage.eb0) r6
            int r7 = r6.f
            if (r7 == 0) goto L62
            bv r2 = defpackage.bv.d
            java.lang.Object[] r3 = r6.d
            r4 = 0
            defpackage.y9.z0(r3, r2, r4, r7)
            int r7 = r6.f
            java.lang.Object r2 = r1.f
            t30[] r2 = (defpackage.t30[]) r2
            if (r2 == 0) goto L32
            int r3 = r2.length
            if (r3 >= r7) goto L3a
        L32:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r7)
            t30[] r2 = new defpackage.t30[r2]
        L3a:
            r3 = 0
            r1.f = r3
        L3d:
            if (r4 >= r7) goto L48
            java.lang.Object[] r5 = r6.d
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L3d
        L48:
            r6.g()
            int r7 = r7 - r0
        L4c:
            r6 = -1
            if (r6 >= r7) goto L60
            r6 = r2[r7]
            defpackage.c10.m(r6)
            boolean r0 = r6.N
            if (r0 == 0) goto L5b
            defpackage.xz.l(r6)
        L5b:
            r2[r7] = r3
            int r7 = r7 + (-1)
            goto L4c
        L60:
            r1.f = r2
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i80.a(boolean):void");
    }

    public final void d(t30 t30Var, boolean z) {
        if (!this.c) {
            pz.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? t30Var.H.e : t30Var.p()) {
            pz.a("node not yet measured");
        }
        e(t30Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.t30 r11, boolean r12) {
        /*
            r10 = this;
            eb0 r0 = r11.x()
            java.lang.Object[] r1 = r0.d
            int r0 = r0.f
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto La5
            r4 = r1[r3]
            t30 r4 = (defpackage.t30) r4
            r30 r5 = defpackage.r30.d
            r6 = 1
            if (r12 != 0) goto L28
            r30 r7 = r4.q()
            if (r7 == r5) goto L40
            w30 r7 = r4.H
            k80 r7 = r7.p
            u30 r7 = r7.z
            boolean r7 = r7.e()
            if (r7 == 0) goto L28
            goto L40
        L28:
            if (r12 == 0) goto La1
            r30 r7 = r4.r()
            if (r7 == r5) goto L40
            w30 r5 = r4.H
            c70 r5 = r5.q
            if (r5 == 0) goto La1
            u30 r5 = r5.t
            if (r5 == 0) goto La1
            boolean r5 = r5.e()
            if (r5 != r6) goto La1
        L40:
            boolean r5 = defpackage.b10.N(r4)
            w30 r7 = r4.H
            if (r5 == 0) goto L85
            if (r12 != 0) goto L85
            boolean r5 = r7.e
            if (r5 == 0) goto L82
            e9 r5 = r10.b
            r5.getClass()
            t30 r8 = r4.j
            if (r8 != 0) goto L59
            r8 = r6
            goto L5a
        L59:
            r8 = r2
        L5a:
            java.lang.Object r9 = r5.a
            r1 r9 = (defpackage.r1) r9
            java.lang.Object r9 = r9.e
            gw0 r9 = (defpackage.gw0) r9
            boolean r9 = r9.contains(r4)
            if (r9 != 0) goto L79
            java.lang.Object r5 = r5.b
            r1 r5 = (defpackage.r1) r5
            java.lang.Object r5 = r5.e
            gw0 r5 = (defpackage.gw0) r5
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L77
            goto L79
        L77:
            r5 = r2
            goto L7a
        L79:
            r5 = r6
        L7a:
            if (r8 != 0) goto L82
            if (r5 == 0) goto L82
            r10.j(r4, r6, r2)
            goto L85
        L82:
            r10.d(r4, r6)
        L85:
            if (r12 == 0) goto L8a
            boolean r5 = r7.e
            goto L8e
        L8a:
            boolean r5 = r4.p()
        L8e:
            if (r5 == 0) goto L93
            r10.j(r4, r12, r2)
        L93:
            if (r12 == 0) goto L98
            boolean r5 = r7.e
            goto L9c
        L98:
            boolean r5 = r4.p()
        L9c:
            if (r5 != 0) goto La1
            r10.e(r4, r12)
        La1:
            int r3 = r3 + 1
            goto La
        La5:
            if (r12 == 0) goto Lac
            w30 r0 = r11.H
            boolean r0 = r0.e
            goto Lb0
        Lac:
            boolean r0 = r11.p()
        Lb0:
            if (r0 == 0) goto Lb5
            r10.j(r11, r12, r2)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i80.e(t30, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [d90] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean h(m3 m3Var) {
        boolean z;
        d90 d90Var;
        d90 d90VarI;
        boolean z2;
        t30 t30Var;
        boolean z3;
        e9 e9Var = this.b;
        t30 t30Var2 = this.a;
        if (!t30Var2.H()) {
            pz.a("performMeasureAndLayout called with unattached root");
        }
        if (!t30Var2.I()) {
            pz.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            pz.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zU = e9Var.u();
                r1 r1Var = (r1) e9Var.a;
                if (zU) {
                    z = false;
                    while (true) {
                        r1 r1Var2 = (r1) e9Var.c;
                        r1 r1Var3 = (r1) e9Var.b;
                        if (!((gw0) r1Var.e).isEmpty()) {
                            t30Var = (t30) ((gw0) r1Var.e).first();
                            r1Var.p(t30Var);
                            z3 = t30Var.j != null;
                            z2 = false;
                        } else if (!((gw0) r1Var3.e).isEmpty()) {
                            t30Var = (t30) ((gw0) r1Var3.e).first();
                            r1Var3.p(t30Var);
                            z3 = t30Var.j != null;
                            z2 = true;
                        } else {
                            if (((gw0) r1Var2.e).isEmpty()) {
                                break;
                            }
                            t30 t30Var3 = (t30) ((gw0) r1Var2.e).first();
                            r1Var2.p(t30Var3);
                            z2 = true;
                            t30Var = t30Var3;
                            z3 = false;
                        }
                        boolean zJ = j(t30Var, z3, z2);
                        if (!z2) {
                            if (t30Var.H.f) {
                                e9Var.a(t30Var, k10.e);
                            }
                            if (t30Var.o()) {
                                e9Var.a(t30Var, k10.g);
                            }
                        }
                        if (t30Var == t30Var2 && zJ) {
                            z = true;
                        }
                    }
                    if (m3Var != null) {
                        m3Var.a();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        eb0 eb0Var = this.f;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        int i2 = 0;
        while (i2 < i) {
            jc0 jc0Var = ((t30) objArr[i2]).G;
            vz vzVar = jc0Var.c;
            boolean zG = oc0.g(128);
            if (zG) {
                d90Var = vzVar.R;
            } else {
                d90Var = vzVar.R.h;
                if (d90Var == null) {
                }
                i2++;
                z4 = false;
            }
            an0 an0Var = nc0.M;
            d90 d90VarQ0 = vzVar.Q0(zG);
            while (d90VarQ0 != null && (d90VarQ0.g & 128) != 0) {
                if ((d90VarQ0.f & 128) != 0) {
                    mn mnVar = d90VarQ0;
                    eb0 eb0Var2 = null;
                    while (mnVar != 0) {
                        if (mnVar instanceof b30) {
                            ((b30) mnVar).n(jc0Var.c);
                        } else {
                            if ((mnVar.f & 128) != 0 && (mnVar instanceof mn)) {
                                d90 d90Var2 = mnVar.s;
                                ?? r15 = z4;
                                d90VarI = mnVar;
                                eb0Var2 = eb0Var2;
                                while (d90Var2 != null) {
                                    if ((d90Var2.f & 128) != 0) {
                                        r15++;
                                        eb0Var2 = eb0Var2;
                                        if (r15 == 1) {
                                            d90VarI = d90Var2;
                                        } else {
                                            if (eb0Var2 == null) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (d90VarI != null) {
                                                eb0Var2.b(d90VarI);
                                                d90VarI = null;
                                            }
                                            eb0Var2.b(d90Var2);
                                        }
                                    }
                                    d90Var2 = d90Var2.i;
                                    d90VarI = d90VarI;
                                    eb0Var2 = eb0Var2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z4 = false;
                            mnVar = d90VarI;
                            eb0Var2 = eb0Var2;
                        }
                        d90VarI = d80.i(eb0Var2);
                        z4 = false;
                        mnVar = d90VarI;
                        eb0Var2 = eb0Var2;
                    }
                }
                if (d90VarQ0 != d90Var) {
                    d90VarQ0 = d90VarQ0.i;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        eb0Var.g();
        return z;
    }

    public final void i() {
        e9 e9Var = this.b;
        if (e9Var.u()) {
            t30 t30Var = this.a;
            if (!t30Var.H()) {
                pz.a("performMeasureAndLayout called with unattached root");
            }
            if (!t30Var.I()) {
                pz.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                pz.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((gw0) ((r1) e9Var.c).e).isEmpty() && !((gw0) ((r1) e9Var.a).e).isEmpty()) {
                        if (t30Var.j != null) {
                            l(t30Var, true);
                        } else {
                            k(t30Var);
                        }
                    }
                    l(t30Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(t30 t30Var, boolean z, boolean z2) {
        gj gjVar;
        boolean zC;
        t30 t30VarT;
        ni0 placementScope;
        vz vzVar;
        t30 t30VarT2;
        t30 t30VarT3;
        c70 c70Var;
        u30 u30Var;
        boolean z3 = t30Var.P;
        w30 w30Var = t30Var.H;
        boolean z4 = false;
        Object[] objArr = 0;
        if (z3 || (!t30Var.I() && !w30Var.p.v && !g(t30Var) && !c10.i(t30Var.J(), Boolean.TRUE) && !f(t30Var) && !w30Var.p.z.e() && ((c70Var = w30Var.q) == null || (u30Var = c70Var.t) == null || !u30Var.e()))) {
            return false;
        }
        t30 t30Var2 = this.a;
        if (t30Var == t30Var2) {
            gjVar = this.i;
            c10.m(gjVar);
        } else {
            gjVar = null;
        }
        r30 r30Var = r30.f;
        if (z) {
            zC = w30Var.e ? b(t30Var, gjVar) : false;
            if (z2 && ((zC || w30Var.f) && c10.i(t30Var.J(), Boolean.TRUE))) {
                if (t30Var.D == r30Var) {
                    t30Var.f();
                }
                c70 c70Var2 = w30Var.q;
                c10.m(c70Var2);
                try {
                    c70Var2.j = true;
                    if (!c70Var2.n) {
                        pz.b("replace() called on item that was not placed");
                    }
                    c70Var2.z = false;
                    boolean zU = c70Var2.u();
                    c70Var2.s0(c70Var2.q, c70Var2.r);
                    if (zU && !c70Var2.z && (t30VarT3 = c70Var2.i.a.t()) != null) {
                        t30VarT3.R(false);
                    }
                    c70Var2.j = false;
                } catch (Throwable th) {
                    c70Var2.j = false;
                    throw th;
                }
            }
        } else {
            zC = t30Var.p() ? c(t30Var, gjVar) : false;
            if (z2 && t30Var.o() && (t30Var == t30Var2 || ((t30VarT2 = t30Var.t()) != null && t30VarT2.I() && w30Var.p.v))) {
                if (t30Var == t30Var2) {
                    if (t30Var.D == r30Var) {
                        t30Var.f();
                    }
                    t30 t30VarT4 = t30Var.t();
                    if (t30VarT4 == null || (vzVar = t30VarT4.G.c) == null || (placementScope = vzVar.o) == null) {
                        placementScope = ((p3) r31.U(t30Var)).getPlacementScope();
                    }
                    ni0.j(placementScope, w30Var.p, 0, 0);
                } else {
                    if (t30Var.D == r30Var) {
                        t30Var.f();
                    }
                    k80 k80Var = w30Var.p;
                    w30 w30Var2 = k80Var.i;
                    try {
                        k80Var.j = true;
                        if (!k80Var.n) {
                            pz.b("replace called on unplaced item");
                        }
                        boolean z5 = k80Var.u;
                        k80Var.u0(k80Var.p, k80Var.r, k80Var.q);
                        if (z5 && !k80Var.H && (t30VarT = w30Var2.a.t()) != null) {
                            t30VarT.T(false);
                        }
                    } finally {
                    }
                }
                xz xzVar = this.e;
                xzVar.getClass();
                if (t30Var.O > 0) {
                    ((eb0) xzVar.e).b(t30Var);
                    t30Var.N = true;
                }
                ((p3) r31.U(t30Var)).getRectManager().e(t30Var);
            }
        }
        eb0 eb0Var = this.h;
        int i = eb0Var.f;
        if (i != 0) {
            Object[] objArr2 = eb0Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                h80 h80Var = (h80) objArr2[i2];
                t30 t30Var3 = h80Var.a;
                boolean z6 = h80Var.c;
                t30 t30Var4 = h80Var.a;
                if (t30Var3.H()) {
                    if (h80Var.b) {
                        t30.S(t30Var4, z6, 2);
                    } else {
                        t30.U(t30Var4, z6, 2);
                    }
                }
            }
            eb0Var.g();
        }
        return zC;
    }

    public final void k(t30 t30Var) throws Throwable {
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            if (t30Var2.q() == r30.d || t30Var2.H.p.z.e()) {
                if (b10.N(t30Var2)) {
                    l(t30Var2, true);
                } else {
                    k(t30Var2);
                }
            }
        }
    }

    public final void l(t30 t30Var, boolean z) throws Throwable {
        gj gjVar;
        if (t30Var.P) {
            return;
        }
        if (t30Var == this.a) {
            gjVar = this.i;
            c10.m(gjVar);
        } else {
            gjVar = null;
        }
        if (z) {
            b(t30Var, gjVar);
        } else {
            c(t30Var, gjVar);
        }
    }

    public final boolean m(t30 t30Var, boolean z) {
        int iOrdinal = t30Var.H.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new h80(t30Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    throw new fg();
                }
                if (!t30Var.p() || z) {
                    t30Var.H.p.w = true;
                    if (!t30Var.P && (t30Var.I() || g(t30Var))) {
                        t30 t30VarT = t30Var.t();
                        if (t30VarT == null || !t30VarT.p()) {
                            this.b.a(t30Var, k10.f);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void n(long j) {
        gj gjVar = this.i;
        if (gjVar == null ? false : gj.b(gjVar.a, j)) {
            return;
        }
        if (this.c) {
            pz.a("updateRootConstraints called while measuring");
        }
        this.i = new gj(j);
        t30 t30Var = this.a;
        t30 t30Var2 = t30Var.j;
        w30 w30Var = t30Var.H;
        if (t30Var2 != null) {
            w30Var.e = true;
        }
        w30Var.p.w = true;
        this.b.a(t30Var, t30Var2 != null ? k10.d : k10.f);
    }
}
