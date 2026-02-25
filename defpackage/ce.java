package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ce {
    public boolean a;
    public Object b;
    public Object c = b10.f();
    public Object d = new ArrayList();
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public ce(gw gwVar, boolean z) {
        this.a = z;
        this.b = (y20) gwVar;
    }

    public void a(v30 v30Var, float f, long j) {
        fd fdVar = v30Var.d;
        float fFloatValue = ((Number) ((x7) this.c).c()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = bf.b(j, fFloatValue);
            if (!this.a) {
                sq.Y(v30Var, jB, f, 0L, 124);
                return;
            }
            float fD = yu0.d(fdVar.c());
            float fB = yu0.b(fdVar.c());
            e9 e9Var = fdVar.e;
            long jS = e9Var.s();
            e9Var.o().l();
            ((e9) ((r1) e9Var.a).e).o().e(0.0f, 0.0f, fD, fB, 1);
            sq.Y(v30Var, jB, f, 0L, 124);
            b8.m(e9Var, jS);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [gw, y20] */
    public void b(v00 v00Var, wl wlVar) {
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = v00Var instanceof ny;
        if (z) {
            arrayList.add(v00Var);
        } else if (v00Var instanceof oy) {
            arrayList.remove(((oy) v00Var).a);
        } else if (v00Var instanceof lu) {
            arrayList.add(v00Var);
        } else if (v00Var instanceof mu) {
            arrayList.remove(((mu) v00Var).a);
        } else if (v00Var instanceof kq) {
            arrayList.add(v00Var);
        } else if (v00Var instanceof lq) {
            arrayList.remove(((lq) v00Var).a);
        } else if (!(v00Var instanceof jq)) {
            return;
        } else {
            arrayList.remove(((jq) v00Var).a);
        }
        v00 v00Var2 = (v00) ue.Y(arrayList);
        if (c10.i((v00) this.e, v00Var2)) {
            return;
        }
        lk lkVar = null;
        if (v00Var2 != null) {
            in0 in0Var = (in0) ((y20) this.b).a();
            float f = z ? in0Var.c : v00Var instanceof lu ? in0Var.b : v00Var instanceof kq ? in0Var.a : 0.0f;
            p31 p31Var = tn0.a;
            if (!(v00Var2 instanceof ny) && ((v00Var2 instanceof lu) || (v00Var2 instanceof kq))) {
                p31Var = new p31(45, 0, zq.b);
            }
            nm.z(wlVar, null, new bx0(this, f, p31Var, null), 3);
        } else {
            v00 v00Var3 = (v00) this.e;
            p31 p31Var2 = tn0.a;
            if (!(v00Var3 instanceof ny) && !(v00Var3 instanceof lu) && (v00Var3 instanceof kq)) {
                p31Var2 = new p31(150, 0, zq.b);
            }
            nm.z(wlVar, null, new c(this, p31Var2, lkVar, 18), 3);
        }
        this.e = v00Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(xz xzVar, p3 p3Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        dy dyVar = (dy) this.c;
        gy gyVar = (gy) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            xz xzVarO = ((r1) this.d).o(xzVar, p3Var);
            r60 r60Var = (r60) xzVarO.e;
            int iC = r60Var.c();
            for (int i3 = 0; i3 < iC; i3++) {
                nj0 nj0Var = (nj0) r60Var.d(i3);
                if (!nj0Var.d && !nj0Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iC2 = r60Var.c();
            for (int i4 = 0; i4 < iC2; i4++) {
                nj0 nj0Var2 = (nj0) r60Var.d(i4);
                if (objArr != false || c10.j(nj0Var2)) {
                    ((t30) this.b).y(nj0Var2.c, (gy) this.e, nj0Var2.i, true);
                    if (!gyVar.d.g()) {
                        dyVar.a(nj0Var2.a, gyVar, c10.j(nj0Var2));
                        gyVar.clear();
                    }
                }
            }
            boolean zB = dyVar.b(xzVarO, z);
            int iC3 = r60Var.c();
            int i5 = 0;
            while (true) {
                if (i5 >= iC3) {
                    i = 0;
                    break;
                }
                nj0 nj0Var3 = (nj0) r60Var.d(i5);
                if (!ed0.b(c10.R(nj0Var3, true), 0L) && nj0Var3.b()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int iC4 = r60Var.c();
            int i6 = 0;
            while (true) {
                if (i6 >= iC4) {
                    i2 = 0;
                    break;
                }
                if (((nj0) r60Var.d(i6)).b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
