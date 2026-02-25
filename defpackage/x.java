package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class x extends r implements List, Collection, c20 {
    public abstract x b(int i, Object obj);

    public abstract x c(Object obj);

    @Override // defpackage.i, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.i, java.util.Collection
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

    public x d(Collection collection) {
        ji0 ji0VarE = e();
        ji0VarE.addAll(collection);
        return ji0VarE.c();
    }

    public abstract ji0 e();

    public abstract x f(w wVar);

    public abstract x g(int i);

    public abstract x h(int i, Object obj);

    @Override // defpackage.r, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        return new zy(this, i, i2);
    }
}
