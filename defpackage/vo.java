package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class vo extends kz0 {
    public int f;

    public vo(int i) {
        super(0L, false);
        this.f = i;
    }

    public abstract lk c();

    public Throwable e(Object obj) {
        eg egVar = obj instanceof eg ? (eg) obj : null;
        if (egVar != null) {
            return egVar.a;
        }
        return null;
    }

    public final void i(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c4.u(c().f(), new am("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            lk lkVarC = c();
            c10.n(lkVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            to toVar = (to) lkVarC;
            mk mkVar = toVar.h;
            Object obj = toVar.j;
            ml mlVarF = mkVar.f();
            Object objK0 = b10.k0(mlVarF, obj);
            r10 r10Var = null;
            g41 g41VarE0 = objK0 != b10.n ? r31.e0(mkVar, mlVarF, objK0) : null;
            try {
                ml mlVarF2 = mkVar.f();
                Object objJ = j();
                Throwable thE = e(objJ);
                if (thE == null) {
                    int i = this.f;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        r10Var = (r10) mlVarF2.n(g2.E);
                    }
                }
                if (r10Var != null && !r10Var.b()) {
                    CancellationException cancellationExceptionQ = r10Var.q();
                    b(cancellationExceptionQ);
                    mkVar.h(c10.z(cancellationExceptionQ));
                } else if (thE != null) {
                    mkVar.h(c10.z(thE));
                } else {
                    mkVar.h(g(objJ));
                }
                if (g41VarE0 != null && !g41VarE0.h0()) {
                    return;
                }
                b10.f0(mlVarF, objK0);
            } catch (Throwable th) {
                if (g41VarE0 == null || g41VarE0.h0()) {
                    b10.f0(mlVarF, objK0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
