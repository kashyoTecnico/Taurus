package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uh0 extends AbstractMap implements Map, e20 {
    public v71 d = new v71(28);
    public l31 e;
    public Object f;
    public int g;
    public int h;
    public vh0 i;

    public uh0(vh0 vh0Var) {
        this.e = vh0Var.d;
        this.h = vh0Var.e;
        this.i = vh0Var;
    }

    public final vh0 a() {
        l31 l31Var = this.e;
        vh0 vh0Var = this.i;
        if (l31Var != vh0Var.d) {
            this.d = new v71(28);
            vh0Var = new vh0(this.e, this.h);
        }
        this.i = vh0Var;
        return vh0Var;
    }

    public final boolean b(Object obj) {
        return this.e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = l31.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof dl0) {
            return b((dl0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof u41) {
            return super.containsValue((u41) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f = null;
        l31 l31VarN = this.e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (l31VarN == null) {
            l31VarN = l31.e;
        }
        this.e = l31VarN;
        return this.f;
    }

    public final void e(int i) {
        this.h = i;
        this.g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ai0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof dl0) {
            return (u41) c((dl0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof dl0) ? obj2 : (u41) super.getOrDefault((dl0) obj, (u41) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new ai0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f = null;
        this.e = this.e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [xh0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        vh0 vh0VarA = null;
        vh0 vh0Var = map instanceof xh0 ? (xh0) map : null;
        if (vh0Var == null) {
            uh0 uh0Var = map instanceof uh0 ? (uh0) map : null;
            if (uh0Var != null) {
                vh0VarA = uh0Var.a();
            }
        } else {
            vh0VarA = vh0Var;
        }
        if (vh0VarA == null) {
            super.putAll(map);
            return;
        }
        wn wnVar = new wn();
        wnVar.a = 0;
        int i = this.h;
        l31 l31Var = this.e;
        l31 l31Var2 = vh0VarA.d;
        c10.n(l31Var2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.e = l31Var.m(l31Var2, 0, wnVar, this);
        int i2 = (vh0VarA.e + i) - wnVar.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.h;
        l31 l31VarO = this.e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (l31VarO == null) {
            l31VarO = l31.e;
        }
        this.e = l31VarO;
        return i != this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new x70(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof dl0) {
            return (u41) d((dl0) obj);
        }
        return null;
    }
}
