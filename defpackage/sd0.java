package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sd0 {
    public final Runnable a;
    public final qb0 b;

    public sd0(Runnable runnable) {
        this.a = runnable;
        qb0 qb0Var = new qb0(new pd0(this));
        this.b = qb0Var;
        qb0Var.a(new qd0());
    }

    public final void a(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        ld0 ld0Var = new ld0(onBackInvokedDispatcher, 0);
        qb0 qb0Var = this.b;
        qb0Var.b(ld0Var, 1);
        qb0Var.b(new ld0(onBackInvokedDispatcher, 1000000), 0);
    }
}
