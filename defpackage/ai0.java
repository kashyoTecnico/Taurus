package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ai0 extends v {
    public final /* synthetic */ int d;
    public final uh0 e;

    public /* synthetic */ ai0(int i, uh0 uh0Var) {
        this.d = i;
        this.e = uh0Var;
    }

    @Override // defpackage.v
    public final int a() {
        switch (this.d) {
            case 0:
                uh0 uh0Var = this.e;
                uh0Var.getClass();
                return uh0Var.h;
            default:
                uh0 uh0Var2 = this.e;
                uh0Var2.getClass();
                return uh0Var2.h;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
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
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                uh0 uh0Var = this.e;
                Object obj2 = uh0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && uh0Var.containsKey(entry.getKey());
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                return new bi0(this.e);
            default:
                m31[] m31VarArr = new m31[8];
                for (int i = 0; i < 8; i++) {
                    m31VarArr[i] = new n31(1);
                }
                return new ci0(this.e, m31VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.e.remove(entry.getKey(), entry.getValue());
            default:
                uh0 uh0Var = this.e;
                if (!uh0Var.containsKey(obj)) {
                    return false;
                }
                uh0Var.remove(obj);
                return true;
        }
    }
}
