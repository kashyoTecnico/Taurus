package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cx0 extends fx0 {
    public x c;
    public int d;
    public int e;

    public cx0(long j, x xVar) {
        super(j);
        this.c = xVar;
    }

    @Override // defpackage.fx0
    public final void a(fx0 fx0Var) {
        synchronized (b10.m) {
            c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.c = ((cx0) fx0Var).c;
            this.d = ((cx0) fx0Var).d;
            this.e = ((cx0) fx0Var).e;
        }
    }

    @Override // defpackage.fx0
    public final fx0 b(long j) {
        return new cx0(j, this.c);
    }
}
