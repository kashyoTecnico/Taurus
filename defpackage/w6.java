package defpackage;

import android.view.View;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w6 extends un0 implements qn0 {
    public pn0 B;
    public rn0 C;

    @Override // defpackage.un0
    public final void A0(fk0 fk0Var, long j, float f) {
        pn0 pn0VarA = this.B;
        if (pn0VarA == null) {
            pn0VarA = yn0.a(yn0.b((View) l81.A(this, m4.f)));
            this.B = pn0VarA;
        }
        rn0 rn0VarA = pn0VarA.a(this);
        int iB = d80.B(f);
        long jA = this.u.a();
        this.v.a();
        rn0VarA.b(fk0Var, this.s, j, iB, jA, 0.1f, new b(3, this));
        this.C = rn0VarA;
        m20.F(this);
    }

    @Override // defpackage.un0
    public final void B0(v30 v30Var) {
        dd ddVarO = v30Var.d.e.o();
        rn0 rn0Var = this.C;
        if (rn0Var != null) {
            long j = this.y;
            long jA = this.u.a();
            this.v.a();
            rn0Var.e(0.1f, j, jA);
            rn0Var.draw(u2.a(ddVarO));
        }
    }

    @Override // defpackage.un0
    public final void D0(fk0 fk0Var) {
        rn0 rn0Var = this.C;
        if (rn0Var != null) {
            rn0Var.d();
        }
    }

    @Override // defpackage.qn0
    public final void d0() {
        this.C = null;
        m20.F(this);
    }

    @Override // defpackage.d90
    public final void t0() {
        pn0 pn0Var = this.B;
        if (pn0Var != null) {
            d0();
            xz xzVar = pn0Var.g;
            rn0 rn0Var = (rn0) ((LinkedHashMap) xzVar.e).get(this);
            if (rn0Var != null) {
                rn0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xzVar.e;
                rn0 rn0Var2 = (rn0) linkedHashMap.get(this);
                if (rn0Var2 != null) {
                }
                linkedHashMap.remove(this);
                pn0Var.f.add(rn0Var);
            }
        }
    }
}
