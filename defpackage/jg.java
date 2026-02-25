package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements d50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jg(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) {
        switch (this.d) {
            case 0:
                sd0 sd0Var = (sd0) this.e;
                sg sgVar = (sg) this.f;
                if (y40Var == y40.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = sgVar.getOnBackInvokedDispatcher();
                    c10.o(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
                    sd0Var.a(onBackInvokedDispatcher);
                    break;
                }
                break;
            default:
                e9 e9Var = (e9) this.e;
                z40 z40Var = (z40) this.f;
                e9Var.getClass();
                hg hgVar = (hg) e9Var.b;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e9Var.c;
                y40.Companion.getClass();
                int iOrdinal = z40Var.ordinal();
                if (y40Var != (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : y40.ON_RESUME : y40.ON_START : y40.ON_CREATE)) {
                    y40 y40Var2 = y40.ON_DESTROY;
                    if (y40Var != y40Var2) {
                        int iOrdinal2 = z40Var.ordinal();
                        if (iOrdinal2 != 2) {
                            y40Var2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : y40.ON_PAUSE : y40.ON_STOP;
                        }
                        if (y40Var == y40Var2) {
                            copyOnWriteArrayList.remove((Object) null);
                            hgVar.run();
                            break;
                        }
                    } else {
                        e9Var.x();
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    hgVar.run();
                    break;
                }
                break;
        }
    }
}
