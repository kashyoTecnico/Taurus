package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ov0 {
    public static final mv0 a = new mv0(0);
    public static final e9 b = new e9(10);
    public static final Object c = new Object();
    public static lv0 d;
    public static long e;
    public static final jv0 f;
    public static final me g;
    public static Object h;
    public static Object i;
    public static final bx j;
    public static final z9 k;

    static {
        lv0 lv0Var = lv0.h;
        d = lv0Var;
        long j2 = 1;
        e = j2 + j2;
        jv0 jv0Var = new jv0();
        jv0Var.b = new long[16];
        jv0Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        jv0Var.d = iArr;
        f = jv0Var;
        me meVar = new me();
        meVar.b = new int[16];
        meVar.c = new q61[16];
        g = meVar;
        ks ksVar = ks.d;
        h = ksVar;
        i = ksVar;
        long j3 = e;
        e = j2 + j3;
        bx bxVar = new bx(j3, lv0Var, null, new r8(2));
        d = d.e(bxVar.b);
        j = bxVar;
        k = new z9(0);
    }

    public static final void a() {
        f(a);
    }

    public static final iw b(iw iwVar, iw iwVar2) {
        return (iwVar == null || iwVar2 == null || iwVar == iwVar2) ? iwVar == null ? iwVar2 : iwVar : new nv0(iwVar, iwVar2, 1);
    }

    public static final HashMap c(long j2, ya0 ya0Var, lv0 lv0Var) {
        long[] jArr;
        lv0 lv0Var2;
        long[] jArr2;
        lv0 lv0Var3;
        int i2;
        fx0 fx0VarS;
        long j3 = j2;
        ua0 ua0VarX = ya0Var.x();
        if (ua0VarX != null) {
            lv0 lv0VarD = ya0Var.d().e(ya0Var.g()).d(ya0Var.j);
            Object[] objArr = ua0VarX.b;
            long[] jArr3 = ua0VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                dx0 dx0Var = (dx0) objArr[(i3 << 3) + i6];
                                fx0 fx0VarA = dx0Var.a();
                                jArr2 = jArr3;
                                i2 = i4;
                                fx0 fx0VarS2 = s(fx0VarA, j3, lv0Var);
                                if (fx0VarS2 == null || (fx0VarS = s(fx0VarA, j3, lv0VarD)) == null || fx0VarS2.equals(fx0VarS)) {
                                    lv0Var3 = lv0VarD;
                                } else {
                                    lv0Var3 = lv0VarD;
                                    fx0 fx0VarS3 = s(fx0VarA, ya0Var.g(), ya0Var.d());
                                    if (fx0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    fx0 fx0VarB = dx0Var.b(fx0VarS, fx0VarS2, fx0VarS3);
                                    if (fx0VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(fx0VarS2, fx0VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                lv0Var3 = lv0VarD;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            lv0VarD = lv0Var3;
                        }
                        jArr = jArr3;
                        lv0Var2 = lv0VarD;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        lv0Var2 = lv0VarD;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    lv0VarD = lv0Var2;
                }
            }
        }
        return null;
    }

    public static final void d(gv0 gv0Var) {
        long j2;
        if (d.c(gv0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(gv0Var.g());
        sb.append(", disposed=");
        sb.append(gv0Var.c);
        sb.append(", applied=");
        ya0 ya0Var = gv0Var instanceof ya0 ? (ya0) gv0Var : null;
        sb.append(ya0Var != null ? Boolean.valueOf(ya0Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            jv0 jv0Var = f;
            j2 = jv0Var.a > 0 ? jv0Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final lv0 e(lv0 lv0Var, long j2, long j3) {
        while (c10.x(j2, j3) < 0) {
            lv0Var = lv0Var.e(j2);
            j2++;
        }
        return lv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.iw r15) {
        /*
            bx r0 = defpackage.ov0.j
            java.lang.Object r1 = defpackage.ov0.c
            monitor-enter(r1)
            ua0 r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            z9 r3 = defpackage.ov0.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = defpackage.ov0.h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            kw r7 = (defpackage.kw) r7     // Catch: java.lang.Throwable -> L36
            gq0 r8 = new gq0     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.e(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            z9 r0 = defpackage.ov0.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            z9 r0 = defpackage.ov0.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = defpackage.ov0.c
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            dx0 r11 = (defpackage.dx0) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov0.f(iw):java.lang.Object");
    }

    public static final void g() {
        me meVar = g;
        int i2 = meVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            q61 q61Var = ((q61[]) meVar.c)[i3];
            Object obj = q61Var != null ? q61Var.get() : null;
            if (obj != null && p((dx0) obj)) {
                if (i4 != i3) {
                    ((q61[]) meVar.c)[i4] = q61Var;
                    int[] iArr = (int[]) meVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((q61[]) meVar.c)[i5] = null;
            ((int[]) meVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            meVar.a = i4;
        }
    }

    public static final gv0 h(gv0 gv0Var, iw iwVar, boolean z) {
        boolean z2 = gv0Var instanceof ya0;
        if (z2 || gv0Var == null) {
            return new g31(z2 ? (ya0) gv0Var : null, iwVar, null, false, z);
        }
        return new h31(gv0Var, iwVar, false, z);
    }

    public static final fx0 i(fx0 fx0Var) {
        fx0 fx0VarS;
        gv0 gv0VarK = k();
        fx0 fx0VarS2 = s(fx0Var, gv0VarK.g(), gv0VarK.d());
        if (fx0VarS2 != null) {
            return fx0VarS2;
        }
        synchronized (c) {
            gv0 gv0VarK2 = k();
            fx0VarS = s(fx0Var, gv0VarK2.g(), gv0VarK2.d());
        }
        if (fx0VarS != null) {
            return fx0VarS;
        }
        r();
        throw null;
    }

    public static final fx0 j(fx0 fx0Var, gv0 gv0Var) {
        fx0 fx0VarS;
        fx0 fx0VarS2 = s(fx0Var, gv0Var.g(), gv0Var.d());
        if (fx0VarS2 != null) {
            return fx0VarS2;
        }
        synchronized (c) {
            fx0VarS = s(fx0Var, gv0Var.g(), gv0Var.d());
        }
        if (fx0VarS != null) {
            return fx0VarS;
        }
        r();
        throw null;
    }

    public static final gv0 k() {
        gv0 gv0Var = (gv0) b.n();
        return gv0Var == null ? j : gv0Var;
    }

    public static final iw l(iw iwVar, iw iwVar2, boolean z) {
        if (!z) {
            iwVar2 = null;
        }
        return (iwVar == null || iwVar2 == null || iwVar == iwVar2) ? iwVar == null ? iwVar2 : iwVar : new nv0(iwVar, iwVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fx0 m(defpackage.fx0 r10, defpackage.dx0 r11) {
        /*
            fx0 r0 = r11.a()
            long r1 = defpackage.ov0.e
            jv0 r3 = defpackage.ov0.f
            int r4 = r3.a
            if (r4 <= 0) goto L11
            long[] r1 = r3.b
            r2 = 0
            r1 = r1[r2]
        L11:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L16:
            if (r0 == 0) goto L48
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L21
            goto L41
        L21:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L45
            int r7 = defpackage.c10.x(r5, r1)
            if (r7 > 0) goto L45
            lv0 r7 = defpackage.lv0.h
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L45
            if (r4 != 0) goto L37
            r4 = r0
            goto L45
        L37:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.c10.x(r1, r5)
            if (r1 >= 0) goto L43
        L41:
            r3 = r0
            goto L48
        L43:
            r3 = r4
            goto L48
        L45:
            fx0 r0 = r0.b
            goto L16
        L48:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L52
            r3.a = r0
            return r3
        L52:
            fx0 r10 = r10.b(r0)
            fx0 r0 = r11.a()
            r10.b = r0
            r11.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov0.m(fx0, dx0):fx0");
    }

    public static final void n(gv0 gv0Var, dx0 dx0Var) {
        gv0Var.t(gv0Var.h() + 1);
        iw iwVarI = gv0Var.i();
        if (iwVarI != null) {
            iwVarI.g(dx0Var);
        }
    }

    public static final fx0 o(fx0 fx0Var, ex0 ex0Var, gv0 gv0Var, fx0 fx0Var2) {
        fx0 fx0VarM;
        if (gv0Var.f()) {
            gv0Var.n(ex0Var);
        }
        long jG = gv0Var.g();
        if (fx0Var2.a == jG) {
            return fx0Var2;
        }
        synchronized (c) {
            fx0VarM = m(fx0Var, ex0Var);
        }
        fx0VarM.a = jG;
        if (fx0Var2.a != 1) {
            gv0Var.n(ex0Var);
        }
        return fx0VarM;
    }

    public static final boolean p(dx0 dx0Var) {
        fx0 fx0Var;
        long j2 = e;
        jv0 jv0Var = f;
        if (jv0Var.a > 0) {
            j2 = jv0Var.b[0];
        }
        fx0 fx0Var2 = null;
        fx0 fx0VarA = null;
        int i2 = 0;
        for (fx0 fx0VarA2 = dx0Var.a(); fx0VarA2 != null; fx0VarA2 = fx0VarA2.b) {
            long j3 = fx0VarA2.a;
            if (j3 != 0) {
                if (c10.x(j3, j2) >= 0) {
                    i2++;
                } else if (fx0Var2 == null) {
                    i2++;
                    fx0Var2 = fx0VarA2;
                } else {
                    if (c10.x(fx0VarA2.a, fx0Var2.a) < 0) {
                        fx0Var = fx0Var2;
                        fx0Var2 = fx0VarA2;
                    } else {
                        fx0Var = fx0VarA2;
                    }
                    if (fx0VarA == null) {
                        fx0VarA = dx0Var.a();
                        fx0 fx0Var3 = fx0VarA;
                        while (true) {
                            if (fx0VarA == null) {
                                fx0VarA = fx0Var3;
                                break;
                            }
                            if (c10.x(fx0VarA.a, j2) >= 0) {
                                break;
                            }
                            if (c10.x(fx0Var3.a, fx0VarA.a) < 0) {
                                fx0Var3 = fx0VarA;
                            }
                            fx0VarA = fx0VarA.b;
                        }
                    }
                    fx0Var2.a = 0L;
                    fx0Var2.a(fx0VarA);
                    fx0Var2 = fx0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(dx0 dx0Var) {
        if (p(dx0Var)) {
            me meVar = g;
            int i2 = meVar.a;
            int iIdentityHashCode = System.identityHashCode(dx0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = meVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) meVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        q61 q61Var = ((q61[]) meVar.c)[i6];
                        if (dx0Var == (q61Var != null ? q61Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) meVar.b)[i8] == iIdentityHashCode; i8--) {
                                q61 q61Var2 = ((q61[]) meVar.c)[i8];
                                if ((q61Var2 != null ? q61Var2.get() : null) == dx0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = meVar.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(meVar.a + 1);
                                    break;
                                } else {
                                    if (((int[]) meVar.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    q61 q61Var3 = ((q61[]) meVar.c)[i6];
                                    if ((q61Var3 != null ? q61Var3.get() : null) == dx0Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            q61[] q61VarArr = (q61[]) meVar.c;
            int length = q61VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                q61[] q61VarArr2 = new q61[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(q61VarArr, i10, q61VarArr2, i12, i2 - i10);
                System.arraycopy((q61[]) meVar.c, 0, q61VarArr2, 0, i10);
                y9.p0((int[]) meVar.b, iArr, i12, i10, i2);
                y9.s0((int[]) meVar.b, iArr, 0, i10, 6);
                meVar.c = q61VarArr2;
                meVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(q61VarArr, i10, q61VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) meVar.b;
                y9.p0(iArr2, iArr2, i13, i10, i2);
            }
            ((q61[]) meVar.c)[i10] = new q61(dx0Var);
            ((int[]) meVar.b)[i10] = iIdentityHashCode;
            meVar.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final fx0 s(fx0 fx0Var, long j2, lv0 lv0Var) {
        fx0 fx0Var2 = null;
        while (fx0Var != null) {
            long j3 = fx0Var.a;
            if (j3 != 0 && c10.x(j3, j2) <= 0 && !lv0Var.c(j3) && (fx0Var2 == null || c10.x(fx0Var2.a, fx0Var.a) < 0)) {
                fx0Var2 = fx0Var;
            }
            fx0Var = fx0Var.b;
        }
        if (fx0Var2 != null) {
            return fx0Var2;
        }
        return null;
    }

    public static final fx0 t(fx0 fx0Var, dx0 dx0Var) {
        fx0 fx0VarS;
        gv0 gv0VarK = k();
        iw iwVarE = gv0VarK.e();
        if (iwVarE != null) {
            iwVarE.g(dx0Var);
        }
        fx0 fx0VarS2 = s(fx0Var, gv0VarK.g(), gv0VarK.d());
        if (fx0VarS2 != null) {
            return fx0VarS2;
        }
        synchronized (c) {
            gv0 gv0VarK2 = k();
            fx0 fx0VarA = dx0Var.a();
            c10.n(fx0VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            fx0VarS = s(fx0VarA, gv0VarK2.g(), gv0VarK2.d());
            if (fx0VarS == null) {
                r();
                throw null;
            }
        }
        return fx0VarS;
    }

    public static final void u(int i2) {
        jv0 jv0Var = f;
        int i3 = jv0Var.d[i2];
        jv0Var.b(i3, jv0Var.a - 1);
        jv0Var.a--;
        long[] jArr = jv0Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (c10.x(jArr[i5], j2) <= 0) {
                break;
            }
            jv0Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = jv0Var.b;
        int i6 = jv0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < jv0Var.a && c10.x(jArr2[i7], jArr2[i8]) < 0) {
                if (c10.x(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                jv0Var.b(i7, i3);
                i3 = i7;
            } else {
                if (c10.x(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                jv0Var.b(i8, i3);
                i3 = i8;
            }
        }
        jv0Var.d[i2] = jv0Var.e;
        jv0Var.e = i2;
    }

    public static final Object v(bx bxVar, iw iwVar) {
        long j2 = bxVar.b;
        Object objG = iwVar.g(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        lv0 lv0VarB = d.b(j2);
        d = lv0VarB;
        bxVar.b = j3;
        bxVar.a = lv0VarB;
        bxVar.g = 0;
        bxVar.h = null;
        bxVar.o();
        d = d.e(j3);
        return objG;
    }

    public static final fx0 w(fx0 fx0Var, dx0 dx0Var, gv0 gv0Var) {
        fx0 fx0VarS;
        if (gv0Var.f()) {
            gv0Var.n(dx0Var);
        }
        long jG = gv0Var.g();
        fx0 fx0VarS2 = s(fx0Var, jG, gv0Var.d());
        if (fx0VarS2 == null) {
            r();
            throw null;
        }
        if (fx0VarS2.a == gv0Var.g()) {
            return fx0VarS2;
        }
        synchronized (c) {
            fx0VarS = s(dx0Var.a(), jG, gv0Var.d());
            if (fx0VarS == null) {
                r();
                throw null;
            }
            if (fx0VarS.a != jG) {
                fx0 fx0VarM = m(fx0VarS, dx0Var);
                fx0VarM.a(fx0VarS);
                fx0VarM.a = gv0Var.g();
                fx0VarS = fx0VarM;
            }
        }
        if (fx0VarS2.a != 1) {
            gv0Var.n(dx0Var);
        }
        return fx0VarS;
    }
}
