package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class x51 {
    public static n71 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        n71 n71VarC = n71.c(null, rootWindowInsets);
        k71 k71Var = n71VarC.a;
        k71Var.o(n71VarC);
        k71Var.d(view.getRootView());
        return n71VarC;
    }
}
