package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bb0 implements List, d20 {
    public final eb0 d;

    public bb0(eb0 eb0Var) {
        this.d = eb0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        eb0 eb0Var = this.d;
        return eb0Var.e(eb0Var.f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        eb0 eb0Var = this.d;
        eb0Var.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eb0Var.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fb0.a(i, this);
        return this.d.d[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.f == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new db0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        eb0 eb0Var = this.d;
        Object[] objArr = eb0Var.d;
        for (int i = eb0Var.f - 1; i >= 0; i--) {
            if (c10.i(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new db0(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        eb0 eb0Var = this.d;
        eb0Var.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = eb0Var.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eb0Var.j(it.next());
        }
        return i != eb0Var.f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        eb0 eb0Var = this.d;
        int i = eb0Var.f;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(eb0Var.d[i2])) {
                eb0Var.k(i2);
            }
        }
        return i != eb0Var.f;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fb0.a(i, this);
        Object[] objArr = this.d.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        fb0.b(this, i, i2);
        return new cb0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r31.a0(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new db0(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        fb0.a(i, this);
        return this.d.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r31.b0(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.e(i, collection);
    }
}
