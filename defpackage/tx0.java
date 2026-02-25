package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tx0 implements List, d20 {
    public final zv0 d;
    public final int e;
    public int f;
    public int g;

    public tx0(zv0 zv0Var, int i, int i2) {
        this.d = zv0Var;
        this.e = i;
        this.f = b10.M(zv0Var);
        this.g = i2 - i;
    }

    public final void a() {
        if (b10.M(this.d) != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.e + this.g;
        zv0 zv0Var = this.d;
        zv0Var.add(i, obj);
        this.g++;
        this.f = b10.M(zv0Var);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.g > 0) {
            a();
            int i = this.g;
            int i2 = this.e;
            zv0 zv0Var = this.d;
            zv0Var.d(i2, i + i2);
            this.g = 0;
            this.f = b10.M(zv0Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        b10.p(i, this.g);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.g;
        int i2 = this.e;
        Iterator it = c10.a0(i2, i + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((o00) it).nextInt();
            if (c10.i(obj, this.d.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.g;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (c10.i(obj, this.d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        x xVar;
        gv0 gv0VarK;
        boolean zS;
        a();
        zv0 zv0Var = this.d;
        int i2 = this.e;
        int i3 = this.g + i2;
        int size = zv0Var.size();
        do {
            synchronized (b10.m) {
                cx0 cx0Var = zv0Var.d;
                c10.n(cx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                cx0 cx0Var2 = (cx0) ov0.i(cx0Var);
                i = cx0Var2.d;
                xVar = cx0Var2.c;
            }
            c10.m(xVar);
            ji0 ji0VarE = xVar.e();
            ji0VarE.subList(i2, i3).retainAll(collection);
            x xVarC = ji0VarE.c();
            if (c10.i(xVarC, xVar)) {
                break;
            }
            cx0 cx0Var3 = zv0Var.d;
            c10.n(cx0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (ov0.c) {
                gv0VarK = ov0.k();
                zS = b10.s((cx0) ov0.w(cx0Var3, zv0Var, gv0VarK), i, xVarC, true);
            }
            ov0.n(gv0VarK, zv0Var);
        } while (!zS);
        int size2 = size - zv0Var.size();
        if (size2 > 0) {
            this.f = b10.M(this.d);
            this.g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b10.p(i, this.g);
        a();
        int i2 = i + this.e;
        zv0 zv0Var = this.d;
        Object obj2 = zv0Var.set(i2, obj);
        this.f = b10.M(zv0Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.g)) {
            zj0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.e;
        return new tx0(this.d, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r31.a0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        bm0 bm0Var = new bm0();
        bm0Var.d = i - 1;
        return new bn0(bm0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r31.b0(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.e;
        zv0 zv0Var = this.d;
        boolean zAddAll = zv0Var.addAll(i2, collection);
        if (zAddAll) {
            this.g = collection.size() + this.g;
            this.f = b10.M(zv0Var);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.e + i;
        zv0 zv0Var = this.d;
        Object objRemove = zv0Var.remove(i2);
        this.g--;
        this.f = b10.M(zv0Var);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.e + i;
        zv0 zv0Var = this.d;
        zv0Var.add(i2, obj);
        this.g++;
        this.f = b10.M(zv0Var);
    }
}
