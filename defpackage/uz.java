package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class uz extends x60 {
    @Override // defpackage.x60
    public final void E0() {
        c70 c70Var = this.r.r.H.q;
        c10.m(c70Var);
        c70Var.r0();
    }

    @Override // defpackage.g80
    public final int S(int i) {
        xz xzVarS = this.r.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.j(t30Var.G.d, t30Var.k(), i);
    }

    @Override // defpackage.g80
    public final int X(int i) {
        xz xzVarS = this.r.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.d(t30Var.G.d, t30Var.k(), i);
    }

    @Override // defpackage.g80
    public final int b0(int i) {
        xz xzVarS = this.r.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.h(t30Var.G.d, t30Var.k(), i);
    }

    @Override // defpackage.g80
    public final oi0 e(long j) {
        i0(j);
        nc0 nc0Var = this.r;
        eb0 eb0VarX = nc0Var.r.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            c70 c70Var = ((t30) objArr[i2]).H.q;
            c10.m(c70Var);
            c70Var.m = r30.f;
        }
        t30 t30Var = nc0Var.r;
        x60.D0(this, t30Var.x.g(this, t30Var.k(), j));
        return this;
    }

    @Override // defpackage.g80
    public final int f(int i) {
        xz xzVarS = this.r.r.s();
        l80 l80VarN = xzVarS.n();
        t30 t30Var = (t30) xzVarS.e;
        return l80VarN.b(t30Var.G.d, t30Var.k(), i);
    }

    @Override // defpackage.v60
    public final int o0(iy iyVar) {
        c70 c70Var = this.r.r.H.q;
        c10.m(c70Var);
        u30 u30Var = c70Var.t;
        w30 w30Var = c70Var.i;
        if (w30Var.d == p30.e) {
            u30Var.d = true;
            if (u30Var.b) {
                w30Var.f = true;
                w30Var.g = true;
            }
        } else {
            u30Var.e = true;
        }
        uz uzVar = c70Var.o().S;
        if (uzVar != null) {
            uzVar.n = true;
        }
        c70Var.r();
        uz uzVar2 = c70Var.o().S;
        if (uzVar2 != null) {
            uzVar2.n = false;
        }
        Integer num = (Integer) u30Var.g.get(iyVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.w.h(iIntValue, iyVar);
        return iIntValue;
    }
}
