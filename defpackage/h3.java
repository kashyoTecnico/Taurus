package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h3 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ dm0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(dm0 dm0Var, int i) {
        super(1);
        this.e = i;
        this.f = dm0Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                this.f.d = (av) obj;
                return Boolean.TRUE;
            case 1:
                jj0 jj0Var = (jj0) obj;
                dm0 dm0Var = this.f;
                Object obj2 = dm0Var.d;
                if (obj2 == null && jj0Var.s) {
                    dm0Var.d = jj0Var;
                } else if (obj2 != null) {
                    jj0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                ln lnVar = (j31) obj;
                if (((d90) lnVar).d.q) {
                    this.f.d = lnVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
