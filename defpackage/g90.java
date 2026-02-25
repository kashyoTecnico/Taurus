package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface g90 extends ln {
    default g2 i() {
        return g2.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [d90] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [g90, ln] */
    /* JADX WARN: Type inference failed for: r8v3, types: [gw, y20] */
    default Object v(rq rqVar) {
        jc0 jc0Var;
        d90 d90Var = (d90) this;
        if (!d90Var.d.q) {
            pz.a("ModifierLocal accessed from an unattached node");
        }
        if (!d90Var.d.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = d90Var.d.h;
        t30 t30VarZ = d80.z(this);
        while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 32) != 0) {
                while (d90Var2 != null) {
                    if ((d90Var2.f & 32) != 0) {
                        mn mnVarI = d90Var2;
                        ?? eb0Var = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof g90) {
                                g90 g90Var = (g90) mnVarI;
                                if (g90Var.i().j()) {
                                    g90Var.i().k();
                                    throw null;
                                }
                            } else if ((mnVarI.f & 32) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var3 = mnVarI.s;
                                int i = 0;
                                mnVarI = mnVarI;
                                eb0Var = eb0Var;
                                while (d90Var3 != null) {
                                    if ((d90Var3.f & 32) != 0) {
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
        return rqVar.a.a();
    }
}
