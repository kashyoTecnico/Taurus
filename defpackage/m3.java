package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m3 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ p3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(p3 p3Var, int i) {
        super(0);
        this.e = i;
        this.f = p3Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        int actionMasked;
        switch (this.e) {
            case 0:
                p3 p3Var = this.f;
                MotionEvent motionEvent = p3Var.t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    p3Var.u0 = SystemClock.uptimeMillis();
                    p3Var.post(p3Var.z0);
                }
                return j41.a;
            default:
                return this.f.get_viewTreeOwners();
        }
    }
}
