package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class o implements Iterator, c20 {
    public final /* synthetic */ int d = 0;
    public int e;
    public final Object f;

    public o(Object[] objArr) {
        c10.p(objArr, "array");
        this.f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.e < ((r) this.f).a()) {
                }
                break;
            default:
                if (this.e < ((Object[]) this.f).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                r rVar = (r) this.f;
                int i = this.e;
                this.e = i + 1;
                return rVar.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.f;
                    int i2 = this.e;
                    this.e = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.e--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(r rVar) {
        this.f = rVar;
    }
}
