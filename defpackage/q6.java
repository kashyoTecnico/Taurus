package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q6 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ wj0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(wj0 wj0Var, int i) {
        super(1);
        this.e = i;
        this.f = wj0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.e) {
            case 0:
                d30 d30VarM = ((d30) obj).m();
                c10.m(d30VarM);
                this.f.l(d30VarM);
                break;
            case 1:
                t00 t00Var = new t00(((t00) obj).a);
                wj0 wj0Var = this.f;
                wj0Var.m7setPopupContentSizefhxjrPA(t00Var);
                wj0Var.m();
                break;
            default:
                gw gwVar = (gw) obj;
                wj0 wj0Var2 = this.f;
                Handler handler = wj0Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    gwVar.a();
                } else {
                    Handler handler2 = wj0Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p1(gwVar, 2));
                    }
                }
                break;
        }
        return j41.a;
    }
}
