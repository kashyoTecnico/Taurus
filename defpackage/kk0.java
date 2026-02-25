package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kk0 extends l implements lk0, ld {
    public final gc g;

    public kk0(ml mlVar, gc gcVar) {
        super(mlVar, true);
        this.g = gcVar;
    }

    @Override // defpackage.y10
    public final void C(CancellationException cancellationException) {
        this.g.g(cancellationException, true);
        A(cancellationException);
    }

    @Override // defpackage.y10, defpackage.r10, defpackage.ll0
    public final void a(CancellationException cancellationException) {
        Object obj = y10.d.get(this);
        if (obj instanceof eg) {
            return;
        }
        if ((obj instanceof x10) && ((x10) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new s10(E(), null, this);
        }
        C(cancellationException);
    }

    @Override // defpackage.vt0
    public final Object c(lk lkVar, Object obj) {
        return this.g.c(lkVar, obj);
    }

    @Override // defpackage.l
    public final void e0(Throwable th, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.g.g(th, false) || z) {
            return;
        }
        c4.u(this.f, th);
    }

    @Override // defpackage.l
    public final void f0(Object obj) {
        this.g.g(null, false);
    }

    @Override // defpackage.ll0
    public final fc iterator() {
        gc gcVar = this.g;
        gcVar.getClass();
        return new fc(gcVar);
    }

    @Override // defpackage.ll0
    public final Object o(jy0 jy0Var) {
        return this.g.o(jy0Var);
    }

    @Override // defpackage.ll0
    public final Object s() {
        return this.g.s();
    }

    @Override // defpackage.vt0
    public final Object u(Object obj) {
        return this.g.u(obj);
    }
}
