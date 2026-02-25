package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g01 extends y20 implements kw {
    public final /* synthetic */ c21 e;
    public final /* synthetic */ c21 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ ww0 h;
    public final /* synthetic */ kw i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ww0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(c21 c21Var, c21 c21Var2, float f, c31 c31Var, kw kwVar, boolean z, c31 c31Var2) {
        super(2);
        this.e = c21Var;
        this.f = c21Var2;
        this.g = f;
        this.h = c31Var;
        this.i = kwVar;
        this.j = z;
        this.k = c31Var2;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        zi0 zi0Var;
        vi0 vi0Var;
        ci ciVar = (ci) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && ciVar.z()) {
            ciVar.Q();
        } else {
            c21 c21Var = this.e;
            iw0 iw0Var = c21Var.a;
            c21 c21Var2 = this.f;
            iw0 iw0Var2 = c21Var2.a;
            c11 c11Var = jw0.d;
            c11 c11Var2 = iw0Var.a;
            c11 c11Var3 = iw0Var2.a;
            boolean z = c11Var2 instanceof cc;
            c11 ccVar = b11.a;
            float f = this.g;
            if (!z && !(c11Var3 instanceof cc)) {
                long jM = r31.M(f, c11Var2.a(), c11Var3.a());
                if (jM != 16) {
                    ccVar = new qf(jM);
                }
            } else if (z && (c11Var3 instanceof cc)) {
                ac acVar = (ac) jw0.b(null, null, f);
                float fK = r31.K(((cc) c11Var2).a, ((cc) c11Var3).a, f);
                if (acVar != null) {
                    if (acVar instanceof fw0) {
                        long jT = no0.t(((fw0) acVar).a, fK);
                        if (jT != 16) {
                            ccVar = new qf(jT);
                        }
                    } else {
                        if (!(acVar instanceof bc)) {
                            throw new fg();
                        }
                        ccVar = new cc((bc) acVar, fK);
                    }
                }
            } else {
                ccVar = (c11) jw0.b(c11Var2, c11Var3, f);
            }
            c11 c11Var4 = ccVar;
            vy0 vy0Var = (vy0) jw0.b(iw0Var.f, iw0Var2.f, f);
            long jC = jw0.c(f, iw0Var.b, iw0Var2.b);
            zv zvVar = iw0Var.c;
            if (zvVar == null) {
                zvVar = zv.f;
            }
            zv zvVar2 = iw0Var2.c;
            if (zvVar2 == null) {
                zvVar2 = zv.f;
            }
            zv zvVar3 = new zv(c10.u(r31.L(f, zvVar.d, zvVar2.d), 1, 1000));
            xv xvVar = (xv) jw0.b(iw0Var.d, iw0Var2.d, f);
            yv yvVar = (yv) jw0.b(iw0Var.e, iw0Var2.e, f);
            String str = (String) jw0.b(iw0Var.g, iw0Var2.g, f);
            long jC2 = jw0.c(f, iw0Var.h, iw0Var2.h);
            ja jaVar = iw0Var.i;
            float f2 = jaVar != null ? jaVar.a : 0.0f;
            ja jaVar2 = iw0Var2.i;
            float fK2 = r31.K(f2, jaVar2 != null ? jaVar2.a : 0.0f, f);
            d11 d11Var = iw0Var.j;
            d11 d11Var2 = d11.c;
            if (d11Var == null) {
                d11Var = d11Var2;
            }
            d11 d11Var3 = iw0Var2.j;
            if (d11Var3 != null) {
                d11Var2 = d11Var3;
            }
            d11 d11Var4 = new d11(r31.K(d11Var.a, d11Var2.a, f), r31.K(d11Var.b, d11Var2.b, f));
            d60 d60Var = (d60) jw0.b(iw0Var.k, iw0Var2.k, f);
            long jM2 = r31.M(f, iw0Var.l, iw0Var2.l);
            uz0 uz0Var = (uz0) jw0.b(iw0Var.m, iw0Var2.m, f);
            hu0 hu0Var = iw0Var.n;
            if (hu0Var == null) {
                hu0Var = new hu0();
            }
            hu0 hu0Var2 = iw0Var2.n;
            if (hu0Var2 == null) {
                hu0Var2 = new hu0();
            }
            long jM3 = r31.M(f, hu0Var.a, hu0Var2.a);
            long j = hu0Var.b;
            long j2 = hu0Var2.b;
            hu0 hu0Var3 = new hu0(r31.K(hu0Var.c, hu0Var2.c, f), jM3, (Float.floatToRawIntBits(r31.K(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f)) << 32) | (Float.floatToRawIntBits(r31.K(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f)) & 4294967295L));
            zi0 zi0Var2 = iw0Var.o;
            zi0 zi0Var3 = iw0Var2.o;
            if (zi0Var2 == null && zi0Var3 == null) {
                zi0Var = null;
            } else {
                if (zi0Var2 == null) {
                    zi0Var2 = zi0.a;
                }
                zi0Var = zi0Var2;
            }
            iw0 iw0Var3 = new iw0(c11Var4, jC, zvVar3, xvVar, yvVar, vy0Var, str, jC2, new ja(fK2), d11Var4, d60Var, jM2, uz0Var, hu0Var3, zi0Var, (tq) jw0.b(iw0Var.p, iw0Var2.p, f));
            tg0 tg0Var = c21Var.b;
            tg0 tg0Var2 = c21Var2.b;
            int i = ug0.b;
            int i2 = ((oz0) jw0.b(new oz0(tg0Var.a), new oz0(tg0Var2.a), f)).a;
            int i3 = ((xz0) jw0.b(new xz0(tg0Var.b), new xz0(tg0Var2.b), f)).a;
            long jC3 = jw0.c(f, tg0Var.c, tg0Var2.c);
            e11 e11Var = tg0Var.d;
            if (e11Var == null) {
                e11Var = e11.c;
            }
            e11 e11Var2 = tg0Var2.d;
            if (e11Var2 == null) {
                e11Var2 = e11.c;
            }
            e11 e11Var3 = new e11(jw0.c(f, e11Var.a, e11Var2.a), jw0.c(f, e11Var.b, e11Var2.b));
            vi0 vi0Var2 = tg0Var.e;
            vi0 vi0Var3 = tg0Var2.e;
            if (vi0Var2 == null && vi0Var3 == null) {
                vi0Var = null;
            } else {
                vi0 vi0Var4 = vi0.b;
                vi0 vi0Var5 = vi0Var2 == null ? vi0Var4 : vi0Var2;
                boolean z2 = vi0Var5.a;
                if (vi0Var3 == null) {
                    vi0Var3 = vi0Var4;
                }
                boolean z3 = vi0Var3.a;
                if (z2 != z3) {
                    ((es) jw0.b(new es(), new es(), f)).getClass();
                    vi0Var5 = new vi0(((Boolean) jw0.b(Boolean.valueOf(z2), Boolean.valueOf(z3), f)).booleanValue());
                }
                vi0Var = vi0Var5;
            }
            c21 c21Var3 = new c21(iw0Var3, new tg0(i2, i3, jC3, e11Var3, vi0Var, (p50) jw0.b(tg0Var.f, tg0Var2.f, f), ((k50) jw0.b(new k50(tg0Var.g), new k50(tg0Var2.g), f)).a, ((py) jw0.b(new py(tg0Var.h), new py(tg0Var2.h), f)).a, (u11) jw0.b(tg0Var.i, tg0Var2.i, f)));
            if (this.j) {
                c21Var3 = c21.a(c21Var3, ((bf) this.k.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            j01.b(((bf) this.h.getValue()).a, c21Var3, this.i, ciVar, 0);
        }
        return j41.a;
    }
}
