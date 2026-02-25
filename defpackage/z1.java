package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class z1 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ kw f;
    public final /* synthetic */ zg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(kw kwVar, zg zgVar, int i) {
        super(2);
        this.e = i;
        this.f = kwVar;
        this.g = zgVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        int i = this.e;
        j41 j41Var = j41.a;
        int i2 = 0;
        zg zgVar = this.g;
        kw kwVar = this.f;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar.z()) {
                    ciVar.V(1497073862);
                    if (kwVar != null) {
                        kwVar.e(ciVar, 0);
                    }
                    ciVar.p(false);
                    zgVar.e(ciVar, 0);
                    break;
                } else {
                    ciVar.Q();
                    break;
                }
            default:
                ci ciVar2 = (ci) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !ciVar2.z()) {
                    float f = f2.a;
                    f2.b(b10.b0(1887135077, new z1(kwVar, zgVar, i2), ciVar2), ciVar2, 438);
                    break;
                } else {
                    ciVar2.Q();
                    break;
                }
                break;
        }
        return j41Var;
    }
}
