package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class dc extends s {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public dc(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.g;
                int i = this.d;
                this.d = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.d++;
                return this.g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.g;
                int i = this.d - 1;
                this.d = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.d--;
                return this.g;
        }
    }

    public dc(int i, Object obj) {
        super(i, 1);
        this.g = obj;
    }
}
