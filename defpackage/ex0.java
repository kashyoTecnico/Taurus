package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ex0 implements dx0 {
    public final z9 d = new z9(0);

    public final boolean e(int i) {
        return (this.d.get() & i) != 0;
    }

    public final void f(int i) {
        z9 z9Var;
        int i2;
        do {
            z9Var = this.d;
            i2 = z9Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!z9Var.compareAndSet(i2, i2 | i));
    }
}
