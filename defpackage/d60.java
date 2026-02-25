package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d60 implements Collection, c20 {
    public static final d60 f = new d60(ks.d);
    public final List d;
    public final int e;

    public d60(List list) {
        this.d = list;
        this.e = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof c60)) {
            return false;
        }
        return this.d.contains((c60) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d60) {
            return c10.i(this.d, ((d60) obj).d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r31.a0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.d + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r31.b0(this, objArr);
    }
}
