package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class xs extends pl {
    public static final /* synthetic */ int i = 0;
    public long f;
    public boolean g;
    public q9 h;

    public final void h(boolean z) {
        long j = this.f - (z ? 4294967296L : 1L);
        this.f = j;
        if (j <= 0 && this.g) {
            shutdown();
        }
    }

    public final void l(vo voVar) {
        q9 q9Var = this.h;
        if (q9Var == null) {
            q9Var = new q9();
            this.h = q9Var;
        }
        q9Var.addLast(voVar);
    }

    public abstract Thread m();

    public final void o(boolean z) {
        this.f = (z ? 4294967296L : 1L) + this.f;
        if (z) {
            return;
        }
        this.g = true;
    }

    public abstract long s();

    public abstract void shutdown();

    public final boolean u() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        q9 q9Var = this.h;
        if (q9Var == null) {
            return false;
        }
        vo voVar = (vo) (q9Var.isEmpty() ? null : q9Var.removeFirst());
        if (voVar == null) {
            return false;
        }
        voVar.run();
        return true;
    }

    public void y(long j, us usVar) {
        tm.m.D(j, usVar);
    }
}
