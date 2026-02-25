package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v51 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ kd0 a;

    public v51(View view, kd0 kd0Var) {
        this.a = kd0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.a(view, n71.c(view, windowInsets)).b();
    }
}
