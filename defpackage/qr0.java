package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qr0 extends mn implements l30, qq, xw {
    public bs0 t;
    public final tz0 u;

    public qr0(q8 q8Var, c21 c21Var, jv jvVar, iw iwVar, int i, boolean z, int i2, int i3, bs0 bs0Var) {
        this.t = bs0Var;
        tz0 tz0Var = new tz0(q8Var, c21Var, jvVar, iwVar, i, z, i2, i3, bs0Var);
        A0(tz0Var);
        this.u = tz0Var;
        if (this.t == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        return this.u.C(v60Var, g80Var, i);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        return this.u.P(v60Var, g80Var, i);
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        this.u.d(v30Var);
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        return this.u.e(n80Var, g80Var, j);
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        return this.u.f(v60Var, g80Var, i);
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        return this.u.m(v60Var, g80Var, i);
    }

    @Override // defpackage.xw
    public final void u(nc0 nc0Var) {
        bs0 bs0Var = this.t;
        if (bs0Var != null) {
            bs0Var.g = xz.j(bs0Var.g, nc0Var, null, 2);
            ys0 ys0Var = bs0Var.e;
            long j = bs0Var.d;
            zs0 zs0Var = (zs0) ys0Var;
            zs0Var.a = false;
            yr0 yr0Var = zs0Var.e;
            if (yr0Var != null) {
                yr0Var.g(Long.valueOf(j));
            }
        }
    }
}
