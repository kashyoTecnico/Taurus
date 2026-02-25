package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w20 implements wq {
    public final c8 a;

    public w20(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // defpackage.wq, defpackage.e8
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final j51 a(q31 q31Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        c8 c8Var = this.a;
        da0 da0Var = (da0) c8Var.c;
        ca0 ca0Var = new ca0(da0Var.e + 2);
        da0 da0Var2 = new da0(da0Var.e);
        int[] iArr3 = da0Var.b;
        Object[] objArr3 = da0Var.c;
        long[] jArr = da0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            v20 v20Var = (v20) objArr3[i6];
                            ca0Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            da0Var2.g(i7, new i51((k8) q31Var.a.g(v20Var.a), v20Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!da0Var.a(0)) {
            int i8 = ca0Var.b;
            if (i8 < 0) {
                qo0.s("Index must be between 0 and size");
                throw null;
            }
            ca0Var.b(i8 + 1);
            int[] iArr4 = ca0Var.a;
            int i9 = ca0Var.b;
            if (i9 != 0) {
                y9.p0(iArr4, iArr4, 1, 0, i9);
            }
            iArr4[0] = 0;
            ca0Var.b++;
        }
        if (!da0Var.a(c8Var.b)) {
            ca0Var.a(c8Var.b);
        }
        int i10 = ca0Var.b;
        if (i10 != 0) {
            int[] iArr5 = ca0Var.a;
            c10.p(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i10);
        }
        return new j51(ca0Var, da0Var2, c8Var.b, zq.b);
    }
}
