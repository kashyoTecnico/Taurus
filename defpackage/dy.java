package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dy {
    public final d30 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ma0 f = new ma0();
    public final sc0 g = new sc0();
    public final ia0 h = new ia0(10);

    public dy(d30 d30Var) {
        this.a = d30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    public final void a(long j, List list, boolean z) {
        long j2;
        long j3;
        long[] jArr;
        int i;
        char c;
        long j4;
        gc0 gc0Var;
        gc0 gc0Var2;
        ia0 ia0Var = this.h;
        ia0Var.e = 0;
        long[] jArr2 = ia0Var.a;
        char c2 = 7;
        if (jArr2 != eq0.a) {
            y9.w0(jArr2, -9187201950435737472L);
            long[] jArr3 = ia0Var.a;
            int i2 = ia0Var.d;
            int i3 = i2 >> 3;
            j2 = -9187201950435737472L;
            long j5 = 255 << ((i2 & 7) << 3);
            j3 = 255;
            jArr3[i3] = ((~j5) & jArr3[i3]) | j5;
        } else {
            j2 = -9187201950435737472L;
            j3 = 255;
        }
        y9.v0(ia0Var.c, 0, ia0Var.d);
        ia0Var.f = eq0.a(ia0Var.d) - ia0Var.e;
        int size = list.size();
        sc0 sc0Var = this.g;
        int i4 = 0;
        boolean z2 = true;
        sc0 sc0Var2 = sc0Var;
        while (i4 < size) {
            d90 d90Var = (d90) list.get(i4);
            if (d90Var.q) {
                d90Var.p = new g3(9, this, d90Var);
                if (z2) {
                    eb0 eb0Var = sc0Var2.a;
                    ?? r14 = eb0Var.d;
                    int i5 = eb0Var.f;
                    c = c2;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            j4 = j2;
                            gc0Var2 = 0;
                            break;
                        }
                        gc0Var2 = r14[i6];
                        j4 = j2;
                        if (c10.i(((gc0) gc0Var2).c, d90Var)) {
                            break;
                        }
                        i6++;
                        j2 = j4;
                    }
                    gc0Var = gc0Var2;
                    if (gc0Var != null) {
                        gc0Var.i = true;
                        gc0Var.d.a(j);
                        Object objD = ia0Var.d(j);
                        if (objD == null) {
                            objD = new ma0();
                            int iB = ia0Var.b(j);
                            ia0Var.b[iB] = j;
                            ia0Var.c[iB] = objD;
                        }
                        ((ma0) objD).a(gc0Var);
                        sc0Var2 = gc0Var;
                    } else {
                        z2 = false;
                    }
                } else {
                    c = c2;
                    j4 = j2;
                }
                gc0Var = new gc0(d90Var);
                gc0Var.d.a(j);
                Object objD2 = ia0Var.d(j);
                if (objD2 == null) {
                    objD2 = new ma0();
                    int iB2 = ia0Var.b(j);
                    ia0Var.b[iB2] = j;
                    ia0Var.c[iB2] = objD2;
                }
                ((ma0) objD2).a(gc0Var);
                sc0Var2.a.b(gc0Var);
                sc0Var2 = gc0Var;
            } else {
                c = c2;
                j4 = j2;
            }
            i4++;
            c2 = c;
            j2 = j4;
        }
        char c3 = c2;
        long j6 = j2;
        if (!z) {
            return;
        }
        long[] jArr4 = ia0Var.b;
        Object[] objArr = ia0Var.c;
        long[] jArr5 = ia0Var.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr5[i7];
            if ((((~j7) << c3) & j7 & j6) != j6) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j8 = jArr4[i11];
                        ma0 ma0Var = (ma0) objArr[i11];
                        eb0 eb0Var2 = sc0Var.a;
                        Object[] objArr2 = eb0Var2.d;
                        int i12 = eb0Var2.f;
                        i = i8;
                        int i13 = 0;
                        while (i13 < i12) {
                            ((gc0) objArr2[i13]).f(j8, ma0Var);
                            i13++;
                            jArr4 = jArr4;
                        }
                    } else {
                        i = i8;
                    }
                    j7 >>= i;
                    i10++;
                    i8 = i;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i9 != i8) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            jArr4 = jArr;
        }
    }

    public final boolean b(xz xzVar, boolean z) {
        r60 r60Var = (r60) xzVar.e;
        d30 d30Var = this.a;
        sc0 sc0Var = this.g;
        boolean zA = sc0Var.a(r60Var, d30Var, xzVar, z);
        eb0 eb0Var = sc0Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((gc0) objArr[i2]).e(xzVar, z) || z3;
        }
        Object[] objArr2 = eb0Var.d;
        int i3 = eb0Var.f;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((gc0) objArr2[i4]).d(xzVar) || z4;
        }
        sc0Var.b(xzVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            ma0 ma0Var = this.f;
            int i5 = ma0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((d90) ma0Var.e(i6));
            }
            ma0Var.c();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            sc0Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        sc0 sc0Var = this.g;
        eb0 eb0Var = sc0Var.a;
        Object[] objArr = eb0Var.d;
        int i = eb0Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((gc0) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            sc0Var.a.g();
        }
    }

    public final void d(d90 d90Var) {
        if (this.b) {
            this.e = true;
            this.f.a(d90Var);
            return;
        }
        sc0 sc0Var = this.g;
        ma0 ma0Var = sc0Var.b;
        ma0Var.c();
        ma0Var.a(sc0Var);
        while (ma0Var.h()) {
            sc0 sc0Var2 = (sc0) ma0Var.j(ma0Var.b - 1);
            int i = 0;
            while (true) {
                eb0 eb0Var = sc0Var2.a;
                if (i < eb0Var.f) {
                    gc0 gc0Var = (gc0) eb0Var.d[i];
                    if (c10.i(gc0Var.c, d90Var)) {
                        sc0Var2.a.j(gc0Var);
                        gc0Var.c();
                    } else {
                        ma0Var.a(gc0Var);
                        i++;
                    }
                }
            }
        }
    }
}
