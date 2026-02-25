package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lw0 implements Cloneable {
    public /* synthetic */ int[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public lw0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.d = new int[i4];
        this.e = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lw0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        c10.n(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        lw0 lw0Var = (lw0) objClone;
        lw0Var.d = (int[]) this.d.clone();
        lw0Var.e = (Object[]) this.e.clone();
        return lw0Var;
    }

    public final Object b(int i) {
        Object obj;
        int iJ = nm.j(this.d, this.f, i);
        if (iJ < 0 || (obj = this.e[iJ]) == m20.m) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iJ = nm.j(this.d, this.f, i);
        if (iJ >= 0) {
            this.e[iJ] = obj;
            return;
        }
        int i2 = ~iJ;
        int i3 = this.f;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == m20.m) {
                this.d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.d, i7);
            c10.o(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, i7);
            c10.o(objArrCopyOf, "copyOf(...)");
            this.e = objArrCopyOf;
        }
        int i8 = this.f;
        if (i8 - i2 != 0) {
            int[] iArr = this.d;
            int i9 = i2 + 1;
            y9.p0(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.e;
            y9.r0(objArr2, objArr2, i9, i2, this.f);
        }
        this.d[i2] = i;
        this.e[i2] = obj;
        this.f++;
    }

    public final Object d(int i) {
        Object[] objArr = this.e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.d[i3]);
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }
}
