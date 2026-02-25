package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ru0 extends i0 {
    public long a;
    public ad b;

    @Override // defpackage.i0
    public final boolean a(h0 h0Var) {
        qu0 qu0Var = (qu0) h0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = qu0Var.l;
        if (j < qu0Var.m) {
            qu0Var.m = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.i0
    public final lk[] b(h0 h0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((qu0) h0Var).v(j);
    }
}
