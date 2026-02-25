package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a2 extends y20 implements kw {
    public final /* synthetic */ kw e;
    public final /* synthetic */ kw f;
    public final /* synthetic */ ju0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ kw m;
    public final /* synthetic */ zg n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kw kwVar, kw kwVar2, ju0 ju0Var, long j, float f, long j2, long j3, long j4, kw kwVar3, zg zgVar) {
        super(2);
        this.e = kwVar;
        this.f = kwVar2;
        this.g = ju0Var;
        this.h = j;
        this.i = f;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = kwVar3;
        this.n = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            zg zgVarB0 = b10.b0(1163543932, new z1(this.m, this.n, 1), ciVar);
            int i = oo.a;
            f2.a(zgVarB0, null, this.e, this.f, this.g, this.h, this.i, lf.e(26, ciVar), this.j, this.k, this.l, ciVar, 6);
        }
        return j41.a;
    }
}
