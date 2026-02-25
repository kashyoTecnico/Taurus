package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fc implements n61 {
    public Object d = ic.p;
    public ad e;
    public final /* synthetic */ gc f;

    public fc(gc gcVar) {
        this.f = gcVar;
    }

    @Override // defpackage.n61
    public final void a(or0 or0Var, int i) {
        ad adVar = this.e;
        if (adVar != null) {
            adVar.a(or0Var, i);
        }
    }

    public final Object b(mk mkVar) throws Throwable {
        vd vdVarL;
        Object obj = this.d;
        boolean z = true;
        if (obj == ic.p || obj == ic.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gc.j;
            gc gcVar = this.f;
            vd vdVar = (vd) atomicReferenceFieldUpdater.get(gcVar);
            while (true) {
                gcVar.getClass();
                if (gcVar.t(gc.e.get(gcVar), true)) {
                    this.d = ic.l;
                    Throwable thM = gcVar.m();
                    if (thM != null) {
                        int i = qw0.a;
                        throw thM;
                    }
                    z = false;
                } else {
                    long andIncrement = gc.f.getAndIncrement(gcVar);
                    long j = ic.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (vdVar.c != j2) {
                        vdVarL = gcVar.l(j2, vdVar);
                        if (vdVarL == null) {
                            continue;
                        }
                    } else {
                        vdVarL = vdVar;
                    }
                    Object objC = gcVar.C(vdVarL, i2, andIncrement, null);
                    cs csVar = ic.m;
                    if (objC == csVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    cs csVar2 = ic.o;
                    if (objC == csVar2) {
                        if (andIncrement < gcVar.q()) {
                            vdVarL.a();
                        }
                        vdVar = vdVarL;
                    } else {
                        if (objC == ic.n) {
                            gc gcVar2 = this.f;
                            ad adVarB = m20.B(r31.I(mkVar));
                            try {
                                this.e = adVarB;
                                Object objC2 = gcVar2.C(vdVarL, i2, andIncrement, this);
                                if (objC2 == csVar) {
                                    a(vdVarL, i2);
                                } else {
                                    if (objC2 == csVar2) {
                                        if (andIncrement < gcVar2.q()) {
                                            vdVarL.a();
                                        }
                                        vd vdVar2 = (vd) gc.j.get(gcVar2);
                                        while (true) {
                                            if (gcVar2.t(gc.e.get(gcVar2), true)) {
                                                ad adVar = this.e;
                                                c10.m(adVar);
                                                this.e = null;
                                                this.d = ic.l;
                                                Throwable thM2 = gcVar.m();
                                                if (thM2 == null) {
                                                    adVar.h(Boolean.FALSE);
                                                } else {
                                                    adVar.h(c10.z(thM2));
                                                }
                                            } else {
                                                long andIncrement2 = gc.f.getAndIncrement(gcVar2);
                                                long j3 = ic.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (vdVar2.c != j4) {
                                                    vd vdVarL2 = gcVar2.l(j4, vdVar2);
                                                    if (vdVarL2 != null) {
                                                        vdVar2 = vdVarL2;
                                                    }
                                                }
                                                Object objC3 = gcVar2.C(vdVar2, i3, andIncrement2, this);
                                                if (objC3 == ic.m) {
                                                    a(vdVar2, i3);
                                                    break;
                                                }
                                                if (objC3 == ic.o) {
                                                    if (andIncrement2 < gcVar2.q()) {
                                                        vdVar2.a();
                                                    }
                                                } else {
                                                    if (objC3 == ic.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    vdVar2.a();
                                                    this.d = objC3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        vdVarL.a();
                                        this.d = objC2;
                                        this.e = null;
                                    }
                                    adVarB.C(Boolean.TRUE, null);
                                }
                                return adVarB.s();
                            } catch (Throwable th) {
                                adVarB.A();
                                throw th;
                            }
                        }
                        vdVarL.a();
                        this.d = objC;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.d;
        cs csVar = ic.p;
        if (obj == csVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.d = csVar;
        if (obj != ic.l) {
            return obj;
        }
        Throwable thN = this.f.n();
        int i = qw0.a;
        throw thN;
    }
}
