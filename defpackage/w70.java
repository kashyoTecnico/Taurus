package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w70 extends v {
    public final /* synthetic */ int d;
    public final v70 e;

    public /* synthetic */ w70(v70 v70Var, int i) {
        this.d = i;
        this.e = v70Var;
    }

    @Override // defpackage.v
    public final int a() {
        switch (this.d) {
        }
        return this.e.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                c10.p((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                c10.p(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case 0:
                this.e.clear();
                break;
            default:
                this.e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.e.e((Map.Entry) obj);
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                return this.e.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.d) {
        }
        return this.e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                v70 v70Var = this.e;
                v70Var.getClass();
                return new s70(v70Var, 0);
            default:
                v70 v70Var2 = this.e;
                v70Var2.getClass();
                return new s70(v70Var2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    v70 v70Var = this.e;
                    v70Var.getClass();
                    v70Var.b();
                    int iG = v70Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = v70Var.e;
                        c10.m(objArr);
                        if (c10.i(objArr[iG], entry.getValue())) {
                            v70Var.k(iG);
                            break;
                        }
                    }
                }
                break;
            default:
                v70 v70Var2 = this.e;
                v70Var2.b();
                int iG2 = v70Var2.g(obj);
                if (iG2 >= 0) {
                    v70Var2.k(iG2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                this.e.b();
                break;
            default:
                c10.p(collection, "elements");
                this.e.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.d) {
            case 0:
                c10.p(collection, "elements");
                this.e.b();
                break;
            default:
                c10.p(collection, "elements");
                this.e.b();
                break;
        }
        return super.retainAll(collection);
    }
}
