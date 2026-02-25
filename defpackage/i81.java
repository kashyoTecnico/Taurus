package defpackage;

import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class i81 implements gi, d50 {
    public final p3 d;
    public final oi e;
    public boolean f;
    public a50 g;
    public kw h = ih.a;

    public i81(p3 p3Var, oi oiVar) {
        this.d = p3Var;
        this.e = oiVar;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        if (y40Var == y40.ON_DESTROY) {
            e();
        } else {
            if (y40Var != y40.ON_CREATE || this.f) {
                return;
            }
            f(this.h);
        }
    }

    public final void e() {
        if (!this.f) {
            this.f = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            a50 a50Var = this.g;
            if (a50Var != null) {
                a50Var.b(this);
            }
        }
        this.e.l();
    }

    public final void f(kw kwVar) {
        this.d.setOnViewTreeOwnersAvailable(new d31(4, this, kwVar));
    }
}
