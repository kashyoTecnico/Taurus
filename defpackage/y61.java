package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class y61 extends c71 {
    public final WindowInsets.Builder b = new WindowInsets.Builder();

    @Override // defpackage.c71
    public n71 b() {
        a();
        n71 n71VarC = n71.c(null, this.b.build());
        n71VarC.a.n(null);
        return n71VarC;
    }

    @Override // defpackage.c71
    public void c(d00 d00Var) {
        this.b.setMandatorySystemGestureInsets(d00Var.d());
    }

    @Override // defpackage.c71
    public void d(d00 d00Var) {
        this.b.setSystemGestureInsets(d00Var.d());
    }

    @Override // defpackage.c71
    public void e(d00 d00Var) {
        this.b.setSystemWindowInsets(d00Var.d());
    }

    @Override // defpackage.c71
    public void f(d00 d00Var) {
        this.b.setTappableElementInsets(d00Var.d());
    }
}
