package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class m31 implements Iterator, c20 {
    public Object[] d = l31.e.d;
    public int e;
    public int f;

    public final void a(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
