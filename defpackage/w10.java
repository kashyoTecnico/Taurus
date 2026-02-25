package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w10 extends u10 {
    public final y10 h;
    public final x10 i;
    public final be j;
    public final Object k;

    public w10(y10 y10Var, x10 x10Var, be beVar, Object obj) {
        this.h = y10Var;
        this.i = x10Var;
        this.j = beVar;
        this.k = obj;
    }

    @Override // defpackage.u10
    public final boolean k() {
        return false;
    }

    @Override // defpackage.u10
    public final void l(Throwable th) {
        be beVar = this.j;
        be beVarU = y10.U(beVar);
        y10 y10Var = this.h;
        x10 x10Var = this.i;
        Object obj = this.k;
        if (beVarU == null || !y10Var.d0(x10Var, beVarU, obj)) {
            x10Var.d.e(new y50(2), 2);
            be beVarU2 = y10.U(beVar);
            if (beVarU2 == null || !y10Var.d0(x10Var, beVarU2, obj)) {
                y10Var.y(y10Var.I(x10Var, obj));
            }
        }
    }
}
