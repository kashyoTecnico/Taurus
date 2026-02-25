package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class d71 extends k71 {
    public final WindowInsets c;
    public d00 d;
    public int e;

    public d71(n71 n71Var, WindowInsets windowInsets) {
        super(n71Var);
        this.d = null;
        this.c = windowInsets;
    }

    public static boolean q(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.k71
    public final d00 i() {
        if (this.d == null) {
            WindowInsets windowInsets = this.c;
            this.d = d00.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.k71
    public boolean l() {
        return this.c.isRound();
    }

    @Override // defpackage.k71
    public void p(int i) {
        this.e = i;
    }

    @Override // defpackage.k71
    public void n(d00[] d00VarArr) {
    }

    @Override // defpackage.k71
    public void o(n71 n71Var) {
    }
}
