package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class oj extends d90 implements b30, pi {
    public if0 r;
    public final mr0 s;
    public boolean t;
    public d30 v;
    public xl0 w;
    public boolean x;
    public boolean z;
    public final r1 u = new r1(2);
    public long y = 0;

    public oj(if0 if0Var, mr0 mr0Var, boolean z) {
        this.r = if0Var;
        this.s = mr0Var;
        this.t = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EDGE_INSN: B:43:0x006b->B:25:0x006b BREAK  A[LOOP:0: B:8:0x001c->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:8:0x001c->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A0(defpackage.oj r11, defpackage.ub r12) {
        /*
            long r0 = r11.y
            r2 = 0
            boolean r0 = defpackage.t00.a(r0, r2)
            if (r0 == 0) goto Lc
            goto L77
        Lc:
            r1 r0 = r11.u
            java.lang.Object r0 = r0.e
            eb0 r0 = (defpackage.eb0) r0
            int r1 = r0.f
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L6a
            int r1 = r1 - r3
            java.lang.Object[] r0 = r0.d
            r4 = r2
        L1c:
            r5 = r0[r1]
            nj r5 = (defpackage.nj) r5
            nb r5 = r5.a
            java.lang.Object r5 = r5.a()
            xl0 r5 = (defpackage.xl0) r5
            if (r5 == 0) goto L65
            long r6 = r5.c()
            long r8 = r11.y
            long r8 = defpackage.d80.F(r8)
            if0 r10 = r11.r
            int r10 = r10.ordinal()
            if (r10 == 0) goto L51
            if (r10 != r3) goto L4b
            float r6 = defpackage.yu0.d(r6)
            float r7 = defpackage.yu0.d(r8)
            int r6 = java.lang.Float.compare(r6, r7)
            goto L5d
        L4b:
            fg r11 = new fg
            r11.<init>()
            throw r11
        L51:
            float r6 = defpackage.yu0.b(r6)
            float r7 = defpackage.yu0.b(r8)
            int r6 = java.lang.Float.compare(r6, r7)
        L5d:
            if (r6 > 0) goto L61
            r4 = r5
            goto L65
        L61:
            if (r4 != 0) goto L6b
            r4 = r5
            goto L6b
        L65:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1c
            goto L6b
        L6a:
            r4 = r2
        L6b:
            if (r4 != 0) goto L7a
            boolean r0 = r11.x
            if (r0 == 0) goto L75
            xl0 r2 = r11.B0()
        L75:
            if (r2 != 0) goto L79
        L77:
            r11 = 0
            return r11
        L79:
            r4 = r2
        L7a:
            long r0 = r11.y
            long r0 = defpackage.d80.F(r0)
            if0 r11 = r11.r
            int r11 = r11.ordinal()
            if (r11 == 0) goto L9e
            if (r11 != r3) goto L98
            float r11 = r4.a
            float r2 = r4.c
            float r2 = r2 - r11
            float r0 = defpackage.yu0.d(r0)
            float r11 = r12.a(r11, r2, r0)
            return r11
        L98:
            fg r11 = new fg
            r11.<init>()
            throw r11
        L9e:
            float r11 = r4.b
            float r2 = r4.d
            float r2 = r2 - r11
            float r0 = defpackage.yu0.b(r0)
            float r11 = r12.a(r11, r2, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj.A0(oj, ub):float");
    }

    public final xl0 B0() {
        if (this.q) {
            nc0 nc0VarY = d80.y(this);
            d30 d30Var = this.v;
            if (d30Var != null) {
                if (!d30Var.H()) {
                    d30Var = null;
                }
                if (d30Var != null) {
                    return nc0VarY.P(d30Var, false);
                }
            }
        }
        return null;
    }

    public final boolean C0(xl0 xl0Var, long j) {
        long jE0 = E0(xl0Var, j);
        return Math.abs(ed0.d(jE0)) <= 0.5f && Math.abs(ed0.e(jE0)) <= 0.5f;
    }

    public final void D0() {
        ub ubVar = (ub) l81.A(this, wb.a);
        if (this.z) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        nm.z(o0(), null, new y5(this, new r41(ubVar.b()), ubVar, null, 3), 1);
    }

    public final long E0(xl0 xl0Var, long j) {
        long jF = d80.F(j);
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            ub ubVar = (ub) l81.A(this, wb.a);
            float f = xl0Var.b;
            return nm.f(0.0f, ubVar.a(f, xl0Var.d - f, yu0.b(jF)));
        }
        if (iOrdinal != 1) {
            throw new fg();
        }
        ub ubVar2 = (ub) l81.A(this, wb.a);
        float f2 = xl0Var.a;
        return nm.f(ubVar2.a(f2, xl0Var.c - f2, yu0.d(jF)), 0.0f);
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.b30
    public final void r(long j) {
        int iW;
        xl0 xl0VarB0;
        long j2 = this.y;
        this.y = j;
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            iW = c10.w((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                throw new fg();
            }
            iW = c10.w((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iW < 0 && (xl0VarB0 = B0()) != null) {
            xl0 xl0Var = this.w;
            if (xl0Var == null) {
                xl0Var = xl0VarB0;
            }
            if (!this.z && !this.x && C0(xl0Var, j2) && !C0(xl0VarB0, j)) {
                this.x = true;
                D0();
            }
            this.w = xl0VarB0;
        }
    }
}
