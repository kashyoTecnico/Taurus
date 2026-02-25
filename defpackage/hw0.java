package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hw0 implements Iterable, c20 {
    public final bv0 d;
    public final int e;
    public final n2 f;

    public hw0(bv0 bv0Var, int i, mx mxVar, n2 n2Var) {
        this.d = bv0Var;
        this.e = i;
        this.f = n2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lx(this.d, this.e, null, this.f);
    }
}
