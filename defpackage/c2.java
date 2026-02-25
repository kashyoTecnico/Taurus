package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c2 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(String str, int i) {
        super(1);
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        int i = this.e;
        j41 j41Var = j41.a;
        String str = this.f;
        switch (i) {
            case 0:
                h20[] h20VarArr = nt0.a;
                ot0 ot0Var = lt0.d;
                h20 h20Var = nt0.a[2];
                ot0Var.a((ct0) obj, str);
                break;
            default:
                h20[] h20VarArr2 = nt0.a;
                ((ct0) obj).d(lt0.a, d80.t(str));
                break;
        }
        return j41Var;
    }
}
