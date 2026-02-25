package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class me {
    public int a;
    public Object b;
    public Object c;

    public void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = (long[]) this.b;
        int i7 = this.a;
        int i8 = i7 + 3;
        this.a = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            c10.o(jArrCopyOf, "copyOf(...)");
            this.b = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.c, iMax);
            c10.o(jArrCopyOf2, "copyOf(...)");
            this.c = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public void b(int i, mw mwVar) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                mwVar.j(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}
