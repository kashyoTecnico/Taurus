package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ca0 {
    public int[] a;
    public int b;

    public ca0(int i) {
        this.a = i == 0 ? s00.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            c10.o(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        qo0.s("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            qo0.s("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            y9.p0(iArr, iArr, i, i + 1, i2);
        }
        this.b--;
    }

    public final void e(int i, int i2) {
        if (i < 0 || i >= this.b) {
            qo0.s("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ca0) {
            ca0 ca0Var = (ca0) obj;
            int i = ca0Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = ca0Var.a;
                p00 p00VarA0 = c10.a0(0, i2);
                int i3 = p00VarA0.d;
                int i4 = p00VarA0.e;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ca0() {
        this(16);
    }
}
