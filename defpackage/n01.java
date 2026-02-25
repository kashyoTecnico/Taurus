package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class n01 {
    public final q8 a;
    public final long b;
    public final o11 c;
    public final hd0 d;
    public final v11 e;
    public long f;
    public final q8 g;
    public final a11 h;
    public final p11 i;

    public n01(a11 a11Var, hd0 hd0Var, p11 p11Var, v11 v11Var) {
        q8 q8Var = a11Var.a;
        long j = a11Var.b;
        o11 o11Var = p11Var != null ? p11Var.a : null;
        this.a = q8Var;
        this.b = j;
        this.c = o11Var;
        this.d = hd0Var;
        this.e = v11Var;
        this.f = j;
        this.g = q8Var;
        this.h = a11Var;
        this.i = p11Var;
    }

    public final List a(iw iwVar) {
        if (!w11.b(this.f)) {
            return ve.M(new xf("", 0), new fu0(w11.e(this.f), w11.e(this.f)));
        }
        hr hrVar = (hr) iwVar.g(this);
        if (hrVar != null) {
            return d80.t(hrVar);
        }
        return null;
    }

    public final Integer b() {
        o11 o11Var = this.c;
        if (o11Var == null) {
            return null;
        }
        int iD = w11.d(this.f);
        hd0 hd0Var = this.d;
        return Integer.valueOf(hd0Var.a(o11Var.e(o11Var.f(hd0Var.d(iD)), true)));
    }

    public final Integer c() {
        int length;
        o11 o11Var = this.c;
        if (o11Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            q8 q8Var = this.a;
            if (iP < q8Var.e.length()) {
                int length2 = this.g.e.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jL = o11Var.l(length2);
                int i = w11.c;
                int i2 = (int) (jL & 4294967295L);
                if (i2 > iP) {
                    length = this.d.a(i2);
                    break;
                }
                iP++;
            } else {
                length = q8Var.e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        o11 o11Var = this.c;
        if (o11Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            if (iP <= 0) {
                iA = 0;
                break;
            }
            int length = this.g.e.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jL = o11Var.l(length);
            int i = w11.c;
            int i2 = (int) (jL >> 32);
            if (i2 < iP) {
                iA = this.d.a(i2);
                break;
            }
            iP--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        o11 o11Var = this.c;
        return (o11Var != null ? o11Var.j(p()) : null) != um0.e;
    }

    public final int f(o11 o11Var, int i) {
        int iP = p();
        v11 v11Var = this.e;
        if (v11Var.a == null) {
            v11Var.a = Float.valueOf(o11Var.c(iP).a);
        }
        int iF = o11Var.f(iP);
        u90 u90Var = o11Var.b;
        int i2 = iF + i;
        if (i2 < 0) {
            return 0;
        }
        if (i2 >= u90Var.f) {
            return this.g.e.length();
        }
        float fB = u90Var.b(i2) - 1;
        Float f = v11Var.a;
        c10.m(f);
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= o11Var.h(i2)) || (!e() && fFloatValue <= o11Var.g(i2))) {
            return o11Var.e(i2, true);
        }
        return this.d.a(u90Var.e(nm.f(f.floatValue(), fB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.p11 r7, int r8) {
        /*
            r6 = this;
            d30 r0 = r7.b
            o11 r1 = r7.a
            if (r0 == 0) goto L13
            d30 r7 = r7.c
            if (r7 == 0) goto L10
            r2 = 1
            xl0 r7 = r7.P(r0, r2)
            goto L11
        L10:
            r7 = 0
        L11:
            if (r7 != 0) goto L15
        L13:
            xl0 r7 = defpackage.xl0.e
        L15:
            a11 r0 = r6.h
            long r2 = r0.b
            int r0 = defpackage.w11.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            hd0 r6 = r6.d
            int r0 = r6.d(r0)
            xl0 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r3 = r7.c()
            float r7 = defpackage.yu0.b(r3)
            float r8 = (float) r8
            float r7 = r7 * r8
            float r7 = r7 + r0
            long r7 = defpackage.nm.f(r2, r7)
            u90 r0 = r1.b
            int r7 = r0.e(r7)
            int r6 = r6.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n01.g(p11, int):int");
    }

    public final void h() {
        v11 v11Var = this.e;
        v11Var.a = null;
        q8 q8Var = this.g;
        if (q8Var.e.length() > 0) {
            if (e()) {
                v11Var.a = null;
                if (q8Var.e.length() > 0) {
                    String str = q8Var.e;
                    long j = this.f;
                    int i = w11.c;
                    int iE = dp0.e(str, (int) (j & 4294967295L));
                    if (iE != -1) {
                        o(iE, iE);
                        return;
                    }
                    return;
                }
                return;
            }
            v11Var.a = null;
            if (q8Var.e.length() > 0) {
                String str2 = q8Var.e;
                long j2 = this.f;
                int i2 = w11.c;
                int iD = dp0.d(str2, (int) (j2 & 4294967295L));
                if (iD != -1) {
                    o(iD, iD);
                }
            }
        }
    }

    public final void i() {
        this.e.a = null;
        q8 q8Var = this.g;
        String str = q8Var.e;
        String str2 = q8Var.e;
        if (str.length() > 0) {
            int i = qo0.i(str2, w11.d(this.f));
            if (i == w11.d(this.f) && i != str2.length()) {
                i = qo0.i(str2, i + 1);
            }
            o(i, i);
        }
    }

    public final void j() {
        this.e.a = null;
        q8 q8Var = this.g;
        String str = q8Var.e;
        String str2 = q8Var.e;
        if (str.length() > 0) {
            int iJ = qo0.j(str2, w11.e(this.f));
            if (iJ == w11.e(this.f) && iJ != 0) {
                iJ = qo0.j(str2, iJ - 1);
            }
            o(iJ, iJ);
        }
    }

    public final void k() {
        v11 v11Var = this.e;
        v11Var.a = null;
        q8 q8Var = this.g;
        if (q8Var.e.length() > 0) {
            if (e()) {
                v11Var.a = null;
                if (q8Var.e.length() > 0) {
                    String str = q8Var.e;
                    long j = this.f;
                    int i = w11.c;
                    int iD = dp0.d(str, (int) (j & 4294967295L));
                    if (iD != -1) {
                        o(iD, iD);
                        return;
                    }
                    return;
                }
                return;
            }
            v11Var.a = null;
            if (q8Var.e.length() > 0) {
                String str2 = q8Var.e;
                long j2 = this.f;
                int i2 = w11.c;
                int iE = dp0.e(str2, (int) (j2 & 4294967295L));
                if (iE != -1) {
                    o(iE, iE);
                }
            }
        }
    }

    public final void l() {
        Integer numB;
        this.e.a = null;
        if (this.g.e.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numValueOf = null;
        this.e.a = null;
        if (this.g.e.length() > 0) {
            o11 o11Var = this.c;
            if (o11Var != null) {
                int iE = w11.e(this.f);
                hd0 hd0Var = this.d;
                numValueOf = Integer.valueOf(hd0Var.a(o11Var.i(o11Var.f(hd0Var.d(iE)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                o(iIntValue, iIntValue);
            }
        }
    }

    public final void n() {
        if (this.g.e.length() > 0) {
            int i = w11.c;
            this.f = no0.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void o(int i, int i2) {
        this.f = no0.a(i, i2);
    }

    public final int p() {
        long j = this.f;
        int i = w11.c;
        return this.d.d((int) (j & 4294967295L));
    }
}
