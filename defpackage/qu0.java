package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class qu0 extends h0 implements xa0, vt, sw {
    public final int h;
    public final int i;
    public final ec j;
    public Object[] k;
    public long l;
    public long m;
    public int n;
    public int o;

    public qu0(int i, int i2, ec ecVar) {
        this.h = i;
        this.i = i2;
        this.j = ecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0078, B:35:0x0082, B:39:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a1, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [qu0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wt] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [i0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ru0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [ru0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00af -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(defpackage.qu0 r8, defpackage.wt r9, defpackage.lk r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.pu0
            if (r0 == 0) goto L13
            r0 = r10
            pu0 r0 = (defpackage.pu0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            pu0 r0 = new pu0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            int r1 = r0.m
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            r10 r8 = r0.j
            ru0 r9 = r0.i
            wt r1 = r0.h
            qu0 r4 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L75
        L36:
            r8 = move-exception
            goto Lb5
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            r10 r8 = r0.j
            ru0 r9 = r0.i
            wt r1 = r0.h
            qu0 r4 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L36
            goto L78
        L4d:
            ru0 r9 = r0.i
            wt r8 = r0.h
            qu0 r1 = r0.g
            defpackage.c10.X(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb5
        L5c:
            defpackage.c10.X(r10)
            i0 r10 = r8.a()
            ru0 r10 = (defpackage.ru0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            ml r1 = r0.e     // Catch: java.lang.Throwable -> Lb2
            defpackage.c10.m(r1)     // Catch: java.lang.Throwable -> Lb2
            g2 r4 = defpackage.g2.E     // Catch: java.lang.Throwable -> Lb2
            kl r1 = r1.n(r4)     // Catch: java.lang.Throwable -> Lb2
            r10 r1 = (defpackage.r10) r1     // Catch: java.lang.Throwable -> Lb2
        L75:
            r4 = r8
            r8 = r1
            r1 = r10
        L78:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            cs r5 = defpackage.c4.n     // Catch: java.lang.Throwable -> L36
            xl r6 = defpackage.xl.d
            if (r10 != r5) goto L93
            r0.g = r4     // Catch: java.lang.Throwable -> L36
            r0.h = r1     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.j = r8     // Catch: java.lang.Throwable -> L36
            r0.m = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L78
            goto Lb1
        L93:
            if (r8 == 0) goto La1
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.q()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La1:
            r0.g = r4     // Catch: java.lang.Throwable -> L36
            r0.h = r1     // Catch: java.lang.Throwable -> L36
            r0.i = r9     // Catch: java.lang.Throwable -> L36
            r0.j = r8     // Catch: java.lang.Throwable -> L36
            r0.m = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb1:
            return
        Lb2:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb5:
            r4.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu0.k(qu0, wt, lk):void");
    }

    @Override // defpackage.vt
    public final Object b(wt wtVar, lk lkVar) throws Throwable {
        k(this, wtVar, lkVar);
        return xl.d;
    }

    @Override // defpackage.h0
    public final i0 c() {
        ru0 ru0Var = new ru0();
        ru0Var.a = -1L;
        return ru0Var;
    }

    @Override // defpackage.h0
    public final i0[] d() {
        return new ru0[2];
    }

    @Override // defpackage.sw
    public final vt e(ml mlVar, int i, ec ecVar) {
        return ((i == 0 || i == -3) && ecVar == ec.d) ? this : new od(this, mlVar, i, ecVar);
    }

    public final Object h(ru0 ru0Var, pu0 pu0Var) {
        ad adVar = new ad(1, r31.I(pu0Var));
        adVar.t();
        synchronized (this) {
            try {
                if (s(ru0Var) < 0) {
                    ru0Var.b = adVar;
                } else {
                    adVar.h(j41.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objS = adVar.s();
        return objS == xl.d ? objS : j41.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    @Override // defpackage.wt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r8, defpackage.lk r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.q(r8)
            if (r0 == 0) goto L9
            j41 r7 = defpackage.j41.a
            return r7
        L9:
            ad r5 = new ad
            lk r9 = defpackage.r31.I(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.t()
            lk[] r9 = defpackage.nm.a
            monitor-enter(r7)
            boolean r0 = r7.r(r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L30
            j41 r8 = defpackage.j41.a     // Catch: java.lang.Throwable -> L2b
            r5.h(r8)     // Catch: java.lang.Throwable -> L2b
            lk[] r8 = r7.n(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8e
        L30:
            ou0 r0 = new ou0     // Catch: java.lang.Throwable -> L8b
            long r1 = r7.o()     // Catch: java.lang.Throwable -> L8b
            int r3 = r7.n     // Catch: java.lang.Throwable -> L86
            int r4 = r7.o     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.m(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.o     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.o = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.i     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            lk[] r9 = r1.n(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8e
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L65
            wc r7 = new wc
            r0 = 1
            r7.<init>(r0, r9)
            r5.w(r7)
        L65:
            int r7 = r8.length
            r9 = 0
        L67:
            if (r9 >= r7) goto L75
            r0 = r8[r9]
            if (r0 == 0) goto L72
            j41 r1 = defpackage.j41.a
            r0.h(r1)
        L72:
            int r9 = r9 + 1
            goto L67
        L75:
            java.lang.Object r7 = r5.s()
            xl r8 = defpackage.xl.d
            if (r7 != r8) goto L7e
            goto L80
        L7e:
            j41 r7 = defpackage.j41.a
        L80:
            if (r7 != r8) goto L83
            return r7
        L83:
            j41 r7 = defpackage.j41.a
            return r7
        L86:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8e
        L8b:
            r0 = move-exception
            r1 = r7
            goto L55
        L8e:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu0.i(java.lang.Object, lk):java.lang.Object");
    }

    public final void j() {
        if (this.i != 0 || this.o > 1) {
            Object[] objArr = this.k;
            c10.m(objArr);
            while (this.o > 0) {
                long jO = o();
                int i = this.n;
                int i2 = this.o;
                if (objArr[((int) ((jO + (i + i2)) - 1)) & (objArr.length - 1)] != c4.n) {
                    return;
                }
                this.o = i2 - 1;
                c4.i(objArr, o() + this.n + this.o, null);
            }
        }
    }

    public final void l() {
        i0[] i0VarArr;
        Object[] objArr = this.k;
        c10.m(objArr);
        c4.i(objArr, o(), null);
        this.n--;
        long jO = o() + 1;
        if (this.l < jO) {
            this.l = jO;
        }
        if (this.m < jO) {
            if (this.e != 0 && (i0VarArr = this.d) != null) {
                for (i0 i0Var : i0VarArr) {
                    if (i0Var != null) {
                        ru0 ru0Var = (ru0) i0Var;
                        long j = ru0Var.a;
                        if (j >= 0 && j < jO) {
                            ru0Var.a = jO;
                        }
                    }
                }
            }
            this.m = jO;
        }
    }

    public final void m(Object obj) {
        int i = this.n + this.o;
        Object[] objArrP = this.k;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        c4.i(objArrP, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final lk[] n(lk[] lkVarArr) {
        i0[] i0VarArr;
        ru0 ru0Var;
        ad adVar;
        int length = lkVarArr.length;
        if (this.e != 0 && (i0VarArr = this.d) != null) {
            int length2 = i0VarArr.length;
            int i = 0;
            lkVarArr = lkVarArr;
            while (i < length2) {
                i0 i0Var = i0VarArr[i];
                if (i0Var != null && (adVar = (ru0Var = (ru0) i0Var).b) != null && s(ru0Var) >= 0) {
                    int length3 = lkVarArr.length;
                    lkVarArr = lkVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(lkVarArr, Math.max(2, lkVarArr.length * 2));
                        c10.o(CopyOf, "copyOf(...)");
                        lkVarArr = CopyOf;
                    }
                    lkVarArr[length] = adVar;
                    ru0Var.b = null;
                    length++;
                }
                i++;
                lkVarArr = lkVarArr;
            }
        }
        return lkVarArr;
    }

    public final long o() {
        return Math.min(this.m, this.l);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.k = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jO;
                c4.i(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        lk[] lkVarArrN = nm.a;
        synchronized (this) {
            if (r(obj)) {
                lkVarArrN = n(lkVarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (lk lkVar : lkVarArrN) {
            if (lkVar != null) {
                lkVar.h(j41.a);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.e
            int r2 = r12.h
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.m(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.n
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.m = r1
            return r9
        L23:
            int r1 = r12.n
            int r3 = r12.i
            if (r1 < r3) goto L47
            long r4 = r12.m
            long r6 = r12.l
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            ec r1 = r12.j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7f
        L3f:
            fg r0 = new fg
            r0.<init>()
            throw r0
        L45:
            r0 = 0
            return r0
        L47:
            r12.m(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r3) goto L54
            r12.l()
        L54:
            long r3 = r12.o()
            int r1 = r12.n
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.l
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.m
            long r5 = r12.o()
            int r7 = r12.n
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.n
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.o
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu0.r(java.lang.Object):boolean");
    }

    public final long s(ru0 ru0Var) {
        long j = ru0Var.a;
        if (j >= o() + this.n && (this.i > 0 || j > o() || this.o == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(ru0 ru0Var) {
        Object obj;
        lk[] lkVarArrV = nm.a;
        synchronized (this) {
            try {
                long jS = s(ru0Var);
                if (jS < 0) {
                    obj = c4.n;
                } else {
                    long j = ru0Var.a;
                    Object[] objArr = this.k;
                    c10.m(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof ou0) {
                        obj2 = ((ou0) obj2).f;
                    }
                    ru0Var.a = jS + 1;
                    Object obj3 = obj2;
                    lkVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lk lkVar : lkVarArrV) {
            if (lkVar != null) {
                lkVar.h(j41.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.k;
            c10.m(objArr);
            c4.i(objArr, jO, null);
        }
        this.l = j;
        this.m = j2;
        this.n = (int) (j3 - jMin);
        this.o = (int) (j4 - j3);
    }

    public final lk[] v(long j) {
        long j2;
        long j3;
        long j4;
        lk[] lkVarArr;
        lk[] lkVarArr2;
        i0[] i0VarArr;
        cs csVar = c4.n;
        lk[] lkVarArr3 = nm.a;
        if (j <= this.m) {
            long jO = o();
            long j5 = this.n + jO;
            int i = this.i;
            if (i == 0 && this.o > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (i0VarArr = this.d) != null) {
                for (i0 i0Var : i0VarArr) {
                    if (i0Var != null) {
                        long j6 = ((ru0) i0Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.m) {
                long jO2 = o() + this.n;
                int iMin = this.e > 0 ? Math.min(this.o, i - ((int) (jO2 - j5))) : this.o;
                long j7 = this.o + jO2;
                if (iMin > 0) {
                    j4 = 1;
                    Object[] objArr = this.k;
                    c10.m(objArr);
                    j2 = jO;
                    lk[] lkVarArr4 = new lk[iMin];
                    long j8 = jO2;
                    while (true) {
                        if (jO2 >= j7) {
                            lkVarArr2 = lkVarArr4;
                            j3 = j5;
                            break;
                        }
                        lkVarArr2 = lkVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != csVar) {
                            c10.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            ou0 ou0Var = (ou0) obj;
                            int i3 = i2 + 1;
                            j3 = j5;
                            lkVarArr2[i2] = ou0Var.g;
                            c4.i(objArr, jO2, csVar);
                            c4.i(objArr, j8, ou0Var.f);
                            j8++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j3 = j5;
                        }
                        jO2++;
                        lkVarArr4 = lkVarArr2;
                        j5 = j3;
                    }
                    jO2 = j8;
                    lkVarArr = lkVarArr2;
                } else {
                    j2 = jO;
                    j3 = j5;
                    j4 = 1;
                    lkVarArr = lkVarArr3;
                }
                int i4 = (int) (jO2 - j2);
                long j9 = this.e == 0 ? jO2 : j3;
                long jMax = Math.max(this.l, jO2 - Math.min(this.h, i4));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.k;
                    c10.m(objArr2);
                    if (c10.i(objArr2[((int) jMax) & (objArr2.length - 1)], csVar)) {
                        jO2 += j4;
                        jMax += j4;
                    }
                }
                u(jMax, j9, jO2, j7);
                j();
                return lkVarArr.length == 0 ? lkVarArr : n(lkVarArr);
            }
        }
        return lkVarArr3;
    }
}
