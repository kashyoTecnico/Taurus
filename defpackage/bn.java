package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bn extends zs implements Executor {
    public static final bn f = new bn();
    public static final pl g;

    static {
        k41 k41Var = k41.f;
        int i = wy0.a;
        if (64 >= i) {
            i = 64;
        }
        g = k41Var.g(n2.n(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.pl
    public final void d(ml mlVar, Runnable runnable) {
        g.d(mlVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(is.d, runnable);
    }

    @Override // defpackage.pl
    public final String toString() {
        return "Dispatchers.IO";
    }
}
