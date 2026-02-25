package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w9 extends uu0 implements Map {
    public r9 g;
    public t9 h;
    public v9 i;

    @Override // java.util.Map
    public final Set entrySet() {
        r9 r9Var = this.g;
        if (r9Var != null) {
            return r9Var;
        }
        r9 r9Var2 = new r9(this);
        this.g = r9Var2;
        return r9Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        t9 t9Var = this.h;
        if (t9Var != null) {
            return t9Var;
        }
        t9 t9Var2 = new t9(this);
        this.h = t9Var2;
        return t9Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            c10.o(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, size * 2);
            c10.o(objArrCopyOf, "copyOf(...)");
            this.e = objArrCopyOf;
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        v9 v9Var = this.i;
        if (v9Var != null) {
            return v9Var;
        }
        v9 v9Var2 = new v9(this);
        this.i = v9Var2;
        return v9Var2;
    }
}
