package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class za extends y20 implements iw {
    public final /* synthetic */ xl0 e;
    public final /* synthetic */ dm0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ta h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(xl0 xl0Var, dm0 dm0Var, long j, ta taVar) {
        super(1);
        this.e = xl0Var;
        this.f = dm0Var;
        this.g = j;
        this.h = taVar;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        v30 v30Var = (v30) obj;
        v30Var.a();
        xl0 xl0Var = this.e;
        float f = xl0Var.a;
        float f2 = xl0Var.b;
        dm0 dm0Var = this.f;
        long j = this.g;
        ta taVar = this.h;
        fd fdVar = v30Var.d;
        ((r1) fdVar.e.a).s(f, f2);
        try {
            sq.z(v30Var, (r5) dm0Var.d, j, 0.0f, taVar, 890);
            ((r1) fdVar.e.a).s(-f, -f2);
            return j41.a;
        } catch (Throwable th) {
            ((r1) fdVar.e.a).s(-f, -f2);
            throw th;
        }
    }
}
