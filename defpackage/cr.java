package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class cr {
    public void a(uy0 uy0Var, uy0 uy0Var2, Window window, View view, boolean z, boolean z2) {
        c10.p(uy0Var, "statusBarStyle");
        c10.p(uy0Var2, "navigationBarStyle");
        c10.p(window, "window");
        c10.p(view, "view");
        mq0.k(window, false);
        window.setStatusBarColor(z ? uy0Var.b : uy0Var.a);
        window.setNavigationBarColor(z2 ? uy0Var2.b : uy0Var2.a);
        k51 k51Var = new k51(window, view);
        k51Var.d(!z);
        k51Var.c(!z2);
    }
}
