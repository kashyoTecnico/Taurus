package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gw gwVar = (gw) obj;
                if (gwVar != null) {
                    gwVar.a();
                    break;
                }
                break;
            default:
                ((ld0) obj).a();
                break;
        }
    }
}
