package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vx0 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ wx0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx0(wx0 wx0Var, int i) {
        super(2);
        this.e = i;
        this.f = wx0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                this.f.a().e = (hi) obj2;
                break;
            case 1:
                f40 f40VarA = this.f.a();
                ((t30) obj).b0(new c40(f40VarA, (kw) obj2, f40VarA.r));
                break;
            default:
                t30 t30Var = (t30) obj;
                f40 f40Var = t30Var.I;
                if (f40Var == null) {
                    f40Var = new f40(t30Var);
                    t30Var.I = f40Var;
                }
                wx0 wx0Var = this.f;
                wx0Var.a = f40Var;
                wx0Var.a().d();
                wx0Var.a();
                break;
        }
        return j41.a;
    }
}
