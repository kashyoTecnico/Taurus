package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ki0 extends s {
    public final Object[] f;
    public final k31 g;

    public ki0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.g = new k31(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k31 k31Var = this.g;
        if (k31Var.hasNext()) {
            this.d++;
            return k31Var.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.f[i - k31Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        k31 k31Var = this.g;
        int i2 = k31Var.e;
        if (i <= i2) {
            this.d = i - 1;
            return k31Var.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.f[i3 - i2];
    }
}
