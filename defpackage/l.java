package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class l extends y10 implements lk, wl {
    public final ml f;

    public l(ml mlVar, boolean z) {
        super(z);
        P((r10) mlVar.n(g2.E));
        this.f = mlVar.k(this);
    }

    @Override // defpackage.y10
    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.y10
    public final void O(fg fgVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c4.u(this.f, fgVar);
    }

    @Override // defpackage.y10
    public final void W(Object obj) {
        if (!(obj instanceof eg)) {
            f0(obj);
        } else {
            eg egVar = (eg) obj;
            e0(egVar.a, eg.b.get(egVar) != 0);
        }
    }

    @Override // defpackage.lk
    public final ml f() {
        return this.f;
    }

    @Override // defpackage.wl
    public final ml g() {
        return this.f;
    }

    public final void g0(zl zlVar, l lVar, kw kwVar) {
        Object objE;
        int iOrdinal = zlVar.ordinal();
        j41 j41Var = j41.a;
        if (iOrdinal == 0) {
            try {
                m20.K(r31.I(r31.v(lVar, this, kwVar)), j41Var);
                return;
            } finally {
                h(c10.z(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c10.p(kwVar, "<this>");
                r31.I(r31.v(lVar, this, kwVar)).h(j41Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new fg();
            }
            try {
                ml mlVar = this.f;
                Object objK0 = b10.k0(mlVar, null);
                try {
                    if (kwVar instanceof ia) {
                        r31.m(2, kwVar);
                        objE = kwVar.e(lVar, this);
                    } else {
                        objE = r31.g0(kwVar, lVar, this);
                    }
                    b10.f0(mlVar, objK0);
                    if (objE != xl.d) {
                        h(objE);
                    }
                } catch (Throwable th) {
                    b10.f0(mlVar, objK0);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.lk
    public final void h(Object obj) {
        Throwable thA = zm0.a(obj);
        if (thA != null) {
            obj = new eg(thA, false);
        }
        Object objT = T(obj);
        if (objT == m20.e) {
            return;
        }
        z(objT);
    }

    public void f0(Object obj) {
    }

    public void e0(Throwable th, boolean z) {
    }
}
