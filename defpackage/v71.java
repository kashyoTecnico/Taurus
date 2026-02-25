package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v71 implements iv, j9, ll, lc0 {
    public static final u71 e = new u71();
    public final /* synthetic */ int d;

    public /* synthetic */ v71(int i) {
        this.d = i;
    }

    public static final float[] g() {
        float[] fArr = g9.s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        g9.s = fArr2;
        return fArr2;
    }

    public static final float h(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.lc0
    public boolean b(d90 d90Var) {
        ?? eb0Var = 0;
        while (true) {
            int i = 0;
            if (d90Var == 0) {
                return false;
            }
            if (d90Var instanceof qj0) {
                if (((qj0) d90Var).i0()) {
                    return true;
                }
            } else if ((d90Var.f & 16) != 0 && (d90Var instanceof mn)) {
                d90 d90Var2 = d90Var.s;
                eb0Var = eb0Var;
                d90Var = d90Var;
                while (d90Var2 != null) {
                    if ((d90Var2.f & 16) != 0) {
                        i++;
                        eb0Var = eb0Var;
                        if (i == 1) {
                            d90Var = d90Var2;
                        } else {
                            if (eb0Var == 0) {
                                eb0Var = new eb0(new d90[16]);
                            }
                            if (d90Var != 0) {
                                eb0Var.b(d90Var);
                                d90Var = 0;
                            }
                            eb0Var.b(d90Var2);
                        }
                    }
                    d90Var2 = d90Var2.i;
                    eb0Var = eb0Var;
                    d90Var = d90Var;
                }
                if (i == 1) {
                }
            }
            d90Var = d80.i(eb0Var);
        }
    }

    @Override // defpackage.lc0
    public int c() {
        return 16;
    }

    @Override // defpackage.j9
    public void d(xn xnVar, int i, int[] iArr, e30 e30Var, int[] iArr2) {
        switch (this.d) {
            case 5:
                o9.b(iArr, iArr2, false);
                break;
            case 6:
                o9.c(i, iArr, iArr2, false);
                break;
            case 7:
                if (e30Var != e30.d) {
                    o9.b(iArr, iArr2, true);
                    break;
                } else {
                    o9.c(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (e30Var != e30.d) {
                    o9.c(i, iArr, iArr2, true);
                    break;
                } else {
                    o9.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // defpackage.lc0
    public void e(t30 t30Var, long j, gy gyVar, int i, boolean z) {
        t30Var.y(j, gyVar, i, z);
    }

    @Override // defpackage.lc0
    public boolean f(t30 t30Var) {
        return true;
    }

    public long i(long j, long j2) {
        float f = c10.f(j, j2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        int i = cq0.a;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a6, code lost:
    
        if (defpackage.j20.a(defpackage.m20.e(r9.getKeyCode()), defpackage.a80.g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027d, code lost:
    
        if (defpackage.j20.a(r8, defpackage.a80.q) != false) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v71.j(android.view.KeyEvent):int");
    }

    public String toString() {
        switch (this.d) {
            case 5:
                return "AbsoluteArrangement#Left";
            case 6:
                return "AbsoluteArrangement#Right";
            case 7:
                return "Arrangement#End";
            case 8:
                return "Arrangement#Start";
            case 9:
            case 10:
            case 11:
            default:
                return super.toString();
            case 12:
                return "Empty";
            case 13:
                return "CompositionErrorContext";
        }
    }

    public v71() {
        this.d = 9;
        new d70(16);
        long[] jArr = eq0.a;
        new ta0();
    }
}
