package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a4 {
    public static final a4 a = new a4();

    public final void a(View view, kj0 kj0Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = kj0Var instanceof n6 ? PointerIcon.getSystemIcon(context, ((n6) kj0Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (c10.i(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
