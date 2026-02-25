package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class po extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                c10.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                b8.o(view);
                throw null;
        }
    }
}
