package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j51 implements f51 {
    public final ca0 a;
    public final da0 b;
    public final int c;
    public final yq d;
    public int[] e;
    public float[] f;
    public k8 g;
    public k8 h;
    public k8 i;
    public k8 j;
    public float[] k;
    public float[] l;
    public r1 m;

    public j51(ca0 ca0Var, da0 da0Var, int i, yq yqVar) {
        this.a = ca0Var;
        this.b = da0Var;
        this.c = i;
        this.d = yqVar;
    }

    public final int c(int i) {
        int i2;
        ca0 ca0Var = this.a;
        int i3 = ca0Var.b;
        int i4 = 0;
        if (i3 < 0) {
            ak0.a("fromIndex(0) > toIndex(" + i3 + ')');
        }
        if (i3 > ca0Var.b) {
            throw new IndexOutOfBoundsException("Index out of range: " + i3);
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int iC = ca0Var.c(i2);
                if (iC >= i) {
                    if (iC <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        yq yqVar;
        float f;
        ca0 ca0Var = this.a;
        if (i >= ca0Var.b - 1) {
            f = i2;
        } else {
            int iC = ca0Var.c(i);
            int iC2 = ca0Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                i51 i51Var = (i51) this.b.b(iC);
                if (i51Var == null || (yqVar = i51Var.b) == null) {
                    yqVar = this.d;
                }
                float f2 = i3;
                float fA = yqVar.a((i2 - iC) / f2);
                return z ? fA : ((f2 * fA) + iC) / 1000;
            }
            f = iC;
        }
        return f / 1000;
    }

    public final void e(k8 k8Var, k8 k8Var2, k8 k8Var3) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.m != null;
        k8 k8Var4 = this.g;
        da0 da0Var = this.b;
        ca0 ca0Var = this.a;
        if (k8Var4 == null) {
            this.g = k8Var.c();
            this.h = k8Var3.c();
            int i = ca0Var.b;
            float[] fArr3 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr3[i2] = ca0Var.c(i2) / 1000;
            }
            this.f = fArr3;
            int i3 = ca0Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != null) {
                k8 k8Var5 = this.i;
                if (k8Var5 == null) {
                    c10.Y("lastInitialValue");
                    throw null;
                }
                if (k8Var5.equals(k8Var)) {
                    k8 k8Var6 = this.j;
                    if (k8Var6 == null) {
                        c10.Y("lastTargetValue");
                        throw null;
                    }
                    if (k8Var6.equals(k8Var2)) {
                        return;
                    }
                }
            }
            this.i = k8Var;
            this.j = k8Var2;
            int iB = k8Var.b() + (k8Var.b() % 2);
            this.k = new float[iB];
            this.l = new float[iB];
            int i5 = ca0Var.b;
            float[][] fArr4 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = ca0Var.c(i6);
                if (iC != 0) {
                    if (iC != this.c) {
                        fArr = new float[iB];
                        Object objB = da0Var.b(iC);
                        c10.m(objB);
                        k8 k8Var7 = ((i51) objB).a;
                        for (int i7 = 0; i7 < iB; i7++) {
                            fArr[i7] = k8Var7.a(i7);
                        }
                    } else if (da0Var.a(iC)) {
                        fArr = new float[iB];
                        Object objB2 = da0Var.b(iC);
                        c10.m(objB2);
                        k8 k8Var8 = ((i51) objB2).a;
                        for (int i8 = 0; i8 < iB; i8++) {
                            fArr[i8] = k8Var8.a(i8);
                        }
                    } else {
                        fArr2 = new float[iB];
                        for (int i9 = 0; i9 < iB; i9++) {
                            fArr2[i9] = k8Var2.a(i9);
                        }
                    }
                    fArr2 = fArr;
                } else if (da0Var.a(iC)) {
                    fArr = new float[iB];
                    Object objB3 = da0Var.b(iC);
                    c10.m(objB3);
                    k8 k8Var9 = ((i51) objB3).a;
                    for (int i10 = 0; i10 < iB; i10++) {
                        fArr[i10] = k8Var9.a(i10);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB];
                    for (int i11 = 0; i11 < iB; i11++) {
                        fArr2[i11] = k8Var.a(i11);
                    }
                }
                fArr4[i6] = fArr2;
            }
            int[] iArr2 = this.e;
            if (iArr2 == null) {
                c10.Y("modes");
                throw null;
            }
            float[] fArr5 = this.f;
            if (fArr5 == null) {
                c10.Y("times");
                throw null;
            }
            this.m = new r1(iArr2, fArr5, fArr4);
        }
    }

    @Override // defpackage.f51
    public final int k() {
        return 0;
    }

    @Override // defpackage.e51
    public final k8 l(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) throws Throwable {
        int i = 0;
        long jV = c10.v((j / 1000000) - 0, 0L, this.c);
        if (jV < 0) {
            return k8Var3;
        }
        e(k8Var, k8Var2, k8Var3);
        if (this.m == null) {
            k8 k8VarO = o((jV - 1) * 1000000, k8Var, k8Var2, k8Var3);
            k8 k8VarO2 = o(jV * 1000000, k8Var, k8Var2, k8Var3);
            int iB = k8VarO.b();
            while (i < iB) {
                k8 k8Var4 = this.h;
                if (k8Var4 == null) {
                    c10.Y("velocityVector");
                    throw null;
                }
                k8Var4.e((k8VarO.a(i) - k8VarO2.a(i)) * 1000.0f, i);
                i++;
            }
            k8 k8Var5 = this.h;
            if (k8Var5 != null) {
                return k8Var5;
            }
            c10.Y("velocityVector");
            throw null;
        }
        int i2 = (int) jV;
        float fD = d(c(i2), i2, false);
        r1 r1Var = this.m;
        if (r1Var == null) {
            c10.Y("arcSpline");
            throw null;
        }
        float[] fArr = this.l;
        if (fArr == null) {
            c10.Y("slopeArray");
            throw null;
        }
        g9[][] g9VarArr = (g9[][]) r1Var.e;
        float f = g9VarArr[0][0].a;
        if (fD < f) {
            fD = f;
        } else if (fD > g9VarArr[g9VarArr.length - 1][0].b) {
            fD = g9VarArr[g9VarArr.length - 1][0].b;
        }
        int length = g9VarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < fArr.length) {
                g9 g9Var = g9VarArr[i3][i5];
                if (fD <= g9Var.b) {
                    if (g9Var.r) {
                        fArr[i4] = g9Var.n;
                        fArr[i4 + 1] = g9Var.o;
                    } else {
                        g9Var.c(fD);
                        fArr[i4] = g9VarArr[i3][i5].a();
                        fArr[i4 + 1] = g9VarArr[i3][i5].b();
                    }
                    z = true;
                }
                i4 += 2;
                i5++;
            }
            if (z) {
                break;
            }
        }
        float[] fArr2 = this.l;
        if (fArr2 == null) {
            c10.Y("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i < length2) {
            k8 k8Var6 = this.h;
            if (k8Var6 == null) {
                c10.Y("velocityVector");
                throw null;
            }
            float[] fArr3 = this.l;
            if (fArr3 == null) {
                c10.Y("slopeArray");
                throw null;
            }
            k8Var6.e(fArr3[i], i);
            i++;
        }
        k8 k8Var7 = this.h;
        if (k8Var7 != null) {
            return k8Var7;
        }
        c10.Y("velocityVector");
        throw null;
    }

    @Override // defpackage.f51
    public final int n() {
        return this.c;
    }

    @Override // defpackage.e51
    public final k8 o(long j, k8 k8Var, k8 k8Var2, k8 k8Var3) throws Throwable {
        int i;
        Throwable th;
        int length;
        int i2;
        boolean z;
        k8 k8Var4 = k8Var;
        k8 k8Var5 = k8Var2;
        int i3 = 0;
        int i4 = this.c;
        int iV = (int) c10.v((j / 1000000) - 0, 0L, i4);
        da0 da0Var = this.b;
        if (da0Var.a(iV)) {
            Object objB = da0Var.b(iV);
            c10.m(objB);
            return ((i51) objB).a;
        }
        if (iV >= i4) {
            return k8Var5;
        }
        if (iV <= 0) {
            return k8Var4;
        }
        e(k8Var4, k8Var5, k8Var3);
        boolean z2 = true;
        if (this.m == null) {
            int iC = c(iV);
            float fD = d(iC, iV, true);
            ca0 ca0Var = this.a;
            int iC2 = ca0Var.c(iC);
            if (da0Var.a(iC2)) {
                Object objB2 = da0Var.b(iC2);
                c10.m(objB2);
                k8Var4 = ((i51) objB2).a;
            }
            int iC3 = ca0Var.c(iC + 1);
            if (da0Var.a(iC3)) {
                Object objB3 = da0Var.b(iC3);
                c10.m(objB3);
                k8Var5 = ((i51) objB3).a;
            }
            k8 k8Var6 = this.g;
            if (k8Var6 == null) {
                c10.Y("valueVector");
                throw null;
            }
            int iB = k8Var6.b();
            for (int i5 = 0; i5 < iB; i5++) {
                k8 k8Var7 = this.g;
                if (k8Var7 == null) {
                    c10.Y("valueVector");
                    throw null;
                }
                float fA = k8Var4.a(i5);
                float fA2 = k8Var5.a(i5);
                q31 q31Var = y41.a;
                k8Var7.e((fA2 * fD) + ((1 - fD) * fA), i5);
            }
            k8 k8Var8 = this.g;
            if (k8Var8 != null) {
                return k8Var8;
            }
            c10.Y("valueVector");
            throw null;
        }
        float fD2 = d(c(iV), iV, false);
        r1 r1Var = this.m;
        if (r1Var == null) {
            c10.Y("arcSpline");
            throw null;
        }
        float[] fArr = this.k;
        if (fArr == null) {
            c10.Y("posArray");
            throw null;
        }
        g9[][] g9VarArr = (g9[][]) r1Var.e;
        float f = g9VarArr[0][0].a;
        if (fD2 >= f && fD2 <= g9VarArr[g9VarArr.length - 1][0].b) {
            int length2 = g9VarArr.length;
            int i6 = 0;
            boolean z3 = false;
            while (true) {
                if (i6 >= length2) {
                    i = i3;
                    th = null;
                    break;
                }
                int i7 = i3;
                int i8 = i7;
                while (i7 < fArr.length) {
                    g9 g9Var = g9VarArr[i6][i8];
                    if (fD2 <= g9Var.b) {
                        if (g9Var.r) {
                            float f2 = g9Var.a;
                            i2 = i3;
                            float f3 = g9Var.k;
                            float f4 = g9Var.c;
                            z = z2;
                            fArr[i7] = ((g9Var.e - f4) * (fD2 - f2) * f3) + f4;
                            float f5 = (fD2 - f2) * f3;
                            float f6 = g9Var.d;
                            fArr[i7 + 1] = ((g9Var.f - f6) * f5) + f6;
                        } else {
                            i2 = i3;
                            z = z2;
                            g9Var.c(fD2);
                            g9 g9Var2 = g9VarArr[i6][i8];
                            fArr[i7] = (g9Var2.l * g9Var2.h) + g9Var2.n;
                            fArr[i7 + 1] = (g9Var2.m * g9Var2.i) + g9Var2.o;
                        }
                        z3 = z;
                    } else {
                        i2 = i3;
                        z = z2;
                    }
                    i7 += 2;
                    i8++;
                    i3 = i2;
                    z2 = z;
                }
                i = i3;
                boolean z4 = z2;
                th = null;
                if (z3) {
                    break;
                }
                i6++;
                i3 = i;
                z2 = z4;
            }
        } else {
            i = 0;
            th = null;
            if (fD2 > g9VarArr[g9VarArr.length - 1][0].b) {
                length = g9VarArr.length - 1;
                f = g9VarArr[g9VarArr.length - 1][0].b;
            } else {
                length = 0;
            }
            float f7 = fD2 - f;
            int i9 = 0;
            int i10 = 0;
            while (i9 < fArr.length) {
                g9 g9Var3 = g9VarArr[length][i10];
                if (g9Var3.r) {
                    float f8 = g9Var3.a;
                    float f9 = g9Var3.k;
                    float f10 = g9Var3.c;
                    fArr[i9] = (g9Var3.n * f7) + ((g9Var3.e - f10) * (f - f8) * f9) + f10;
                    float f11 = (f - f8) * f9;
                    float f12 = g9Var3.d;
                    fArr[i9 + 1] = (g9Var3.o * f7) + ((g9Var3.f - f12) * f11) + f12;
                } else {
                    g9Var3.c(f);
                    g9 g9Var4 = g9VarArr[length][i10];
                    fArr[i9] = (g9Var4.a() * f7) + (g9Var4.l * g9Var4.h) + g9Var4.n;
                    g9 g9Var5 = g9VarArr[length][i10];
                    fArr[i9 + 1] = (g9Var5.b() * f7) + (g9Var5.m * g9Var5.i) + g9Var5.o;
                }
                i9 += 2;
                i10++;
            }
        }
        float[] fArr2 = this.k;
        if (fArr2 == null) {
            c10.Y("posArray");
            throw th;
        }
        int length3 = fArr2.length;
        for (int i11 = i; i11 < length3; i11++) {
            k8 k8Var9 = this.g;
            if (k8Var9 == null) {
                c10.Y("valueVector");
                throw th;
            }
            float[] fArr3 = this.k;
            if (fArr3 == null) {
                c10.Y("posArray");
                throw th;
            }
            k8Var9.e(fArr3[i11], i11);
        }
        k8 k8Var10 = this.g;
        if (k8Var10 != null) {
            return k8Var10;
        }
        c10.Y("valueVector");
        throw th;
    }
}
