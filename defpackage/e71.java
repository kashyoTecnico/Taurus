package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class e71 extends d71 {
    public d00 f;

    public e71(n71 n71Var, WindowInsets windowInsets) {
        super(n71Var, windowInsets);
        this.f = null;
    }

    @Override // defpackage.k71
    public n71 b() {
        return n71.c(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.k71
    public n71 c() {
        return n71.c(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.k71
    public final d00 h() {
        if (this.f == null) {
            WindowInsets windowInsets = this.c;
            this.f = d00.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f;
    }

    @Override // defpackage.k71
    public boolean k() {
        return this.c.isConsumed();
    }
}
