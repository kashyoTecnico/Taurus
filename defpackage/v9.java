package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v9 implements Collection {
    public final /* synthetic */ w9 d;

    public v9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s9(this.d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        w9 w9Var = this.d;
        int iA = w9Var.a(obj);
        if (iA < 0) {
            return false;
        }
        w9Var.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        w9 w9Var = this.d;
        int i = w9Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(w9Var.h(i2))) {
                w9Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        w9 w9Var = this.d;
        int i = w9Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(w9Var.h(i2))) {
                w9Var.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        w9 w9Var = this.d;
        int i = w9Var.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w9Var.h(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        w9 w9Var = this.d;
        int i = w9Var.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w9Var.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
