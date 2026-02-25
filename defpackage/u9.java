package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u9 implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean f;
    public final /* synthetic */ w9 g;

    public u9(w9 w9Var) {
        this.g = w9Var;
        this.d = w9Var.f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.e;
        w9 w9Var = this.g;
        return c10.i(key, w9Var.e(i)) && c10.i(entry.getValue(), w9Var.h(this.e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f) {
            return this.g.e(this.e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f) {
            return this.g.h(this.e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.e;
        w9 w9Var = this.g;
        Object objE = w9Var.e(i);
        Object objH = w9Var.h(this.e);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e++;
        this.f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException();
        }
        this.g.f(this.e);
        this.e--;
        this.d--;
        this.f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f) {
            return this.g.g(this.e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
