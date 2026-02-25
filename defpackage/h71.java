package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class h71 extends g71 {
    public static final n71 g = n71.c(null, WindowInsets.CONSUMED);

    public h71(n71 n71Var, WindowInsets windowInsets) {
        super(n71Var, windowInsets);
    }

    @Override // defpackage.k71
    public d00 f(int i) {
        return d00.c(this.c.getInsets(l71.a(i)));
    }

    @Override // defpackage.k71
    public d00 g(int i) {
        return d00.c(this.c.getInsetsIgnoringVisibility(l71.a(i)));
    }

    @Override // defpackage.k71
    public boolean m(int i) {
        return this.c.isVisible(l71.a(i));
    }

    @Override // defpackage.k71
    public final void d(View view) {
    }
}
