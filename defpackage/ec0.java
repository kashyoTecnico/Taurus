package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ec0 extends d90 implements j31 {
    public final zq0 r;
    public final q2 s;
    public ec0 t;
    public final String u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public ec0(zq0 zq0Var, q2 q2Var) {
        this.r = zq0Var;
        this.s = q2Var;
    }

    public final wl A0() {
        ec0 ec0Var = this.q ? (ec0) h9.d(this) : null;
        wl wlVarA0 = ec0Var != null ? ec0Var.A0() : null;
        if (wlVarA0 != null && nm.w(wlVarA0)) {
            return wlVarA0;
        }
        wl wlVar = (wl) this.s.d;
        if (wlVar != null) {
            return wlVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(long r13, long r15, defpackage.mk r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.cc0
            if (r1 == 0) goto L16
            r1 = r0
            cc0 r1 = (defpackage.cc0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            cc0 r1 = new cc0
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.i
            int r1 = r7.k
            r8 = 2
            r2 = 1
            xl r9 = defpackage.xl.d
            if (r1 == 0) goto L45
            if (r1 == r2) goto L39
            if (r1 != r8) goto L31
            long r12 = r7.g
            defpackage.c10.X(r0)
            goto L8d
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            long r13 = r7.h
            long r1 = r7.g
            defpackage.c10.X(r0)
            r10 = r1
            r2 = r0
            r0 = r13
            r13 = r10
            goto L5b
        L45:
            defpackage.c10.X(r0)
            r7.g = r13
            r5 = r15
            r7.h = r5
            r7.k = r2
            zq0 r2 = r12.r
            r3 = r13
            java.lang.Object r0 = r2.a(r3, r5, r7)
            if (r0 != r9) goto L59
            goto L8b
        L59:
            r2 = r0
            r0 = r15
        L5b:
            l51 r2 = (defpackage.l51) r2
            long r2 = r2.a
            boolean r4 = r12.q
            if (r4 == 0) goto L71
            r5 = 0
            if (r4 == 0) goto L6f
            if (r4 == 0) goto L6f
            j31 r12 = defpackage.h9.d(r12)
            r5 = r12
            ec0 r5 = (defpackage.ec0) r5
        L6f:
            r12 = r5
            goto L74
        L71:
            ec0 r5 = r12.t
            goto L6f
        L74:
            if (r12 == 0) goto L93
            long r13 = defpackage.l51.e(r13, r2)
            long r0 = defpackage.l51.d(r0, r2)
            r7.g = r2
            r7.k = r8
            r15 = r0
            r17 = r7
            java.lang.Object r0 = r12.B0(r13, r15, r17)
            if (r0 != r9) goto L8c
        L8b:
            return r9
        L8c:
            r12 = r2
        L8d:
            l51 r0 = (defpackage.l51) r0
            long r0 = r0.a
            r2 = r12
            goto L95
        L93:
            r0 = 0
        L95:
            long r12 = defpackage.l51.e(r2, r0)
            l51 r14 = new l51
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec0.B0(long, long, mk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C0(long r7, long r9, int r11) {
        /*
            r6 = this;
            zq0 r0 = r6.r
            boolean r1 = r0.b
            r2 = 0
            if (r1 == 0) goto L2a
            mr0 r0 = r0.a
            er0 r1 = r0.a
            boolean r1 = r1.b()
            if (r1 == 0) goto L13
            goto L2a
        L13:
            er0 r1 = r0.a
            float r4 = r0.f(r9)
            float r4 = r0.c(r4)
            float r1 = r1.d(r4)
            float r1 = r0.c(r1)
            long r0 = r0.g(r1)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            boolean r4 = r6.q
            r5 = 0
            if (r4 == 0) goto L39
            if (r4 == 0) goto L39
            j31 r6 = defpackage.h9.d(r6)
            r5 = r6
            ec0 r5 = (defpackage.ec0) r5
        L39:
            r6 = r5
            if (r6 == 0) goto L48
            long r7 = defpackage.ed0.g(r7, r0)
            long r9 = defpackage.ed0.f(r9, r0)
            long r2 = r6.C0(r7, r9, r11)
        L48:
            long r6 = defpackage.ed0.g(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec0.C0(long, long, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r12 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r12 != r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(long r10, defpackage.lk r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.dc0
            if (r0 == 0) goto L13
            r0 = r12
            dc0 r0 = (defpackage.dc0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L1a
        L13:
            dc0 r0 = new dc0
            mk r12 = (defpackage.mk) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.h
            int r1 = r0.j
            r2 = 0
            r4 = 2
            r5 = 1
            xl r6 = defpackage.xl.d
            if (r1 == 0) goto L3e
            if (r1 == r5) goto L38
            if (r1 != r4) goto L30
            long r9 = r0.g
            defpackage.c10.X(r12)
            goto L74
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            long r10 = r0.g
            defpackage.c10.X(r12)
            goto L5c
        L3e:
            defpackage.c10.X(r12)
            boolean r12 = r9.q
            r1 = 0
            if (r12 == 0) goto L4f
            if (r12 == 0) goto L4f
            j31 r9 = defpackage.h9.d(r9)
            r1 = r9
            ec0 r1 = (defpackage.ec0) r1
        L4f:
            if (r1 == 0) goto L63
            r0.g = r10
            r0.j = r5
            java.lang.Object r12 = r1.D0(r10, r0)
            if (r12 != r6) goto L5c
            goto L73
        L5c:
            l51 r12 = (defpackage.l51) r12
            long r7 = r12.a
            r11 = r10
            r9 = r7
            goto L65
        L63:
            r11 = r10
            r9 = r2
        L65:
            defpackage.l51.d(r11, r9)
            r0.g = r9
            r0.j = r4
            l51 r12 = new l51
            r12.<init>(r2)
            if (r12 != r6) goto L74
        L73:
            return r6
        L74:
            l51 r12 = (defpackage.l51) r12
            long r11 = r12.a
            long r9 = defpackage.l51.e(r9, r11)
            l51 r11 = new l51
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec0.D0(long, lk):java.lang.Object");
    }

    public final long E0(long j, int i) {
        boolean z = this.q;
        ec0 ec0Var = null;
        if (z && z) {
            ec0Var = (ec0) h9.d(this);
        }
        long jE0 = ec0Var != null ? ec0Var.E0(j, i) : 0L;
        ed0.f(j, jE0);
        return ed0.g(jE0, 0L);
    }

    @Override // defpackage.j31
    public final Object o() {
        return this.u;
    }

    @Override // defpackage.d90
    public final void s0() {
        q2 q2Var = this.s;
        q2Var.a = this;
        q2Var.b = null;
        this.t = null;
        q2Var.c = new b(17, this);
        q2Var.d = o0();
    }

    @Override // defpackage.d90
    public final void t0() {
        dm0 dm0Var = new dm0();
        h9.m(this, new h3(dm0Var, 2));
        ec0 ec0Var = (ec0) ((j31) dm0Var.d);
        this.t = ec0Var;
        q2 q2Var = this.s;
        q2Var.b = ec0Var;
        if (((ec0) q2Var.a) == this) {
            q2Var.a = null;
        }
    }
}
