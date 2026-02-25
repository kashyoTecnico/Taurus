package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d0 extends r31 {
    @Override // defpackage.r31
    public final void R(e0 e0Var, e0 e0Var2) {
        e0Var.b = e0Var2;
    }

    @Override // defpackage.r31
    public final void S(e0 e0Var, Thread thread) {
        e0Var.a = thread;
    }

    @Override // defpackage.r31
    public final boolean n(f0 f0Var, b0 b0Var) {
        b0 b0Var2 = b0.b;
        synchronized (f0Var) {
            try {
                if (f0Var.e != b0Var) {
                    return false;
                }
                f0Var.e = b0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r31
    public final boolean o(f0 f0Var, Object obj, Object obj2) {
        synchronized (f0Var) {
            try {
                if (f0Var.d != obj) {
                    return false;
                }
                f0Var.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r31
    public final boolean p(f0 f0Var, e0 e0Var, e0 e0Var2) {
        synchronized (f0Var) {
            try {
                if (f0Var.f != e0Var) {
                    return false;
                }
                f0Var.f = e0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
