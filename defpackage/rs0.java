package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rs0 implements yz0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public rs0(u01 u01Var, boolean z) {
        this.c = u01Var;
        this.b = z;
    }

    @Override // defpackage.yz0
    public final void a() {
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                ss0Var.s = true;
                ss0Var.p();
                ss0Var.p.setValue(null);
                ss0Var.q.setValue(null);
                break;
            default:
                u01 u01Var = (u01) this.c;
                u01Var.o.setValue(null);
                u01Var.p.setValue(null);
                u01Var.p(true);
                break;
        }
    }

    @Override // defpackage.yz0
    public final void b() {
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                ss0Var.s = true;
                ss0Var.p();
                ss0Var.p.setValue(null);
                ss0Var.q.setValue(null);
                break;
            default:
                u01 u01Var = (u01) this.c;
                u01Var.o.setValue(null);
                u01Var.p.setValue(null);
                u01Var.p(true);
                break;
        }
    }

    @Override // defpackage.yz0
    public final void c(long j) {
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                if (ss0Var.c() == null) {
                    return;
                }
                sr0 sr0VarE = ss0Var.e();
                c10.m(sr0VarE);
                boolean z = this.b;
                Object objD = ss0Var.a.c.d((z ? sr0VarE.a : sr0VarE.b).c);
                if (objD == null) {
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
                }
                z90 z90Var = (z90) objD;
                d30 d30VarC = z90Var.c();
                if (d30VarC == null) {
                    throw new IllegalStateException("Current selectable should have layout coordinates.");
                }
                long jA = z90Var.a(sr0VarE, z);
                if (nm.y(jA)) {
                    return;
                }
                ss0Var.l.setValue(new ed0(ss0Var.j().v(d30VarC, js0.a(jA))));
                ss0Var.m.setValue(new ed0(0L));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.yz0
    public final void d() {
        sr0 sr0VarE;
        d30 d30VarC;
        p11 p11VarD;
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                boolean z = this.b;
                if ((z ? (ed0) ss0Var.n.getValue() : (ed0) ss0Var.o.getValue()) != null && (sr0VarE = ss0Var.e()) != null) {
                    z90 z90Var = (z90) ss0Var.a.c.d((z ? sr0VarE.a : sr0VarE.b).c);
                    if (z90Var != null && (d30VarC = z90Var.c()) != null) {
                        long jA = z90Var.a(sr0VarE, z);
                        if (!nm.y(jA)) {
                            ss0Var.q.setValue(new ed0(ss0Var.j().v(d30VarC, js0.a(jA))));
                            ss0Var.p.setValue(z ? nx.e : nx.f);
                            ss0Var.s = false;
                            ss0Var.p();
                            break;
                        }
                    }
                }
                break;
            default:
                u01 u01Var = (u01) this.c;
                boolean z2 = this.b;
                u01Var.o.setValue(z2 ? nx.e : nx.f);
                long jA2 = js0.a(u01Var.i(z2));
                r40 r40Var = u01Var.d;
                if (r40Var != null && (p11VarD = r40Var.d()) != null) {
                    long jE = p11VarD.e(jA2);
                    u01Var.l = jE;
                    u01Var.p.setValue(new ed0(jE));
                    u01Var.n = 0L;
                    u01Var.q = -1;
                    r40 r40Var2 = u01Var.d;
                    if (r40Var2 != null) {
                        r40Var2.q.setValue(Boolean.TRUE);
                    }
                    u01Var.p(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yz0
    public final void e(long j) {
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                zg0 zg0Var = ss0Var.l;
                zg0 zg0Var2 = ss0Var.m;
                if (ss0Var.c() != null) {
                    zg0Var2.setValue(new ed0(ed0.g(((ed0) zg0Var2.getValue()).a, j)));
                    long jG = ed0.g(((ed0) zg0Var.getValue()).a, ((ed0) zg0Var2.getValue()).a);
                    if (ss0Var.o(jG, ((ed0) zg0Var.getValue()).a, this.b, g2.U)) {
                        zg0Var.setValue(new ed0(jG));
                        zg0Var2.setValue(new ed0(0L));
                        break;
                    }
                }
                break;
            default:
                u01 u01Var = (u01) this.c;
                long jG2 = ed0.g(u01Var.n, j);
                u01Var.n = jG2;
                u01Var.p.setValue(new ed0(ed0.g(u01Var.l, jG2)));
                a11 a11VarJ = u01Var.j();
                ed0 ed0VarG = u01Var.g();
                c10.m(ed0VarG);
                u01.a(u01Var, a11VarJ, ed0VarG.a, false, this.b, g2.U, true);
                u01Var.p(false);
                break;
        }
    }

    @Override // defpackage.yz0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.c;
                ss0Var.s = true;
                ss0Var.p();
                ss0Var.p.setValue(null);
                ss0Var.q.setValue(null);
                break;
        }
    }

    public rs0(boolean z, ss0 ss0Var) {
        this.b = z;
        this.c = ss0Var;
    }

    private final void f() {
    }

    private final void g(long j) {
    }
}
