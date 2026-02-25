package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class md0 implements OnBackAnimationCallback {
    public final /* synthetic */ ld0 a;

    public md0(ld0 ld0Var) {
        this.a = ld0Var;
    }

    public final void onBackCancelled() {
        ld0 ld0Var = this.a;
        qb0 qb0Var = ld0Var.a;
        if (qb0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!ld0Var.b) {
            qb0Var.c(ld0Var, null);
        }
        tb0 tb0Var = qb0Var.b;
        tb0Var.getClass();
        if (ld0Var.equals(tb0Var.h) && -1 == tb0Var.g) {
            if (tb0Var.f == null) {
                tb0Var.c(-1);
            }
            tb0Var.f = null;
            tb0Var.g = 0;
            tb0Var.h = null;
            zw0 zw0Var = tb0Var.a;
            ub0 ub0Var = ub0.j;
            zw0Var.getClass();
            zw0Var.h(null, ub0Var);
        }
        ld0Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        c10.p(backEvent, "backEvent");
        pb0 pb0VarG = r31.g(backEvent);
        ld0 ld0Var = this.a;
        qb0 qb0Var = ld0Var.a;
        if (qb0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (ld0Var.b) {
            tb0 tb0Var = qb0Var.b;
            tb0Var.getClass();
            if (ld0Var.equals(tb0Var.h) && -1 == tb0Var.g) {
                if (tb0Var.f == null) {
                    tb0Var.c(-1);
                }
                zw0 zw0Var = tb0Var.a;
                vb0 vb0Var = new vb0(pb0VarG);
                zw0Var.getClass();
                zw0Var.h(null, vb0Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        c10.p(backEvent, "backEvent");
        pb0 pb0VarG = r31.g(backEvent);
        ld0 ld0Var = this.a;
        qb0 qb0Var = ld0Var.a;
        if (qb0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (ld0Var.b) {
            return;
        }
        qb0Var.c(ld0Var, pb0VarG);
        ld0Var.b = true;
    }
}
