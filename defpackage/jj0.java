package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jj0 extends d90 implements j31, qj0, pi {
    public n6 r;
    public boolean s;

    public final void A0() {
        n6 n6Var;
        dm0 dm0Var = new dm0();
        h9.m(this, new uu(dm0Var));
        jj0 jj0Var = (jj0) dm0Var.d;
        if (jj0Var == null || (n6Var = jj0Var.r) == null) {
            n6Var = this.r;
        }
        B0(n6Var);
    }

    public final void B0(kj0 kj0Var) {
        lj0 lj0Var = (lj0) l81.A(this, ti.u);
        if (lj0Var != null) {
            k3 k3Var = (k3) lj0Var;
            if (kj0Var == null) {
                kj0.a.getClass();
                kj0Var = d80.d;
            }
            a4.a.a(k3Var.a, kj0Var);
        }
    }

    public final void C0() {
        zl0 zl0Var = new zl0();
        zl0Var.d = true;
        h9.n(this, new pp(zl0Var, 1));
        if (zl0Var.d) {
            A0();
        }
    }

    public final void D0() {
        if (this.s) {
            this.s = false;
            if (this.q) {
                dm0 dm0Var = new dm0();
                h9.m(this, new h3(dm0Var, 1));
                jj0 jj0Var = (jj0) dm0Var.d;
                if (jj0Var != null) {
                    jj0Var.A0();
                } else {
                    B0(null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        if (hj0Var == hj0.e) {
            ?? r4 = gj0Var.a;
            int size = r4.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((nj0) r4.get(i)).i;
                if (i2 != 3 && i2 != 4) {
                    int i3 = gj0Var.c;
                    if (i3 == 4) {
                        this.s = true;
                        C0();
                        return;
                    } else {
                        if (i3 == 5) {
                            D0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.qj0
    public final void b0() {
        D0();
    }

    @Override // defpackage.j31
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.qj0
    public final long q() {
        int i = t21.b;
        return t21.a;
    }

    @Override // defpackage.d90
    public final void t0() {
        D0();
    }
}
