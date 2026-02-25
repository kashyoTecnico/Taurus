package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class aw0 {
    public final iw a;
    public Object b;
    public la0 c;
    public int j;
    public int d = -1;
    public final ta0 e = n2.c();
    public final ta0 f = new ta0();
    public final ua0 g = new ua0();
    public final eb0 h = new eb0(new fo[16]);
    public final bi i = new bi(1, this);
    public final ta0 k = n2.c();
    public final HashMap l = new HashMap();

    public aw0(iw iwVar) {
        this.a = iwVar;
    }

    public final void a(Object obj, ir irVar, gw gwVar) {
        Object obj2;
        int i;
        boolean z;
        Object obj3;
        int i2;
        int i3;
        int i4;
        Object obj4 = this.b;
        la0 la0Var = this.c;
        int i5 = this.d;
        this.b = obj;
        this.c = (la0) this.f.g(obj);
        if (this.d == -1) {
            this.d = Long.hashCode(ov0.k().g());
        }
        bi biVar = this.i;
        eb0 eb0VarF = qo0.f();
        boolean z2 = true;
        try {
            eb0VarF.b(biVar);
            h9.k(irVar, gwVar);
            eb0VarF.k(eb0VarF.f - 1);
            Object obj5 = this.b;
            c10.m(obj5);
            int i6 = this.d;
            la0 la0Var2 = this.c;
            if (la0Var2 != null) {
                long[] jArr = la0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            z = z2;
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    i4 = i8;
                                    Object obj6 = la0Var2.b[i11];
                                    i3 = i10;
                                    boolean z3 = la0Var2.c[i11] != i6 ? z : false;
                                    if (z3) {
                                        i2 = i6;
                                        ta0 ta0Var = this.e;
                                        n2.k(ta0Var, obj6, obj5);
                                        obj3 = obj5;
                                        if ((obj6 instanceof fo) && !ta0Var.c(obj6)) {
                                            n2.l(this.k, obj6);
                                            this.l.remove(obj6);
                                        }
                                    } else {
                                        obj3 = obj5;
                                        i2 = i6;
                                    }
                                    if (z3) {
                                        la0Var2.g(i11);
                                    }
                                } else {
                                    obj3 = obj5;
                                    i2 = i6;
                                    i3 = i10;
                                    i4 = i8;
                                }
                                j >>= i4;
                                i10 = i3 + 1;
                                i8 = i4;
                                i6 = i2;
                                obj5 = obj3;
                            }
                            obj2 = obj5;
                            i = i6;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            obj2 = obj5;
                            i = i6;
                            z = z2;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        z2 = z;
                        i6 = i;
                        obj5 = obj2;
                    }
                }
            }
            this.b = obj4;
            this.c = la0Var;
            this.d = i5;
        } catch (Throwable th) {
            eb0VarF.k(eb0VarF.f - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027e A[PHI: r13
  0x027e: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x0256, B:117:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a7 A[PHI: r13
  0x04a7: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x047f, B:218:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0506 A[EDGE_INSN: B:241:0x0506->B:319:0x050f BREAK  A[LOOP:18: B:231:0x04d4->B:242:0x0508], PHI: r13
  0x0506: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04de, B:240:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136 A[PHI: r33
  0x0136: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x010a, B:56:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f A[PHI: r13
  0x020f: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e7, B:93:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.la0 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof defpackage.fo
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            fo r2 = (defpackage.fo) r2
            eo r2 = r2.h()
            java.util.HashMap r3 = r0.l
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            la0 r2 = r2.e
            ta0 r3 = r0.k
            defpackage.n2.l(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            dx0 r9 = (defpackage.dx0) r9
            boolean r5 = r9 instanceof defpackage.ex0
            if (r5 == 0) goto L82
            r5 = r9
            ex0 r5 = (defpackage.ex0) r5
            r5.f(r4)
        L82:
            defpackage.n2.a(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof defpackage.ex0
            if (r2 == 0) goto L9d
            r2 = r1
            ex0 r2 = (defpackage.ex0) r2
            r2.f(r4)
        L9d:
            ta0 r0 = r0.e
            r2 = r23
            defpackage.n2.a(r0, r1, r2)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.c(java.lang.Object, int, java.lang.Object, la0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.d():void");
    }
}
