package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rx implements Runnable {
    public final /* synthetic */ int d = 0;
    public Runnable e;
    public final /* synthetic */ pl f;

    public rx(ad adVar, sx sxVar) {
        this.e = adVar;
        this.f = sxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.d) {
            case 0:
                ((ad) this.e).E((sx) this.f);
                break;
            default:
                j50 j50Var = (j50) this.f;
                pl plVar = j50Var.g;
                int i = 0;
                while (true) {
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        c4.u(is.d, th);
                    }
                    Runnable runnableH = j50Var.h();
                    if (runnableH != null) {
                        this.e = runnableH;
                        i++;
                        if (i >= 16 && plVar.f(j50Var)) {
                            plVar.d(j50Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
        }
    }

    public rx(j50 j50Var, Runnable runnable) {
        this.f = j50Var;
        this.e = runnable;
    }
}
