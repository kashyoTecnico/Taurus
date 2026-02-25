package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q9 extends u {
    public static final Object[] g = new Object[0];
    public int d;
    public Object[] e = g;
    public int f;

    @Override // defpackage.u
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f + 1);
        int iH = h(this.d + i);
        int i3 = this.f;
        if (i < ((i3 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.e;
                c10.p(objArr, "<this>");
                iH = objArr.length;
            }
            int i4 = iH - 1;
            int i5 = this.d;
            if (i5 == 0) {
                Object[] objArr2 = this.e;
                c10.p(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.d;
            if (i4 >= i6) {
                Object[] objArr3 = this.e;
                objArr3[length] = objArr3[i6];
                y9.r0(objArr3, objArr3, i6, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.e;
                y9.r0(objArr4, objArr4, i6 - 1, i6, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                y9.r0(objArr5, objArr5, 0, 1, i4 + 1);
            }
            this.e[i4] = obj;
            this.d = length;
        } else {
            int iH2 = h(i3 + this.d);
            if (iH < iH2) {
                Object[] objArr6 = this.e;
                y9.r0(objArr6, objArr6, iH + 1, iH, iH2);
            } else {
                Object[] objArr7 = this.e;
                y9.r0(objArr7, objArr7, 1, 0, iH2);
                Object[] objArr8 = this.e;
                objArr8[0] = objArr8[objArr8.length - 1];
                y9.r0(objArr8, objArr8, iH + 1, iH, objArr8.length - 1);
            }
            this.e[iH] = obj;
        }
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c10.p(collection, "elements");
        int i2 = this.f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f);
        int iH = h(this.f + this.d);
        int iH2 = h(this.d + i);
        int size = collection.size();
        if (i >= ((this.f + 1) >> 1)) {
            int i3 = iH2 + size;
            if (iH2 < iH) {
                int i4 = size + iH;
                Object[] objArr = this.e;
                if (i4 <= objArr.length) {
                    y9.r0(objArr, objArr, i3, iH2, iH);
                } else if (i3 >= objArr.length) {
                    y9.r0(objArr, objArr, i3 - objArr.length, iH2, iH);
                } else {
                    int length = iH - (i4 - objArr.length);
                    y9.r0(objArr, objArr, 0, length, iH);
                    Object[] objArr2 = this.e;
                    y9.r0(objArr2, objArr2, i3, iH2, length);
                }
            } else {
                Object[] objArr3 = this.e;
                y9.r0(objArr3, objArr3, size, 0, iH);
                Object[] objArr4 = this.e;
                if (i3 >= objArr4.length) {
                    y9.r0(objArr4, objArr4, i3 - objArr4.length, iH2, objArr4.length);
                } else {
                    y9.r0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.e;
                    y9.r0(objArr5, objArr5, i3, iH2, objArr5.length - size);
                }
            }
            c(iH2, collection);
            return true;
        }
        int i5 = this.d;
        int length2 = i5 - size;
        if (iH2 < i5) {
            Object[] objArr6 = this.e;
            y9.r0(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iH2) {
                Object[] objArr7 = this.e;
                y9.r0(objArr7, objArr7, objArr7.length - size, 0, iH2);
            } else {
                Object[] objArr8 = this.e;
                y9.r0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.e;
                y9.r0(objArr9, objArr9, 0, size, iH2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.e;
            y9.r0(objArr10, objArr10, length2, i5, iH2);
        } else {
            Object[] objArr11 = this.e;
            length2 += objArr11.length;
            int i6 = iH2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                y9.r0(objArr11, objArr11, length2, i5, iH2);
            } else {
                y9.r0(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.e;
                y9.r0(objArr12, objArr12, 0, this.d + length3, iH2);
            }
        }
        this.d = length2;
        c(f(iH2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f + 1);
        int length = this.d;
        if (length == 0) {
            Object[] objArr = this.e;
            c10.p(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.d = i;
        this.e[i] = obj;
        this.f++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.e[h(a() + this.d)] = obj;
        this.f = a() + 1;
    }

    @Override // defpackage.u
    public final Object b(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        if (i == ve.L(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int iH = h(this.d + i);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        if (i < (this.f >> 1)) {
            int i3 = this.d;
            if (iH >= i3) {
                y9.r0(objArr, objArr, i3 + 1, i3, iH);
            } else {
                y9.r0(objArr, objArr, 1, 0, iH);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.d;
                y9.r0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i5 = this.d;
            objArr3[i5] = null;
            this.d = e(i5);
        } else {
            int iH2 = h(ve.L(this) + this.d);
            if (iH <= iH2) {
                Object[] objArr4 = this.e;
                y9.r0(objArr4, objArr4, iH, iH + 1, iH2 + 1);
            } else {
                Object[] objArr5 = this.e;
                y9.r0(objArr5, objArr5, iH, iH + 1, objArr5.length);
                Object[] objArr6 = this.e;
                objArr6[objArr6.length - 1] = objArr6[0];
                y9.r0(objArr6, objArr6, 0, 1, iH2 + 1);
            }
            this.e[iH2] = null;
        }
        this.f--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.f = collection.size() + this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.d, h(a() + this.d));
        }
        this.d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == g) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        y9.r0(objArr, objArr2, 0, this.d, objArr.length);
        Object[] objArr3 = this.e;
        int length2 = objArr3.length;
        int i3 = this.d;
        y9.r0(objArr3, objArr2, length2 - i3, 0, i3);
        this.d = 0;
        this.e = objArr2;
    }

    public final int e(int i) {
        c10.p(this.e, "<this>");
        if (i == r1.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            y9.v0(this.e, i, i2);
            return;
        }
        Object[] objArr = this.e;
        y9.v0(objArr, i, objArr.length);
        y9.v0(this.e, 0, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", iA));
        }
        return this.e[h(this.d + i)];
    }

    public final int h(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iH = h(a() + this.d);
        int length = this.d;
        if (length < iH) {
            while (length < iH) {
                if (c10.i(obj, this.e[length])) {
                    i = this.d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.e.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iH; i2++) {
                    if (c10.i(obj, this.e[i2])) {
                        length = i2 + this.e.length;
                        i = this.d;
                    }
                }
                return -1;
            }
            if (c10.i(obj, this.e[length])) {
                i = this.d;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[h(ve.L(this) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iH = h(this.f + this.d);
        int i2 = this.d;
        if (i2 < iH) {
            length = iH - 1;
            if (i2 <= length) {
                while (!c10.i(obj, this.e[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
            return -1;
        }
        if (i2 > iH) {
            int i3 = iH - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.e;
                    c10.p(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.d;
                    if (i4 <= length) {
                        while (!c10.i(obj, this.e[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.d;
                    }
                } else {
                    if (c10.i(obj, this.e[i3])) {
                        length = i3 + this.e.length;
                        i = this.d;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        c10.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f + this.d);
            int i = this.d;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.e[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.e[iH] = obj;
                        iH++;
                    }
                    i++;
                }
                y9.v0(this.e, iH, iH2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(iH - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = e(i);
        this.f = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h(ve.L(this) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d80.m(i, i2, this.f);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        i();
        if (i < this.f - i2) {
            int iH = h((i - 1) + this.d);
            int iH2 = h((i2 - 1) + this.d);
            while (i > 0) {
                int i4 = iH + 1;
                int iMin = Math.min(i, Math.min(i4, iH2 + 1));
                Object[] objArr = this.e;
                int i5 = iH2 - iMin;
                int i6 = iH - iMin;
                y9.r0(objArr, objArr, i5 + 1, i6 + 1, i4);
                iH = f(i6);
                iH2 = f(i5);
                i -= iMin;
            }
            int iH3 = h(this.d + i3);
            g(this.d, iH3);
            this.d = iH3;
        } else {
            int iH4 = h(this.d + i2);
            int iH5 = h(this.d + i);
            int i7 = this.f;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(i7, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.e;
                int i8 = iH4 + i2;
                y9.r0(objArr3, objArr3, iH5, iH4, i8);
                iH4 = h(i8);
                iH5 = h(iH5 + i2);
            }
            int iH6 = h(this.f + this.d);
            g(f(iH6 - i3), iH6);
        }
        this.f -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        c10.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f + this.d);
            int i = this.d;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.e[i];
                    if (collection.contains(obj)) {
                        this.e[iH] = obj;
                        iH++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                y9.v0(this.e, iH, iH2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.f = f(iH - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", iA));
        }
        int iH = h(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        c10.p(objArr, "array");
        int length = objArr.length;
        int i = this.f;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            c10.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iH = h(this.f + this.d);
        int i2 = this.d;
        if (i2 < iH) {
            y9.t0(this.e, objArr, i2, iH, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            y9.r0(objArr2, objArr, 0, this.d, objArr2.length);
            Object[] objArr3 = this.e;
            y9.r0(objArr3, objArr, objArr3.length - this.d, 0, iH);
        }
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c10.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.d), collection);
        return true;
    }
}
