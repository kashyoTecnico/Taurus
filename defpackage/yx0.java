package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yx0 implements Collection, c20 {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public yx0() {
        int i = hf0.a;
        this.e = new na0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                return ((na0) this.e).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.d) {
            case 0:
                ((na0) this.e).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                return ((na0) this.e).c(obj);
            default:
                return ((ta0) this.e).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((na0) this.e).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                c10.p(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((ta0) this.e).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.d) {
            case 0:
                return ((na0) this.e).g == 0;
            default:
                return ((ta0) this.e).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                na0 na0Var = (na0) this.e;
                na0Var.getClass();
                return new vw(new pa0(na0Var));
            default:
                return qo0.l(new ps(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                return ((na0) this.e).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                return ((na0) this.e).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                return ((na0) this.e).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.d) {
            case 0:
                return ((na0) this.e).g;
            default:
                return ((ta0) this.e).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.d) {
        }
        return r31.a0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.d) {
            case 0:
                break;
            default:
                c10.p(objArr, "array");
                break;
        }
        return r31.b0(this, objArr);
    }

    public yx0(ta0 ta0Var) {
        c10.p(ta0Var, "parent");
        this.e = ta0Var;
    }
}
