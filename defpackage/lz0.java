package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class lz0 extends kz0 {
    public final Runnable f;

    public lz0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(nm.t(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
