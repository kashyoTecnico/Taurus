package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class pv0 extends fx0 {
    public float c;

    public pv0(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.fx0
    public final void a(fx0 fx0Var) {
        c10.n(fx0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.c = ((pv0) fx0Var).c;
    }

    @Override // defpackage.fx0
    public final fx0 b(long j) {
        return new pv0(j, this.c);
    }
}
