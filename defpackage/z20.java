package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z20 implements im0, ql {
    public final ml d;
    public final kw e;
    public final kk f;
    public rw0 g;

    public z20(ml mlVar, kw kwVar) {
        this.d = mlVar;
        this.e = kwVar;
        this.f = nm.d(mlVar.k(mlVar.n(li.e) != null ? this : is.d));
    }

    @Override // defpackage.im0
    public final void c() {
        rw0 rw0Var = this.g;
        if (rw0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            rw0Var.a(cancellationException);
        }
        this.g = nm.z(this.f, null, this.e, 3);
    }

    @Override // defpackage.im0
    public final void d() {
        rw0 rw0Var = this.g;
        if (rw0Var != null) {
            rw0Var.C(new ew(1));
        }
        this.g = null;
    }

    @Override // defpackage.im0
    public final void f() {
        rw0 rw0Var = this.g;
        if (rw0Var != null) {
            rw0Var.C(new ew(1));
        }
        this.g = null;
    }

    @Override // defpackage.kl
    public final ll getKey() {
        return g2.w;
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        return d80.v(this, mlVar);
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        return d80.r(this, llVar);
    }

    @Override // defpackage.ql
    public final void p(ml mlVar, Throwable th) throws Throwable {
        li liVar = (li) mlVar.n(li.e);
        if (liVar != null) {
            d80.H(th, new ki(0, liVar, this));
        }
        ql qlVar = (ql) this.d.n(g2.w);
        if (qlVar == null) {
            throw th;
        }
        qlVar.p(mlVar, th);
    }

    @Override // defpackage.ml
    public final Object r(kw kwVar, Object obj) {
        return kwVar.e(obj, this);
    }

    @Override // defpackage.ml
    public final ml v(ll llVar) {
        return d80.u(this, llVar);
    }
}
