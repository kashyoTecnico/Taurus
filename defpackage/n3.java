package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n3 implements Runnable {
    public final /* synthetic */ p3 d;

    public n3(p3 p3Var) {
        this.d = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.d;
        p3Var.removeCallbacks(this);
        MotionEvent motionEvent = p3Var.t0;
        if (motionEvent != null) {
            boolean z = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            p3 p3Var2 = this.d;
            p3Var2.E(motionEvent, i, p3Var2.u0, false);
        }
    }
}
