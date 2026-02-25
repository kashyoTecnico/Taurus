package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class a61 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(View view, v61 v61Var) {
        view.setWindowInsetsAnimationCallback(v61Var != null ? new w61(v61Var) : null);
    }
}
