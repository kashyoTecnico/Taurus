package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class g3 extends y20 implements gw {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(int i, Object obj, Object obj2) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [eb0] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [eb0] */
    @Override // defpackage.gw
    public final Object a() {
        gt0 gt0Var;
        t30 t30Var;
        long j;
        p11 p11VarD;
        r40 r40Var;
        q8 q8Var;
        int i = this.e;
        long jE = 9205357640488583168L;
        int i2 = 1;
        j41 j41Var = j41.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                w3 w3Var = (w3) obj;
                oq0 oq0Var = (oq0) obj2;
                jq0 jq0Var = oq0Var.h;
                jq0 jq0Var2 = oq0Var.i;
                Float f = oq0Var.f;
                Float f2 = oq0Var.g;
                float fFloatValue = (jq0Var == null || f == null) ? 0.0f : ((Number) jq0Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (jq0Var2 == null || f2 == null) ? 0.0f : ((Number) jq0Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iS = w3Var.s(oq0Var.d);
                    it0 it0Var = (it0) w3Var.l().b(w3Var.n);
                    if (it0Var != null) {
                        try {
                            z0 z0Var = w3Var.p;
                            if (z0Var != null) {
                                z0Var.a.setBoundsInScreen(w3Var.c(it0Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    it0 it0Var2 = (it0) w3Var.l().b(w3Var.o);
                    if (it0Var2 != null) {
                        try {
                            z0 z0Var2 = w3Var.q;
                            if (z0Var2 != null) {
                                z0Var2.a.setBoundsInScreen(w3Var.c(it0Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    w3Var.d.invalidate();
                    it0 it0Var3 = (it0) w3Var.l().b(iS);
                    if (it0Var3 != null && (gt0Var = it0Var3.a) != null && (t30Var = gt0Var.c) != null) {
                        if (jq0Var != null) {
                            w3Var.s.g(iS, jq0Var);
                        }
                        if (jq0Var2 != null) {
                            w3Var.t.g(iS, jq0Var2);
                        }
                        w3Var.o(t30Var);
                    }
                }
                if (jq0Var != null) {
                    oq0Var.f = (Float) jq0Var.a.a();
                }
                if (jq0Var2 != null) {
                    oq0Var.g = (Float) jq0Var2.a.a();
                }
                return j41Var;
            case 2:
                ((ld) obj2).u(obj);
                return j41Var;
            case 3:
                a11 a11Var = (a11) obj2;
                za0 za0Var = (za0) obj;
                if (!w11.a(a11Var.b, ((a11) za0Var.getValue()).b) || !c10.i(a11Var.c, ((a11) za0Var.getValue()).c)) {
                    za0Var.setValue(a11Var);
                }
                return j41Var;
            case 4:
                ((qc) obj2).t.g((rc) obj);
                return j41Var;
            case 5:
                ((r40) obj2).u.g(new wy(((xy) obj).d));
                return Boolean.TRUE;
            case 6:
                r40 r40Var2 = (r40) obj2;
                vu vuVar = (vu) obj;
                if (r40Var2.b()) {
                    cw0 cw0Var = r40Var2.c;
                    if (cw0Var != null) {
                        ((nn) cw0Var).b();
                    }
                } else {
                    vuVar.getClass();
                    vuVar.a(new uu(i2));
                }
                return Boolean.TRUE;
            case 7:
                ((dm0) obj2).d = ((av) obj).B0();
                return j41Var;
            case 8:
                ((dm0) obj2).d = l81.A((fv) obj, mi0.a);
                return j41Var;
            case 9:
                ((dy) obj2).d((d90) obj);
                return j41Var;
            case 10:
                jc0 jc0Var = ((t30) obj2).G;
                dm0 dm0Var = (dm0) obj;
                if ((jc0Var.f.g & 8) != 0) {
                    for (d90 d90Var = jc0Var.e; d90Var != null; d90Var = d90Var.h) {
                        if ((d90Var.f & 8) != 0) {
                            mn mnVarI = d90Var;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof et0) {
                                    et0 et0Var = (et0) mnVarI;
                                    if (et0Var.c0()) {
                                        ct0 ct0Var = new ct0();
                                        dm0Var.d = ct0Var;
                                        ct0Var.g = true;
                                    }
                                    if (et0Var.e0()) {
                                        ((ct0) dm0Var.d).f = true;
                                    }
                                    et0Var.K((ct0) dm0Var.d);
                                } else if ((mnVarI.f & 8) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var2 = mnVarI.s;
                                    int i3 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var2 != null) {
                                        if ((d90Var2.f & 8) != 0) {
                                            i3++;
                                            eb0Var = eb0Var;
                                            if (i3 == 1) {
                                                mnVarI = d90Var2;
                                            } else {
                                                if (eb0Var == 0) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (mnVarI != 0) {
                                                    eb0Var.b(mnVarI);
                                                    mnVarI = 0;
                                                }
                                                eb0Var.b(d90Var2);
                                            }
                                        }
                                        d90Var2 = d90Var2.i;
                                        mnVarI = mnVarI;
                                        eb0Var = eb0Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                    }
                }
                return j41Var;
            case 11:
                c70 c70Var = (c70) obj2;
                w30 w30Var = c70Var.i;
                w30Var.h = 0;
                eb0 eb0VarX = w30Var.a.x();
                Object[] objArr = eb0VarX.d;
                int i4 = eb0VarX.f;
                for (int i5 = 0; i5 < i4; i5++) {
                    c70 c70Var2 = ((t30) objArr[i5]).H.q;
                    c10.m(c70Var2);
                    c70Var2.k = c70Var2.l;
                    c70Var2.l = Integer.MAX_VALUE;
                    if (c70Var2.m == r30.e) {
                        c70Var2.m = r30.f;
                    }
                }
                t30 t30Var2 = w30Var.a;
                t30 t30Var3 = w30Var.a;
                eb0 eb0VarX2 = t30Var2.x();
                Object[] objArr2 = eb0VarX2.d;
                int i6 = eb0VarX2.f;
                for (int i7 = 0; i7 < i6; i7++) {
                    c70 c70Var3 = ((t30) objArr2[i7]).H.q;
                    c10.m(c70Var3);
                    c70Var3.t.getClass();
                }
                uz uzVar = c70Var.o().S;
                if (uzVar != null) {
                    boolean z = uzVar.n;
                    bb0 bb0Var = (bb0) t30Var3.m();
                    int i8 = bb0Var.d.f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        x60 x60VarM0 = ((t30) bb0Var.get(i9)).G.d.M0();
                        if (x60VarM0 != null) {
                            x60VarM0.n = z;
                        }
                    }
                }
                ((x60) obj).w0().b();
                if (c70Var.o().S != null) {
                    bb0 bb0Var2 = (bb0) t30Var3.m();
                    int i10 = bb0Var2.d.f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        x60 x60VarM02 = ((t30) bb0Var2.get(i11)).G.d.M0();
                        if (x60VarM02 != null) {
                            x60VarM02.n = false;
                        }
                    }
                }
                eb0 eb0VarX3 = t30Var3.x();
                Object[] objArr3 = eb0VarX3.d;
                int i12 = eb0VarX3.f;
                for (int i13 = 0; i13 < i12; i13++) {
                    c70 c70Var4 = ((t30) objArr3[i13]).H.q;
                    c10.m(c70Var4);
                    int i14 = c70Var4.k;
                    int i15 = c70Var4.l;
                    if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                        c70Var4.k0(true);
                    }
                }
                eb0 eb0VarX4 = t30Var3.x();
                Object[] objArr4 = eb0VarX4.d;
                int i16 = eb0VarX4.f;
                for (int i17 = 0; i17 < i16; i17++) {
                    c70 c70Var5 = ((t30) objArr4[i17]).H.q;
                    c10.m(c70Var5);
                    u30 u30Var = c70Var5.t;
                    u30Var.getClass();
                    u30Var.c = false;
                }
                return j41Var;
            case 12:
                xl0 xl0Var = (xl0) obj2;
                if (xl0Var != null) {
                    return xl0Var;
                }
                nc0 nc0Var = (nc0) obj;
                if (!nc0Var.O0().q) {
                    nc0Var = null;
                }
                if (nc0Var != null) {
                    return c4.f(0L, d80.F(nc0Var.f));
                }
                return null;
            case 13:
                ss0 ss0Var = (ss0) obj2;
                long j2 = ((t00) ((za0) obj).getValue()).a;
                sr0 sr0VarE = ss0Var.e();
                if (sr0VarE != null) {
                    nx nxVarC = ss0Var.c();
                    int i18 = nxVarC == null ? -1 : ts0.a[nxVarC.ordinal()];
                    if (i18 != -1) {
                        if (i18 == 1) {
                            jE = r31.E(ss0Var, j2, sr0VarE.a);
                        } else {
                            if (i18 != 2) {
                                if (i18 != 3) {
                                    throw new fg();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            jE = r31.E(ss0Var, j2, sr0VarE.b);
                        }
                    }
                }
                return new ed0(jE);
            default:
                u01 u01Var = (u01) obj2;
                long j3 = ((t00) ((za0) obj).getValue()).a;
                ed0 ed0VarG = u01Var.g();
                if (ed0VarG != null) {
                    long j4 = ed0VarG.a;
                    r40 r40Var3 = u01Var.d;
                    q8 q8Var2 = r40Var3 != null ? r40Var3.a.a : null;
                    if (q8Var2 != null && q8Var2.e.length() != 0) {
                        nx nxVar = (nx) u01Var.o.getValue();
                        int i19 = nxVar == null ? -1 : w01.a[nxVar.ordinal()];
                        if (i19 != -1) {
                            if (i19 == 1 || i19 == 2) {
                                long j5 = u01Var.j().b;
                                int i20 = w11.c;
                                j = j5 >> 32;
                            } else {
                                if (i19 != 3) {
                                    throw new fg();
                                }
                                long j6 = u01Var.j().b;
                                int i21 = w11.c;
                                j = j6 & 4294967295L;
                            }
                            int i22 = (int) j;
                            r40 r40Var4 = u01Var.d;
                            if (r40Var4 != null && (p11VarD = r40Var4.d()) != null && (r40Var = u01Var.d) != null && (q8Var = r40Var.a.a) != null) {
                                int iU = c10.u(u01Var.b.d(i22), 0, q8Var.e.length());
                                float fD = ed0.d(p11VarD.d(j4));
                                o11 o11Var = p11VarD.a;
                                int iF = o11Var.f(iU);
                                u90 u90Var = o11Var.b;
                                float fG = o11Var.g(iF);
                                float fH = o11Var.h(iF);
                                float fT = c10.t(fD, Math.min(fG, fH), Math.max(fG, fH));
                                if (t00.a(j3, 0L) || Math.abs(fD - fT) <= ((int) (j3 >> 32)) / 2) {
                                    float fD2 = u90Var.d(iF);
                                    jE = nm.f(fT, ((u90Var.b(iF) - fD2) / 2) + fD2);
                                }
                            }
                        }
                    }
                }
                return new ed0(jE);
        }
    }
}
