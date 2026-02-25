package defpackage;

import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h9 {
    public static volatile h9 b;
    public final Object a;

    public h9(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                Executors.newFixedThreadPool(4, new jn());
                break;
            default:
                this.a = new h9(1);
                break;
        }
    }

    public static final void a(ci ciVar, e90 e90Var) {
        e5 e5Var = e5.g;
        int iJ = c10.J(ciVar);
        e90 e90VarP = r31.P(ciVar, e90Var);
        wh0 wh0VarL = ciVar.l();
        sh.b.getClass();
        si siVar = rh.b;
        ciVar.X();
        if (ciVar.S) {
            ciVar.k(siVar);
        } else {
            ciVar.h0();
        }
        dq0.m(ciVar, rh.e, e5Var);
        dq0.m(ciVar, rh.d, wh0VarL);
        dq0.m(ciVar, rh.c, e90VarP);
        n9 n9Var = rh.f;
        if (ciVar.S || !c10.i(ciVar.K(), Integer.valueOf(iJ))) {
            b8.k(iJ, ciVar, iJ, n9Var);
        }
        ciVar.p(true);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final j31 c(ln lnVar, Object obj) {
        jc0 jc0Var;
        d90 d90Var = (d90) lnVar;
        if (!d90Var.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = d90Var.d.h;
        t30 t30VarZ = d80.z(lnVar);
        while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 262144) != 0) {
                while (d90Var2 != null) {
                    if ((d90Var2.f & 262144) != 0) {
                        mn mnVarI = d90Var2;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof j31) {
                                j31 j31Var = (j31) mnVarI;
                                if (obj.equals(j31Var.o())) {
                                    return j31Var;
                                }
                            } else if ((mnVarI.f & 262144) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var3 = mnVarI.s;
                                int i = 0;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                                while (d90Var3 != null) {
                                    if ((d90Var3.f & 262144) != 0) {
                                        i++;
                                        eb0Var = eb0Var;
                                        if (i == 1) {
                                            mnVarI = d90Var3;
                                        } else {
                                            if (eb0Var == 0) {
                                                eb0Var = new eb0(new d90[16]);
                                            }
                                            if (mnVarI != 0) {
                                                eb0Var.b(mnVarI);
                                                mnVarI = 0;
                                            }
                                            eb0Var.b(d90Var3);
                                        }
                                    }
                                    d90Var3 = d90Var3.i;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            mnVarI = d80.i(eb0Var);
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [j31, java.lang.Object, ln] */
    /* JADX WARN: Type inference failed for: r3v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final j31 d(j31 j31Var) {
        jc0 jc0Var;
        d90 d90Var = (d90) j31Var;
        if (!d90Var.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = d90Var.d.h;
        t30 t30VarZ = d80.z(j31Var);
        while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 262144) != 0) {
                while (d90Var2 != null) {
                    if ((d90Var2.f & 262144) != 0) {
                        mn mnVarI = d90Var2;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof j31) {
                                j31 j31Var2 = (j31) mnVarI;
                                if (c10.i(j31Var.o(), j31Var2.o()) && j31Var.getClass() == j31Var2.getClass()) {
                                    return j31Var2;
                                }
                            } else if ((mnVarI.f & 262144) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var3 = mnVarI.s;
                                int i = 0;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                                while (d90Var3 != null) {
                                    if ((d90Var3.f & 262144) != 0) {
                                        i++;
                                        eb0Var = eb0Var;
                                        if (i == 1) {
                                            mnVarI = d90Var3;
                                        } else {
                                            if (eb0Var == 0) {
                                                eb0Var = new eb0(new d90[16]);
                                            }
                                            if (mnVarI != 0) {
                                                eb0Var.b(mnVarI);
                                                mnVarI = 0;
                                            }
                                            eb0Var.b(d90Var3);
                                        }
                                    }
                                    d90Var3 = d90Var3.i;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            mnVarI = d80.i(eb0Var);
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        return null;
    }

    public static final l61 e(View view) {
        c10.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            l61 l61Var = tag instanceof l61 ? (l61) tag : null;
            if (l61Var != null) {
                return l61Var;
            }
            Object objG = jp0.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final float f(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static gv0 g() {
        return (gv0) ov0.b.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0265 A[EDGE_INSN: B:203:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281], EDGE_INSN: B:204:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int h(defpackage.m11 r19, android.text.Layout r20, defpackage.g30 r21, int r22, android.graphics.RectF r23, defpackage.xz r24, defpackage.c6 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9.h(m11, android.text.Layout, g30, int, android.graphics.RectF, xz, c6, boolean):int");
    }

    public static final void i(et0 et0Var) {
        d80.z(et0Var).F();
    }

    public static gv0 j(gv0 gv0Var) {
        if (gv0Var instanceof g31) {
            g31 g31Var = (g31) gv0Var;
            if (g31Var.t == dq0.d()) {
                g31Var.r = null;
                return gv0Var;
            }
        }
        if (gv0Var instanceof h31) {
            h31 h31Var = (h31) gv0Var;
            if (h31Var.i == dq0.d()) {
                h31Var.h = null;
                return gv0Var;
            }
        }
        gv0 gv0VarH = ov0.h(gv0Var, null, false);
        gv0VarH.j();
        return gv0VarH;
    }

    public static Object k(iw iwVar, gw gwVar) {
        gv0 g31Var;
        if (iwVar == null) {
            return gwVar.a();
        }
        gv0 gv0Var = (gv0) ov0.b.n();
        if (gv0Var instanceof g31) {
            g31 g31Var2 = (g31) gv0Var;
            if (g31Var2.t == dq0.d()) {
                iw iwVar2 = g31Var2.r;
                iw iwVar3 = g31Var2.s;
                try {
                    ((g31) gv0Var).r = ov0.l(iwVar, iwVar2, true);
                    ((g31) gv0Var).s = iwVar3;
                    return gwVar.a();
                } finally {
                    g31Var2.r = iwVar2;
                    g31Var2.s = iwVar3;
                }
            }
        }
        if (gv0Var == null || (gv0Var instanceof ya0)) {
            g31Var = new g31(gv0Var instanceof ya0 ? (ya0) gv0Var : null, iwVar, null, true, false);
        } else {
            if (iwVar == null) {
                return gwVar.a();
            }
            g31Var = gv0Var.u(iwVar);
        }
        try {
            gv0 gv0VarJ = g31Var.j();
            try {
                Object objA = gwVar.a();
                gv0.q(gv0VarJ);
                g31Var.c();
                return objA;
            } catch (Throwable th) {
                gv0.q(gv0VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            g31Var.c();
            throw th2;
        }
    }

    public static void l(gv0 gv0Var, gv0 gv0Var2, iw iwVar) {
        if (gv0Var != gv0Var2) {
            gv0Var2.getClass();
            gv0.q(gv0Var);
            gv0Var2.c();
        } else if (gv0Var instanceof g31) {
            ((g31) gv0Var).r = iwVar;
        } else if (gv0Var instanceof h31) {
            ((h31) gv0Var).h = iwVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gv0Var).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [j31, java.lang.Object, ln] */
    /* JADX WARN: Type inference failed for: r12v0, types: [iw] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [d90] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void m(j31 j31Var, iw iwVar) {
        jc0 jc0Var;
        d90 d90Var = (d90) j31Var;
        if (!d90Var.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = d90Var.d.h;
        t30 t30VarZ = d80.z(j31Var);
        while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 262144) != 0) {
                while (d90Var2 != null) {
                    if ((d90Var2.f & 262144) != 0) {
                        mn mnVarI = d90Var2;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            boolean zBooleanValue = true;
                            if (mnVarI instanceof j31) {
                                j31 j31Var2 = (j31) mnVarI;
                                if (c10.i(j31Var.o(), j31Var2.o()) && j31Var.getClass() == j31Var2.getClass()) {
                                    zBooleanValue = ((Boolean) iwVar.g(j31Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((mnVarI.f & 262144) != 0) && (mnVarI instanceof mn)) {
                                    d90 d90Var3 = mnVarI.s;
                                    int i = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var3 != null) {
                                        if ((d90Var3.f & 262144) != 0) {
                                            i++;
                                            eb0Var = eb0Var;
                                            if (i == 1) {
                                                mnVarI = d90Var3;
                                            } else {
                                                if (eb0Var == 0) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (mnVarI != 0) {
                                                    eb0Var.b(mnVarI);
                                                    mnVarI = 0;
                                                }
                                                eb0Var.b(d90Var3);
                                            }
                                        }
                                        d90Var3 = d90Var3.i;
                                        mnVarI = mnVarI;
                                        eb0Var = eb0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            mnVarI = d80.i(eb0Var);
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [j31, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [iw] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d90] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void n(j31 j31Var, iw iwVar) {
        d90 d90Var = (d90) j31Var;
        if (!d90Var.d.q) {
            pz.b("visitSubtreeIf called on an unattached node");
        }
        eb0 eb0Var = new eb0(new d90[16]);
        d90 d90Var2 = d90Var.d;
        d90 d90Var3 = d90Var2.i;
        if (d90Var3 == null) {
            d80.h(eb0Var, d90Var2);
        } else {
            eb0Var.b(d90Var3);
        }
        while (true) {
            int i = eb0Var.f;
            if (i == 0) {
                return;
            }
            d90 d90Var4 = (d90) eb0Var.k(i - 1);
            if ((d90Var4.g & 262144) != 0) {
                for (d90 d90Var5 = d90Var4; d90Var5 != null; d90Var5 = d90Var5.i) {
                    if ((d90Var5.f & 262144) != 0) {
                        mn mnVarI = d90Var5;
                        ?? eb0Var2 = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof j31) {
                                j31 j31Var2 = (j31) mnVarI;
                                i31 i31Var = (c10.i(j31Var.o(), j31Var2.o()) && j31Var.getClass() == j31Var2.getClass()) ? (i31) iwVar.g(j31Var2) : i31.d;
                                if (i31Var == i31.f) {
                                    return;
                                }
                                if (i31Var == i31.e) {
                                    break;
                                }
                            } else if ((mnVarI.f & 262144) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var6 = mnVarI.s;
                                int i2 = 0;
                                mnVarI = mnVarI;
                                eb0Var2 = eb0Var2;
                                while (d90Var6 != null) {
                                    if ((d90Var6.f & 262144) != 0) {
                                        i2++;
                                        eb0Var2 = eb0Var2;
                                        if (i2 == 1) {
                                            mnVarI = d90Var6;
                                        } else {
                                            if (eb0Var2 == 0) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (mnVarI != 0) {
                                                eb0Var2.b(mnVarI);
                                                mnVarI = 0;
                                            }
                                            eb0Var2.b(d90Var6);
                                        }
                                    }
                                    d90Var6 = d90Var6.i;
                                    mnVarI = mnVarI;
                                    eb0Var2 = eb0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            mnVarI = d80.i(eb0Var2);
                        }
                    }
                }
            }
            d80.h(eb0Var, d90Var4);
        }
    }

    public static final void o(gt0 gt0Var, int i, kq0 kq0Var) {
        gt0 gt0Var2;
        eb0 eb0Var = new eb0(new gt0[16]);
        List listI = gt0Var.i(false, false);
        while (true) {
            eb0Var.d(eb0Var.f, listI);
            while (true) {
                int i2 = eb0Var.f;
                if (i2 == 0) {
                    return;
                }
                gt0Var2 = (gt0) eb0Var.k(i2 - 1);
                boolean zK = l81.K(gt0Var2);
                ct0 ct0Var = gt0Var2.d;
                ta0 ta0Var = ct0Var.d;
                if (!zK && !ta0Var.c(lt0.i)) {
                    nc0 nc0VarD = gt0Var2.d();
                    if (nc0VarD == null) {
                        throw b8.f("Expected semantics node to have a coordinator.");
                    }
                    q00 q00VarL = m20.L(l81.s(nc0VarD));
                    if (q00VarL.a < q00VarL.c && q00VarL.b < q00VarL.d) {
                        Object objG = ct0Var.d.g(bt0.e);
                        if (objG == null) {
                            objG = null;
                        }
                        kw kwVar = (kw) objG;
                        Object objG2 = ta0Var.g(lt0.u);
                        jq0 jq0Var = (jq0) (objG2 != null ? objG2 : null);
                        if (kwVar == null || jq0Var == null || ((Number) jq0Var.b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = i + 1;
                        kq0Var.g(new lq0(gt0Var2, i3, q00VarL, nc0VarD));
                        o(gt0Var2, i3, kq0Var);
                    }
                }
            }
            listI = gt0Var2.i(false, false);
        }
    }
}
