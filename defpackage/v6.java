package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v6 implements im0, qn0, gz {
    public final ce d;
    public final za0 g;
    public final za0 h;
    public final ViewGroup i;
    public pn0 j;
    public final boolean e = true;
    public final float f = Float.NaN;
    public final zg0 k = qo0.n(null);
    public final zg0 l = qo0.n(Boolean.TRUE);
    public long m = 0;
    public int n = -1;
    public final b o = new b(2, this);

    public v6(za0 za0Var, za0 za0Var2, ViewGroup viewGroup) {
        this.d = new ce(new pk(za0Var2, 1), true);
        this.g = za0Var;
        this.h = za0Var2;
        this.i = viewGroup;
    }

    @Override // defpackage.im0
    public final void d() {
        pn0 pn0Var = this.j;
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

    @Override // defpackage.qn0
    public final void d0() {
        this.k.setValue(null);
    }

    @Override // defpackage.gz
    public final void e(v30 v30Var) {
        fd fdVar = v30Var.d;
        this.m = fdVar.c();
        float f = this.f;
        this.n = Float.isNaN(f) ? d80.B(nn0.a(v30Var, this.e, fdVar.c())) : fdVar.N(f);
        long j = ((bf) this.g.getValue()).a;
        float f2 = ((in0) this.h.getValue()).d;
        v30Var.a();
        this.d.a(v30Var, Float.isNaN(f) ? nn0.a(v30Var, true, fdVar.c()) : v30Var.A(f), j);
        dd ddVarO = fdVar.e.o();
        ((Boolean) this.l.getValue()).booleanValue();
        rn0 rn0Var = (rn0) this.k.getValue();
        if (rn0Var != null) {
            rn0Var.e(f2, fdVar.c(), j);
            rn0Var.draw(u2.a(ddVarO));
        }
    }

    @Override // defpackage.im0
    public final void f() {
        pn0 pn0Var = this.j;
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

    @Override // defpackage.im0
    public final void c() {
    }
}
