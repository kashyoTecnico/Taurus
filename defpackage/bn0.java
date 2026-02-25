package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bn0 implements ListIterator, c20 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final /* synthetic */ Object f;

    public bn0(cn0 cn0Var, int i) {
        this.f = cn0Var;
        List list = cn0Var.d;
        if (i >= 0 && i <= cn0Var.a()) {
            this.e = list.listIterator(cn0Var.a() - i);
            return;
        }
        StringBuilder sbI = b8.i("Position index ", i, " must be in range [");
        sbI.append(new p00(0, cn0Var.a(), 1));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).hasPrevious();
            default:
                return ((bm0) this.e).d < ((tx0) this.f).g - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).hasNext();
            default:
                return ((bm0) this.e).d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).previous();
            default:
                bm0 bm0Var = (bm0) this.e;
                int i = bm0Var.d + 1;
                tx0 tx0Var = (tx0) this.f;
                b10.p(i, tx0Var.g);
                bm0Var.d = i;
                return tx0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case 0:
                cn0 cn0Var = (cn0) this.f;
                return ve.L(cn0Var) - ((ListIterator) this.e).previousIndex();
            default:
                return ((bm0) this.e).d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                return ((ListIterator) this.e).next();
            default:
                bm0 bm0Var = (bm0) this.e;
                int i = bm0Var.d;
                tx0 tx0Var = (tx0) this.f;
                b10.p(i, tx0Var.g);
                bm0Var.d = i - 1;
                return tx0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.d) {
            case 0:
                cn0 cn0Var = (cn0) this.f;
                return ve.L(cn0Var) - ((ListIterator) this.e).nextIndex();
            default:
                return ((bm0) this.e).d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public bn0(bm0 bm0Var, tx0 tx0Var) {
        this.e = bm0Var;
        this.f = tx0Var;
    }
}
