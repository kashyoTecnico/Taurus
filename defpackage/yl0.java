package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yl0 {
    public final me a;
    public final p21 b;
    public final ma0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public p1 g;
    public long h;
    public final b i;
    public final sa0 j;

    public yl0() {
        me meVar = new me();
        meVar.b = new long[192];
        meVar.c = new long[192];
        this.a = meVar;
        this.b = new p21();
        this.c = new ma0();
        this.h = -1L;
        this.i = new b(20, this);
        this.j = new sa0();
    }

    public static long a(nc0 nc0Var, long j) {
        float[] fArrB;
        int iH;
        dg0 dg0Var = nc0Var.L;
        if (dg0Var == null || (iH = nm.h((fArrB = ((gx) dg0Var).b()))) == 3) {
            return j;
        }
        if ((iH & 2) == 0) {
            return 9223372034707292159L;
        }
        return c10.U(e80.b((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), fArrB));
    }

    public static long h(t30 t30Var) {
        jc0 jc0Var = t30Var.G;
        nc0 nc0Var = jc0Var.d;
        long jC = 0;
        for (nc0 nc0Var2 = jc0Var.c; nc0Var2 != null && nc0Var2 != nc0Var; nc0Var2 = nc0Var2.t) {
            long jA = a(nc0Var2, jC);
            if (m00.a(jA, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jC = m00.c(jA, nc0Var2.C);
        }
        return jC;
    }

    public static void i(t30 t30Var) {
        long jH;
        nc0 nc0Var = t30Var.G.d;
        long jA = a(nc0Var, 0L);
        long jC = 9223372034707292159L;
        if (!nm.i(jA)) {
            t30Var.f = 9223372034707292159L;
            return;
        }
        long jC2 = m00.c(jA, nc0Var.C);
        t30 t30VarT = t30Var.t();
        if (t30VarT != null) {
            if (!nm.i(t30VarT.f)) {
                i(t30VarT);
            }
            long j = t30VarT.f;
            if (nm.i(j)) {
                if (t30VarT.i) {
                    jH = h(t30VarT);
                    t30VarT.h = jH;
                    t30VarT.i = false;
                } else {
                    jH = t30VarT.h;
                }
                if (nm.i(jH)) {
                    jC = m00.c(m00.c(j, jH), jC2);
                }
            }
        } else {
            jC = jC2;
        }
        t30Var.f = jC;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.t30 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.c(t30, boolean):void");
    }

    public final void d(t30 t30Var) {
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            t30 t30Var2 = (t30) objArr[i2];
            c(t30Var2, false);
            d(t30Var2);
        }
    }

    public final void e(t30 t30Var) {
        this.d = true;
        int i = t30Var.e & 67108863;
        me meVar = this.a;
        long[] jArr = (long[]) meVar.b;
        int i2 = meVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        p1 p1Var = this.g;
        boolean z = p1Var != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (p1Var != null) {
                Handler handler = q1.a;
                q1.a.removeCallbacks(p1Var);
            }
            Handler handler2 = q1.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
            this.h = jMax;
            p1 p1Var2 = new p1(this.i, 0);
            q1.a.postDelayed(p1Var2, jMax - jCurrentTimeMillis);
            this.g = p1Var2;
        }
    }

    public final void f(t30 t30Var) {
        long jH = h(t30Var);
        if (!nm.i(jH)) {
            d(t30Var);
            return;
        }
        t30Var.h = jH;
        t30Var.i = false;
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            g((t30) objArr[i2], false);
        }
        e(t30Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.t30 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.g(t30, boolean):void");
    }

    public final void j(t30 t30Var) {
        int i = t30Var.e & 67108863;
        me meVar = this.a;
        long[] jArr = (long[]) meVar.b;
        int i2 = meVar.a;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
