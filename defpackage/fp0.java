package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fp0 implements d50, AutoCloseable {
    public final String d;
    public final ep0 e;
    public boolean f;

    public fp0(String str, ep0 ep0Var) {
        this.d = str;
        this.e = ep0Var;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        if (y40Var == y40.ON_DESTROY) {
            this.f = false;
            f50Var.getLifecycle().b(this);
        }
    }

    public final void e(a50 a50Var, mp0 mp0Var) {
        c10.p(mp0Var, "registry");
        c10.p(a50Var, "lifecycle");
        if (this.f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f = true;
        a50Var.a(this);
        mp0Var.b(this.d, (lg) this.e.a.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
