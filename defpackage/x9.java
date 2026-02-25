package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x9 implements Collection, Set, d20, f20 {
    public int[] d = nm.b;
    public Object[] e = nm.d;
    public int f;

    public final Object a(int i) {
        int i2 = this.f;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                y9.p0(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.e;
                y9.r0(objArr2, objArr2, i, i4, i2);
            }
            this.e[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.d = iArr2;
            this.e = new Object[i5];
            if (i > 0) {
                y9.s0(iArr, iArr2, 0, i, 6);
                y9.t0(objArr, this.e, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                y9.p0(iArr, this.d, i, i6, i2);
                y9.r0(objArr, this.e, i, i6, i2);
            }
        }
        if (i2 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iU;
        int i2 = this.f;
        if (obj == null) {
            iU = nm.u(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iU = nm.u(this, obj, iHashCode);
        }
        if (iU >= 0) {
            return false;
        }
        int i3 = ~iU;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.e;
            int[] iArr2 = new int[i4];
            this.d = iArr2;
            this.e = new Object[i4];
            if (i2 != this.f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                y9.s0(iArr, iArr2, 0, iArr.length, 6);
                y9.t0(objArr, this.e, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.d;
            int i5 = i3 + 1;
            y9.p0(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.e;
            y9.r0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f;
        if (i2 == i6) {
            int[] iArr4 = this.d;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.e[i3] = obj;
                this.f = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        c10.p(collection, "elements");
        int size = collection.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            int[] iArr2 = new int[size];
            this.d = iArr2;
            this.e = new Object[size];
            if (i > 0) {
                y9.s0(iArr, iArr2, 0, i, 6);
                y9.t0(objArr, this.e, 0, this.f, 6);
            }
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f != 0) {
            this.d = nm.b;
            this.e = nm.d;
            this.f = 0;
        }
        if (this.f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? nm.u(this, null, 0) : nm.u(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        c10.p(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.e[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.d;
        int i = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new s9(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iU = obj == null ? nm.u(this, null, 0) : nm.u(this, obj, obj.hashCode());
        if (iU < 0) {
            return false;
        }
        a(iU);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        c10.p(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        c10.p(collection, "elements");
        boolean z = false;
        for (int i = this.f - 1; -1 < i; i--) {
            if (!ue.R(collection, this.e[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return y9.u0(this.e, 0, this.f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        c10.p(objArr, "array");
        int i = this.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        y9.r0(this.e, objArr, 0, 0, this.f);
        return objArr;
    }
}
