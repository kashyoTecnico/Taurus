package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cn0 extends r {
    public final List d;

    public cn0(List list) {
        c10.p(list, "delegate");
        this.d = list;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= ve.L(this)) {
            return this.d.get(ve.L(this) - i);
        }
        StringBuilder sbI = b8.i("Element index ", i, " must be in range [");
        sbI.append(new p00(0, ve.L(this), 1));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    @Override // defpackage.r, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new bn0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator() {
        return new bn0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        return new bn0(this, i);
    }
}
