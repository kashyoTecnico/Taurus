package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zb implements j90 {
    public final g7 d;
    public Throwable f;
    public final Object e = new Object();
    public final z9 g = new z9(0);
    public ma0 h = new ma0();
    public ma0 i = new ma0();

    public zb(g7 g7Var) {
        this.d = g7Var;
    }

    public final void c(long j) {
        int i;
        ad adVar;
        Object objZ;
        synchronized (this.e) {
            try {
                ma0 ma0Var = this.h;
                this.h = this.i;
                this.i = ma0Var;
                z9 z9Var = this.g;
                do {
                    i = z9Var.get();
                } while (!z9Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = ma0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    xb xbVar = (xb) ma0Var.e(i3);
                    iw iwVar = xbVar.a;
                    if (iwVar != null && (adVar = xbVar.b) != null) {
                        try {
                            objZ = iwVar.g(Long.valueOf(j));
                        } catch (Throwable th) {
                            objZ = c10.z(th);
                        }
                        adVar.h(objZ);
                    }
                }
                ma0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.j90
    public final Object e(iw iwVar, mk mkVar) {
        int i;
        int i2;
        int i3;
        ad adVar = new ad(1, r31.I(mkVar));
        adVar.t();
        xb xbVar = new xb();
        xbVar.a = iwVar;
        xbVar.b = adVar;
        bm0 bm0Var = new bm0();
        bm0Var.d = -1;
        synchronized (this.e) {
            Throwable th = this.f;
            if (th != null) {
                adVar.h(c10.z(th));
            } else {
                z9 z9Var = this.g;
                do {
                    i = z9Var.get();
                    i2 = i + 1;
                } while (!z9Var.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                bm0Var.d = (i2 >>> 27) & 15;
                this.h.a(xbVar);
                adVar.v(new yb(xbVar, this, bm0Var));
                if (z) {
                    try {
                        this.d.a();
                    } catch (Throwable th2) {
                        synchronized (this.e) {
                            try {
                                if (this.f == null) {
                                    this.f = th2;
                                    ma0 ma0Var = this.h;
                                    Object[] objArr = ma0Var.a;
                                    int i4 = ma0Var.b;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        ad adVar2 = ((xb) objArr[i5]).b;
                                        if (adVar2 != null) {
                                            adVar2.h(c10.z(th2));
                                        }
                                    }
                                    this.h.c();
                                    z9 z9Var2 = this.g;
                                    do {
                                        i3 = z9Var2.get();
                                    } while (!z9Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return adVar.s();
    }

    @Override // defpackage.ml
    public final ml k(ml mlVar) {
        return d80.v(this, mlVar);
    }

    @Override // defpackage.ml
    public final kl n(ll llVar) {
        return d80.r(this, llVar);
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
