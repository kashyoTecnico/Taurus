package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class ya0 extends gv0 {
    public static final int[] n = new int[0];
    public final iw e;
    public final iw f;
    public int g;
    public ua0 h;
    public ArrayList i;
    public lv0 j;
    public int[] k;
    public int l;
    public boolean m;

    public ya0(long j, lv0 lv0Var, iw iwVar, iw iwVar2) {
        super(j, lv0Var);
        this.e = iwVar;
        this.f = iwVar2;
        this.j = lv0.h;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ov0.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(ua0 ua0Var) {
        this.h = ua0Var;
    }

    public ya0 C(iw iwVar, iw iwVar2) {
        long j;
        yb0 yb0Var;
        if (this.c) {
            zj0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zj0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ov0.c;
        synchronized (obj) {
            long j2 = ov0.e;
            j = 1;
            ov0.e = j2 + j;
            ov0.d = ov0.d.e(j2);
            lv0 lv0VarD = d();
            r(lv0VarD.e(j2));
            yb0Var = new yb0(j2, ov0.e(lv0VarD, g() + j, j2), ov0.l(iwVar, e(), true), ov0.b(iwVar2, i()), this);
        }
        if (this.m || this.c) {
            return yb0Var;
        }
        long jG = g();
        synchronized (obj) {
            long j3 = ov0.e;
            ov0.e = j3 + j;
            s(j3);
            ov0.d = ov0.d.e(g());
        }
        r(ov0.e(d(), jG + j, g()));
        return yb0Var;
    }

    @Override // defpackage.gv0
    public final void b() {
        ov0.d = ov0.d.b(g()).a(this.j);
    }

    @Override // defpackage.gv0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ov0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.gv0
    public boolean f() {
        return false;
    }

    @Override // defpackage.gv0
    public int h() {
        return this.g;
    }

    @Override // defpackage.gv0
    public iw i() {
        return this.f;
    }

    @Override // defpackage.gv0
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.gv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.zj0.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            ua0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.zj0.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            dx0 r13 = (defpackage.dx0) r13
            fx0 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            lv0 r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.ue.R(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            mv0 r6 = defpackage.ov0.a
            r14 = 0
            r13.a = r14
        L83:
            fx0 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya0.l():void");
    }

    @Override // defpackage.gv0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.gv0
    public void n(dx0 dx0Var) {
        ua0 ua0VarX = x();
        if (ua0VarX == null) {
            int i = fq0.a;
            ua0VarX = new ua0();
            B(ua0VarX);
        }
        ua0VarX.a(dx0Var);
    }

    @Override // defpackage.gv0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ov0.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.gv0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.gv0
    public gv0 u(iw iwVar) {
        long j;
        zb0 zb0Var;
        if (this.c) {
            zj0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zj0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = ov0.c;
        synchronized (obj) {
            long j2 = ov0.e;
            j = 1;
            ov0.e = j2 + j;
            ov0.d = ov0.d.e(j2);
            zb0Var = new zb0(j2, ov0.e(d(), jG + j, j2), ov0.l(iwVar, e(), true), this);
        }
        if (this.m || this.c) {
            return zb0Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j3 = ov0.e;
            ov0.e = j3 + j;
            s(j3);
            ov0.d = ov0.d.e(g());
        }
        r(ov0.e(d(), jG2 + j, g()));
        return zb0Var;
    }

    public final void v() {
        long j;
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (ov0.c) {
            long j2 = ov0.e;
            j = 1;
            ov0.e = j2 + j;
            s(j2);
            ov0.d = ov0.d.e(g());
        }
        r(ov0.e(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.mq0 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya0.w():mq0");
    }

    public ua0 x() {
        return this.h;
    }

    @Override // defpackage.gv0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public iw e() {
        return this.e;
    }

    public final mq0 z(long j, ua0 ua0Var, HashMap map, lv0 lv0Var) {
        ArrayList arrayList;
        ArrayList arrayListA0;
        ArrayList arrayList2;
        lv0 lv0Var2;
        Object[] objArr;
        long[] jArr;
        lv0 lv0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        fx0 fx0VarB;
        lv0 lv0VarD = d().e(g()).d(this.j);
        Object[] objArr3 = ua0Var.b;
        long[] jArr3 = ua0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListA0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            dx0 dx0Var = (dx0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            fx0 fx0VarA = dx0Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            fx0 fx0VarS = ov0.s(fx0VarA, j, lv0Var);
                            if (fx0VarS == null) {
                                lv0Var3 = lv0VarD;
                                arrayList3 = arrayListA0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListA0;
                                j2 = j3;
                                fx0 fx0VarS2 = ov0.s(fx0VarA, g(), lv0VarD);
                                if (fx0VarS2 == null) {
                                    lv0Var3 = lv0VarD;
                                } else {
                                    lv0Var3 = lv0VarD;
                                    if (fx0VarS2.a != 1 && !fx0VarS.equals(fx0VarS2)) {
                                        fx0 fx0VarS3 = ov0.s(fx0VarA, g(), d());
                                        if (fx0VarS3 == null) {
                                            ov0.r();
                                            throw null;
                                        }
                                        if (map == null || (fx0VarB = (fx0) map.get(fx0VarS)) == null) {
                                            fx0VarB = dx0Var.b(fx0VarS2, fx0VarS, fx0VarS3);
                                        }
                                        if (fx0VarB == null) {
                                            return new hv0();
                                        }
                                        if (!fx0VarB.equals(fx0VarS3)) {
                                            if (fx0VarB.equals(fx0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new ng0(dx0Var, fx0VarS.b(g())));
                                                arrayListA0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListA0.add(dx0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!fx0VarB.equals(fx0VarS2) ? new ng0(dx0Var, fx0VarB) : new ng0(dx0Var, fx0VarS2.b(g())));
                                            }
                                        }
                                        arrayListA0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListA0 = arrayList3;
                        } else {
                            lv0Var3 = lv0VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        lv0VarD = lv0Var3;
                    }
                    lv0Var2 = lv0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    lv0Var2 = lv0VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                lv0VarD = lv0Var2;
            }
        } else {
            arrayList = null;
            arrayListA0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ng0 ng0Var = (ng0) arrayList2.get(i5);
                dx0 dx0Var2 = (dx0) ng0Var.d;
                fx0 fx0Var = (fx0) ng0Var.e;
                fx0Var.a = j;
                synchronized (ov0.c) {
                    fx0Var.b = dx0Var2.a();
                    dx0Var2.c(fx0Var);
                }
            }
        }
        if (arrayListA0 != null) {
            int size2 = arrayListA0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ua0Var.k((dx0) arrayListA0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListA0 = ue.a0(arrayList6, arrayListA0);
            }
            this.i = arrayListA0;
        }
        return iv0.a;
    }
}
