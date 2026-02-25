package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class y9 extends b10 {
    public static boolean n0(Object[] objArr, Object obj) {
        return y0(objArr, obj) >= 0;
    }

    public static void o0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        c10.p(cArr, "<this>");
        c10.p(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void p0(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        c10.p(iArr, "<this>");
        c10.p(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void q0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        c10.p(jArr, "<this>");
        c10.p(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void r0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        c10.p(objArr, "<this>");
        c10.p(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void s0(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        p0(iArr, iArr2, i, 0, i2);
    }

    public static /* synthetic */ void t0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        r0(objArr, objArr2, 0, i, i2);
    }

    public static Object[] u0(Object[] objArr, int i, int i2) {
        c10.p(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
            c10.o(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void v0(Object[] objArr, int i, int i2) {
        c10.p(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void w0(long[] jArr, long j) {
        int length = jArr.length;
        c10.p(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static int x0(long[] jArr) {
        c10.p(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int y0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void z0(Object[] objArr, Comparator comparator, int i, int i2) {
        c10.p(objArr, "<this>");
        c10.p(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }
}
