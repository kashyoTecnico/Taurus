package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ey implements ListIterator, c20 {
    public final /* synthetic */ int d;
    public int e;
    public int f;
    public int g;
    public final Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ey(gy gyVar, int i, int i2) {
        this(gyVar, (i2 & 1) != 0 ? 0 : i, 0, gyVar.d.b);
        this.d = 0;
    }

    public void a() {
        if (((AbstractList) ((w50) this.h).h).modCount != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                w50 w50Var = (w50) this.h;
                int i = this.e;
                this.e = i + 1;
                w50Var.add(i, obj);
                this.f = -1;
                this.g = ((AbstractList) w50Var).modCount;
                return;
            case 2:
                b();
                x50 x50Var = (x50) this.h;
                int i2 = this.e;
                this.e = i2 + 1;
                x50Var.add(i2, obj);
                this.f = -1;
                this.g = ((AbstractList) x50Var).modCount;
                return;
            default:
                c();
                zv0 zv0Var = (zv0) this.h;
                zv0Var.add(this.e + 1, obj);
                this.f = -1;
                this.e++;
                this.g = b10.M(zv0Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((x50) this.h)).modCount != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (b10.M((zv0) this.h) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return this.e < this.g;
            case 1:
                return this.e < ((w50) this.h).f;
            case 2:
                return this.e < ((x50) this.h).e;
            default:
                return this.e < ((zv0) this.h).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                if (this.e > this.f) {
                }
                break;
            case 1:
                if (this.e > 0) {
                }
                break;
            case 2:
                if (this.e > 0) {
                }
                break;
            default:
                if (this.e >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                ma0 ma0Var = ((gy) this.h).d;
                int i = this.e;
                this.e = i + 1;
                Object objE = ma0Var.e(i);
                c10.n(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (d90) objE;
            case 1:
                a();
                int i2 = this.e;
                w50 w50Var = (w50) this.h;
                if (i2 >= w50Var.f) {
                    throw new NoSuchElementException();
                }
                this.e = i2 + 1;
                this.f = i2;
                return w50Var.d[w50Var.e + i2];
            case 2:
                b();
                int i3 = this.e;
                x50 x50Var = (x50) this.h;
                if (i3 >= x50Var.e) {
                    throw new NoSuchElementException();
                }
                this.e = i3 + 1;
                this.f = i3;
                return x50Var.d[i3];
            default:
                c();
                int i4 = this.e + 1;
                this.f = i4;
                zv0 zv0Var = (zv0) this.h;
                b10.p(i4, zv0Var.size());
                Object obj = zv0Var.get(i4);
                this.e = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case 0:
                return this.e - this.f;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.d) {
            case 0:
                ma0 ma0Var = ((gy) this.h).d;
                int i = this.e - 1;
                this.e = i;
                Object objE = ma0Var.e(i);
                c10.n(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (d90) objE;
            case 1:
                a();
                int i2 = this.e;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.e = i3;
                this.f = i3;
                w50 w50Var = (w50) this.h;
                return w50Var.d[w50Var.e + i3];
            case 2:
                b();
                int i4 = this.e;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.e = i5;
                this.f = i5;
                return ((x50) this.h).d[i5];
            default:
                c();
                int i6 = this.e;
                zv0 zv0Var = (zv0) this.h;
                b10.p(i6, zv0Var.size());
                int i7 = this.e;
                this.f = i7;
                this.e--;
                return zv0Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case 0:
                return (this.e - this.f) - 1;
            case 1:
                i = this.e;
                break;
            case 2:
                i = this.e;
                break;
            default:
                return this.e;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                w50 w50Var = (w50) this.h;
                a();
                int i = this.f;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                w50Var.b(i);
                this.e = this.f;
                this.f = -1;
                this.g = ((AbstractList) w50Var).modCount;
                return;
            case 2:
                x50 x50Var = (x50) this.h;
                b();
                int i2 = this.f;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                x50Var.b(i2);
                this.e = this.f;
                this.f = -1;
                this.g = ((AbstractList) x50Var).modCount;
                return;
            default:
                c();
                zv0 zv0Var = (zv0) this.h;
                zv0Var.remove(this.f);
                this.e--;
                this.f = -1;
                this.g = b10.M(zv0Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.f;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((w50) this.h).set(i, obj);
                return;
            case 2:
                b();
                int i2 = this.f;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((x50) this.h).set(i2, obj);
                return;
            default:
                zv0 zv0Var = (zv0) this.h;
                c();
                int i3 = this.f;
                if (i3 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                zv0Var.set(i3, obj);
                this.g = b10.M(zv0Var);
                return;
        }
    }

    public ey(x50 x50Var, int i) {
        this.d = 2;
        this.h = x50Var;
        this.e = i;
        this.f = -1;
        this.g = ((AbstractList) x50Var).modCount;
    }

    public ey(zv0 zv0Var, int i) {
        this.d = 3;
        this.h = zv0Var;
        this.e = i - 1;
        this.f = -1;
        this.g = b10.M(zv0Var);
    }

    public ey(gy gyVar, int i, int i2, int i3) {
        this.d = 0;
        this.h = gyVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public ey(w50 w50Var, int i) {
        this.d = 1;
        this.h = w50Var;
        this.e = i;
        this.f = -1;
        this.g = ((AbstractList) w50Var).modCount;
    }
}
