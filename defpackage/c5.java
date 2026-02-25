package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c5 extends y20 implements kw {
    public final /* synthetic */ int e;
    public final /* synthetic */ ow f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c5(ck ckVar, gw gwVar, iw iwVar, int i) {
        super(2);
        this.e = 2;
        this.i = ckVar;
        this.h = gwVar;
        this.f = (y20) iwVar;
        this.g = i;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [iw, y20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [iw, y20] */
    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Number) obj2).intValue();
                l81.b((gw) this.h, (no) this.i, (zg) this.f, (ci) obj, d80.I(this.g | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                m20.d((id0) this.h, (h2) this.i, (zg) this.f, (ci) obj, d80.I(this.g | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ck ckVar = (ck) this.i;
                gw gwVar = (gw) this.h;
                ?? r3 = (y20) this.f;
                d80.b(ckVar, gwVar, b90.a, r3, (ci) obj, d80.I(this.g | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                gk.d((xj0) this.i, (gw) this.h, (y20) this.f, (ci) obj, d80.I(this.g | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                dp0.b((sr0) this.h, (iw) this.i, (zg) this.f, (ci) obj, d80.I(this.g | 1));
                break;
            default:
                ((Number) obj2).intValue();
                l81.h((wx0) this.h, (e90) this.i, (kw) this.f, (ci) obj, d80.I(this.g | 1));
                break;
        }
        return j41.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c5(xj0 xj0Var, gw gwVar, iw iwVar, int i) {
        super(2);
        this.e = 3;
        this.i = xj0Var;
        this.h = gwVar;
        this.f = (y20) iwVar;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(sr0 sr0Var, iw iwVar, zg zgVar, int i) {
        super(2);
        this.e = 4;
        this.h = sr0Var;
        this.i = iwVar;
        this.f = zgVar;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(Object obj, Object obj2, kw kwVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.h = obj;
        this.i = obj2;
        this.f = kwVar;
        this.g = i;
    }
}
