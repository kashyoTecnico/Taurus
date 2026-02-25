package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class n00 implements Iterable, c20 {
    public final int d;
    public final int e;
    public final int f;

    public n00(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.d = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.e = i2;
        this.f = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n00)) {
            return false;
        }
        if (isEmpty() && ((n00) obj).isEmpty()) {
            return true;
        }
        n00 n00Var = (n00) obj;
        return this.d == n00Var.d && this.e == n00Var.e && this.f == n00Var.f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public boolean isEmpty() {
        int i = this.f;
        int i2 = this.e;
        int i3 = this.d;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o00(this.d, this.e, this.f);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            i3 = -i3;
        }
        sb.append(i3);
        return sb.toString();
    }
}
