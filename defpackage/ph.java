package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ph implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ph(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rw0) obj).a(null);
                break;
            default:
                u01 u01Var = (u01) obj;
                if (u01Var != null) {
                    r40 r40Var = u01Var.d;
                    if (r40Var != null) {
                        r40Var.e(w11.b);
                    }
                    r40 r40Var2 = u01Var.d;
                    if (r40Var2 != null) {
                        r40Var2.f(w11.b);
                        break;
                    }
                }
                break;
        }
    }
}
