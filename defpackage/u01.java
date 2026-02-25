package defpackage;

import android.view.ActionMode;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u01 {
    public final h41 a;
    public r40 d;
    public qe f;
    public d21 g;
    public yx h;
    public vu i;
    public final zg0 j;
    public final zg0 k;
    public long l;
    public Integer m;
    public long n;
    public final zg0 o;
    public final zg0 p;
    public int q;
    public a11 r;
    public wu0 s;
    public final t01 t;
    public final r1 u;
    public hd0 b = c10.n;
    public iw c = k01.l;
    public final zg0 e = qo0.n(new a11((String) null, 0, 7));

    public u01(h41 h41Var) {
        this.a = h41Var;
        Boolean bool = Boolean.TRUE;
        this.j = qo0.n(bool);
        this.k = qo0.n(bool);
        this.l = 0L;
        this.n = 0L;
        this.o = qo0.n(null);
        this.p = qo0.n(null);
        this.q = -1;
        this.r = new a11((String) null, 0L, 7);
        this.t = new t01(this, 1);
        this.u = new r1(26, this);
    }

    public static final long a(u01 u01Var, a11 a11Var, long j, boolean z, boolean z2, tr0 tr0Var, boolean z3) {
        p11 p11VarD;
        long j2;
        long j3;
        sr0 sr0Var;
        boolean z4;
        boolean z5;
        yx yxVar;
        int i;
        r40 r40Var = u01Var.d;
        if (r40Var == null || (p11VarD = r40Var.d()) == null) {
            return w11.b;
        }
        hd0 hd0Var = u01Var.b;
        long j4 = a11Var.b;
        q8 q8Var = a11Var.a;
        int i2 = w11.c;
        long jA = no0.a(hd0Var.d((int) (j4 >> 32)), u01Var.b.d((int) (j4 & 4294967295L)));
        int iB = p11VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jA >> 32);
        int i4 = (!z2 || z) ? iB : (int) (jA & 4294967295L);
        wu0 wu0Var = u01Var.s;
        int i5 = (z || wu0Var == null || (i = u01Var.q) == -1) ? -1 : i;
        o11 o11Var = p11VarD.a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            sr0Var = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (jA >> 32);
            j3 = j4;
            rr0 rr0Var = new rr0(dq0.i(o11Var, i6), i6, 1L);
            int i7 = (int) (jA & 4294967295L);
            sr0Var = new sr0(rr0Var, new rr0(dq0.i(o11Var, i7), i7, 1L), w11.f(jA));
        }
        wu0 wu0Var2 = new wu0(z2, 1, 1, sr0Var, new pr0(1L, 1, i3, i4, i5, o11Var));
        if (!wu0Var2.g(wu0Var)) {
            return j3;
        }
        u01Var.s = wu0Var2;
        u01Var.q = iB;
        sr0 sr0VarA = tr0Var.a(wu0Var2);
        long jA2 = no0.a(u01Var.b.a(sr0VarA.a.b), u01Var.b.a(sr0VarA.b.b));
        long j5 = j3;
        if (w11.a(jA2, j5)) {
            return j5;
        }
        boolean z6 = w11.f(jA2) != w11.f(j5) && w11.a(no0.a((int) (jA2 & j2), (int) (jA2 >> 32)), j5);
        boolean z7 = w11.b(jA2) && w11.b(j5);
        if (z3 && q8Var.e.length() > 0 && !z6 && !z7 && (yxVar = u01Var.h) != null) {
            yxVar.a();
        }
        u01Var.c.g(c(q8Var, jA2));
        if (!z3) {
            u01Var.p(!w11.b(jA2));
        }
        r40 r40Var2 = u01Var.d;
        if (r40Var2 != null) {
            r40Var2.q.setValue(Boolean.valueOf(z3));
        }
        r40 r40Var3 = u01Var.d;
        if (r40Var3 != null) {
            r40Var3.m.setValue(Boolean.valueOf(!w11.b(jA2) && dq0.j(u01Var, true)));
        }
        r40 r40Var4 = u01Var.d;
        if (r40Var4 == null) {
            z4 = false;
        } else {
            if (w11.b(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (dq0.j(u01Var, false)) {
                    z5 = true;
                }
                r40Var4.n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            r40Var4.n.setValue(Boolean.valueOf(z5));
        }
        r40 r40Var5 = u01Var.d;
        if (r40Var5 == null) {
            return jA2;
        }
        r40Var5.o.setValue(Boolean.valueOf((w11.b(jA2) && dq0.j(u01Var, true)) ? true : z4));
        return jA2;
    }

    public static a11 c(q8 q8Var, long j) {
        return new a11(q8Var, j, (w11) null);
    }

    public final void b(boolean z) {
        if (w11.b(j().b)) {
            return;
        }
        qe qeVar = this.f;
        if (qeVar != null) {
            ((w2) qeVar).a(n2.f(j()));
        }
        if (z) {
            int iD = w11.d(j().b);
            this.c.g(c(j().a, no0.a(iD, iD)));
            n(px.d);
        }
    }

    public final void d() {
        if (w11.b(j().b)) {
            return;
        }
        qe qeVar = this.f;
        if (qeVar != null) {
            ((w2) qeVar).a(n2.f(j()));
        }
        q8 q8VarH = n2.h(j(), j().a.e.length());
        q8 q8VarG = n2.g(j(), j().a.e.length());
        o8 o8Var = new o8(q8VarH);
        o8Var.a(q8VarG);
        q8 q8VarB = o8Var.b();
        int iE = w11.e(j().b);
        this.c.g(c(q8VarB, no0.a(iE, iE)));
        n(px.d);
        this.a.e = true;
    }

    public final void e(ed0 ed0Var) {
        if (!w11.b(j().b)) {
            r40 r40Var = this.d;
            p11 p11VarD = r40Var != null ? r40Var.d() : null;
            int iD = (ed0Var == null || p11VarD == null) ? w11.d(j().b) : this.b.a(p11VarD.b(ed0Var.a, true));
            this.c.g(a11.a(j(), null, no0.a(iD, iD), 5));
        }
        n((ed0Var == null || j().a.e.length() <= 0) ? px.d : px.f);
        p(false);
    }

    public final void f(boolean z) {
        vu vuVar;
        r40 r40Var = this.d;
        if (r40Var != null && !r40Var.b() && (vuVar = this.i) != null) {
            vuVar.a(new uu(1));
        }
        this.r = j();
        p(z);
        n(px.e);
    }

    public final ed0 g() {
        return (ed0) this.p.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final long i(boolean z) {
        p11 p11VarD;
        long j;
        r40 r40Var = this.d;
        if (r40Var == null || (p11VarD = r40Var.d()) == null) {
            return 9205357640488583168L;
        }
        o11 o11Var = p11VarD.a;
        r40 r40Var2 = this.d;
        q8 q8Var = r40Var2 != null ? r40Var2.a.a : null;
        if (q8Var == null) {
            return 9205357640488583168L;
        }
        if (!c10.i(q8Var.e, o11Var.a.a.e)) {
            return 9205357640488583168L;
        }
        a11 a11VarJ = j();
        if (z) {
            long j2 = a11VarJ.b;
            int i = w11.c;
            j = j2 >> 32;
        } else {
            long j3 = a11VarJ.b;
            int i2 = w11.c;
            j = j3 & 4294967295L;
        }
        return qo0.k(o11Var, this.b.d((int) j), z, w11.f(j().b));
    }

    public final a11 j() {
        return (a11) this.e.getValue();
    }

    public final void k() {
        d21 d21Var = this.g;
        if ((d21Var != null ? ((i7) d21Var).d : null) != e21.d || d21Var == null) {
            return;
        }
        i7 i7Var = (i7) d21Var;
        i7Var.d = e21.e;
        ActionMode actionMode = i7Var.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        i7Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u01.l():void");
    }

    public final void m() {
        a11 a11VarC = c(j().a, no0.a(0, j().a.e.length()));
        this.c.g(a11VarC);
        this.r = a11.a(this.r, null, a11VarC.b, 5);
        f(true);
    }

    public final void n(px pxVar) {
        r40 r40Var = this.d;
        if (r40Var != null) {
            if (r40Var.a() == pxVar) {
                r40Var = null;
            }
            if (r40Var != null) {
                r40Var.k.setValue(pxVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u01.o():void");
    }

    public final void p(boolean z) {
        r40 r40Var = this.d;
        if (r40Var != null) {
            r40Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            o();
        } else {
            k();
        }
    }
}
