package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class oi0 {
    public int d;
    public int e;
    public long f;
    public long g = pi0.a;
    public long h = 0;

    public oi0() {
        long j = 0;
        this.f = (j & 4294967295L) | (j << 32);
    }

    public int c0() {
        return (int) (this.f & 4294967295L);
    }

    public int d0() {
        return (int) (this.f >> 32);
    }

    public final void e0() {
        this.d = c10.u((int) (this.f >> 32), gj.j(this.g), gj.h(this.g));
        this.e = c10.u((int) (this.f & 4294967295L), gj.i(this.g), gj.g(this.g));
        int i = this.d;
        long j = this.f;
        this.h = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void g0(long j, float f, iw iwVar);

    public final void h0(long j) {
        if (t00.a(this.f, j)) {
            return;
        }
        this.f = j;
        e0();
    }

    public final void i0(long j) {
        if (gj.b(this.g, j)) {
            return;
        }
        this.g = j;
        e0();
    }

    public Object l() {
        return null;
    }
}
