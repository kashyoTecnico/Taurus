package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t01 implements yz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u01 b;

    public /* synthetic */ t01(u01 u01Var, int i) {
        this.a = i;
        this.b = u01Var;
    }

    @Override // defpackage.yz0
    public final void a() {
        switch (this.a) {
            case 0:
                u01 u01Var = this.b;
                u01Var.o.setValue(null);
                u01Var.p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // defpackage.yz0
    public final void b() {
        switch (this.a) {
            case 0:
                u01 u01Var = this.b;
                u01Var.o.setValue(null);
                u01Var.p.setValue(null);
                break;
        }
    }

    @Override // defpackage.yz0
    public final void c(long j) {
        p11 p11VarD;
        long j2;
        p11 p11VarD2;
        p11 p11VarD3;
        switch (this.a) {
            case 0:
                u01 u01Var = this.b;
                long jA = js0.a(u01Var.i(true));
                r40 r40Var = u01Var.d;
                if (r40Var != null && (p11VarD = r40Var.d()) != null) {
                    long jE = p11VarD.e(jA);
                    u01Var.l = jE;
                    u01Var.p.setValue(new ed0(jE));
                    u01Var.n = 0L;
                    u01Var.o.setValue(nx.d);
                    u01Var.p(false);
                    break;
                }
                break;
            default:
                u01 u01Var2 = this.b;
                zg0 zg0Var = u01Var2.o;
                if (u01Var2.h() && ((nx) zg0Var.getValue()) == null) {
                    zg0Var.setValue(nx.f);
                    u01Var2.q = -1;
                    u01Var2.k();
                    r40 r40Var2 = u01Var2.d;
                    if (r40Var2 == null || (p11VarD3 = r40Var2.d()) == null || !p11VarD3.c(j)) {
                        j2 = j;
                        r40 r40Var3 = u01Var2.d;
                        if (r40Var3 != null && (p11VarD2 = r40Var3.d()) != null) {
                            int iA = u01Var2.b.a(p11VarD2.b(j2, true));
                            a11 a11VarC = u01.c(u01Var2.j().a, no0.a(iA, iA));
                            u01Var2.f(false);
                            yx yxVar = u01Var2.h;
                            if (yxVar != null) {
                                yxVar.a();
                            }
                            u01Var2.c.g(a11VarC);
                        }
                    } else if (u01Var2.j().a.e.length() != 0) {
                        u01Var2.f(false);
                        j2 = j;
                        u01Var2.m = Integer.valueOf((int) (u01.a(u01Var2, a11.a(u01Var2.j(), null, w11.b, 5), j2, true, false, g2.S, true) >> 32));
                    }
                    u01Var2.n(px.d);
                    u01Var2.l = j2;
                    u01Var2.p.setValue(new ed0(j2));
                    u01Var2.n = 0L;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yz0
    public final void d() {
        int i = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    @Override // defpackage.yz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t01.e(long):void");
    }

    public void i() {
        u01 u01Var = this.b;
        u01Var.o.setValue(null);
        u01Var.p.setValue(null);
        u01Var.p(true);
        u01Var.m = null;
        boolean zB = w11.b(u01Var.j().b);
        u01Var.n(zB ? px.f : px.e);
        r40 r40Var = u01Var.d;
        if (r40Var != null) {
            r40Var.m.setValue(Boolean.valueOf(!zB && dq0.j(u01Var, true)));
        }
        r40 r40Var2 = u01Var.d;
        if (r40Var2 != null) {
            r40Var2.n.setValue(Boolean.valueOf(!zB && dq0.j(u01Var, false)));
        }
        r40 r40Var3 = u01Var.d;
        if (r40Var3 == null) {
            return;
        }
        r40Var3.o.setValue(Boolean.valueOf(zB && dq0.j(u01Var, true)));
    }

    @Override // defpackage.yz0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
