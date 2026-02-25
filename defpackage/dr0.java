package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dr0 extends mn implements cd0, tu, o20, et0, qj0, pi {
    public py0 A;
    public cg0 B;
    public final q2 C;
    public final uq0 D;
    public final xz E;
    public final mr0 F;
    public final zq0 G;
    public final oj H;
    public g2 I;
    public eq J;
    public ar0 K;
    public if0 t;
    public s40 u;
    public boolean v;
    public fa0 w;
    public gc x;
    public kq y;
    public boolean z;

    public dr0(fa0 fa0Var, if0 if0Var, cg0 cg0Var, er0 er0Var, boolean z, boolean z2) {
        s40 s40Var = s40.C;
        this.t = if0Var;
        this.u = s40Var;
        this.v = z;
        this.w = fa0Var;
        this.B = cg0Var;
        q2 q2Var = new q2();
        q2Var.c = new b(16, q2Var);
        this.C = q2Var;
        uq0 uq0Var = new uq0();
        uq0Var.r = z;
        A0(uq0Var);
        this.D = uq0Var;
        xz xzVar = new xz(new r1(6, new r1(a.c)));
        this.E = xzVar;
        mr0 mr0Var = new mr0(er0Var, this.B, xzVar, if0Var, z2, q2Var);
        this.F = mr0Var;
        zq0 zq0Var = new zq0(mr0Var, z);
        this.G = zq0Var;
        oj ojVar = new oj(if0Var, mr0Var, z2);
        A0(ojVar);
        this.H = ojVar;
        A0(new ec0(zq0Var, q2Var));
        A0(new av(new zu(1, j10.a, j10.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
        qb qbVar = new qb();
        qbVar.r = ojVar;
        A0(qbVar);
        h hVar = new h(23, this);
        hv hvVar = new hv();
        hvVar.r = hVar;
        A0(hvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D0(defpackage.dr0 r4, defpackage.mk r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.fq
            if (r0 == 0) goto L13
            r0 = r5
            fq r0 = (defpackage.fq) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            fq r0 = new fq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            dr0 r4 = r0.g
            defpackage.c10.X(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.c10.X(r5)
            kq r5 = r4.y
            if (r5 == 0) goto L4f
            fa0 r1 = r4.w
            if (r1 == 0) goto L4c
            jq r3 = new jq
            r3.<init>(r5)
            r0.g = r4
            r0.j = r2
            java.lang.Object r5 = r1.a(r3, r0)
            xl r0 = defpackage.xl.d
            if (r5 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r4.y = r5
        L4f:
            r0 = 0
            r4.H0(r0)
            j41 r4 = defpackage.j41.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.D0(dr0, mk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E0(defpackage.dr0 r6, defpackage.tp r7, defpackage.mk r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.gq
            if (r0 == 0) goto L13
            r0 = r8
            gq r0 = (defpackage.gq) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            gq r0 = new gq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.l
            r2 = 2
            r3 = 1
            xl r4 = defpackage.xl.d
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            kq r6 = r0.i
            tp r7 = r0.h
            dr0 r0 = r0.g
            defpackage.c10.X(r8)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tp r7 = r0.h
            dr0 r6 = r0.g
            defpackage.c10.X(r8)
            goto L5d
        L40:
            defpackage.c10.X(r8)
            kq r8 = r6.y
            if (r8 == 0) goto L5d
            fa0 r1 = r6.w
            if (r1 == 0) goto L5d
            jq r5 = new jq
            r5.<init>(r8)
            r0.g = r6
            r0.h = r7
            r0.l = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L5d
            goto L74
        L5d:
            kq r8 = new kq
            r8.<init>()
            fa0 r1 = r6.w
            if (r1 == 0) goto L79
            r0.g = r6
            r0.h = r7
            r0.i = r8
            r0.l = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L75
        L74:
            return r4
        L75:
            r0 = r6
            r6 = r8
        L77:
            r8 = r6
            r6 = r0
        L79:
            r6.y = r8
            long r6 = r7.a
            j41 r6 = defpackage.j41.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.E0(dr0, tp, mk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(defpackage.dr0 r4, defpackage.up r5, defpackage.mk r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.hq
            if (r0 == 0) goto L13
            r0 = r6
            hq r0 = (defpackage.hq) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            hq r0 = new hq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            up r5 = r0.h
            dr0 r4 = r0.g
            defpackage.c10.X(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.c10.X(r6)
            kq r6 = r4.y
            if (r6 == 0) goto L53
            fa0 r1 = r4.w
            if (r1 == 0) goto L50
            lq r3 = new lq
            r3.<init>(r6)
            r0.g = r4
            r0.h = r5
            r0.k = r2
            java.lang.Object r6 = r1.a(r3, r0)
            xl r0 = defpackage.xl.d
            if (r6 != r0) goto L50
            return r0
        L50:
            r6 = 0
            r4.y = r6
        L53:
            long r5 = r5.a
            r4.H0(r5)
            j41 r4 = defpackage.j41.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.F0(dr0, up, mk):java.lang.Object");
    }

    public final void G0() {
        kq kqVar = this.y;
        if (kqVar != null) {
            fa0 fa0Var = this.w;
            if (fa0Var != null) {
                fa0Var.b(new jq(kqVar));
            }
            this.y = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        lk lkVar;
        long j2;
        ?? r0 = gj0Var.a;
        int size = r0.size();
        int i = 0;
        while (true) {
            lkVar = null;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.u.g((nj0) r0.get(i))).booleanValue()) {
                if (this.v && this.A == null) {
                    c cVar = new c(this, lkVar, 13);
                    gj0 gj0Var2 = ly0.a;
                    py0 py0Var = new py0(null, null, my0.a);
                    py0Var.t = cVar;
                    A0(py0Var);
                    this.A = py0Var;
                }
                py0 py0Var2 = this.A;
                if (py0Var2 != null) {
                    py0Var2.H(gj0Var, hj0Var, j);
                }
            } else {
                i++;
            }
        }
        if (hj0Var == hj0.e && gj0Var.c == 6) {
            ?? r11 = gj0Var.a;
            int size2 = r11.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((nj0) r11.get(i2)).b()) {
                    return;
                }
            }
            c10.m(this.I);
            xn xnVar = d80.z(this).z;
            ed0 ed0Var = new ed0(0L);
            int size3 = r11.size();
            int i3 = 0;
            while (true) {
                j2 = ed0Var.a;
                if (i3 >= size3) {
                    break;
                }
                ed0Var = new ed0(ed0.g(j2, ((nj0) r11.get(i3)).j));
                i3++;
            }
            nm.z(o0(), null, new ar0(this, ed0.h(j2, -xnVar.A(64)), lkVar, 2), 3);
            int size4 = r11.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((nj0) r11.get(i4)).a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gw, y20] */
    public final void H0(long j) {
        wl wlVar = (wl) ((y20) this.C.c).a();
        if (wlVar == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        nm.z(wlVar, null, new ar0(this, j, null, 0), 3);
    }

    @Override // defpackage.cd0
    public final void J() {
        c4.A(this, new dq(this, 2));
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        if (this.v && (this.J == null || this.K == null)) {
            this.J = new eq(this, 1);
            this.K = new ar0(this, null);
        }
        eq eqVar = this.J;
        if (eqVar != null) {
            h20[] h20VarArr = nt0.a;
            ct0Var.d(bt0.d, new j0(null, eqVar));
        }
        ar0 ar0Var = this.K;
        if (ar0Var != null) {
            h20[] h20VarArr2 = nt0.a;
            ct0Var.d(bt0.e, ar0Var);
        }
    }

    @Override // defpackage.tu
    public final void Q(ru ruVar) {
        ruVar.b(false);
    }

    @Override // defpackage.o20
    public final boolean R(KeyEvent keyEvent) {
        long jF;
        if (!this.v) {
            return false;
        }
        if ((!j20.a(m20.z(keyEvent), j20.n) && !j20.a(m20.e(keyEvent.getKeyCode()), j20.m)) || m20.E(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        if0 if0Var = this.F.d;
        if0 if0Var2 = if0.d;
        oj ojVar = this.H;
        if (if0Var == if0Var2) {
            int i = (int) (ojVar.y & 4294967295L);
            jF = nm.f(0.0f, j20.a(m20.e(keyEvent.getKeyCode()), j20.m) ? i : -i);
        } else {
            int i2 = (int) (ojVar.y >> 32);
            jF = nm.f(j20.a(m20.e(keyEvent.getKeyCode()), j20.m) ? i2 : -i2, 0.0f);
        }
        nm.z(o0(), null, new ar0(this, jF, null, 1), 3);
        return true;
    }

    @Override // defpackage.qj0
    public final void b0() {
        py0 py0Var = this.A;
        if (py0Var != null) {
            py0Var.b0();
        }
    }

    @Override // defpackage.o20
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.d90
    public final void s0() {
        c4.A(this, new dq(this, 2));
        this.I = g2.s;
    }

    @Override // defpackage.d90
    public final void t0() {
        this.z = false;
        G0();
    }
}
