package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t9 implements Set {
    public final /* synthetic */ w9 d;

    public t9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        w9 w9Var = this.d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (w9Var.f == set.size()) {
                return w9Var.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        w9 w9Var = this.d;
        int iHashCode = 0;
        for (int i = w9Var.f - 1; i >= 0; i--) {
            Object objE = w9Var.e(i);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s9(this.d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        w9 w9Var = this.d;
        int iC = w9Var.c(obj);
        if (iC < 0) {
            return false;
        }
        w9Var.f(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        w9 w9Var = this.d;
        int i = w9Var.f;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(w9Var.e(i2))) {
                w9Var.f(i2);
            }
        }
        return i != w9Var.f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        w9 w9Var = this.d;
        int i = w9Var.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w9Var.e(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        w9 w9Var = this.d;
        int i = w9Var.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w9Var.e(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
