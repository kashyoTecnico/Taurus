package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qb extends d90 implements jb, b30, j31 {
    public static final v71 t = new v71(10);
    public oj r;
    public boolean s;

    public static final xl0 A0(qb qbVar, nc0 nc0Var, gw gwVar) {
        xl0 xl0Var;
        if (qbVar.q && qbVar.s) {
            nc0 nc0VarY = d80.y(qbVar);
            if (!nc0Var.O0().q) {
                nc0Var = null;
            }
            if (nc0Var != null && (xl0Var = (xl0) gwVar.a()) != null) {
                float f = nc0VarY.P(nc0Var, false).a;
                return xl0Var.h((Float.floatToRawIntBits(r4.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.jb
    public final Object l(nc0 nc0Var, gw gwVar, mk mkVar) {
        Object objQ = nm.q(new pb(this, nc0Var, gwVar, new ea(this, nc0Var, gwVar), null), mkVar);
        return objQ == xl.d ? objQ : j41.a;
    }

    @Override // defpackage.b30
    public final void n(d30 d30Var) {
        this.s = true;
    }

    @Override // defpackage.j31
    public final Object o() {
        return t;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }
}
