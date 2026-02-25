package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class rk extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [gw, y20] */
    @Override // defpackage.iw
    public final Object g(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                r40 r40Var = (r40) this.f;
                if (r40Var.b()) {
                    f11 f11Var = (f11) this.g;
                    a11 a11Var = (a11) this.h;
                    xz xzVar = r40Var.d;
                    xy xyVar = (xy) this.i;
                    xk xkVar = r40Var.t;
                    xk xkVar2 = r40Var.u;
                    dm0 dm0Var = new dm0();
                    u7 u7Var = new u7(xzVar, xkVar, dm0Var, 8);
                    dj0 dj0Var = f11Var.a;
                    dj0Var.a(a11Var, xyVar, u7Var, xkVar2);
                    j11 j11Var = new j11(f11Var, dj0Var);
                    f11Var.b.set(j11Var);
                    dm0Var.d = j11Var;
                    r40Var.e = j11Var;
                }
                break;
            case 1:
                d8 d8Var = (d8) obj;
                float fFloatValue = ((Number) d8Var.e.getValue()).floatValue();
                am0 am0Var = (am0) this.f;
                float f = fFloatValue - am0Var.d;
                float fA = ((ir0) this.g).a(f);
                am0Var.d = ((Number) d8Var.e.getValue()).floatValue();
                ((am0) this.h).d = ((Number) d8Var.a.b.g(d8Var.f)).floatValue();
                if (Math.abs(f - fA) > 0.5f) {
                    d8Var.i.setValue(Boolean.FALSE);
                    d8Var.d.a();
                }
                ((xz) this.i).getClass();
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                wl wlVar = (wl) this.i;
                am0 am0Var2 = (am0) this.h;
                nz nzVar = (nz) this.g;
                ww0 ww0Var = (ww0) ((za0) this.f).getValue();
                long jLongValue2 = ww0Var != null ? ((Number) ww0Var.getValue()).longValue() : jLongValue;
                long j = nzVar.c;
                eb0 eb0Var = nzVar.a;
                int i = 0;
                if (j == Long.MIN_VALUE || am0Var2.d != dq0.h(wlVar.g())) {
                    nzVar.c = jLongValue;
                    int i2 = eb0Var.f;
                    if (i2 > 0) {
                        Object[] objArr = eb0Var.d;
                        int i3 = 0;
                        do {
                            ((lz) objArr[i3]).j = true;
                            i3++;
                        } while (i3 < i2);
                    }
                    am0Var2.d = dq0.h(wlVar.g());
                }
                float f2 = am0Var2.d;
                if (f2 == 0.0f) {
                    int i4 = eb0Var.f;
                    if (i4 > 0) {
                        Object[] objArr2 = eb0Var.d;
                        do {
                            lz lzVar = (lz) objArr2[i];
                            lzVar.g.setValue(lzVar.h.c);
                            lzVar.j = true;
                            i++;
                        } while (i < i4);
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - nzVar.c) / f2);
                    int i5 = eb0Var.f;
                    if (i5 > 0) {
                        Object[] objArr3 = eb0Var.d;
                        int i6 = 0;
                        z = true;
                        do {
                            lz lzVar2 = (lz) objArr3[i6];
                            if (!lzVar2.i) {
                                lzVar2.l.b.setValue(Boolean.FALSE);
                                if (lzVar2.j) {
                                    lzVar2.j = false;
                                    lzVar2.k = j2;
                                }
                                long j3 = j2 - lzVar2.k;
                                lzVar2.g.setValue(lzVar2.h.b(j3));
                                lzVar2.i = lzVar2.h.g(j3);
                            }
                            if (!lzVar2.i) {
                                z = false;
                            }
                            i6++;
                        } while (i6 < i5);
                    } else {
                        z = true;
                    }
                    nzVar.d.setValue(Boolean.valueOf(!z));
                }
                break;
        }
        return j41.a;
    }
}
