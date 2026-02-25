package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j80 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ k80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j80(k80 k80Var, int i) {
        super(0);
        this.e = i;
        this.f = k80Var;
    }

    @Override // defpackage.gw
    public final Object a() {
        ni0 placementScope;
        switch (this.e) {
            case 0:
                k80 k80Var = this.f;
                w30 w30Var = k80Var.i;
                w30Var.i = 0;
                eb0 eb0VarX = w30Var.a.x();
                Object[] objArr = eb0VarX.d;
                int i = eb0VarX.f;
                for (int i2 = 0; i2 < i; i2++) {
                    k80 k80Var2 = ((t30) objArr[i2]).H.p;
                    k80Var2.k = k80Var2.l;
                    k80Var2.l = Integer.MAX_VALUE;
                    k80Var2.v = false;
                    if (k80Var2.o == r30.e) {
                        k80Var2.o = r30.f;
                    }
                }
                t30 t30Var = w30Var.a;
                t30 t30Var2 = w30Var.a;
                eb0 eb0VarX2 = t30Var.x();
                Object[] objArr2 = eb0VarX2.d;
                int i3 = eb0VarX2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((t30) objArr2[i4]).H.p.z.getClass();
                }
                k80Var.o().w0().b();
                eb0 eb0VarX3 = t30Var2.x();
                Object[] objArr3 = eb0VarX3.d;
                int i5 = eb0VarX3.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    t30 t30Var3 = (t30) objArr3[i6];
                    w30 w30Var2 = t30Var3.H;
                    if (w30Var2.p.k != t30Var3.u()) {
                        t30Var2.N();
                        t30Var2.A();
                        if (t30Var3.u() == Integer.MAX_VALUE) {
                            if (w30Var2.c) {
                                c70 c70Var = w30Var2.q;
                                c10.m(c70Var);
                                c70Var.k0(false);
                            }
                            w30Var2.p.p0();
                        }
                    }
                }
                eb0 eb0VarX4 = t30Var2.x();
                Object[] objArr4 = eb0VarX4.d;
                int i7 = eb0VarX4.f;
                for (int i8 = 0; i8 < i7; i8++) {
                    u30 u30Var = ((t30) objArr4[i8]).H.p.z;
                    u30Var.getClass();
                    u30Var.c = false;
                }
                break;
            case 1:
                k80 k80Var3 = this.f;
                k80Var3.i.a().e(k80Var3.D);
                break;
            default:
                k80 k80Var4 = this.f;
                w30 w30Var3 = k80Var4.i;
                nc0 nc0Var = w30Var3.a().t;
                if (nc0Var == null || (placementScope = nc0Var.o) == null) {
                    placementScope = ((p3) r31.U(w30Var3.a)).getPlacementScope();
                }
                iw iwVar = k80Var4.I;
                if (iwVar == null) {
                    nc0 nc0VarA = w30Var3.a();
                    long j = k80Var4.J;
                    float f = k80Var4.K;
                    placementScope.getClass();
                    ni0.a(placementScope, nc0VarA);
                    nc0VarA.g0(m00.c(j, nc0VarA.h), f, null);
                } else {
                    nc0 nc0VarA2 = w30Var3.a();
                    long j2 = k80Var4.J;
                    float f2 = k80Var4.K;
                    placementScope.getClass();
                    ni0.a(placementScope, nc0VarA2);
                    nc0VarA2.g0(m00.c(j2, nc0VarA2.h), f2, iwVar);
                }
                break;
        }
        return j41.a;
    }
}
