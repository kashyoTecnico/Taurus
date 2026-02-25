package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class qx implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qx(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        switch (this.d) {
            case 0:
                ((sx) this.e).f.removeCallbacks((rx) this.f);
                break;
            case 1:
                oi oiVar = (oi) this.e;
                ua0 ua0Var = (ua0) this.f;
                oiVar.z(obj);
                if (ua0Var != null) {
                    ua0Var.a(obj);
                }
                return j41.a;
            default:
                sl0 sl0Var = (sl0) this.e;
                Throwable th = (Throwable) this.f;
                Throwable th2 = (Throwable) obj;
                synchronized (sl0Var.b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                c10.h(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    sl0Var.d = th;
                    zw0 zw0Var = sl0Var.t;
                    ol0 ol0Var = ol0.d;
                    zw0Var.getClass();
                    zw0Var.h(null, ol0Var);
                    break;
                }
        }
        return j41.a;
    }
}
