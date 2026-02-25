package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class u4 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(long j, jg0 jg0Var, zg zgVar) {
        super(2);
        this.e = 1;
        this.f = j;
        this.g = jg0Var;
        this.h = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                id0 id0Var = (id0) this.g;
                e90 e90Var = (e90) this.h;
                z4.a(id0Var, e90Var, this.f, (ci) obj, d80.I(1));
                break;
            case 1:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
                    ciVar.Q();
                } else {
                    nm.g(this.f, ((b41) ciVar.j(c41.a)).m, b10.b0(1327513942, new h4(3, (jg0) this.g, (zg) this.h), ciVar), ciVar, 384);
                }
                break;
            default:
                ((Number) obj2).intValue();
                uy uyVar = (uy) this.g;
                e90 e90Var2 = (e90) this.h;
                ry.a(uyVar, e90Var2, this.f, (ci) obj, d80.I(433));
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4(Object obj, e90 e90Var, long j, int i, int i2) {
        super(2);
        this.e = i2;
        this.g = obj;
        this.h = e90Var;
        this.f = j;
    }
}
