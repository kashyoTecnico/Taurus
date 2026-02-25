package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w50 extends u implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int f;
    public final w50 g;
    public final x50 h;

    public w50(Object[] objArr, int i, int i2, w50 w50Var, x50 x50Var) {
        c10.p(objArr, "backing");
        c10.p(x50Var, "root");
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.g = w50Var;
        this.h = x50Var;
        ((AbstractList) this).modCount = ((AbstractList) x50Var).modCount;
    }

    @Override // defpackage.u
    public final int a() {
        f();
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.e + this.f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c10.p(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.e + this.f, collection, size);
        return size > 0;
    }

    @Override // defpackage.u
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        return h(this.e + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.e, this.f);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        x50 x50Var = this.h;
        w50 w50Var = this.g;
        if (w50Var != null) {
            w50Var.d(i, collection, i2);
        } else {
            x50 x50Var2 = x50.g;
            x50Var.d(i, collection, i2);
        }
        this.d = x50Var.d;
        this.f += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        x50 x50Var = this.h;
        w50 w50Var = this.g;
        if (w50Var != null) {
            w50Var.e(i, obj);
        } else {
            x50 x50Var2 = x50.g;
            x50Var.e(i, obj);
        }
        this.d = x50Var.d;
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (c10.i(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.h).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.h.f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        return this.d[this.e + i];
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        w50 w50Var = this.g;
        if (w50Var != null) {
            objH = w50Var.h(i);
        } else {
            x50 x50Var = x50.g;
            objH = this.h.h(i);
        }
        this.f--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.e + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        w50 w50Var = this.g;
        if (w50Var != null) {
            w50Var.i(i, i2);
        } else {
            x50 x50Var = x50.g;
            this.h.i(i, i2);
        }
        this.f -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f; i++) {
            if (c10.i(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int iJ;
        w50 w50Var = this.g;
        if (w50Var != null) {
            iJ = w50Var.j(i, i2, collection, z);
        } else {
            x50 x50Var = x50.g;
            iJ = this.h.j(i, i2, collection, z);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f - 1; i >= 0; i--) {
            if (c10.i(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        c10.p(collection, "elements");
        g();
        f();
        return j(this.e, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        c10.p(collection, "elements");
        g();
        f();
        return j(this.e, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        Object[] objArr = this.d;
        int i3 = this.e;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        d80.m(i, i2, this.f);
        return new w50(this.d, this.e + i, i2 - i, this, this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        c10.p(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f;
        int i2 = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.d, i2, i + i2, objArr.getClass());
            c10.o(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        y9.r0(this.d, objArr, 0, i2, i + i2);
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return c4.j(this.d, this.e, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        return new ey(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            e(this.e + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c10.p(collection, "elements");
        g();
        f();
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.e + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = this.e;
        return y9.u0(objArr, i2, i + i2);
    }
}
