package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zk extends y20 implements iw {
    public final /* synthetic */ r40 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ s61 g;
    public final /* synthetic */ u01 h;
    public final /* synthetic */ a11 i;
    public final /* synthetic */ hd0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(r40 r40Var, boolean z, s61 s61Var, u01 u01Var, a11 a11Var, hd0 hd0Var) {
        super(1);
        this.e = r40Var;
        this.f = z;
        this.g = s61Var;
        this.h = u01Var;
        this.i = a11Var;
        this.j = hd0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        j11 j11Var;
        d30 d30Var;
        d30 d30Var2;
        d30 d30Var3 = (d30) obj;
        r40 r40Var = this.e;
        zg0 zg0Var = r40Var.o;
        r40Var.h = d30Var3;
        p11 p11VarD = r40Var.d();
        if (p11VarD != null) {
            p11VarD.b = d30Var3;
        }
        if (this.f) {
            px pxVarA = r40Var.a();
            px pxVar = px.e;
            a11 a11Var = this.i;
            u01 u01Var = this.h;
            if (pxVarA == pxVar) {
                if (((Boolean) r40Var.l.getValue()).booleanValue() && ((Boolean) ((l40) this.g).a.getValue()).booleanValue()) {
                    u01Var.o();
                } else {
                    u01Var.k();
                }
                r40Var.m.setValue(Boolean.valueOf(dq0.j(u01Var, true)));
                r40Var.n.setValue(Boolean.valueOf(dq0.j(u01Var, false)));
                zg0Var.setValue(Boolean.valueOf(w11.b(a11Var.b)));
            } else if (r40Var.a() == px.f) {
                zg0Var.setValue(Boolean.valueOf(dq0.j(u01Var, true)));
            }
            hd0 hd0Var = this.j;
            b10.V(r40Var, a11Var, hd0Var);
            p11 p11VarD2 = r40Var.d();
            if (p11VarD2 != null && (j11Var = r40Var.e) != null && r40Var.b() && (d30Var = p11VarD2.b) != null && d30Var.H() && (d30Var2 = p11VarD2.c) != null) {
                o11 o11Var = p11VarD2.a;
                ey0 ey0Var = new ey0(3, d30Var);
                xl0 xl0VarF0 = r31.f0(d30Var);
                xl0 xl0VarP = d30Var.P(d30Var2, false);
                if (c10.i((j11) j11Var.a.b.get(), j11Var)) {
                    j11Var.b.h(a11Var, hd0Var, o11Var, ey0Var, xl0VarF0, xl0VarP);
                }
            }
        }
        return j41.a;
    }
}
