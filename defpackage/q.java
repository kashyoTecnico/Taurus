package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q extends r implements RandomAccess {
    public final r d;
    public final int e;
    public final int f;

    public q(r rVar, int i, int i2) {
        this.d = rVar;
        this.e = i;
        d80.m(i, i2, rVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b8.g("index: ", i, ", size: ", i2));
        }
        return this.d.get(this.e + i);
    }
}
