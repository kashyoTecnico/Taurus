package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cv0 implements Iterable, c20 {
    public final bv0 d;
    public final int e;
    public final int f;

    public cv0(bv0 bv0Var, int i, int i2) {
        this.d = bv0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bv0 bv0Var = this.d;
        if (bv0Var.k != this.f) {
            dv0.f();
        }
        int i = this.e;
        bv0Var.f(i);
        return new lx(bv0Var, i + 1, dv0.a(bv0Var.d, i) + i);
    }
}
