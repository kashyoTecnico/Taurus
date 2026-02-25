package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class m7 extends pl {
    public static final qy0 p = m20.J(d4.n);
    public static final k7 q = new k7(0);
    public final Choreographer f;
    public final Handler g;
    public boolean l;
    public boolean m;
    public final o7 o;
    public final Object h = new Object();
    public final q9 i = new q9();
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public final l7 n = new l7(this);

    public m7(Choreographer choreographer, Handler handler) {
        this.f = choreographer;
        this.g = handler;
        this.o = new o7(choreographer, this);
    }

    public static final void h(m7 m7Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (m7Var.h) {
                q9 q9Var = m7Var.i;
                runnable = (Runnable) (q9Var.isEmpty() ? null : q9Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (m7Var.h) {
                    q9 q9Var2 = m7Var.i;
                    runnable = (Runnable) (q9Var2.isEmpty() ? null : q9Var2.removeFirst());
                }
            }
            synchronized (m7Var.h) {
                if (m7Var.i.isEmpty()) {
                    z = false;
                    m7Var.l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.pl
    public final void d(ml mlVar, Runnable runnable) {
        synchronized (this.h) {
            this.i.addLast(runnable);
            if (!this.l) {
                this.l = true;
                this.g.post(this.n);
                if (!this.m) {
                    this.m = true;
                    this.f.postFrameCallback(this.n);
                }
            }
        }
    }
}
