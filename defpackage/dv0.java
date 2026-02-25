package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class dv0 {
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iE = e(arrayList, i, i2);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void d(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((m2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iW = c10.w(i5, i);
            if (iW < 0) {
                i3 = i4 + 1;
            } else {
                if (iW <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
