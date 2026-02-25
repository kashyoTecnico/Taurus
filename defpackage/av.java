package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class av extends d90 implements pi, cd0, g90 {
    public final iw r;
    public boolean s;
    public boolean t;
    public final int u;

    public av(zu zuVar, int i) {
        int i2 = (i & 1) != 0 ? 1 : 2;
        this.r = (i & 4) != 0 ? null : zuVar;
        this.u = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [eb0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [eb0] */
    public final void A0(yu yuVar, yu yuVar2) {
        jc0 jc0Var;
        qu quVar = (qu) ((p3) d80.A(this)).getFocusOwner();
        av avVar = quVar.h;
        yuVar.equals(yuVar2);
        d90 d90Var = this.d;
        if (!d90Var.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = this.d;
        t30 t30VarZ = d80.z(this);
        loop0: while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 5120) != 0) {
                while (d90Var2 != null) {
                    int i = d90Var2.f;
                    if ((i & 5120) != 0) {
                        if (d90Var2 != d90Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 4096) != 0) {
                            mn mnVarI = d90Var2;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof iu) {
                                    iu iuVar = (iu) mnVarI;
                                    if (avVar == quVar.h) {
                                        iuVar.S(yuVar2);
                                    }
                                } else if ((mnVarI.f & 4096) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var3 = mnVarI.s;
                                    int i2 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var3 != null) {
                                        if ((d90Var3.f & 4096) != 0) {
                                            i2++;
                                            eb0Var = eb0Var;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        iw iwVar = this.r;
        if (iwVar != null) {
            iwVar.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [eb0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eb0] */
    public final su B0() {
        boolean z;
        jc0 jc0Var;
        su suVar = new su();
        suVar.a = true;
        vu vuVar = vu.b;
        suVar.b = vuVar;
        suVar.c = vuVar;
        suVar.d = vuVar;
        suVar.e = vuVar;
        suVar.f = vuVar;
        suVar.g = vuVar;
        suVar.h = vuVar;
        suVar.i = vuVar;
        suVar.j = e3.E;
        suVar.k = e3.F;
        int i = this.u;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((zz) ((b00) ((a00) l81.A(this, ti.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        suVar.a = z;
        d90 d90Var = this.d;
        if (!d90Var.q) {
            pz.b("visitAncestors called on an unattached node");
        }
        d90 d90Var2 = this.d;
        t30 t30VarZ = d80.z(this);
        loop0: while (t30VarZ != null) {
            if ((t30VarZ.G.f.g & 3072) != 0) {
                while (d90Var2 != null) {
                    int i2 = d90Var2.f;
                    if ((i2 & 3072) != 0) {
                        if (d90Var2 != d90Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            mn mnVarI = d90Var2;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof tu) {
                                    ((tu) mnVarI).Q(suVar);
                                } else if ((mnVarI.f & 2048) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var3 = mnVarI.s;
                                    int i3 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var3 != null) {
                                        if ((d90Var3.f & 2048) != 0) {
                                            i3++;
                                            eb0Var = eb0Var;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                    }
                    d90Var2 = d90Var2.h;
                }
            }
            t30VarZ = t30VarZ.t();
            d90Var2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
        }
        return suVar;
    }

    public final yu C0() {
        qu quVar;
        av avVar;
        jc0 jc0Var;
        boolean z = this.q;
        yu yuVar = yu.g;
        if (!z || (avVar = (quVar = (qu) ((p3) d80.A(this)).getFocusOwner()).h) == null) {
            return yuVar;
        }
        if (this == avVar) {
            quVar.getClass();
            return yu.d;
        }
        if (avVar.q) {
            if (!avVar.d.q) {
                pz.b("visitAncestors called on an unattached node");
            }
            d90 d90Var = avVar.d.h;
            t30 t30VarZ = d80.z(avVar);
            while (t30VarZ != null) {
                if ((t30VarZ.G.f.g & 1024) != 0) {
                    while (d90Var != null) {
                        if ((d90Var.f & 1024) != 0) {
                            d90 d90VarI = d90Var;
                            eb0 eb0Var = null;
                            while (d90VarI != null) {
                                if (d90VarI instanceof av) {
                                    if (this == ((av) d90VarI)) {
                                        return yu.e;
                                    }
                                } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                    int i = 0;
                                    for (d90 d90Var2 = ((mn) d90VarI).s; d90Var2 != null; d90Var2 = d90Var2.i) {
                                        if ((d90Var2.f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                d90VarI = d90Var2;
                                            } else {
                                                if (eb0Var == null) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (d90VarI != null) {
                                                    eb0Var.b(d90VarI);
                                                    d90VarI = null;
                                                }
                                                eb0Var.b(d90Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                d90VarI = d80.i(eb0Var);
                            }
                        }
                        d90Var = d90Var.h;
                    }
                }
                t30VarZ = t30VarZ.t();
                d90Var = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
            }
        }
        return yuVar;
    }

    public final void D0() {
        int iOrdinal = C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fg();
                }
                return;
            }
        }
        dm0 dm0Var = new dm0();
        c4.A(this, new g3(7, dm0Var, this));
        Object obj = dm0Var.d;
        if (obj == null) {
            c10.Y("focusProperties");
            throw null;
        }
        if (((ru) obj).a()) {
            return;
        }
        ((qu) ((p3) d80.A(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean E0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zQ = false;
            if (!B0().a) {
                return false;
            }
            int iOrdinal = c10.P(this).ordinal();
            if (iOrdinal == 0) {
                zQ = c10.Q(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zQ = true;
                } else if (iOrdinal != 3) {
                    throw new fg();
                }
            }
            return zQ;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cd0
    public final void J() {
        D0();
    }

    @Override // defpackage.d90
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.d90
    public final void t0() {
        int iOrdinal = C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fg();
                }
                return;
            }
        }
        qu quVar = (qu) ((p3) d80.A(this)).getFocusOwner();
        quVar.b(8, true, false);
        quVar.d.a();
    }

    @Override // defpackage.d90
    public final void u0() {
        if (C0().a()) {
            ((qu) ((p3) d80.A(this)).getFocusOwner()).b(8, true, true);
        }
    }
}
