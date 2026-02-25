package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class al extends y20 implements iw {
    public final /* synthetic */ r40 e;
    public final /* synthetic */ vu f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ u01 h;
    public final /* synthetic */ hd0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(r40 r40Var, vu vuVar, boolean z, u01 u01Var, hd0 hd0Var) {
        super(1);
        this.e = r40Var;
        this.f = vuVar;
        this.g = z;
        this.h = u01Var;
        this.i = hd0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        long j = ((ed0) obj).a;
        r40 r40Var = this.e;
        if (r40Var.b()) {
            cw0 cw0Var = r40Var.c;
            if (cw0Var != null) {
                ((nn) cw0Var).b();
            }
        } else {
            vu vuVar = this.f;
            vuVar.getClass();
            vuVar.a(new uu(1));
        }
        if (r40Var.b() && this.g) {
            if (r40Var.a() != px.e) {
                p11 p11VarD = r40Var.d();
                if (p11VarD != null) {
                    xz xzVar = r40Var.d;
                    xk xkVar = r40Var.t;
                    int iA = this.i.a(p11VarD.b(j, true));
                    xkVar.g(a11.a((a11) xzVar.e, null, no0.a(iA, iA), 5));
                    if (r40Var.a.a.e.length() > 0) {
                        r40Var.k.setValue(px.f);
                    }
                }
            } else {
                this.h.e(new ed0(j));
            }
        }
        return j41.a;
    }
}
