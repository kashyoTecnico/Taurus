package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mb extends d90 {
    public lb r;

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.d90
    public final void s0() {
        lb lbVar = this.r;
        if (lbVar != null) {
            lbVar.a.j(this);
        }
        if (lbVar != null) {
            lbVar.a.b(this);
        }
        this.r = lbVar;
    }

    @Override // defpackage.d90
    public final void t0() {
        lb lbVar = this.r;
        if (lbVar != null) {
            c10.n(lbVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            lbVar.a.j(this);
        }
    }
}
