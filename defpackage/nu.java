package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class nu {
    public final qu a;
    public final p3 b;
    public final ua0 c;
    public final ua0 d;
    public boolean e;

    public nu(qu quVar, p3 p3Var) {
        this.a = quVar;
        this.b = p3Var;
        int i = fq0.a;
        this.c = new ua0();
        this.d = new ua0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        f3 f3Var = new f3(0, this, nu.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 1);
        ma0 ma0Var = this.b.w0;
        if (ma0Var.f(f3Var) < 0) {
            ma0Var.a(f3Var);
        }
        this.e = true;
    }
}
