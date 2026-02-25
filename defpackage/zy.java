package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zy extends r {
    public final x d;
    public final int e;
    public final int f;

    public zy(x xVar, int i, int i2) {
        this.d = xVar;
        this.e = i;
        nm.o(i, i2, xVar.a());
        this.f = i2 - i;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nm.m(i, this.f);
        return this.d.get(this.e + i);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        nm.o(i, i2, this.f);
        int i3 = this.e;
        return new zy(this.d, i + i3, i3 + i2);
    }
}
