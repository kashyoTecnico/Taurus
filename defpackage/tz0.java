package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tz0 extends d90 implements l30, qq, et0 {
    public Map A;
    public w90 B;
    public sz0 C;
    public rz0 D;
    public q8 r;
    public c21 s;
    public jv t;
    public iw u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public bs0 z;

    public tz0(q8 q8Var, c21 c21Var, jv jvVar, iw iwVar, int i, boolean z, int i2, int i3, bs0 bs0Var) {
        this.r = q8Var;
        this.s = c21Var;
        this.t = jvVar;
        this.u = iwVar;
        this.v = i;
        this.w = z;
        this.x = i2;
        this.y = i3;
        this.z = bs0Var;
    }

    public final void A0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            w90 w90VarB0 = B0();
            q8 q8Var = this.r;
            c21 c21Var = this.s;
            jv jvVar = this.t;
            int i = this.v;
            boolean z5 = this.w;
            int i2 = this.x;
            int i3 = this.y;
            w90VarB0.a = q8Var;
            w90VarB0.b = c21Var;
            w90VarB0.c = jvVar;
            w90VarB0.d = i;
            w90VarB0.e = z5;
            w90VarB0.f = i2;
            w90VarB0.g = i3;
            w90VarB0.k = null;
            w90VarB0.m = null;
            w90VarB0.o = -1;
            w90VarB0.n = -1;
        }
        if (this.q) {
            if (z2 || (z && this.C != null)) {
                h9.i(this);
            }
            if (z2 || z3 || z4) {
                nm.v(this);
                m20.F(this);
            }
            if (z) {
                m20.F(this);
            }
        }
    }

    public final w90 B0() {
        if (this.B == null) {
            this.B = new w90(this.r, this.s, this.t, this.v, this.w, this.x, this.y);
        }
        w90 w90Var = this.B;
        c10.m(w90Var);
        return w90Var;
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        return C0(v60Var).a(i, v60Var.getLayoutDirection());
    }

    public final w90 C0(xn xnVar) {
        w90 w90Var;
        rz0 rz0Var = this.D;
        if (rz0Var != null && rz0Var.c && (w90Var = rz0Var.d) != null) {
            w90Var.c(xnVar);
            return w90Var;
        }
        w90 w90VarB0 = B0();
        w90VarB0.c(xnVar);
        return w90VarB0;
    }

    public final boolean D0(iw iwVar, bs0 bs0Var) {
        boolean z;
        if (this.u != iwVar) {
            this.u = iwVar;
            z = true;
        } else {
            z = false;
        }
        if (c10.i(this.z, bs0Var)) {
            return z;
        }
        this.z = bs0Var;
        return true;
    }

    public final boolean E0(c21 c21Var, int i, int i2, boolean z, jv jvVar, int i3) {
        boolean z2 = !this.s.c(c21Var);
        this.s = c21Var;
        if (this.y != i) {
            this.y = i;
            z2 = true;
        }
        if (this.x != i2) {
            this.x = i2;
            z2 = true;
        }
        if (this.w != z) {
            this.w = z;
            z2 = true;
        }
        if (!c10.i(this.t, jvVar)) {
            this.t = jvVar;
            z2 = true;
        }
        if (this.v == i3) {
            return z2;
        }
        this.v = i3;
        return true;
    }

    public final boolean F0(q8 q8Var) {
        boolean zI = c10.i(this.r.e, q8Var.e);
        ArrayList arrayList = this.r.f;
        Object obj = ks.d;
        if (arrayList == null) {
            arrayList = obj;
        }
        Object obj2 = q8Var.f;
        if (obj2 == null) {
            obj2 = obj;
        }
        boolean zEquals = arrayList.equals(obj2);
        Object obj3 = this.r.g;
        if (obj3 == null) {
            obj3 = obj;
        }
        ArrayList arrayList2 = q8Var.g;
        if (arrayList2 != null) {
            obj = arrayList2;
        }
        boolean z = (zI && zEquals && obj3.equals(obj) && c10.i(this.r.d, q8Var.d)) ? false : true;
        if (z) {
            this.r = q8Var;
        }
        if (!zI) {
            this.D = null;
        }
        return z;
    }

    @Override // defpackage.et0
    public final void K(ct0 ct0Var) {
        sz0 sz0Var = this.C;
        if (sz0Var == null) {
            sz0Var = new sz0(this, 0);
            this.C = sz0Var;
        }
        q8 q8Var = this.r;
        h20[] h20VarArr = nt0.a;
        ct0Var.d(lt0.A, d80.t(q8Var));
        rz0 rz0Var = this.D;
        if (rz0Var != null) {
            q8 q8Var2 = rz0Var.b;
            ot0 ot0Var = lt0.B;
            h20[] h20VarArr2 = nt0.a;
            h20 h20Var = h20VarArr2[15];
            ot0Var.a(ct0Var, q8Var2);
            boolean z = rz0Var.c;
            ot0 ot0Var2 = lt0.C;
            h20 h20Var2 = h20VarArr2[16];
            ot0Var2.a(ct0Var, Boolean.valueOf(z));
        }
        ct0Var.d(bt0.j, new j0(null, new sz0(this, 1)));
        ct0Var.d(bt0.k, new j0(null, new sz0(this, 2)));
        ct0Var.d(bt0.l, new j0(null, new b(23, this)));
        nt0.a(ct0Var, sz0Var);
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        return mq0.e(C0(v60Var).d(v60Var.getLayoutDirection()).a());
    }

    @Override // defpackage.et0
    public final boolean c0() {
        return true;
    }

    @Override // defpackage.qq
    public final void d(v30 v30Var) {
        o11 o11Var;
        fd fdVar = v30Var.d;
        if (this.q) {
            bs0 bs0Var = this.z;
            if (bs0Var != null) {
                long j = bs0Var.f;
                sr0 sr0Var = (sr0) ((zs0) bs0Var.e).a().d(bs0Var.d);
                if (sr0Var != null) {
                    rr0 rr0Var = sr0Var.b;
                    rr0 rr0Var2 = sr0Var.a;
                    boolean z = sr0Var.c;
                    int i = !z ? rr0Var2.b : rr0Var.b;
                    int i2 = !z ? rr0Var.b : rr0Var2.b;
                    if (i != i2) {
                        z90 z90Var = bs0Var.h;
                        int iB = (z90Var == null || (o11Var = (o11) z90Var.c.a()) == null) ? 0 : z90Var.b(o11Var);
                        if (i > iB) {
                            i = iB;
                        }
                        if (i2 > iB) {
                            i2 = iB;
                        }
                        o11 o11Var2 = (o11) bs0Var.g.f;
                        i6 i6VarK = o11Var2 != null ? o11Var2.k(i, i2) : null;
                        if (i6VarK != null) {
                            o11 o11Var3 = (o11) bs0Var.g.f;
                            if (o11Var3 == null || o11Var3.a.f == 3 || !o11Var3.d()) {
                                v30Var.V(i6VarK, j);
                            } else {
                                float fD = yu0.d(fdVar.c());
                                float fB = yu0.b(fdVar.c());
                                e9 e9Var = fdVar.e;
                                long jS = e9Var.s();
                                e9Var.o().l();
                                try {
                                    ((e9) ((r1) e9Var.a).e).o().e(0.0f, 0.0f, fD, fB, 1);
                                    v30Var.V(i6VarK, j);
                                } finally {
                                    b8.m(e9Var, jS);
                                }
                            }
                        }
                    }
                }
            }
            dd ddVarO = fdVar.e.o();
            o11 o11Var4 = C0(v30Var).m;
            if (o11Var4 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            u90 u90Var = o11Var4.b;
            boolean z2 = o11Var4.d() && this.v != 3;
            if (z2) {
                long j2 = o11Var4.c;
                xl0 xl0VarF = c4.f(0L, dq0.a((int) (j2 >> 32), (int) (j2 & 4294967295L)));
                ddVarO.l();
                dd.k(ddVarO, xl0VarF);
            }
            try {
                iw0 iw0Var = this.s.a;
                uz0 uz0Var = iw0Var.m;
                if (uz0Var == null) {
                    uz0Var = uz0.b;
                }
                uz0 uz0Var2 = uz0Var;
                hu0 hu0Var = iw0Var.n;
                if (hu0Var == null) {
                    hu0Var = hu0.d;
                }
                hu0 hu0Var2 = hu0Var;
                tq tqVar = iw0Var.p;
                if (tqVar == null) {
                    tqVar = dt.a;
                }
                tq tqVar2 = tqVar;
                ac acVarB = iw0Var.a.b();
                if (acVarB != null) {
                    u90.h(u90Var, ddVarO, acVarB, this.s.a.a.c(), hu0Var2, uz0Var2, tqVar2);
                } else {
                    long jB = bf.g;
                    if (jB == 16) {
                        jB = this.s.b() != 16 ? this.s.b() : bf.b;
                    }
                    u90.g(u90Var, ddVarO, jB, hu0Var2, uz0Var2, tqVar2);
                }
                if (z2) {
                    ddVarO.i();
                }
                rz0 rz0Var = this.D;
                if (rz0Var == null || !rz0Var.c) {
                    q8 q8Var = this.r;
                    int length = q8Var.e.length();
                    List list = q8Var.d;
                    if (list != null) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            p8 p8Var = (p8) list.get(i3);
                            if ((p8Var.a instanceof u50) && s8.b(0, length, p8Var.b, p8Var.c)) {
                                v30Var.a();
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (z2) {
                    ddVarO.i();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    @Override // defpackage.l30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m80 e(defpackage.n80 r9, defpackage.g80 r10, long r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz0.e(n80, g80, long):m80");
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        return mq0.e(C0(v60Var).d(v60Var.getLayoutDirection()).c());
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        return C0(v60Var).a(i, v60Var.getLayoutDirection());
    }
}
