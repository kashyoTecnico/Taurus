package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z70 implements Map, c20 {
    public final ta0 d;
    public qs e;
    public qs f;
    public yx0 g;

    public z70(ta0 ta0Var) {
        c10.p(ta0Var, "parent");
        this.d = ta0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.d.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        qs qsVar = this.e;
        if (qsVar != null) {
            return qsVar;
        }
        qs qsVar2 = new qs(this.d, 0);
        this.e = qsVar2;
        return qsVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z70.class != obj.getClass()) {
            return false;
        }
        return c10.i(this.d, ((z70) obj).d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.d.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        qs qsVar = this.f;
        if (qsVar != null) {
            return qsVar;
        }
        qs qsVar2 = new qs(this.d, 1);
        this.f = qsVar2;
        return qsVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.e;
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        yx0 yx0Var = this.g;
        if (yx0Var != null) {
            return yx0Var;
        }
        yx0 yx0Var2 = new yx0(this.d);
        this.g = yx0Var2;
        return yx0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
