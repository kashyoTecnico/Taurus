package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class v60 extends oi0 implements n80, o90 {
    public s60 i;
    public iw j;
    public qi0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final w60 o = new w60(0, this);
    public po0 p;
    public ta0 q;

    public static void A0(nc0 nc0Var) {
        u30 u30Var;
        nc0 nc0Var2 = nc0Var.s;
        t30 t30Var = nc0Var.r;
        if (!c10.i(nc0Var2 != null ? nc0Var2.r : null, t30Var)) {
            t30Var.H.p.z.f();
            return;
        }
        l2 l2VarQ = t30Var.H.p.q();
        if (l2VarQ == null || (u30Var = ((k80) l2VarQ).z) == null) {
            return;
        }
        u30Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B0(ua0 ua0Var) {
        t30 t30Var;
        Object[] objArr = ua0Var.b;
        long[] jArr = ua0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (t30Var = (t30) ((p61) objArr[(i << 3) + i3]).get()) != null) {
                        if (s()) {
                            t30Var.R(false);
                        } else {
                            t30Var.T(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void C0();

    @Override // defpackage.n80
    public final m80 M(int i, int i2, Map map, iw iwVar, iw iwVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            pz.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u60(i, i2, map, iwVar, iwVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(defpackage.t30 r32, defpackage.ly r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v60.k0(t30, ly):void");
    }

    @Override // defpackage.o90
    public final void n(boolean z) {
        v60 v60VarX0 = x0();
        t30 t30VarV0 = v60VarX0 != null ? v60VarX0.v0() : null;
        if (c10.i(t30VarV0, v0())) {
            this.l = z;
            return;
        }
        if ((t30VarV0 != null ? t30VarV0.H.d : null) != p30.f) {
            if ((t30VarV0 != null ? t30VarV0.H.d : null) != p30.g) {
                return;
            }
        }
        this.l = z;
    }

    public abstract int o0(iy iyVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(qi0 qi0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        t30 t30Var;
        int i;
        char c2;
        long j6;
        v60 v60VarX0;
        gg0 snapshotObserver;
        ta0 ta0Var = this.q;
        po0 po0Var = this.p;
        if (po0Var == null) {
            po0Var = new po0();
            this.p = po0Var;
        }
        po0 po0Var2 = po0Var;
        eg0 eg0Var = v0().p;
        if (eg0Var != null && (snapshotObserver = ((p3) eg0Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(qi0Var, s40.h, new t60(this, j, j2, qi0Var));
        }
        boolean zS = s();
        ua0 ua0Var = po0Var2.e;
        ua0 ua0Var2 = po0Var2.f;
        int i2 = po0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = po0Var2.d[i3];
            if (b == 3) {
                ly lyVar = po0Var2.b[i3];
                c10.m(lyVar);
                ua0Var2.j(lyVar);
            } else if (b != 0 && ta0Var != null) {
                ly lyVar2 = po0Var2.b[i3];
                c10.m(lyVar2);
                ua0 ua0Var3 = (ua0) ta0Var.j(lyVar2);
                if (ua0Var3 != null) {
                    ua0Var.i(ua0Var3);
                }
            }
        }
        int i4 = po0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = po0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                ly[] lyVarArr = po0Var2.b;
                lyVarArr[i6 - i5] = lyVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = po0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            po0Var2.b[i8] = null;
        }
        po0Var2.a -= i5;
        v60 v60VarX02 = x0();
        Object[] objArr = ua0Var2.b;
        long[] jArr = ua0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            ly lyVar3 = (ly) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            v60 v60Var = v60VarX02 == null ? this : v60VarX02;
                            i = i9;
                            v60 v60Var2 = v60Var;
                            while (true) {
                                po0 po0Var3 = v60Var2.p;
                                if ((po0Var3 != null && y9.y0(po0Var3.b, lyVar3) >= 0) || (v60VarX0 = v60Var2.x0()) == null) {
                                    break;
                                } else {
                                    v60Var2 = v60VarX0;
                                }
                            }
                            ta0 ta0Var2 = v60Var2.q;
                            ua0 ua0Var4 = ta0Var2 != null ? (ua0) ta0Var2.j(lyVar3) : null;
                            if (ua0Var4 != null) {
                                v60Var.B0(ua0Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ua0Var2.b();
        Object[] objArr2 = ua0Var.b;
        long[] jArr2 = ua0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (t30Var = (t30) ((p61) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zS) {
                                t30Var.R(false);
                            } else {
                                t30Var.T(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ua0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(defpackage.m80 r15) {
        /*
            r14 = this;
            ta0 r0 = r14.q
            boolean r1 = r14.n
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            iw r1 = r15.d()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            ua0 r10 = (defpackage.ua0) r10
            r14.B0(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.a()
            return
        L59:
            iw r0 = r14.j
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            s60 r1 = r14.z0()
            boolean r1 = r1.d
            if (r1 == 0) goto L9a
            d30 r0 = r14.t0()
            long r4 = r0.d(r4)
            long r4 = defpackage.c10.U(r4)
            long r0 = r0.Q()
            s60 r6 = r14.z0()
            long r6 = r6.e
            boolean r6 = defpackage.m00.a(r4, r6)
            if (r6 == 0) goto L95
            s60 r6 = r14.z0()
            long r6 = r6.f
            boolean r6 = defpackage.t00.a(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            qi0 r0 = r14.k
            if (r0 == 0) goto Lac
            r0.d = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            qi0 r0 = new qi0
            r0.<init>(r15, r14)
            r14.k = r0
            goto La9
        Lb4:
            r1.p0(r2, r3, r5)
            iw r14 = r15.d()
            r1.j = r14
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v60.q0(m80):void");
    }

    public final int r0(iy iyVar) {
        int iO0;
        if (u0() && (iO0 = o0(iyVar)) != Integer.MIN_VALUE) {
            return iO0 + ((int) (this.h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.x00
    public boolean s() {
        return false;
    }

    public abstract v60 s0();

    public abstract d30 t0();

    public abstract boolean u0();

    public abstract t30 v0();

    public abstract m80 w0();

    public abstract v60 x0();

    public abstract long y0();

    public final s60 z0() {
        s60 s60Var = this.i;
        if (s60Var != null) {
            return s60Var;
        }
        s60 s60Var2 = new s60(this);
        this.i = s60Var2;
        return s60Var2;
    }
}
