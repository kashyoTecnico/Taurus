package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ta0 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public ta0(int i) {
        this.a = eq0.a;
        Object[] objArr = nm.d;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            h(eq0.d(i));
        } else {
            qo0.r("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != eq0.a) {
            y9.w0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        y9.v0(this.c, 0, this.d);
        y9.v0(this.b, 0, this.d);
        this.f = eq0.a(this.d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.c10.i(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.b(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.c10.i(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.c(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object[] r0 = r13.c
            long[] r13 = r13.a
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = defpackage.c10.i(r14, r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.d(java.lang.Object):boolean");
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.ta0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ta0 r1 = (defpackage.ta0) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L74
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L6d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L69
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L5e
            java.lang.Object r13 = r1.g(r14)
            if (r13 != 0) goto L5d
            boolean r13 = r1.c(r14)
            if (r13 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r14 = r1.g(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L69
            return r4
        L69:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L6d:
            if (r10 != r11) goto L74
        L6f:
            if (r7 == r6) goto L74
            int r7 = r7 + 1
            goto L23
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.equals(java.lang.Object):boolean");
    }

    public final int f(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (c10.i(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iE = e(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iX0 = y9.x0(jArr4);
                            int i20 = iX0 - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iX0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i24);
                                    int i25 = i24 & i16;
                                    if (((iE2 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = iE2 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (iE2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iE2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i26;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = eq0.a(this.d) - this.e;
                        }
                        iE = e(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB = eq0.b(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i29 = this.d;
                    h(iB);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i30 = this.d;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = iE3 >> 3;
                            int i34 = (iE3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((iE3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i4);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr7 = this.a;
                int i36 = iE >> 3;
                long j15 = jArr7[i36];
                int i37 = (iE & 7) << 3;
                this.f = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.d;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((iE - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~iE;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.c10.i(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            return r13
        L72:
            r13 = 0
            return r13
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.g(java.lang.Object):java.lang.Object");
    }

    public final void h(int i) {
        long[] jArr;
        Object[] objArr = nm.d;
        int iMax = i > 0 ? Math.max(7, eq0.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = eq0.a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            y9.w0(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.a = jArr;
        this.f = eq0.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean i() {
        return this.e == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.c10.i(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object r13 = r13.k(r10)
            return r13
        L72:
            r13 = 0
            return r13
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.j(java.lang.Object):java.lang.Object");
    }

    public final Object k(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.b[iF] = obj;
        this.c[iF] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.i()
            if (r1 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L77
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L72
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L52
            r15 = r16
        L52:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5e
            r14 = r16
        L5e:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L6c
            java.lang.String r14 = ", "
            r1.append(r14)
        L6c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L70:
            if (r11 != r12) goto L77
        L72:
            if (r7 == r5) goto L77
            int r7 = r7 + 1
            goto L20
        L77:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "toString(...)"
            defpackage.c10.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta0.toString():java.lang.String");
    }

    public /* synthetic */ ta0() {
        this(6);
    }
}
