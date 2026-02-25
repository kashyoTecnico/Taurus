package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bi0 implements Iterator, c20 {
    public final /* synthetic */ int d = 0;
    public final Iterator e;

    public bi0(uh0 uh0Var) {
        m31[] m31VarArr = new m31[8];
        for (int i = 0; i < 8; i++) {
            m31VarArr[i] = new o31(this);
        }
        this.e = new zh0(uh0Var, m31VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return ((zh0) this.e).f;
            default:
                return this.e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                return (Map.Entry) ((zh0) this.e).next();
            default:
                return (b51) this.e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                ((zh0) this.e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bi0(z41 z41Var) {
        this.e = z41Var.e.iterator();
    }
}
