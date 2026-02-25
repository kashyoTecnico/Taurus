package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ma0 ma0Var = p3.K0;
        synchronized (ma0Var) {
            Object[] objArr = ma0Var.a;
            int i = ma0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                p3.k(((p3) objArr[i2]).getRoot());
            }
        }
    }
}
