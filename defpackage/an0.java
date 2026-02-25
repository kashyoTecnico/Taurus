package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class an0 implements xn {
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public long l;
    public ju0 m;
    public boolean n;
    public long o;
    public xn p;
    public e30 q;
    public int r;
    public nf0 s;

    public final void a(float f) {
        if (this.g == f) {
            return;
        }
        this.d |= 4;
        this.g = f;
    }

    @Override // defpackage.xn
    public final float b() {
        return this.p.b();
    }

    public final void d(long j) {
        if (bf.c(this.i, j)) {
            return;
        }
        this.d |= 64;
        this.i = j;
    }

    public final void e(float f) {
        if (this.h == f) {
            return;
        }
        this.d |= 32;
        this.h = f;
    }

    public final void f(ju0 ju0Var) {
        if (c10.i(this.m, ju0Var)) {
            return;
        }
        this.d |= 8192;
        this.m = ju0Var;
    }

    public final void h(long j) {
        if (bf.c(this.j, j)) {
            return;
        }
        this.d |= 128;
        this.j = j;
    }

    @Override // defpackage.xn
    public final float k() {
        return this.p.k();
    }
}
