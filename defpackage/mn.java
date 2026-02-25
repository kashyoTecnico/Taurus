package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class mn extends d90 {
    public final int r = oc0.e(this);
    public d90 s;

    public final void A0(ln lnVar) {
        d90 d90Var = ((d90) lnVar).d;
        if (d90Var != lnVar) {
            d90 d90Var2 = lnVar instanceof d90 ? (d90) lnVar : null;
            d90 d90Var3 = d90Var2 != null ? d90Var2.h : null;
            if (d90Var != this.d || !c10.i(d90Var3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (d90Var.q) {
            pz.b("Cannot delegate to an already attached node");
        }
        d90Var.y0(this.d);
        int i = this.f;
        int iF = oc0.f(d90Var);
        d90Var.f = iF;
        int i2 = this.f;
        int i3 = iF & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof l30)) {
            pz.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + d90Var);
        }
        d90Var.i = this.s;
        this.s = d90Var;
        d90Var.h = this;
        C0(iF | this.f, false);
        if (this.q) {
            if (i3 == 0 || (i & 2) != 0) {
                z0(this.k);
            } else {
                jc0 jc0Var = d80.z(this).G;
                this.d.z0(null);
                jc0Var.g();
            }
            d90Var.q0();
            d90Var.w0();
            if (!d90Var.q) {
                pz.b("autoInvalidateInsertedNode called on unattached node");
            }
            oc0.a(d90Var, -1, 1);
        }
    }

    public final void B0(ln lnVar) {
        d90 d90Var = null;
        for (d90 d90Var2 = this.s; d90Var2 != null; d90Var2 = d90Var2.i) {
            if (d90Var2 == lnVar) {
                boolean z = d90Var2.q;
                if (z) {
                    la0 la0Var = oc0.a;
                    if (!z) {
                        pz.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    oc0.a(d90Var2, -1, 2);
                    d90Var2.x0();
                    d90Var2.r0();
                }
                d90Var2.y0(d90Var2);
                d90Var2.g = 0;
                if (d90Var == null) {
                    this.s = d90Var2.i;
                } else {
                    d90Var.i = d90Var2.i;
                }
                d90Var2.i = null;
                d90Var2.h = null;
                int i = this.f;
                int iF = oc0.f(this);
                C0(iF, true);
                if (this.q && (i & 2) != 0 && (iF & 2) == 0) {
                    jc0 jc0Var = d80.z(this).G;
                    this.d.z0(null);
                    jc0Var.g();
                    return;
                }
                return;
            }
            d90Var = d90Var2;
        }
        throw new IllegalStateException(("Could not find delegate: " + lnVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void C0(int i, boolean z) {
        d90 d90Var;
        int i2 = this.f;
        this.f = i;
        if (i2 != i) {
            d90 d90Var2 = this.d;
            if (d90Var2 == this) {
                this.g = i;
            }
            boolean z2 = this.q;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f;
                    r2.f = i;
                    if (r2 == d90Var2) {
                        break;
                    } else {
                        r2 = r2.h;
                    }
                }
                if (z && r2 == d90Var2) {
                    i = oc0.f(d90Var2);
                    d90Var2.f = i;
                }
                int i3 = i | ((r2 == 0 || (d90Var = r2.i) == null) ? 0 : d90Var.g);
                for (d90 d90Var3 = r2; d90Var3 != null; d90Var3 = d90Var3.h) {
                    i3 |= d90Var3.f;
                    d90Var3.g = i3;
                }
            }
        }
    }

    @Override // defpackage.d90
    public final void q0() {
        super.q0();
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.z0(this.k);
            if (!d90Var.q) {
                d90Var.q0();
            }
        }
    }

    @Override // defpackage.d90
    public final void r0() {
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.r0();
        }
        super.r0();
    }

    @Override // defpackage.d90
    public final void v0() {
        super.v0();
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.v0();
        }
    }

    @Override // defpackage.d90
    public final void w0() {
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.w0();
        }
        super.w0();
    }

    @Override // defpackage.d90
    public final void x0() {
        super.x0();
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.x0();
        }
    }

    @Override // defpackage.d90
    public final void y0(d90 d90Var) {
        this.d = d90Var;
        for (d90 d90Var2 = this.s; d90Var2 != null; d90Var2 = d90Var2.i) {
            d90Var2.y0(d90Var);
        }
    }

    @Override // defpackage.d90
    public final void z0(nc0 nc0Var) {
        this.k = nc0Var;
        for (d90 d90Var = this.s; d90Var != null; d90Var = d90Var.i) {
            d90Var.z0(nc0Var);
        }
    }
}
