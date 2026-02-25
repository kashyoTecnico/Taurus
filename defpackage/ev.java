package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ev extends mn implements iu, et0, xw, wu {
    public yu t;
    public final dv u;
    public final fv v;
    public final gv w;

    public ev(fa0 fa0Var) {
        dv dvVar = new dv();
        dvVar.r = fa0Var;
        A0(dvVar);
        this.u = dvVar;
        fv fvVar = new fv();
        A0(fvVar);
        this.v = fvVar;
        gv gvVar = new gv();
        A0(gvVar);
        this.w = gvVar;
        A0(new av(new zu(1, j10.a, j10.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
    }

    public final void D0(fa0 fa0Var) {
        lu luVar;
        dv dvVar = this.u;
        if (c10.i(dvVar.r, fa0Var)) {
            return;
        }
        fa0 fa0Var2 = dvVar.r;
        if (fa0Var2 != null && (luVar = dvVar.s) != null) {
            fa0Var2.b(new mu(luVar));
        }
        dvVar.s = null;
        dvVar.r = fa0Var;
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        yu yuVar = this.t;
        boolean z = false;
        if (yuVar != null && yuVar.a()) {
            z = true;
        }
        h20[] h20VarArr = nt0.a;
        ot0 ot0Var = lt0.k;
        h20 h20Var = nt0.a[4];
        ot0Var.a(ct0Var, Boolean.valueOf(z));
        ct0Var.d(bt0.u, new j0(null, new b(9, this)));
    }

    @Override // defpackage.iu
    public final void S(yu yuVar) {
        hv hvVarA0;
        if (c10.i(this.t, yuVar)) {
            return;
        }
        boolean zA = yuVar.a();
        lk lkVar = null;
        if (zA) {
            nm.z(o0(), null, new qm(this, lkVar, 1), 3);
        }
        if (this.q) {
            h9.i(this);
        }
        dv dvVar = this.u;
        fa0 fa0Var = dvVar.r;
        if (fa0Var != null) {
            if (zA) {
                lu luVar = dvVar.s;
                if (luVar != null) {
                    dvVar.A0(fa0Var, new mu(luVar));
                    dvVar.s = null;
                }
                lu luVar2 = new lu();
                dvVar.A0(fa0Var, luVar2);
                dvVar.s = luVar2;
            } else {
                lu luVar3 = dvVar.s;
                if (luVar3 != null) {
                    dvVar.A0(fa0Var, new mu(luVar3));
                    dvVar.s = null;
                }
            }
        }
        gv gvVar = this.w;
        if (zA != gvVar.r) {
            if (zA) {
                nc0 nc0Var = gvVar.s;
                if (nc0Var != null && nc0Var.O0().q && (hvVarA0 = gvVar.A0()) != null) {
                    hvVarA0.A0(gvVar.s);
                }
            } else {
                hv hvVarA02 = gvVar.A0();
                if (hvVarA02 != null) {
                    hvVarA02.A0(null);
                }
            }
            gvVar.r = zA;
        }
        fv fvVar = this.v;
        if (zA) {
            fvVar.getClass();
            dm0 dm0Var = new dm0();
            c4.A(fvVar, new g3(8, dm0Var, fvVar));
            if (dm0Var.d != null) {
                throw new ClassCastException();
            }
        }
        fvVar.getClass();
        this.t = yuVar;
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        this.w.u(nc0Var);
    }
}
