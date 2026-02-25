package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t70 implements Map.Entry, c20 {
    public final v70 d;
    public final int e;

    public t70(v70 v70Var, int i) {
        c10.p(v70Var, "map");
        this.d = v70Var;
        this.e = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c10.i(entry.getKey(), getKey()) && c10.i(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d.d[this.e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.d.e;
        c10.m(objArr);
        return objArr[this.e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v70 v70Var = this.d;
        v70Var.b();
        Object[] objArr = v70Var.e;
        if (objArr == null) {
            int length = v70Var.d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            v70Var.e = objArr;
        }
        int i = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
