package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mm0 implements wl, im0 {
    public static final cd g = new cd(0);
    public final ml d;
    public final mm0 e = this;
    public volatile ml f;

    public mm0(ml mlVar) {
        this.d = mlVar;
    }

    public final void a() {
        synchronized (this.e) {
            try {
                ml mlVar = this.f;
                if (mlVar == null) {
                    this.f = g;
                } else {
                    ew ewVar = new ew(0);
                    r10 r10Var = (r10) mlVar.n(g2.E);
                    if (r10Var != null) {
                        r10Var.a(ewVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.im0
    public final void d() {
        a();
    }

    @Override // defpackage.im0
    public final void f() {
        a();
    }

    @Override // defpackage.wl
    public final ml g() {
        ml mlVarK;
        ml mlVar = this.f;
        if (mlVar == null || mlVar == g) {
            li liVar = (li) this.d.n(li.e);
            ml lm0Var = liVar != null ? new lm0(liVar, this) : is.d;
            synchronized (this.e) {
                try {
                    ml mlVar2 = this.f;
                    if (mlVar2 == null) {
                        ml mlVar3 = this.d;
                        mlVarK = mlVar3.k(new t10((r10) mlVar3.n(g2.E))).k(is.d).k(lm0Var);
                    } else if (mlVar2 == g) {
                        ml mlVar4 = this.d;
                        t10 t10Var = new t10((r10) mlVar4.n(g2.E));
                        t10Var.A(new ew(0));
                        mlVarK = mlVar4.k(t10Var).k(is.d).k(lm0Var);
                    } else {
                        mlVarK = mlVar2;
                    }
                    this.f = mlVarK;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mlVar = mlVarK;
        }
        c10.m(mlVar);
        return mlVar;
    }

    @Override // defpackage.im0
    public final void c() {
    }
}
