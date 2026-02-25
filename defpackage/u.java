package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class u extends AbstractList implements List, d20 {
    public abstract int a();

    public abstract Object b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
