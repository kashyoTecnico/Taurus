package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fn extends hq0 {
    public static final fn g;

    static {
        int i = mz0.c;
        int i2 = mz0.d;
        long j = mz0.e;
        String str = mz0.a;
        fn fnVar = new fn();
        fnVar.f = new vl(i, i2, j, str);
        g = fnVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.pl
    public final String toString() {
        return "Dispatchers.Default";
    }
}
