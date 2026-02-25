package defpackage;

import androidx.compose.foundation.text.handwriting.a;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rx0 extends mn implements l30, qj0, iu {
    public gw t;
    public boolean u;
    public final py0 v;

    public rx0(gw gwVar) {
        this.t = gwVar;
        c cVar = new c(this, null, 19);
        gj0 gj0Var = ly0.a;
        py0 py0Var = new py0(null, null, my0.a);
        py0Var.t = cVar;
        A0(py0Var);
        this.v = py0Var;
    }

    @Override // defpackage.qj0
    public final void H(gj0 gj0Var, hj0 hj0Var, long j) {
        this.v.H(gj0Var, hj0Var, j);
    }

    @Override // defpackage.iu
    public final void S(yu yuVar) {
        this.u = yuVar.a();
    }

    @Override // defpackage.qj0
    public final void b0() {
        this.v.b0();
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        int iN = n80Var.N(a.a);
        int iN2 = n80Var.N(a.b);
        int i = iN2 * 2;
        int i2 = iN * 2;
        oi0 oi0VarE = g80Var.e(hj.i(j, i, i2));
        int i3 = oi0VarE.e - i2;
        return n80Var.a0(oi0VarE.d - i, i3, ls.d, new z80(oi0VarE, iN2, iN));
    }
}
