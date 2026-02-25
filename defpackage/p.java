package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p extends o implements ListIterator {
    public final /* synthetic */ r g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i) {
        super(rVar);
        this.g = rVar;
        int iA = rVar.a();
        if (i < 0 || i > iA) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", iA));
        }
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.e - 1;
        this.e = i;
        return this.g.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
