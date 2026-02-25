package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gv extends d90 implements j31, xw {
    public static final v71 t = new v71(18);
    public boolean r;
    public nc0 s;

    public final hv A0() {
        if (!this.q) {
            return null;
        }
        j31 j31VarC = h9.c(this, hv.s);
        if (j31VarC instanceof hv) {
            return (hv) j31VarC;
        }
        return null;
    }

    @Override // defpackage.j31
    public final Object o() {
        return t;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        hv hvVarA0;
        this.s = nc0Var;
        if (this.r) {
            if (!nc0Var.O0().q) {
                hv hvVarA02 = A0();
                if (hvVarA02 != null) {
                    hvVarA02.A0(null);
                    return;
                }
                return;
            }
            nc0 nc0Var2 = this.s;
            if (nc0Var2 == null || !nc0Var2.O0().q || (hvVarA0 = A0()) == null) {
                return;
            }
            hvVarA0.A0(this.s);
        }
    }
}
