package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class r9 extends AbstractSet {
    public final /* synthetic */ w9 d;

    public r9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u9(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
