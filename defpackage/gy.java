package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gy implements List, c20 {
    public final ma0 d = new ma0(16);
    public final ha0 e = new ha0(16);
    public int f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        defpackage.qo0.s("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.m20.c(r0, r1, r1)
            int r2 = r7.f
            int r2 = r2 + 1
            int r3 = defpackage.ve.L(r7)
            if (r2 > r3) goto L44
        L11:
            ha0 r4 = r7.e
            if (r2 < 0) goto L3a
            int r5 = r4.b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.a
            r4 = r4[r2]
            int r6 = defpackage.c4.l(r4, r0)
            if (r6 >= 0) goto L24
            r0 = r4
        L24:
            float r4 = defpackage.c4.r(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = defpackage.c4.y(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r7 = "Index must be between 0 and size"
            defpackage.qo0.s(r7)
            r7 = 0
            throw r7
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.a():long");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.d.k(i, i2);
        ha0 ha0Var = this.e;
        if (i >= 0) {
            int i3 = ha0Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    qo0.r("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = ha0Var.a;
                        y9.q0(jArr, jArr, i, i2, i3);
                    }
                    ha0Var.b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            ha0Var.getClass();
        }
        qo0.s("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f = -1;
        this.d.c();
        this.e.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d90) && indexOf((d90) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d90) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objE = this.d.e(i);
        c10.n(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (d90) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d90)) {
            return -1;
        }
        d90 d90Var = (d90) obj;
        int iL = ve.L(this);
        if (iL >= 0) {
            int i = 0;
            while (!c10.i(this.d.e(i), d90Var)) {
                if (i != iL) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ey(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d90)) {
            return -1;
        }
        d90 d90Var = (d90) obj;
        for (int iL = ve.L(this); -1 < iL; iL--) {
            if (c10.i(this.d.e(iL), d90Var)) {
                return iL;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ey(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new fy(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r31.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ey(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r31.b0(this, objArr);
    }
}
