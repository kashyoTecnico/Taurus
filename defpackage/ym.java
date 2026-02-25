package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ym implements yx {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ ym(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.yx
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.performHapticFeedback(9);
                break;
            default:
                ((p3) this.b).performHapticFeedback(9);
                break;
        }
    }
}
