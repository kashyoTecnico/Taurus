package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qv0 extends fx0 {
    public int c;

    public qv0(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.fx0
    public final void a(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.c = ((qv0) fx0Var).c;
    }

    @Override // defpackage.fx0
    public final fx0 b(long j) {
        return new qv0(j, this.c);
    }
}
