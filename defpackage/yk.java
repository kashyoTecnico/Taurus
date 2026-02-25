package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class yk extends y20 implements iw {
    public final /* synthetic */ r40 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f11 g;
    public final /* synthetic */ a11 h;
    public final /* synthetic */ xy i;
    public final /* synthetic */ hd0 j;
    public final /* synthetic */ u01 k;
    public final /* synthetic */ wl l;
    public final /* synthetic */ lb m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(r40 r40Var, boolean z, f11 f11Var, a11 a11Var, xy xyVar, hd0 hd0Var, u01 u01Var, wl wlVar, lb lbVar) {
        super(1);
        this.e = r40Var;
        this.f = z;
        this.g = f11Var;
        this.h = a11Var;
        this.i = xyVar;
        this.j = hd0Var;
        this.k = u01Var;
        this.l = wlVar;
        this.m = lbVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        p11 p11VarD;
        yu yuVar = (yu) obj;
        r40 r40Var = this.e;
        if (r40Var.b() != yuVar.a()) {
            r40Var.f.setValue(Boolean.valueOf(yuVar.a()));
            boolean zB = r40Var.b();
            hd0 hd0Var = this.j;
            a11 a11Var = this.h;
            if (zB && this.f) {
                b10.o(this.g, r40Var, a11Var, this.i, hd0Var);
            } else {
                b10.l(r40Var);
            }
            if (yuVar.a() && (p11VarD = r40Var.d()) != null) {
                nm.z(this.l, null, new x5(this.m, a11Var, r40Var, p11VarD, hd0Var, null, 3), 3);
            }
            if (!yuVar.a()) {
                this.k.e(null);
            }
        }
        return j41.a;
    }
}
