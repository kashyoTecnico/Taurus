package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class l7 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ m7 d;

    public l7(m7 m7Var) {
        this.d = m7Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.g.removeCallbacks(this);
        m7.h(this.d);
        m7 m7Var = this.d;
        synchronized (m7Var.h) {
            if (m7Var.m) {
                m7Var.m = false;
                ArrayList arrayList = m7Var.j;
                m7Var.j = m7Var.k;
                m7Var.k = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m7.h(this.d);
        m7 m7Var = this.d;
        synchronized (m7Var.h) {
            if (m7Var.j.isEmpty()) {
                m7Var.f.removeFrameCallback(this);
                m7Var.m = false;
            }
        }
    }
}
