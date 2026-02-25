package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x71 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ sl0 e;

    public x71(View view, sl0 sl0Var) {
        this.d = view;
        this.e = sl0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.removeOnAttachStateChangeListener(this);
        this.e.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
