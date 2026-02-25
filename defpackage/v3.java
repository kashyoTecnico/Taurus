package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class v3 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ w3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(w3 w3Var, int i) {
        super(1);
        this.e = i;
        this.f = w3Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                w3 w3Var = this.f;
                return Boolean.valueOf(w3Var.d.getParent().requestSendAccessibilityEvent(w3Var.d, (AccessibilityEvent) obj));
            default:
                oq0 oq0Var = (oq0) obj;
                if (oq0Var.e.contains(oq0Var)) {
                    w3 w3Var2 = this.f;
                    w3Var2.d.getSnapshotObserver().a(oq0Var, w3Var2.P, new g3(1, oq0Var, w3Var2));
                }
                return j41.a;
        }
    }
}
