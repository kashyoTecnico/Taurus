package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j71 extends i71 {
    public static final n71 h = n71.c(null, WindowInsets.CONSUMED);

    public j71(n71 n71Var, WindowInsets windowInsets) {
        super(n71Var, windowInsets);
    }

    @Override // defpackage.h71, defpackage.k71
    public d00 f(int i) {
        return d00.c(this.c.getInsets(m71.a(i)));
    }

    @Override // defpackage.h71, defpackage.k71
    public d00 g(int i) {
        return d00.c(this.c.getInsetsIgnoringVisibility(m71.a(i)));
    }

    @Override // defpackage.h71, defpackage.k71
    public boolean m(int i) {
        return this.c.isVisible(m71.a(i));
    }
}
