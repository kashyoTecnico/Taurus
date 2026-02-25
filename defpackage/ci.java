package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ci {
    public int A;
    public int B;
    public boolean C;
    public final bi D;
    public final ArrayList E;
    public boolean F;
    public av0 G;
    public bv0 H;
    public ev0 I;
    public boolean J;
    public wh0 K;
    public jd L;
    public final wh M;
    public m2 N;
    public mt O;
    public of P;
    public final li Q;
    public final ml R;
    public boolean S;
    public long T;
    public ji U;
    public final e9 a;
    public final hi b;
    public final bv0 c;
    public final wa0 d;
    public final jd e;
    public final jd f;
    public final r1 g;
    public final oi h;
    public sh0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public ba0 p;
    public boolean q;
    public boolean r;
    public da0 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final u00 n = new u00();
    public final ArrayList s = new ArrayList();
    public final u00 t = new u00();
    public wh0 u = vh0.g;
    public final u00 x = new u00();
    public int z = -1;

    public ci(e9 e9Var, hi hiVar, bv0 bv0Var, wa0 wa0Var, jd jdVar, jd jdVar2, r1 r1Var, oi oiVar) {
        this.a = e9Var;
        this.b = hiVar;
        this.c = bv0Var;
        this.d = wa0Var;
        this.e = jdVar;
        this.f = jdVar2;
        this.g = r1Var;
        this.h = oiVar;
        this.C = hiVar.e() || hiVar.c();
        this.D = new bi(0, this);
        this.E = new ArrayList();
        av0 av0VarC = bv0Var.c();
        av0VarC.c();
        this.G = av0VarC;
        bv0 bv0Var2 = new bv0();
        if (hiVar.e()) {
            bv0Var2.b();
        }
        if (hiVar.c()) {
            bv0Var2.n = new da0();
        }
        this.H = bv0Var2;
        ev0 ev0VarD = bv0Var2.d();
        ev0VarD.e(true);
        this.I = ev0VarD;
        this.M = new wh(this, jdVar);
        av0 av0VarC2 = this.H.c();
        try {
            m2 m2VarA = av0VarC2.a(0);
            av0VarC2.c();
            this.N = m2VarA;
            this.O = new mt();
            this.Q = new li(this);
            ml mlVarI = hiVar.i();
            ml mlVarY = y();
            this.R = mlVarI.k(mlVarY == null ? is.d : mlVarY);
        } catch (Throwable th) {
            av0VarC2.c();
            throw th;
        }
    }

    public static final int M(ci ciVar, int i, boolean z, int i2) {
        av0 av0Var = ciVar.G;
        if (av0Var.j(i)) {
            int i3 = av0Var.i(i);
            Object objP = av0Var.p(av0Var.b, i);
            if (i3 == 206 && c10.i(objP, fi.e)) {
                Object objH = av0Var.h(i, 0);
                zh zhVar = objH instanceof zh ? (zh) objH : null;
                if (zhVar != null) {
                    for (ci ciVar2 : zhVar.d.e) {
                        bv0 bv0Var = ciVar2.c;
                        if (bv0Var.e > 0 && (bv0Var.d[1] & 67108864) != 0) {
                            oi oiVar = ciVar2.h;
                            synchronized (oiVar.g) {
                                oiVar.o();
                                ta0 ta0Var = oiVar.q;
                                oiVar.q = n2.c();
                                try {
                                    oiVar.w.a0(ta0Var);
                                } finally {
                                }
                            }
                            jd jdVar = new jd();
                            ciVar2.L = jdVar;
                            av0 av0VarC = ciVar2.c.c();
                            try {
                                ciVar2.G = av0VarC;
                                wh whVar = ciVar2.M;
                                jd jdVar2 = whVar.b;
                                try {
                                    whVar.b = jdVar;
                                    ciVar2.L(0);
                                    wh whVar2 = ciVar2.M;
                                    whVar2.b();
                                    if (whVar2.c) {
                                        whVar2.b.j.O(xe0.c);
                                        if (whVar2.c) {
                                            whVar2.d(false);
                                            whVar2.d(false);
                                            whVar2.b.j.O(ie0.c);
                                            whVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                av0VarC.c();
                            }
                        }
                        ciVar.b.n(ciVar2.h);
                    }
                }
                return av0Var.o(i);
            }
            if (!av0Var.l(i)) {
                return av0Var.o(i);
            }
        } else if (av0Var.d(i)) {
            int i4 = av0Var.b[(i * 5) + 3] + i;
            int iM = 0;
            for (int i5 = i + 1; i5 < i4; i5 += av0Var.b[(i5 * 5) + 3]) {
                boolean zL = av0Var.l(i5);
                if (zL) {
                    ciVar.M.c();
                    wh whVar3 = ciVar.M;
                    Object objN = av0Var.n(i5);
                    whVar3.c();
                    whVar3.h.add(objN);
                }
                iM += M(ciVar, i5, zL || z, zL ? 0 : i2 + iM);
                if (zL) {
                    ciVar.M.c();
                    ciVar.M.a();
                }
            }
            if (!av0Var.l(i)) {
                return iM;
            }
        } else if (!av0Var.l(i)) {
            return av0Var.o(i);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        jd jdVar = this.f;
        wh whVar = this.M;
        jd jdVar2 = whVar.b;
        try {
            whVar.b = jdVar;
            jdVar.j.O(ve0.c);
            if (arrayList.size() <= 0) {
                whVar.b.j.O(je0.c);
                whVar.f = 0;
            } else {
                ng0 ng0Var = (ng0) arrayList.get(0);
                r90 r90Var = (r90) ng0Var.d;
                r90Var.getClass();
                throw null;
            }
        } finally {
            whVar.b = jdVar2;
        }
    }

    public final void B(wh0 wh0Var, Object obj) {
        R(126665345, null, 0, null);
        C();
        f0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                ev0.y(this.I);
            }
            boolean z = (this.S || c10.i(this.G.f(), wh0Var)) ? false : true;
            if (z) {
                I(wh0Var);
            }
            R(202, fi.c, 0, wh0Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            m20.G(this, new zg(316014703, true, new j70(2, obj)));
            this.w = z2;
        } finally {
        }
    }

    public final Object C() {
        boolean z = this.S;
        v71 v71Var = vh.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof zh)) {
                return objM;
            }
        } else if (this.r) {
            fi.c("A call to createNode(), emitNode() or useNode() expected");
            return v71Var;
        }
        return v71Var;
    }

    public final List D() {
        hi hiVar = this.b;
        gi giVarG = hiVar.g();
        oi oiVar = giVarG != null ? (oi) giVarG : null;
        if (oiVar != null) {
            bv0 bv0Var = oiVar.i;
            av0 av0VarC = bv0Var.c();
            try {
                Integer numS = m20.s(av0VarC, hiVar, 0, av0VarC.c);
                if (numS != null) {
                    try {
                        return m20.Q(bv0Var.c(), numS.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return ks.d;
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += dv0.a(this.G.b, iQ);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.oi r9, defpackage.oi r10, java.lang.Integer r11, java.util.List r12, defpackage.gw r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            ng0 r6 = (defpackage.ng0) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.d     // Catch: java.lang.Throwable -> L24
            nl0 r7 = (defpackage.nl0) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.e     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.Z(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.Z(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.s = r10     // Catch: java.lang.Throwable -> L24
            r9.t = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4d
            r9.s = r5     // Catch: java.lang.Throwable -> L24
            r9.t = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.s = r5     // Catch: java.lang.Throwable -> L24
            r9.t = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.k = r1
            return r10
        L62:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.F(oi, oi, java.lang.Integer, java.util.List, gw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.G():void");
    }

    public final void H() {
        int i;
        L(this.G.g);
        wh whVar = this.M;
        whVar.d(false);
        u00 u00Var = whVar.d;
        ci ciVar = whVar.a;
        av0 av0Var = ciVar.G;
        if (av0Var.c > 0 && u00Var.a(-2) != (i = av0Var.i)) {
            if (!whVar.c && whVar.e) {
                whVar.d(false);
                whVar.b.j.O(me0.c);
                whVar.c = true;
            }
            if (i > 0) {
                m2 m2VarA = av0Var.a(i);
                u00Var.c(i);
                whVar.d(false);
                gf0 gf0Var = whVar.b.j;
                gf0Var.O(le0.c);
                m20.O(gf0Var, 0, m2VarA);
                whVar.c = true;
            }
        }
        whVar.b.j.O(te0.c);
        int i2 = whVar.f;
        av0 av0Var2 = ciVar.G;
        whVar.f = av0Var2.b[(av0Var2.g * 5) + 3] + i2;
    }

    public final void I(wh0 wh0Var) {
        da0 da0Var = this.v;
        if (da0Var == null) {
            da0Var = new da0();
            this.v = da0Var;
        }
        da0Var.g(this.G.g, wh0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r7, int r8, int r9) {
        /*
            r6 = this;
            av0 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            wh r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.J(int, int, int):void");
    }

    public final Object K() {
        boolean z = this.S;
        v71 v71Var = vh.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof zh)) {
                return objM instanceof jm0 ? ((jm0) objM).a : objM;
            }
        } else if (this.r) {
            fi.c("A call to createNode(), emitNode() or useNode() expected");
            return v71Var;
        }
        return v71Var;
    }

    public final void L(int i) {
        boolean zL = this.G.l(i);
        wh whVar = this.M;
        if (zL) {
            whVar.c();
            Object objN = this.G.n(i);
            whVar.c();
            whVar.h.add(objN);
        }
        M(this, i, zL, 0);
        whVar.c();
        if (zL) {
            whVar.a();
        }
    }

    public final boolean N(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            if (this.P != null) {
                w();
                return true;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.O():void");
    }

    public final void P() {
        av0 av0Var = this.G;
        int i = av0Var.i;
        this.l = i >= 0 ? av0Var.b[(i * 5) + 1] & 67108863 : 0;
        av0Var.t();
    }

    public final void Q() {
        if (this.l != 0) {
            fi.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        nl0 nl0VarW = w();
        if (nl0VarW != null) {
            int i = nl0VarW.b;
            if ((i & 128) == 0) {
                nl0VarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Type inference failed for: r2v7, types: [ev0] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [ev0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, v71] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(int r27, defpackage.yd0 r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.R(int, yd0, int, java.lang.Object):void");
    }

    public final void S() {
        R(-127, null, 0, null);
    }

    public final void T(int i, yd0 yd0Var) {
        R(i, yd0Var, 0, null);
    }

    public final void U(Object obj, boolean z) {
        if (z) {
            av0 av0Var = this.G;
            if (av0Var.k <= 0) {
                if ((av0Var.b[(av0Var.g * 5) + 1] & 1073741824) == 0) {
                    zj0.a("Expected a node group");
                }
                av0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            wh whVar = this.M;
            whVar.getClass();
            whVar.d(false);
            gf0 gf0Var = whVar.b.j;
            gf0Var.O(af0.c);
            m20.O(gf0Var, 0, obj);
        }
        this.G.u();
    }

    public final void V(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(i, null, 0, null);
            return;
        }
        if (this.r) {
            fi.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        av0 av0Var = this.G;
        boolean z = this.S;
        v71 v71Var = vh.a;
        if (z) {
            av0Var.k++;
            this.I.P(i, v71Var, false, v71Var);
            u(false, null);
            return;
        }
        if (av0Var.g() == i && ((i3 = av0Var.g) >= av0Var.h || (av0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            av0Var.u();
            u(false, null);
            return;
        }
        if (av0Var.k <= 0 && (i2 = av0Var.g) != av0Var.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, av0Var.s());
            fi.a(this.s, i2, av0Var.g);
        }
        av0Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            ev0 ev0VarD = this.H.d();
            this.I = ev0VarD;
            ev0VarD.L();
            this.J = false;
            this.K = null;
        }
        ev0 ev0Var = this.I;
        ev0Var.d();
        int i5 = ev0Var.t;
        ev0Var.P(i, v71Var, false, v71Var);
        this.N = ev0Var.b(i5);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ci W(int r7) {
        /*
            r6 = this;
            r6.V(r7)
            boolean r7 = r6.S
            r1 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            oi r2 = r6.h
            if (r7 == 0) goto L26
            nl0 r7 = new nl0
            r7.<init>(r2)
            r1.add(r7)
            r6.f0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.k()
            return r6
        L26:
            av0 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.fi.e(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            l10 r7 = (defpackage.l10) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            av0 r3 = r6.G
            java.lang.Object r3 = r3.m()
            v71 r4 = defpackage.vh.a
            boolean r4 = defpackage.c10.i(r3, r4)
            if (r4 == 0) goto L51
            nl0 r3 = new nl0
            r3.<init>(r2)
            r6.f0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            defpackage.c10.n(r3, r2)
            nl0 r3 = (defpackage.nl0) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r4
            goto L65
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r4
        L71:
            int r5 = r3.b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.k()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            wh r7 = r6.M
            jd r7 = r7.b
            gf0 r7 = r7.j
            ye0 r0 = defpackage.ye0.c
            r7.O(r0)
            defpackage.m20.O(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lb6
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb6
            r6.y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.W(int):ci");
    }

    public final void X() {
        R(125, null, 2, null);
        this.r = true;
    }

    public final void Y() {
        this.m = 0;
        this.G = this.c.c();
        R(100, null, 0, null);
        hi hiVar = this.b;
        hiVar.o();
        wh0 wh0VarH = hiVar.h();
        this.x.c(this.w ? 1 : 0);
        this.w = f(wh0VarH);
        this.K = null;
        if (!this.q) {
            this.q = hiVar.d();
        }
        if (!this.C) {
            this.C = hiVar.e();
        }
        if (this.C) {
            hx0 hx0Var = ni.a;
            c10.n(hx0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            wh0VarH = ((vh0) wh0VarH).b(hx0Var, new ix0(y()));
        }
        this.u = wh0VarH;
        Set set = (Set) nm.A(wh0VarH, h00.a);
        if (set != null) {
            ji jiVar = this.U;
            if (jiVar == null) {
                jiVar = new ji(this.h);
                this.U = jiVar;
            }
            set.add(jiVar);
            hiVar.l(set);
        }
        R(Long.hashCode(hiVar.f()), null, 0, null);
    }

    public final boolean Z(nl0 nl0Var, Object obj) {
        m2 m2Var = nl0Var.c;
        if (m2Var == null) {
            return false;
        }
        int iA = this.G.a.a(m2Var);
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iE = fi.e(iA, arrayList);
        if (iE < 0) {
            int i = -(iE + 1);
            if (!(obj instanceof fo)) {
                obj = null;
            }
            arrayList.add(i, new l10(nl0Var, iA, obj));
            return true;
        }
        l10 l10Var = (l10) arrayList.get(iE);
        if (!(obj instanceof fo)) {
            l10Var.c = null;
            return true;
        }
        Object obj2 = l10Var.c;
        if (obj2 == null) {
            l10Var.c = obj;
            return true;
        }
        if (obj2 instanceof ua0) {
            ((ua0) obj2).a(obj);
            return true;
        }
        int i2 = fq0.a;
        ua0 ua0Var = new ua0(2);
        ua0Var.j(obj2);
        ua0Var.j(obj);
        l10Var.c = ua0Var;
        return true;
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        mt mtVar = this.O;
        mtVar.k.K();
        mtVar.j.K();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        av0 av0Var = this.G;
        if (!av0Var.f) {
            av0Var.c();
        }
        if (this.I.w) {
            return;
        }
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(defpackage.ta0 r15) {
        /*
            r14 = this;
            java.util.ArrayList r14 = r14.s
            int r0 = defpackage.ve.L(r14)
        L6:
            r1 = -1
            if (r1 >= r0) goto L2a
            java.lang.Object r1 = r14.get(r0)
            l10 r1 = (defpackage.l10) r1
            nl0 r2 = r1.a
            m2 r2 = r2.c
            if (r2 == 0) goto L24
            boolean r3 = r2.a()
            if (r3 == 0) goto L24
            int r3 = r1.b
            int r2 = r2.a
            if (r3 == r2) goto L27
            r1.b = r2
            goto L27
        L24:
            r14.remove(r0)
        L27:
            int r0 = r0 + (-1)
            goto L6
        L2a:
            java.lang.Object[] r0 = r15.b
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L88
            r3 = 0
            r4 = r3
        L37:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L83
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L51:
            if (r9 >= r7) goto L81
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r1[r10]
            java.lang.String r12 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            defpackage.c10.n(r11, r12)
            nl0 r11 = (defpackage.nl0) r11
            m2 r12 = r11.c
            if (r12 == 0) goto L7d
            int r12 = r12.a
            g2 r13 = defpackage.g2.O
            if (r10 != r13) goto L75
            r10 = 0
        L75:
            l10 r13 = new l10
            r13.<init>(r11, r12, r10)
            r14.add(r13)
        L7d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L51
        L81:
            if (r7 != r8) goto L88
        L83:
            if (r4 == r2) goto L88
            int r4 = r4 + 1
            goto L37
        L88:
            di r15 = defpackage.fi.f
            defpackage.ze.P(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.a0(ta0):void");
    }

    public final void b(kw kwVar, Object obj) {
        if (this.S) {
            gf0 gf0Var = this.O.j;
            gf0Var.O(bf0.c);
            m20.O(gf0Var, 0, obj);
            c10.n(kwVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            r31.m(2, kwVar);
            m20.O(gf0Var, 1, kwVar);
            return;
        }
        wh whVar = this.M;
        whVar.b();
        gf0 gf0Var2 = whVar.b.j;
        gf0Var2.O(bf0.c);
        c10.n(kwVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        r31.m(2, kwVar);
        m20.P(gf0Var2, 0, obj, 1, kwVar);
    }

    public final void b0(int i, int i2) {
        if (g0(i) != i2) {
            if (i < 0) {
                ba0 ba0Var = this.p;
                if (ba0Var == null) {
                    ba0Var = new ba0();
                    this.p = ba0Var;
                }
                ba0Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        f0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i, int i2) {
        int iG0 = g0(i);
        if (iG0 != i2) {
            int i3 = i2 - iG0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iG02 = g0(i) + i3;
                b0(i, iG02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        sh0 sh0Var = (sh0) arrayList.get(i4);
                        if (sh0Var != null && sh0Var.a(i, iG02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.G.i;
                } else if (this.G.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        f0(Integer.valueOf(i));
        return true;
    }

    public final vh0 d0(wh0 wh0Var, vh0 vh0Var) {
        vh0 vh0Var2 = (vh0) wh0Var;
        vh0Var2.getClass();
        uh0 uh0Var = new uh0(vh0Var2);
        uh0Var.putAll(vh0Var);
        vh0 vh0VarA = uh0Var.a();
        T(204, fi.d);
        C();
        f0(vh0VarA);
        C();
        f0(vh0Var);
        p(false);
        return vh0VarA;
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        f0(Long.valueOf(j));
        return true;
    }

    public final void e0(Object obj) {
        int i;
        av0 av0Var;
        int i2;
        ev0 ev0Var;
        if (obj instanceof im0) {
            im0 im0Var = (im0) obj;
            m2 m2VarA = null;
            if (this.S) {
                ev0 ev0Var2 = this.I;
                int i3 = ev0Var2.t;
                if (i3 > ev0Var2.v + 1) {
                    int i4 = i3 - 1;
                    int iD = ev0Var2.D(ev0Var2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = iD;
                        ev0Var = this.I;
                        if (i4 == ev0Var.v || i4 < 0) {
                            break;
                        } else {
                            iD = ev0Var.D(ev0Var.b, i4);
                        }
                    }
                    m2VarA = ev0Var.b(i2);
                }
            } else {
                av0 av0Var2 = this.G;
                int i5 = av0Var2.g;
                if (i5 > av0Var2.i + 1) {
                    int i6 = i5 - 1;
                    int iQ = av0Var2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = iQ;
                        av0Var = this.G;
                        if (i6 == av0Var.i || i6 < 0) {
                            break;
                        } else {
                            iQ = av0Var.q(i6);
                        }
                    }
                    m2VarA = av0Var.a(i);
                }
            }
            jm0 jm0Var = new jm0(im0Var, m2VarA);
            if (this.S) {
                gf0 gf0Var = this.M.b.j;
                gf0Var.O(se0.c);
                m20.O(gf0Var, 0, jm0Var);
            }
            this.d.add(obj);
            obj = jm0Var;
        }
        f0(obj);
    }

    public final boolean f(Object obj) {
        if (c10.i(C(), obj)) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void f0(Object obj) {
        if (this.S) {
            ev0 ev0Var = this.I;
            if (ev0Var.n <= 0 || ev0Var.i == ev0Var.k) {
                ev0Var.E(obj);
                return;
            }
            da0 da0Var = ev0Var.s;
            if (da0Var == null) {
                da0Var = new da0();
            }
            ev0Var.s = da0Var;
            int i = ev0Var.v;
            Object objB = da0Var.b(i);
            if (objB == null) {
                objB = new ma0();
                da0Var.g(i, objB);
            }
            ((ma0) objB).a(obj);
            return;
        }
        av0 av0Var = this.G;
        boolean z = av0Var.n;
        wh whVar = this.M;
        if (!z) {
            m2 m2VarA = av0Var.a(av0Var.i);
            gf0 gf0Var = whVar.b.j;
            gf0Var.O(ae0.c);
            m20.P(gf0Var, 0, m2VarA, 1, obj);
            return;
        }
        int iC = (av0Var.l - dv0.c(av0Var.b, av0Var.i)) - 1;
        if (whVar.a.G.i - whVar.f >= 0) {
            whVar.d(true);
            gf0 gf0Var2 = whVar.b.j;
            gf0Var2.O(ne0.g);
            m20.O(gf0Var2, 0, obj);
            gf0Var2.l[gf0Var2.m - gf0Var2.j[gf0Var2.k - 1].a] = iC;
            return;
        }
        av0 av0Var2 = this.G;
        m2 m2VarA2 = av0Var2.a(av0Var2.i);
        gf0 gf0Var3 = whVar.b.j;
        gf0Var3.O(ne0.f);
        m20.P(gf0Var3, 0, obj, 1, m2VarA2);
        gf0Var3.l[gf0Var3.m - gf0Var3.j[gf0Var3.k - 1].a] = iC;
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        f0(Boolean.valueOf(z));
        return true;
    }

    public final int g0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        ba0 ba0Var = this.p;
        if (ba0Var == null || ba0Var.c(i) < 0) {
            return 0;
        }
        int iC = ba0Var.c(i);
        if (iC >= 0) {
            return ba0Var.c[iC];
        }
        qo0.t("Cannot find value for key " + i);
        throw null;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void h0() {
        if (!this.r) {
            fi.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            fi.c("useNode() called while inserting");
        }
        av0 av0Var = this.G;
        Object objN = av0Var.n(av0Var.i);
        wh whVar = this.M;
        whVar.c();
        whVar.h.add(objN);
        if (this.y && (objN instanceof kh)) {
            whVar.b();
            whVar.b.j.O(df0.c);
        }
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        wh whVar = this.M;
        whVar.c = false;
        whVar.d.b = 0;
        whVar.f = 0;
        whVar.e = true;
        whVar.g = 0;
        whVar.h.clear();
        whVar.i = -1;
        whVar.j = -1;
        whVar.k = -1;
        whVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final Object j(dl0 dl0Var) {
        return nm.A(l(), dl0Var);
    }

    public final void k(gw gwVar) {
        if (!this.r) {
            fi.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            fi.c("createNode() can only be called when inserting");
        }
        u00 u00Var = this.n;
        int i = u00Var.a[u00Var.b - 1];
        ev0 ev0Var = this.I;
        m2 m2VarB = ev0Var.b(ev0Var.v);
        this.l++;
        mt mtVar = this.O;
        gf0 gf0Var = mtVar.j;
        gf0Var.O(ne0.d);
        m20.O(gf0Var, 0, gwVar);
        gf0Var.l[gf0Var.m - gf0Var.j[gf0Var.k - 1].a] = i;
        m20.O(gf0Var, 1, m2VarB);
        gf0 gf0Var2 = mtVar.k;
        gf0Var2.O(ne0.e);
        gf0Var2.l[gf0Var2.m - gf0Var2.j[gf0Var2.k - 1].a] = i;
        m20.O(gf0Var2, 0, m2VarB);
    }

    public final wh0 l() {
        wh0 wh0Var;
        wh0 wh0Var2 = this.K;
        if (wh0Var2 != null) {
            return wh0Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        yd0 yd0Var = fi.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                ev0 ev0Var = this.I;
                if (ev0Var.b[ev0Var.r(iD) * 5] == 202 && c10.i(this.I.s(iD), yd0Var)) {
                    Object objQ = this.I.q(iD);
                    c10.n(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    wh0 wh0Var3 = (wh0) objQ;
                    this.K = wh0Var3;
                    return wh0Var3;
                }
                ev0 ev0Var2 = this.I;
                iD = ev0Var2.D(ev0Var2.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    av0 av0Var = this.G;
                    if (c10.i(av0Var.p(av0Var.b, iQ), yd0Var)) {
                        da0 da0Var = this.v;
                        if (da0Var == null || (wh0Var = (wh0) da0Var.b(iQ)) == null) {
                            av0 av0Var2 = this.G;
                            Object objB = av0Var2.b(av0Var2.b, iQ);
                            c10.n(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            wh0Var = (wh0) objB;
                        }
                        this.K = wh0Var;
                        return wh0Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        wh0 wh0Var4 = this.u;
        this.K = wh0Var4;
        return wh0Var4;
    }

    public final List m() {
        boolean z = this.C;
        List list = ks.d;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ev0 ev0Var = this.I;
        arrayList.addAll(m20.m(ev0Var, null, ev0Var.t, null));
        av0 av0Var = this.G;
        if (!av0Var.f && av0Var.c != 0) {
            il0 il0Var = new il0(av0Var);
            int iQ = av0Var.i;
            Object objValueOf = Integer.valueOf(av0Var.l - dv0.c(av0Var.b, iQ));
            while (iQ >= 0) {
                il0Var.b(av0Var.a.f(iQ), objValueOf);
                objValueOf = av0Var.a(iQ);
                iQ = av0Var.q(iQ);
            }
            list = il0Var.a;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n(ta0 ta0Var, kw kwVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            fi.c("Reentrant composition is not supported");
        }
        this.g.k();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ov0.k().g());
            this.v = null;
            a0(ta0Var);
            this.k = 0;
            this.F = true;
            try {
                Y();
                Object objC = C();
                if (objC != kwVar && kwVar != null) {
                    f0(kwVar);
                }
                bi biVar = this.D;
                eb0 eb0VarF = qo0.f();
                try {
                    eb0VarF.b(biVar);
                    yd0 yd0Var = fi.a;
                    if (kwVar != null) {
                        T(200, yd0Var);
                        m20.G(this, kwVar);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(vh.a)) {
                        O();
                    } else {
                        T(200, yd0Var);
                        r31.m(2, objC);
                        m20.G(this, (kw) objC);
                        p(false);
                    }
                    eb0VarF.k(eb0VarF.f - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        fi.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    eb0VarF.k(eb0VarF.f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            wh whVar = this.M;
            whVar.c();
            whVar.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.p(boolean):void");
    }

    public final void q() {
        p(false);
        nl0 nl0VarW = w();
        if (nl0VarW != null) {
            int i = nl0VarW.b;
            if ((i & 1) != 0) {
                nl0VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:59:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:60:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nl0 r() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.r():nl0");
    }

    public final void s() {
        if (this.F || this.z != 100) {
            zj0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void t() {
        p(false);
        this.b.b();
        p(false);
        wh whVar = this.M;
        if (whVar.c) {
            whVar.d(false);
            whVar.d(false);
            whVar.b.j.O(ie0.c);
            whVar.c = false;
        }
        whVar.b();
        if (whVar.d.b != 0) {
            fi.c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            fi.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void u(boolean z, sh0 sh0Var) {
        this.i.add(this.j);
        this.j = sh0Var;
        int i = this.l;
        u00 u00Var = this.n;
        u00Var.c(i);
        u00Var.c(this.m);
        u00Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void v() {
        bv0 bv0Var = new bv0();
        if (this.C) {
            bv0Var.b();
        }
        if (this.b.c()) {
            bv0Var.n = new da0();
        }
        this.H = bv0Var;
        ev0 ev0VarD = bv0Var.d();
        ev0VarD.e(true);
        this.I = ev0VarD;
    }

    public final nl0 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (nl0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        nl0 nl0VarW = w();
        return (nl0VarW == null || (nl0VarW.b & 4) == 0) ? false : true;
    }

    public final li y() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        nl0 nl0VarW;
        return (this.S || this.y || this.w || (nl0VarW = w()) == null || (nl0VarW.b & 8) != 0) ? false : true;
    }
}
