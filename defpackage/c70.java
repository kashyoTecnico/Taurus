package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c70 extends oi0 implements g80, l2, o90 {
    public final w30 i;
    public boolean j;
    public boolean n;
    public boolean o;
    public gj p;
    public iw r;
    public boolean w;
    public Object y;
    public boolean z;
    public int k = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;
    public r30 m = r30.f;
    public long q = 0;
    public z60 s = z60.f;
    public final u30 t = new u30(this, 1);
    public final eb0 u = new eb0(new c70[16]);
    public boolean v = true;
    public boolean x = true;

    public c70(w30 w30Var) {
        this.i = w30Var;
        this.y = w30Var.p.t;
    }

    @Override // defpackage.g80
    public final int S(int i) {
        q0();
        x60 x60VarM0 = this.i.a().M0();
        c10.m(x60VarM0);
        return x60VarM0.S(i);
    }

    @Override // defpackage.l2
    public final void U() {
        t30.S(this.i.a, false, 7);
    }

    @Override // defpackage.g80
    public final int X(int i) {
        q0();
        x60 x60VarM0 = this.i.a().M0();
        c10.m(x60VarM0);
        return x60VarM0.X(i);
    }

    @Override // defpackage.l2
    public final u30 a() {
        return this.t;
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        q0();
        x60 x60VarM0 = this.i.a().M0();
        c10.m(x60VarM0);
        return x60VarM0.b0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // defpackage.g80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oi0 e(long r6) {
        /*
            r5 = this;
            w30 r0 = r5.i
            t30 r1 = r0.a
            t30 r1 = r1.t()
            r2 = 0
            if (r1 == 0) goto L10
            w30 r1 = r1.H
            p30 r1 = r1.d
            goto L11
        L10:
            r1 = r2
        L11:
            p30 r3 = defpackage.p30.e
            if (r1 == r3) goto L25
            t30 r1 = r0.a
            t30 r1 = r1.t()
            if (r1 == 0) goto L21
            w30 r1 = r1.H
            p30 r2 = r1.d
        L21:
            p30 r1 = defpackage.p30.g
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.b = r1
        L28:
            t30 r1 = r0.a
            t30 r2 = r1.t()
            if (r2 == 0) goto L72
            w30 r2 = r2.H
            r30 r3 = r5.m
            r30 r4 = defpackage.r30.f
            if (r3 == r4) goto L42
            boolean r1 = r1.F
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.pz.b(r1)
        L42:
            p30 r1 = r2.d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r6.<init>(r7)
            p30 r7 = r2.d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6a:
            r30 r1 = defpackage.r30.e
            goto L6f
        L6d:
            r30 r1 = defpackage.r30.d
        L6f:
            r5.m = r1
            goto L76
        L72:
            r30 r1 = defpackage.r30.f
            r5.m = r1
        L76:
            t30 r0 = r0.a
            r30 r1 = r0.D
            r30 r2 = defpackage.r30.f
            if (r1 != r2) goto L81
            r0.e()
        L81:
            r5.t0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c70.e(long):oi0");
    }

    @Override // defpackage.g80
    public final int f(int i) {
        q0();
        x60 x60VarM0 = this.i.a().M0();
        c10.m(x60VarM0);
        return x60VarM0.f(i);
    }

    @Override // defpackage.oi0
    public final void g0(long j, float f, iw iwVar) throws Throwable {
        s0(j, iwVar);
    }

    @Override // defpackage.l2
    public final void j(h hVar) {
        eb0 eb0VarX = this.i.a.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            c70 c70Var = ((t30) objArr[i2]).H.q;
            c10.m(c70Var);
            hVar.g(c70Var);
        }
    }

    public final void k0(boolean z) {
        w30 w30Var = this.i;
        if (z && w30Var.c) {
            return;
        }
        if (z || w30Var.c) {
            this.s = z60.f;
            eb0 eb0VarX = w30Var.a.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                c70 c70Var = ((t30) objArr[i2]).H.q;
                c10.m(c70Var);
                c70Var.k0(true);
            }
        }
    }

    @Override // defpackage.oi0, defpackage.g80
    public final Object l() {
        return this.y;
    }

    @Override // defpackage.o90
    public final void n(boolean z) {
        x60 x60VarM0;
        w30 w30Var = this.i;
        x60 x60VarM02 = w30Var.a().M0();
        if (Boolean.valueOf(z).equals(x60VarM02 != null ? Boolean.valueOf(x60VarM02.l) : null) || (x60VarM0 = w30Var.a().M0()) == null) {
            return;
        }
        x60VarM0.l = z;
    }

    @Override // defpackage.l2
    public final vz o() {
        return this.i.a.G.c;
    }

    public final void o0() {
        z60 z60Var = this.s;
        w30 w30Var = this.i;
        boolean z = w30Var.c;
        t30 t30Var = w30Var.a;
        z60 z60Var2 = z60.d;
        if (z) {
            this.s = z60.e;
        } else {
            this.s = z60Var2;
        }
        if (z60Var != z60Var2 && w30Var.e) {
            t30.S(t30Var, true, 6);
        }
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            c70 c70Var = t30Var2.H.q;
            if (c70Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c70Var.l != Integer.MAX_VALUE) {
                c70Var.o0();
                t30.V(t30Var2);
            }
        }
    }

    public final void p0() {
        w30 w30Var = this.i;
        if (w30Var.o > 0) {
            eb0 eb0VarX = w30Var.a.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                t30 t30Var = (t30) objArr[i2];
                w30 w30Var2 = t30Var.H;
                if ((w30Var2.m || w30Var2.n) && !w30Var2.f) {
                    t30Var.R(false);
                }
                c70 c70Var = w30Var2.q;
                if (c70Var != null) {
                    c70Var.p0();
                }
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
        return w30Var.q;
    }

    public final void q0() {
        w30 w30Var = this.i;
        t30.S(w30Var.a, false, 7);
        t30 t30Var = w30Var.a;
        t30 t30VarT = t30Var.t();
        if (t30VarT == null || t30Var.D != r30.f) {
            return;
        }
        int iOrdinal = t30VarT.H.d.ordinal();
        t30Var.D = iOrdinal != 0 ? iOrdinal != 2 ? t30VarT.D : r30.e : r30.d;
    }

    @Override // defpackage.l2
    public final void r() {
        this.w = true;
        u30 u30Var = this.t;
        u30Var.h();
        w30 w30Var = this.i;
        boolean z = w30Var.f;
        t30 t30Var = w30Var.a;
        if (z) {
            eb0 eb0VarX = t30Var.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                t30 t30Var2 = (t30) objArr[i2];
                w30 w30Var2 = t30Var2.H;
                if (w30Var2.e && t30Var2.r() == r30.d) {
                    c70 c70Var = w30Var2.q;
                    c10.m(c70Var);
                    c70 c70Var2 = w30Var2.q;
                    gj gjVar = c70Var2 != null ? c70Var2.p : null;
                    c10.m(gjVar);
                    if (c70Var.t0(gjVar.a)) {
                        t30.S(t30Var, false, 7);
                    }
                }
            }
        }
        uz uzVar = o().S;
        c10.m(uzVar);
        if (w30Var.g || (!uzVar.n && w30Var.f)) {
            w30Var.f = false;
            p30 p30Var = w30Var.d;
            w30Var.d = p30.g;
            eg0 eg0VarU = r31.U(t30Var);
            w30Var.i(false);
            gg0 snapshotObserver = ((p3) eg0VarU).getSnapshotObserver();
            g3 g3Var = new g3(11, this, uzVar);
            snapshotObserver.getClass();
            if (t30Var.j != null) {
                snapshotObserver.a(t30Var, snapshotObserver.h, g3Var);
            } else {
                snapshotObserver.a(t30Var, snapshotObserver.e, g3Var);
            }
            w30Var.d = p30Var;
            if (w30Var.m && uzVar.n) {
                requestLayout();
            }
            w30Var.g = false;
        }
        if (u30Var.b && u30Var.e()) {
            u30Var.g();
        }
        this.w = false;
    }

    public final void r0() {
        p30 p30Var;
        this.z = true;
        w30 w30Var = this.i;
        t30 t30VarT = w30Var.a.t();
        z60 z60Var = this.s;
        if ((z60Var != z60.d && !w30Var.c) || (z60Var != z60.e && w30Var.c)) {
            o0();
            if (this.j && t30VarT != null) {
                t30VarT.R(false);
            }
        }
        if (t30VarT != null) {
            w30 w30Var2 = t30VarT.H;
            if (!this.j && ((p30Var = w30Var2.d) == p30.f || p30Var == p30.g)) {
                if (this.l != Integer.MAX_VALUE) {
                    pz.b("Place was called on a node which was placed already");
                }
                int i = w30Var2.h;
                this.l = i;
                w30Var2.h = i + 1;
            }
        } else {
            this.l = 0;
        }
        r();
    }

    @Override // defpackage.l2
    public final void requestLayout() {
        this.i.a.R(false);
    }

    public final void s0(long j, iw iwVar) throws Throwable {
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        t30 t30Var2 = w30Var.a;
        try {
            t30 t30VarT = t30Var.t();
            p30 p30Var = t30VarT != null ? t30VarT.H.d : null;
            p30 p30Var2 = p30.g;
            if (p30Var == p30Var2) {
                w30Var.c = false;
            }
            if (t30Var2.P) {
                pz.a("place is called on a deactivated node");
            }
            w30Var.d = p30Var2;
            this.n = true;
            this.z = false;
            if (!m00.a(j, this.q)) {
                if (w30Var.n || w30Var.m) {
                    w30Var.f = true;
                }
                p0();
            }
            eg0 eg0VarU = r31.U(t30Var2);
            if (w30Var.f || !u()) {
                w30Var.h(false);
                this.t.e = false;
                gg0 snapshotObserver = ((p3) eg0VarU).getSnapshotObserver();
                b70 b70Var = new b70(this, eg0VarU, j);
                snapshotObserver.getClass();
                if (t30Var2.j != null) {
                    snapshotObserver.a(t30Var2, snapshotObserver.g, b70Var);
                } else {
                    snapshotObserver.a(t30Var2, snapshotObserver.f, b70Var);
                }
            } else {
                x60 x60VarM0 = w30Var.a().M0();
                c10.m(x60VarM0);
                x60VarM0.F0(m00.c(j, x60VarM0.h));
                r0();
            }
            this.q = j;
            this.r = iwVar;
            w30Var.d = p30.h;
        } catch (Throwable th) {
            t30Var.X(th);
            throw null;
        }
    }

    public final boolean t0(long j) throws Throwable {
        long j2;
        w30 w30Var = this.i;
        t30 t30Var = w30Var.a;
        t30 t30Var2 = w30Var.a;
        try {
            if (t30Var.P) {
                pz.a("measure is called on a deactivated node");
            }
            t30 t30VarT = t30Var2.t();
            t30Var2.F = t30Var2.F || (t30VarT != null && t30VarT.F);
            if (!t30Var2.H.e) {
                gj gjVar = this.p;
                if (gjVar == null ? false : gj.b(gjVar.a, j)) {
                    eg0 eg0Var = t30Var2.p;
                    if (eg0Var != null) {
                        ((p3) eg0Var).i(t30Var2, true);
                    }
                    t30Var2.W();
                    return false;
                }
            }
            this.p = new gj(j);
            i0(j);
            this.t.d = false;
            eb0 eb0VarX = t30Var2.x();
            Object[] objArr = eb0VarX.d;
            int i = eb0VarX.f;
            for (int i2 = 0; i2 < i; i2++) {
                c70 c70Var = ((t30) objArr[i2]).H.q;
                c10.m(c70Var);
                c70Var.t.getClass();
            }
            if (this.o) {
                j2 = this.f;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.o = true;
            x60 x60VarM0 = w30Var.a().M0();
            if (!(x60VarM0 != null)) {
                pz.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            w30Var.c(j);
            h0((x60VarM0.e & 4294967295L) | (x60VarM0.d << 32));
            return (((int) (j2 >> 32)) == x60VarM0.d && ((int) (j2 & 4294967295L)) == x60VarM0.e) ? false : true;
        } catch (Throwable th) {
            t30Var.X(th);
            throw null;
        }
    }

    @Override // defpackage.l2
    public final boolean u() {
        return this.s != z60.f;
    }
}
