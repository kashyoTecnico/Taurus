package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qs implements Set, c20 {
    public final /* synthetic */ int d;
    public final ta0 e;

    public qs(ta0 ta0Var, int i) {
        this.d = i;
        switch (i) {
            case 1:
                c10.p(ta0Var, "parent");
                this.e = ta0Var;
                break;
            default:
                c10.p(ta0Var, "parent");
                this.e = ta0Var;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return c10.i(this.e.g(entry.getKey()), entry.getValue());
            default:
                return this.e.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!c10.i(this.e.g(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                c10.p(collection, "elements");
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!this.e.c(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.d) {
        }
        return this.e.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                return qo0.l(new ps(this, null, 0));
            default:
                return qo0.l(new ps(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.d) {
        }
        return this.e.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.d) {
        }
        return r31.a0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.d) {
            case 0:
                c10.p(objArr, "array");
                break;
            default:
                c10.p(objArr, "array");
                break;
        }
        return r31.b0(this, objArr);
    }
}
