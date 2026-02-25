package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class xd0 extends d90 implements b30 {
    public iw r;
    public long s;

    @Override // defpackage.d90
    public final boolean p0() {
        return true;
    }

    @Override // defpackage.b30
    public final void r(long j) {
        if (t00.a(this.s, j)) {
            return;
        }
        this.r.g(new t00(j));
        this.s = j;
    }
}
