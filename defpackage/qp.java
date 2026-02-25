package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qp extends d90 implements j31, b30 {
    public qp r;
    public qp s;
    public long t;

    public final boolean A0(r1 r1Var) {
        qp qpVar = this.r;
        if (qpVar != null) {
            return qpVar.A0(r1Var);
        }
        qp qpVar2 = this.s;
        if (qpVar2 != null) {
            return qpVar2.A0(r1Var);
        }
        return false;
    }

    public final void B0(r1 r1Var) {
        qp qpVar = this.s;
        if (qpVar != null) {
            qpVar.B0(r1Var);
            return;
        }
        qp qpVar2 = this.r;
        if (qpVar2 != null) {
            qpVar2.B0(r1Var);
        }
    }

    public final void C0(r1 r1Var) {
        qp qpVar = this.s;
        if (qpVar != null) {
            qpVar.C0(r1Var);
        }
        qp qpVar2 = this.r;
        if (qpVar2 != null) {
            qpVar2.C0(r1Var);
        }
        this.r = null;
    }

    public final void D0(r1 r1Var) {
        j31 j31Var;
        qp qpVar;
        qp qpVar2 = this.r;
        if (qpVar2 == null || !b10.k(qpVar2, c10.K(r1Var))) {
            if (this.d.q) {
                dm0 dm0Var = new dm0();
                h9.n(this, new u7(dm0Var, this, r1Var, 4));
                j31Var = (j31) dm0Var.d;
            } else {
                j31Var = null;
            }
            qpVar = (qp) j31Var;
        } else {
            qpVar = qpVar2;
        }
        if (qpVar != null && qpVar2 == null) {
            qpVar.B0(r1Var);
            qpVar.D0(r1Var);
            qp qpVar3 = this.s;
            if (qpVar3 != null) {
                qpVar3.C0(r1Var);
            }
        } else if (qpVar == null && qpVar2 != null) {
            qp qpVar4 = this.s;
            if (qpVar4 != null) {
                qpVar4.B0(r1Var);
                qpVar4.D0(r1Var);
            }
            qpVar2.C0(r1Var);
        } else if (!c10.i(qpVar, qpVar2)) {
            if (qpVar != null) {
                qpVar.B0(r1Var);
                qpVar.D0(r1Var);
            }
            if (qpVar2 != null) {
                qpVar2.C0(r1Var);
            }
        } else if (qpVar != null) {
            qpVar.D0(r1Var);
        } else {
            qp qpVar5 = this.s;
            if (qpVar5 != null) {
                qpVar5.D0(r1Var);
            }
        }
        this.r = qpVar;
    }

    public final void E0(r1 r1Var) {
        qp qpVar = this.s;
        if (qpVar != null) {
            qpVar.E0(r1Var);
            return;
        }
        qp qpVar2 = this.r;
        if (qpVar2 != null) {
            qpVar2.E0(r1Var);
        }
    }

    @Override // defpackage.j31
    public final Object o() {
        return g2.x;
    }

    @Override // defpackage.b30
    public final void r(long j) {
        this.t = j;
    }

    @Override // defpackage.d90
    public final void t0() {
        this.s = null;
        this.r = null;
    }
}
