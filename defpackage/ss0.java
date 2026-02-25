package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ss0 {
    public final zs0 a;
    public yx e;
    public qe f;
    public d21 g;
    public ed0 j;
    public d30 k;
    public ks0 r;
    public boolean s;
    public final zg0 b = qo0.n(null);
    public final zg0 c = qo0.n(Boolean.TRUE);
    public y20 d = new yr0(this, 8);
    public final vu h = new vu();
    public final zg0 i = qo0.n(Boolean.FALSE);
    public final zg0 l = qo0.n(new ed0(0));
    public final zg0 m = qo0.n(new ed0(0));
    public final zg0 n = qo0.n(null);
    public final zg0 o = qo0.n(null);
    public final zg0 p = qo0.n(null);
    public final zg0 q = qo0.n(null);

    public ss0(zs0 zs0Var) {
        this.a = zs0Var;
        int i = 1;
        zs0Var.e = new yr0(this, i);
        zs0Var.f = new uj0(i, this);
        zs0Var.g = new ps0(this);
        zs0Var.h = new xr0(this, 2);
        zs0Var.i = new yr0(this, 2);
        zs0Var.j = new yr0(this, 3);
    }

    public static final long a(ss0 ss0Var, d30 d30Var, long j) {
        d30 d30Var2 = ss0Var.k;
        if (d30Var2 == null || !d30Var2.H()) {
            return 9205357640488583168L;
        }
        return ss0Var.j().v(d30Var, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r10 = this;
            sr0 r0 = r10.e()
            r1 = 0
            if (r0 == 0) goto L62
            zs0 r0 = r10.a
            ia0 r2 = r0.a()
            int r2 = r2.e
            if (r2 != 0) goto L12
            goto L62
        L12:
            o8 r2 = new o8
            r2.<init>()
            d30 r3 = r10.j()
            java.util.ArrayList r3 = r0.c(r3)
            int r4 = r3.size()
            r5 = 0
        L24:
            if (r5 >= r4) goto L5d
            java.lang.Object r6 = r3.get(r5)
            z90 r6 = (defpackage.z90) r6
            ia0 r7 = r0.a()
            long r8 = r6.a
            java.lang.Object r7 = r7.d(r8)
            sr0 r7 = (defpackage.sr0) r7
            if (r7 == 0) goto L5a
            rr0 r8 = r7.a
            rr0 r9 = r7.b
            q8 r6 = r6.d()
            boolean r7 = r7.c
            if (r7 == 0) goto L4f
            int r7 = r9.b
            int r8 = r8.b
            q8 r6 = r6.subSequence(r7, r8)
            goto L57
        L4f:
            int r7 = r8.b
            int r8 = r9.b
            q8 r6 = r6.subSequence(r7, r8)
        L57:
            r2.a(r6)
        L5a:
            int r5 = r5 + 1
            goto L24
        L5d:
            q8 r0 = r2.b()
            goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L79
            java.lang.String r2 = r0.e
            int r2 = r2.length()
            if (r2 <= 0) goto L6e
            r1 = r0
        L6e:
            if (r1 == 0) goto L79
            qe r10 = r10.f
            if (r10 == 0) goto L79
            w2 r10 = (defpackage.w2) r10
            r10.a(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss0.b():void");
    }

    public final nx c() {
        return (nx) this.p.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final sr0 e() {
        return (sr0) this.b.getValue();
    }

    public final boolean f() {
        sr0 sr0Var;
        d30 d30VarJ = j();
        zs0 zs0Var = this.a;
        ArrayList arrayListC = zs0Var.c(d30VarJ);
        if (arrayListC.isEmpty()) {
            return true;
        }
        int size = arrayListC.size();
        for (int i = 0; i < size; i++) {
            z90 z90Var = (z90) arrayListC.get(i);
            q8 q8VarD = z90Var.d();
            if (q8VarD.e.length() != 0 && ((sr0Var = (sr0) zs0Var.a().d(z90Var.a)) == null || Math.abs(sr0Var.a.b - sr0Var.b.b) != q8VarD.e.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        sr0 sr0VarE = e();
        if (sr0VarE != null) {
            rr0 rr0Var = sr0VarE.b;
            rr0 rr0Var2 = sr0VarE.a;
            if (!c10.i(rr0Var2, rr0Var)) {
                if (rr0Var2.c == rr0Var.c) {
                    return true;
                }
                d30 d30VarJ = j();
                zs0 zs0Var = this.a;
                ArrayList arrayListC = zs0Var.c(d30VarJ);
                int size = arrayListC.size();
                for (int i = 0; i < size; i++) {
                    sr0 sr0Var = (sr0) zs0Var.a().d(((z90) arrayListC.get(i)).a);
                    if (sr0Var != null && sr0Var.a.b != sr0Var.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [iw, y20] */
    public final void i() {
        yx yxVar;
        ia0 ia0Var = m60.a;
        c10.n(ia0Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.a.k.setValue(ia0Var);
        this.s = false;
        p();
        if (e() != null) {
            this.d.g(null);
            if (!g() || (yxVar = this.e) == null) {
                return;
            }
            yxVar.a();
        }
    }

    public final d30 j() {
        d30 d30Var = this.k;
        if (d30Var == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if (d30Var.H()) {
            return d30Var;
        }
        throw new IllegalArgumentException("unattached coordinates");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [iw, y20] */
    public final void k() {
        sr0 sr0Var;
        ArrayList arrayList;
        int i;
        d30 d30VarJ = j();
        zs0 zs0Var = this.a;
        ArrayList arrayListC = zs0Var.c(d30VarJ);
        if (arrayListC.isEmpty()) {
            return;
        }
        ia0 ia0Var = m60.a;
        ia0 ia0Var2 = new ia0();
        int size = arrayListC.size();
        int i2 = 0;
        sr0 sr0Var2 = null;
        sr0 sr0Var3 = null;
        while (i2 < size) {
            z90 z90Var = (z90) arrayListC.get(i2);
            long j = z90Var.a;
            o11 o11Var = (o11) z90Var.c.a();
            if (o11Var == null) {
                arrayList = arrayListC;
                i = size;
                sr0Var = null;
            } else {
                int length = o11Var.a.a.e.length();
                arrayList = arrayListC;
                i = size;
                sr0Var = new sr0(new rr0(o11Var.a(0), 0, j), new rr0(o11Var.a(Math.max(length - 1, 0)), length, j), false);
            }
            if (sr0Var != null) {
                if (sr0Var2 == null) {
                    sr0Var2 = sr0Var;
                }
                long j2 = z90Var.a;
                int iB = ia0Var2.b(j2);
                Object[] objArr = ia0Var2.c;
                Object obj = objArr[iB];
                ia0Var2.b[iB] = j2;
                objArr[iB] = sr0Var;
                sr0Var3 = sr0Var;
            }
            i2++;
            arrayListC = arrayList;
            size = i;
        }
        if (ia0Var2.e == 0) {
            return;
        }
        if (sr0Var2 != sr0Var3) {
            c10.m(sr0Var2);
            rr0 rr0Var = sr0Var2.a;
            c10.m(sr0Var3);
            sr0Var2 = new sr0(rr0Var, sr0Var3.b, false);
        }
        zs0Var.k.setValue(ia0Var2);
        this.d.g(sr0Var2);
        this.r = null;
    }

    public final void l(boolean z) {
        zg0 zg0Var = this.c;
        if (((Boolean) zg0Var.getValue()).booleanValue() != z) {
            zg0Var.setValue(Boolean.valueOf(z));
            p();
        }
    }

    public final void m(sr0 sr0Var) {
        this.b.setValue(sr0Var);
        if (sr0Var != null) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r13 = this;
            sr0 r0 = r13.e()
            d30 r1 = r13.k
            zs0 r2 = r13.a
            r3 = 0
            if (r0 == 0) goto L1a
            rr0 r4 = r0.a
            if (r4 == 0) goto L1a
            ia0 r5 = r2.c
            long r6 = r4.c
            java.lang.Object r4 = r5.d(r6)
            z90 r4 = (defpackage.z90) r4
            goto L1b
        L1a:
            r4 = r3
        L1b:
            if (r0 == 0) goto L2c
            rr0 r5 = r0.b
            if (r5 == 0) goto L2c
            ia0 r2 = r2.c
            long r5 = r5.c
            java.lang.Object r2 = r2.d(r5)
            z90 r2 = (defpackage.z90) r2
            goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r4 == 0) goto L34
            d30 r5 = r4.c()
            goto L35
        L34:
            r5 = r3
        L35:
            if (r2 == 0) goto L3c
            d30 r6 = r2.c()
            goto L3d
        L3c:
            r6 = r3
        L3d:
            zg0 r7 = r13.o
            zg0 r8 = r13.n
            if (r0 == 0) goto La8
            if (r1 == 0) goto La8
            boolean r9 = r1.H()
            if (r9 == 0) goto La8
            if (r5 != 0) goto L50
            if (r6 != 0) goto L50
            goto La8
        L50:
            xl0 r9 = defpackage.r31.f0(r1)
            if (r5 == 0) goto L7a
            r10 = 1
            long r10 = r4.a(r0, r10)
            boolean r4 = defpackage.nm.y(r10)
            if (r4 == 0) goto L62
            goto L7a
        L62:
            long r4 = r1.v(r5, r10)
            ed0 r10 = new ed0
            r10.<init>(r4)
            nx r11 = r13.c()
            nx r12 = defpackage.nx.e
            if (r11 == r12) goto L7b
            boolean r4 = defpackage.r31.t(r9, r4)
            if (r4 == 0) goto L7a
            goto L7b
        L7a:
            r10 = r3
        L7b:
            r8.setValue(r10)
            if (r6 == 0) goto La4
            r4 = 0
            long r4 = r2.a(r0, r4)
            boolean r0 = defpackage.nm.y(r4)
            if (r0 == 0) goto L8c
            goto La4
        L8c:
            long r0 = r1.v(r6, r4)
            ed0 r2 = new ed0
            r2.<init>(r0)
            nx r13 = r13.c()
            nx r4 = defpackage.nx.f
            if (r13 == r4) goto La3
            boolean r13 = defpackage.r31.t(r9, r0)
            if (r13 == 0) goto La4
        La3:
            r3 = r2
        La4:
            r7.setValue(r3)
            return
        La8:
            r8.setValue(r3)
            r7.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss0.n():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [iw, y20] */
    public final boolean o(long j, long j2, boolean z, tr0 tr0Var) {
        ArrayList arrayList;
        ks0 wu0Var;
        zs0 zs0Var;
        o11 o11Var;
        int i;
        o11 o11Var2;
        long jF;
        int i2;
        int i3;
        long j3;
        int iK;
        ls0 ls0Var;
        zs0 zs0Var2;
        int i4;
        boolean z2;
        ArrayList arrayList2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rr0 rr0Var;
        int i11;
        rr0 rr0Var2;
        this.p.setValue(z ? nx.e : nx.f);
        this.q.setValue(new ed0(j));
        d30 d30VarJ = j();
        zs0 zs0Var3 = this.a;
        ArrayList arrayListC = zs0Var3.c(d30VarJ);
        int i12 = l60.a;
        ga0 ga0Var = new ga0(6);
        int size = arrayListC.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            ga0Var.e(((z90) arrayListC.get(i14)).a, i14);
        }
        ls0 ls0Var2 = new ls0(j, j2, d30VarJ, z, nm.y(j2) ? null : e(), new qs0(i13, ga0Var));
        int size2 = arrayListC.size();
        int i15 = 0;
        while (true) {
            arrayList = ls0Var2.h;
            if (i15 >= size2) {
                break;
            }
            z90 z90Var = (z90) arrayListC.get(i15);
            d30 d30VarC = z90Var.c();
            if (d30VarC == null || (o11Var = (o11) z90Var.c.a()) == null) {
                zs0Var2 = zs0Var3;
                ls0Var = ls0Var2;
                i2 = size2;
                i3 = i15;
                arrayList2 = arrayListC;
                i = i13;
            } else {
                i = i13;
                long jV = ls0Var2.c.v(d30VarC, 0L);
                long jF2 = ed0.f(ls0Var2.a, jV);
                long j4 = ls0Var2.b;
                if (nm.y(j4)) {
                    jF = 9205357640488583168L;
                    o11Var2 = o11Var;
                } else {
                    o11Var2 = o11Var;
                    jF = ed0.f(j4, jV);
                }
                long j5 = z90Var.a;
                o11 o11Var3 = o11Var2;
                long j6 = o11Var3.c;
                i2 = size2;
                i3 = i15;
                float f = (int) (j6 & 4294967295L);
                int i16 = ed0.d(jF2) < 0.0f ? 1 : ed0.d(jF2) > ((float) ((int) (j6 >> 32))) ? 3 : 2;
                int i17 = ed0.e(jF2) < 0.0f ? 1 : ed0.e(jF2) > f ? 3 : 2;
                boolean z3 = ls0Var2.d;
                sr0 sr0Var = ls0Var2.e;
                if (z3) {
                    ls0 ls0Var3 = ls0Var2;
                    j3 = j5;
                    iK = m20.k(i16, i17, ls0Var3, j3, sr0Var != null ? sr0Var.b : null);
                    zs0Var2 = zs0Var3;
                    i6 = iK;
                    arrayList2 = arrayListC;
                    i4 = i16;
                    i7 = i17;
                    ls0Var = ls0Var3;
                    z2 = z3;
                    i5 = i6;
                } else {
                    ls0 ls0Var4 = ls0Var2;
                    j3 = j5;
                    iK = m20.k(i16, i17, ls0Var4, j3, sr0Var != null ? sr0Var.a : null);
                    ls0Var = ls0Var4;
                    zs0Var2 = zs0Var3;
                    i4 = iK;
                    z2 = z3;
                    arrayList2 = arrayListC;
                    i5 = i16;
                    i6 = i17;
                    i7 = i4;
                }
                int iK2 = dq0.k(i16, i17);
                if (iK2 == 2 || iK2 != iK) {
                    int length = o11Var3.a.a.e.length();
                    qs0 qs0Var = ls0Var.f;
                    if (z2) {
                        int iA = m20.A(jF2, o11Var3);
                        if (sr0Var == null || (rr0Var2 = sr0Var.b) == null) {
                            i11 = iA;
                            length = i11;
                        } else {
                            i11 = iA;
                            int iCompare = qs0Var.compare(Long.valueOf(rr0Var2.c), Long.valueOf(j3));
                            if (iCompare < 0) {
                                length = i;
                            } else if (iCompare <= 0) {
                                length = rr0Var2.b;
                            }
                        }
                        i9 = i11;
                        i10 = length;
                    } else {
                        int iA2 = m20.A(jF2, o11Var3);
                        if (sr0Var == null || (rr0Var = sr0Var.a) == null) {
                            i8 = iA2;
                            i9 = i8;
                        } else {
                            i8 = iA2;
                            int iCompare2 = qs0Var.compare(Long.valueOf(rr0Var.c), Long.valueOf(j3));
                            if (iCompare2 < 0) {
                                length = i;
                            } else if (iCompare2 <= 0) {
                                length = rr0Var.b;
                            }
                            i9 = length;
                        }
                        i10 = i8;
                    }
                    int iA3 = nm.y(jF) ? -1 : m20.A(jF, o11Var3);
                    int i18 = ls0Var.k + 2;
                    ls0Var.k = i18;
                    long j7 = j3;
                    pr0 pr0Var = new pr0(j7, i18, i9, i10, iA3, o11Var3);
                    ls0Var.i = ls0Var.a(ls0Var.i, i4, i7);
                    ls0Var.j = ls0Var.a(ls0Var.j, i5, i6);
                    ls0Var.g.e(j7, arrayList.size());
                    arrayList.add(pr0Var);
                }
            }
            i15 = i3 + 1;
            size2 = i2;
            ls0Var2 = ls0Var;
            i13 = i;
            arrayListC = arrayList2;
            zs0Var3 = zs0Var2;
        }
        zs0 zs0Var4 = zs0Var3;
        ls0 ls0Var5 = ls0Var2;
        boolean z4 = i13;
        int i19 = ls0Var5.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size3 != 1) {
            int i20 = ls0Var5.i;
            int i21 = i20 == -1 ? i19 : i20;
            int i22 = ls0Var5.j;
            wu0Var = new x90(ls0Var5.g, arrayList, i21, i22 == -1 ? i19 : i22, ls0Var5.d, ls0Var5.e);
        } else {
            pr0 pr0Var2 = (pr0) ue.b0(arrayList);
            int i23 = ls0Var5.i;
            int i24 = i23 == -1 ? i19 : i23;
            int i25 = ls0Var5.j;
            wu0Var = new wu0(ls0Var5.d, i24, i25 == -1 ? i19 : i25, ls0Var5.e, pr0Var2);
        }
        if (!wu0Var.g(this.r)) {
            return z4;
        }
        sr0 sr0VarA = tr0Var.a(wu0Var);
        if (!c10.i(sr0VarA, e())) {
            if (g()) {
                zs0Var = zs0Var4;
                ArrayList arrayList3 = zs0Var.b;
                int size4 = arrayList3.size();
                int i26 = z4 ? 1 : 0;
                while (true) {
                    if (i26 >= size4) {
                        break;
                    }
                    if (((z90) arrayList3.get(i26)).d().e.length() > 0) {
                        yx yxVar = this.e;
                        if (yxVar != null) {
                            yxVar.a();
                        }
                    } else {
                        i26++;
                    }
                }
            } else {
                zs0Var = zs0Var4;
            }
            zs0Var.k.setValue(wu0Var.h(sr0VarA));
            this.d.g(sr0VarA);
        }
        this.r = wu0Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss0.p():void");
    }
}
