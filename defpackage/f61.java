package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class f61 {
    public final g61 a = new g61();

    public final void a() {
        g61 g61Var = this.a;
        if (g61Var == null || g61Var.d) {
            return;
        }
        g61Var.d = true;
        synchronized (g61Var.a) {
            try {
                Iterator it = g61Var.b.values().iterator();
                while (it.hasNext()) {
                    g61.a((AutoCloseable) it.next());
                }
                Iterator it2 = g61Var.c.iterator();
                while (it2.hasNext()) {
                    g61.a((AutoCloseable) it2.next());
                }
                g61Var.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
