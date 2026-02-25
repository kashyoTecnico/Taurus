package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class el extends y20 implements iw {
    public final /* synthetic */ y21 e;
    public final /* synthetic */ a11 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xy h;
    public final /* synthetic */ r40 i;
    public final /* synthetic */ hd0 j;
    public final /* synthetic */ u01 k;
    public final /* synthetic */ vu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(y21 y21Var, a11 a11Var, boolean z, xy xyVar, r40 r40Var, hd0 hd0Var, u01 u01Var, vu vuVar) {
        super(1);
        this.e = y21Var;
        this.f = a11Var;
        this.g = z;
        this.h = xyVar;
        this.i = r40Var;
        this.j = hd0Var;
        this.k = u01Var;
        this.l = vuVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        ct0 ct0Var = (ct0) obj;
        q8 q8Var = this.e.a;
        h20[] h20VarArr = nt0.a;
        ot0 ot0Var = lt0.E;
        h20[] h20VarArr2 = nt0.a;
        h20 h20Var = h20VarArr2[18];
        ot0Var.a(ct0Var, q8Var);
        a11 a11Var = this.f;
        long j = a11Var.b;
        ot0 ot0Var2 = lt0.F;
        h20 h20Var2 = h20VarArr2[19];
        ot0Var2.a(ct0Var, new w11(j));
        j41 j41Var = j41.a;
        boolean z = this.g;
        if (!z) {
            ct0Var.d(lt0.i, j41Var);
        }
        ot0 ot0Var3 = lt0.L;
        h20 h20Var3 = h20VarArr2[25];
        ot0Var3.a(ct0Var, Boolean.valueOf(z));
        r40 r40Var = this.i;
        nt0.a(ct0Var, new xk(r40Var, 2));
        if (z) {
            ct0Var.d(bt0.i, new j0(null, new xk(r40Var, ct0Var)));
            ct0Var.d(bt0.m, new j0(null, new cl(z, r40Var, ct0Var, a11Var)));
        }
        hd0 hd0Var = this.j;
        boolean z2 = this.g;
        u01 u01Var = this.k;
        ct0Var.d(bt0.h, new j0(null, new dl(hd0Var, z2, a11Var, u01Var, r40Var)));
        xy xyVar = this.h;
        int i = xyVar.d;
        g3 g3Var = new g3(5, r40Var, xyVar);
        ct0Var.d(lt0.G, new wy(i));
        ct0Var.d(bt0.n, new j0(null, g3Var));
        ct0Var.d(bt0.b, new j0(null, new g3(6, r40Var, this.l)));
        ct0Var.d(bt0.c, new j0(null, new bl(u01Var, 1)));
        if (!w11.b(j)) {
            ct0Var.d(bt0.o, new j0(null, new bl(u01Var, 2)));
            if (z) {
                ct0Var.d(bt0.p, new j0(null, new bl(u01Var, 3)));
            }
        }
        if (z) {
            ct0Var.d(bt0.q, new j0(null, new bl(u01Var, 0)));
        }
        return j41Var;
    }
}
