package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class x30 implements xx0, n80 {
    public final /* synthetic */ a40 d;
    public final /* synthetic */ f40 e;

    public x30(f40 f40Var) {
        this.e = f40Var;
        this.d = f40Var.j;
    }

    @Override // defpackage.xn
    public final float A(float f) {
        return this.d.b() * f;
    }

    @Override // defpackage.xx0
    public final List G(kw kwVar, Object obj) {
        f40 f40Var = this.e;
        t30 t30Var = f40Var.d;
        ta0 ta0Var = f40Var.i;
        t30 t30Var2 = (t30) ta0Var.g(obj);
        if (t30Var2 != null && ((bb0) t30Var.n()).d.i(t30Var2) < f40Var.f) {
            return t30Var2.l();
        }
        ta0 ta0Var2 = f40Var.n;
        ta0 ta0Var3 = f40Var.l;
        eb0 eb0Var = f40Var.o;
        if (eb0Var.f < f40Var.g) {
            pz.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eb0Var.f;
        int i2 = f40Var.g;
        if (i == i2) {
            eb0Var.b(obj);
        } else {
            Object[] objArr = eb0Var.d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        f40Var.g++;
        if (ta0Var3.b(obj)) {
            t30 t30Var3 = (t30) ta0Var3.g(obj);
            y30 y30Var = t30Var3 != null ? (y30) f40Var.h.g(t30Var3) : null;
            if (y30Var != null && y30Var.d) {
                f40Var.g(t30Var3, (bq0) obj, kwVar);
            }
        } else {
            if (t30Var.H()) {
                f40Var.d();
                if (!ta0Var.c(obj)) {
                    ta0Var2.j(obj);
                    Object objG = ta0Var3.g(obj);
                    if (objG == null) {
                        objG = f40Var.h((bq0) obj);
                        if (objG != null) {
                            int i3 = ((bb0) t30Var.n()).d.i(objG);
                            int i4 = ((bb0) t30Var.n()).d.f;
                            t30Var.r = true;
                            t30Var.K(i3, i4, 1);
                            t30Var.r = false;
                            f40Var.q++;
                        } else {
                            int i5 = ((bb0) t30Var.n()).d.f;
                            t30 t30Var4 = new t30(2);
                            t30Var.r = true;
                            t30Var.z(i5, t30Var4);
                            t30Var.r = false;
                            f40Var.q++;
                            objG = t30Var4;
                        }
                        ta0Var3.l(obj, objG);
                    }
                    f40Var.g((t30) objG, (bq0) obj, kwVar);
                }
            }
            ta0Var2.l(obj, !t30Var.H() ? new d40() : new e40(f40Var, (bq0) obj));
            if (t30Var.H.d == p30.f) {
                t30Var.R(true);
            } else {
                t30.S(t30Var, true, 6);
            }
        }
        t30 t30Var5 = (t30) ta0Var3.g(obj);
        if (t30Var5 == null) {
            return ks.d;
        }
        List listK0 = t30Var5.H.p.k0();
        bb0 bb0Var = (bb0) listK0;
        int i6 = bb0Var.d.f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((k80) bb0Var.get(i7)).i.b = true;
        }
        return listK0;
    }

    @Override // defpackage.xn
    public final float I(long j) {
        return this.d.I(j);
    }

    @Override // defpackage.n80
    public final m80 M(int i, int i2, Map map, iw iwVar, iw iwVar2) {
        return this.d.M(i, i2, map, iwVar, iwVar2);
    }

    @Override // defpackage.xn
    public final int N(float f) {
        return this.d.N(f);
    }

    @Override // defpackage.xn
    public final long W(long j) {
        return this.d.W(j);
    }

    @Override // defpackage.xn
    public final float Z(long j) {
        return this.d.Z(j);
    }

    @Override // defpackage.n80
    public final m80 a0(int i, int i2, Map map, iw iwVar) {
        return this.d.M(i, i2, map, null, iwVar);
    }

    @Override // defpackage.xn
    public final float b() {
        return this.d.e;
    }

    @Override // defpackage.xn
    public final long f0(float f) {
        return this.d.f0(f);
    }

    @Override // defpackage.x00
    public final e30 getLayoutDirection() {
        return this.d.d;
    }

    @Override // defpackage.xn
    public final float j0(int i) {
        return this.d.j0(i);
    }

    @Override // defpackage.xn
    public final float k() {
        return this.d.f;
    }

    @Override // defpackage.xn
    public final float l0(float f) {
        return f / this.d.b();
    }

    @Override // defpackage.x00
    public final boolean s() {
        return this.d.s();
    }

    @Override // defpackage.xn
    public final long x(float f) {
        return this.d.x(f);
    }

    @Override // defpackage.xn
    public final long y(long j) {
        return this.d.y(j);
    }
}
