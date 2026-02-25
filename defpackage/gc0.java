package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gc0 extends sc0 {
    public final d90 c;
    public final c8 d;
    public final r60 e;
    public nc0 f;
    public gj0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public gc0(d90 d90Var) {
        this.c = d90Var;
        c8 c8Var = new c8(3);
        c8Var.c = new long[2];
        this.d = c8Var;
        this.e = new r60(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0311  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.r60 r53, defpackage.d30 r54, defpackage.xz r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc0.a(r60, d30, xz, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.sc0
    public final void b(xz xzVar) {
        super.b(xzVar);
        gj0 gj0Var = this.g;
        if (gj0Var == null) {
            return;
        }
        this.h = this.i;
        ?? r1 = gj0Var.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            nj0 nj0Var = (nj0) r1.get(i);
            boolean z = nj0Var.d;
            long j = nj0Var.a;
            boolean zH = xzVar.h(j);
            boolean z2 = this.i;
            if ((!z && !zH) || (!z && !z2)) {
                this.d.d(j);
            }
        }
        this.i = false;
        this.j = gj0Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eb0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [eb0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [d90] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        eb0 eb0Var = this.a;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((gc0) objArr[i2]).c();
        }
        mn mnVarI = this.c;
        ?? eb0Var2 = 0;
        while (mnVarI != 0) {
            if (mnVarI instanceof qj0) {
                ((qj0) mnVarI).b0();
            } else if ((mnVarI.f & 16) != 0 && (mnVarI instanceof mn)) {
                d90 d90Var = mnVarI.s;
                int i3 = 0;
                eb0Var2 = eb0Var2;
                mnVarI = mnVarI;
                while (d90Var != null) {
                    if ((d90Var.f & 16) != 0) {
                        i3++;
                        eb0Var2 = eb0Var2;
                        if (i3 == 1) {
                            mnVarI = d90Var;
                        } else {
                            if (eb0Var2 == 0) {
                                eb0Var2 = new eb0(new d90[16]);
                            }
                            if (mnVarI != 0) {
                                eb0Var2.b(mnVarI);
                                mnVarI = 0;
                            }
                            eb0Var2.b(d90Var);
                        }
                    }
                    d90Var = d90Var.i;
                    eb0Var2 = eb0Var2;
                    mnVarI = mnVarI;
                }
                if (i3 == 1) {
                }
            }
            mnVarI = d80.i(eb0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.xz r15) {
        /*
            r14 = this;
            r60 r0 = r14.e
            int r1 = r0.c()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            d90 r1 = r14.c
            boolean r4 = r1.q
            if (r4 != 0) goto L14
            goto La
        L14:
            gj0 r4 = r14.g
            defpackage.c10.m(r4)
            nc0 r5 = r14.f
            defpackage.c10.m(r5)
            long r5 = r5.f
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof defpackage.qj0
            if (r10 == 0) goto L31
            qj0 r7 = (defpackage.qj0) r7
            hj0 r9 = defpackage.hj0.f
            r7.H(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.f
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof defpackage.mn
            if (r10 == 0) goto L67
            r10 = r7
            mn r10 = (defpackage.mn) r10
            d90 r10 = r10.s
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.f
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            eb0 r8 = new eb0
            d90[] r13 = new defpackage.d90[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.b(r7)
            r7 = r2
        L5e:
            r8.b(r10)
        L61:
            d90 r10 = r10.i
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            d90 r7 = defpackage.d80.i(r8)
            goto L22
        L6c:
            boolean r1 = r1.q
            if (r1 == 0) goto L83
            eb0 r1 = r14.a
            java.lang.Object[] r4 = r1.d
            int r1 = r1.f
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            gc0 r6 = (defpackage.gc0) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.b(r15)
            int r15 = r0.g
            java.lang.Object[] r1 = r0.f
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.g = r3
            r0.d = r3
            r14.f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc0.d(xz):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [d90] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d90] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [d90] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [eb0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [eb0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r6v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [eb0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eb0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(xz xzVar, boolean z) {
        if (this.e.c() == 0) {
            return false;
        }
        mn mnVarI = this.c;
        if (!mnVarI.q) {
            return false;
        }
        gj0 gj0Var = this.g;
        c10.m(gj0Var);
        nc0 nc0Var = this.f;
        c10.m(nc0Var);
        long j = nc0Var.f;
        mn mnVarI2 = mnVarI;
        ?? eb0Var = 0;
        while (mnVarI2 != 0) {
            if (mnVarI2 instanceof qj0) {
                ((qj0) mnVarI2).H(gj0Var, hj0.d, j);
            } else if ((mnVarI2.f & 16) != 0 && (mnVarI2 instanceof mn)) {
                d90 d90Var = mnVarI2.s;
                int i = 0;
                mnVarI2 = mnVarI2;
                eb0Var = eb0Var;
                while (d90Var != null) {
                    if ((d90Var.f & 16) != 0) {
                        i++;
                        eb0Var = eb0Var;
                        if (i == 1) {
                            mnVarI2 = d90Var;
                        } else {
                            if (eb0Var == 0) {
                                eb0Var = new eb0(new d90[16]);
                            }
                            if (mnVarI2 != 0) {
                                eb0Var.b(mnVarI2);
                                mnVarI2 = 0;
                            }
                            eb0Var.b(d90Var);
                        }
                    }
                    d90Var = d90Var.i;
                    mnVarI2 = mnVarI2;
                    eb0Var = eb0Var;
                }
                if (i == 1) {
                }
            }
            mnVarI2 = d80.i(eb0Var);
        }
        if (mnVarI.q) {
            eb0 eb0Var2 = this.a;
            Object[] objArr = eb0Var2.d;
            int i2 = eb0Var2.f;
            for (int i3 = 0; i3 < i2; i3++) {
                gc0 gc0Var = (gc0) objArr[i3];
                c10.m(this.f);
                gc0Var.e(xzVar, z);
            }
        }
        if (mnVarI.q) {
            ?? eb0Var3 = 0;
            while (mnVarI != 0) {
                if (mnVarI instanceof qj0) {
                    ((qj0) mnVarI).H(gj0Var, hj0.e, j);
                } else if ((mnVarI.f & 16) != 0 && (mnVarI instanceof mn)) {
                    d90 d90Var2 = mnVarI.s;
                    int i4 = 0;
                    mnVarI = mnVarI;
                    eb0Var3 = eb0Var3;
                    while (d90Var2 != null) {
                        if ((d90Var2.f & 16) != 0) {
                            i4++;
                            eb0Var3 = eb0Var3;
                            if (i4 == 1) {
                                mnVarI = d90Var2;
                            } else {
                                if (eb0Var3 == 0) {
                                    eb0Var3 = new eb0(new d90[16]);
                                }
                                if (mnVarI != 0) {
                                    eb0Var3.b(mnVarI);
                                    mnVarI = 0;
                                }
                                eb0Var3.b(d90Var2);
                            }
                        }
                        d90Var2 = d90Var2.i;
                        mnVarI = mnVarI;
                        eb0Var3 = eb0Var3;
                    }
                    if (i4 == 1) {
                    }
                }
                mnVarI = d80.i(eb0Var3);
            }
        }
        return true;
    }

    public final void f(long j, ma0 ma0Var) {
        c8 c8Var = this.d;
        if (c8Var.c(j) && ma0Var.f(this) < 0) {
            c8Var.d(j);
            r60 r60Var = this.e;
            int iK = nm.k(r60Var.e, r60Var.g, j);
            if (iK >= 0) {
                Object[] objArr = r60Var.f;
                Object obj = objArr[iK];
                Object obj2 = l81.c;
                if (obj != obj2) {
                    objArr[iK] = obj2;
                    r60Var.d = true;
                }
            }
        }
        eb0 eb0Var = this.a;
        Object[] objArr2 = eb0Var.d;
        int i = eb0Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((gc0) objArr2[i2]).f(j, ma0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
