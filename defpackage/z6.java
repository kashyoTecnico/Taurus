package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z6 extends y20 implements kw {
    public final /* synthetic */ c61 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ e90 h;
    public final /* synthetic */ id0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(c61 c61Var, long j, boolean z, e90 e90Var, id0 id0Var) {
        super(2);
        this.e = c61Var;
        this.f = j;
        this.g = z;
        this.h = e90Var;
        this.i = id0Var;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            c4.b(ti.s.a(this.e), b10.b0(-1426434671, new y6(this.f, this.g, this.h, this.i), ciVar), ciVar, 56);
        }
        return j41.a;
    }
}
