package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x70 extends AbstractCollection implements Collection, d20 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ x70(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.d) {
            case 0:
                ((v70) this.e).clear();
                break;
            default:
                ((uh0) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                return ((v70) this.e).containsValue(obj);
            default:
                return ((uh0) this.e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case 0:
                return ((v70) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                v70 v70Var = (v70) this.e;
                v70Var.getClass();
                return new s70(v70Var, 2);
            default:
                uh0 uh0Var = (uh0) this.e;
                m31[] m31VarArr = new m31[8];
                for (int i = 0; i < 8; i++) {
                    m31VarArr[i] = new n31(2);
                }
                return new ci0(uh0Var, m31VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                v70 v70Var = (v70) this.e;
                v70Var.b();
                int iH = v70Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                v70Var.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                ((v70) this.e).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                ((v70) this.e).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.d) {
            case 0:
                return ((v70) this.e).l;
            default:
                uh0 uh0Var = (uh0) this.e;
                uh0Var.getClass();
                return uh0Var.h;
        }
    }
}
