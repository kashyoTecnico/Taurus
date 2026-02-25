package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hn0 extends mf {
    public static final of r = new of(9);
    public final r61 d;
    public final float e;
    public final float f;
    public final w21 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ip k;
    public final gn0 l;
    public final dn0 m;
    public final ip n;
    public final gn0 o;
    public final dn0 p;
    public final boolean q;

    public hn0(String str, float[] fArr, r61 r61Var, final w21 w21Var, int i) {
        ip ipVar;
        ip ipVar2;
        double d = w21Var.a;
        boolean z = d == -3.0d;
        double d2 = w21Var.g;
        double d3 = w21Var.f;
        if (z) {
            final int i2 = 4;
            ipVar = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i3 = i2;
                    w21 w21Var2 = w21Var;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            ipVar = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i3;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            ipVar = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i4;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            ipVar = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i5;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            ipVar2 = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i6;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            ipVar2 = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i7;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            ipVar2 = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i8;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            ipVar2 = new ip() { // from class: fn0
                @Override // defpackage.ip
                public final double b(double d4) {
                    int i32 = i9;
                    w21 w21Var2 = w21Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pf.a;
                            return pf.a(w21Var2, d4);
                        case 1:
                            float[] fArr3 = pf.a;
                            return pf.c(w21Var2, d4);
                        case 2:
                            double d5 = w21Var2.b;
                            return d4 >= w21Var2.e ? Math.pow((d5 * d4) + w21Var2.c, w21Var2.a) : w21Var2.d * d4;
                        case 3:
                            double d6 = w21Var2.b;
                            double d7 = w21Var2.c;
                            double d8 = w21Var2.d;
                            return d4 >= w21Var2.e ? Math.pow((d6 * d4) + d7, w21Var2.a) + w21Var2.f : (d8 * d4) + w21Var2.g;
                        case 4:
                            float[] fArr4 = pf.a;
                            return pf.b(w21Var2, d4);
                        case 5:
                            float[] fArr5 = pf.a;
                            return pf.d(w21Var2, d4);
                        case 6:
                            double d9 = w21Var2.b;
                            double d10 = w21Var2.c;
                            double d11 = w21Var2.d;
                            return d4 >= w21Var2.e * d11 ? (Math.pow(d4, 1.0d / w21Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = w21Var2.b;
                            double d13 = w21Var2.c;
                            double d14 = w21Var2.d;
                            return d4 >= w21Var2.e * d14 ? (Math.pow(d4 - w21Var2.f, 1.0d / w21Var2.a) - d13) / d12 : (d4 - w21Var2.g) / d14;
                    }
                }
            };
        }
        this(str, fArr, r61Var, null, ipVar, ipVar2, 0.0f, 1.0f, w21Var, i);
    }

    @Override // defpackage.mf
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.mf
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.mf
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.mf
    public final long d(float f, float f2, float f3) {
        double d = f;
        dn0 dn0Var = this.p;
        float fB = (float) dn0Var.b(d);
        float fB2 = (float) dn0Var.b(f2);
        float fB3 = (float) dn0Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f5 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.mf
    public final float e(float f, float f2, float f3) {
        double d = f;
        dn0 dn0Var = this.p;
        float fB = (float) dn0Var.b(d);
        float fB2 = (float) dn0Var.b(f2);
        float fB3 = (float) dn0Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // defpackage.mf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hn0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        hn0 hn0Var = (hn0) obj;
        w21 w21Var = hn0Var.g;
        if (Float.compare(hn0Var.e, this.e) != 0 || Float.compare(hn0Var.f, this.f) != 0 || !c10.i(this.d, hn0Var.d) || !Arrays.equals(this.h, hn0Var.h)) {
            return false;
        }
        w21 w21Var2 = this.g;
        if (w21Var2 != null) {
            return c10.i(w21Var2, w21Var);
        }
        if (w21Var == null) {
            return true;
        }
        if (c10.i(this.k, hn0Var.k)) {
            return c10.i(this.n, hn0Var.n);
        }
        return false;
    }

    @Override // defpackage.mf
    public final long f(float f, float f2, float f3, float f4, mf mfVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        dn0 dn0Var = this.m;
        return r31.b((float) dn0Var.b(f5), (float) dn0Var.b(f6), (float) dn0Var.b(f7), f4, mfVar);
    }

    @Override // defpackage.mf
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        w21 w21Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (w21Var != null ? w21Var.hashCode() : 0);
        if (w21Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hn0(java.lang.String r33, float[] r34, defpackage.r61 r35, float[] r36, defpackage.ip r37, defpackage.ip r38, float r39, float r40, defpackage.w21 r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn0.<init>(java.lang.String, float[], r61, float[], ip, ip, float, float, w21, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hn0(String str, float[] fArr, r61 r61Var, final double d, float f, float f2, int i) {
        ip ipVar;
        ip ipVar2 = r;
        if (d == 1.0d) {
            ipVar = ipVar2;
        } else {
            final int i2 = 0;
            ipVar = new ip() { // from class: en0
                @Override // defpackage.ip
                public final double b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            ipVar2 = new ip() { // from class: en0
                @Override // defpackage.ip
                public final double b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, r61Var, null, ipVar, ipVar2, f, f2, new w21(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
