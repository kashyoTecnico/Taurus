package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class oc0 {
    public static final la0 a;

    static {
        la0 la0Var = zc0.a;
        a = new la0();
    }

    public static final void a(d90 d90Var, int i, int i2) {
        if (!(d90Var instanceof mn)) {
            b(d90Var, i & d90Var.f, i2);
            return;
        }
        mn mnVar = (mn) d90Var;
        int i3 = mnVar.r;
        b(d90Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (d90 d90Var2 = mnVar.s; d90Var2 != null; d90Var2 = d90Var2.i) {
            a(d90Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d90 d90Var, int i, int i2) {
        if (i2 != 0 || d90Var.p0()) {
            if ((i & 2) != 0 && (d90Var instanceof l30)) {
                nm.v((l30) d90Var);
                if (i2 == 2) {
                    d80.x(d90Var, 2).b1();
                }
            }
            if ((i & 128) != 0 && (d90Var instanceof b30) && i2 != 2) {
                d80.z(d90Var).D();
            }
            if ((i & 256) != 0 && (d90Var instanceof xw)) {
                if (i2 == 1) {
                    t30 t30VarZ = d80.z(d90Var);
                    t30VarZ.Z(t30VarZ.O + 1);
                } else if (i2 == 2) {
                    d80.z(d90Var).Z(r0.O - 1);
                }
                if (i2 != 2) {
                    t30 t30VarZ2 = d80.z(d90Var);
                    if (t30VarZ2.O != 0 && !t30VarZ2.o() && !t30VarZ2.p() && !t30VarZ2.N) {
                        p3 p3Var = (p3) r31.U(t30VarZ2);
                        xz xzVar = p3Var.P.e;
                        xzVar.getClass();
                        if (t30VarZ2.O > 0) {
                            ((eb0) xzVar.e).b(t30VarZ2);
                            t30VarZ2.N = true;
                        }
                        p3Var.B(null);
                    }
                }
            }
            if ((i & 4) != 0 && (d90Var instanceof qq)) {
                m20.F((qq) d90Var);
            }
            if ((i & 8) != 0 && (d90Var instanceof et0)) {
                d80.z(d90Var).s = true;
            }
            if ((i & 64) != 0 && (d90Var instanceof ah0)) {
                w30 w30Var = d80.z((ah0) d90Var).H;
                w30Var.p.s = true;
                c70 c70Var = w30Var.q;
                if (c70Var != null) {
                    c70Var.x = true;
                }
            }
            if ((i & 2048) != 0 && (d90Var instanceof tu)) {
                tu tuVar = (tu) d90Var;
                vc.b = null;
                tuVar.Q(vc.a);
                if (vc.b != null) {
                    d90 d90Var2 = (d90) tuVar;
                    if (!d90Var2.d.q) {
                        pz.b("visitChildren called on an unattached node");
                    }
                    eb0 eb0Var = new eb0(new d90[16]);
                    d90 d90Var3 = d90Var2.d;
                    d90 d90Var4 = d90Var3.i;
                    if (d90Var4 == null) {
                        d80.h(eb0Var, d90Var3);
                    } else {
                        eb0Var.b(d90Var4);
                    }
                    while (true) {
                        int i3 = eb0Var.f;
                        if (i3 == 0) {
                            break;
                        }
                        d90 d90VarI = (d90) eb0Var.k(i3 - 1);
                        if ((d90VarI.g & 1024) == 0) {
                            d80.h(eb0Var, d90VarI);
                        } else {
                            while (true) {
                                if (d90VarI == null) {
                                    break;
                                }
                                if ((d90VarI.f & 1024) != 0) {
                                    eb0 eb0Var2 = null;
                                    while (d90VarI != null) {
                                        if (d90VarI instanceof av) {
                                            av avVar = (av) d90VarI;
                                            nu nuVar = ((qu) ((p3) d80.A(avVar)).getFocusOwner()).d;
                                            if (nuVar.c.a(avVar)) {
                                                nuVar.a();
                                            }
                                        } else if ((d90VarI.f & 1024) != 0 && (d90VarI instanceof mn)) {
                                            int i4 = 0;
                                            for (d90 d90Var5 = ((mn) d90VarI).s; d90Var5 != null; d90Var5 = d90Var5.i) {
                                                if ((d90Var5.f & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        d90VarI = d90Var5;
                                                    } else {
                                                        if (eb0Var2 == null) {
                                                            eb0Var2 = new eb0(new d90[16]);
                                                        }
                                                        if (d90VarI != null) {
                                                            eb0Var2.b(d90VarI);
                                                            d90VarI = null;
                                                        }
                                                        eb0Var2.b(d90Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        d90VarI = d80.i(eb0Var2);
                                    }
                                } else {
                                    d90VarI = d90VarI.i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(d90Var instanceof iu)) {
                return;
            }
            iu iuVar = (iu) d90Var;
            nu nuVar2 = ((qu) ((p3) d80.A(iuVar)).getFocusOwner()).d;
            if (nuVar2.d.a(iuVar)) {
                nuVar2.a();
            }
        }
    }

    public static final void c(d90 d90Var) {
        if (!d90Var.q) {
            pz.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(d90Var, -1, 0);
    }

    public static final int d(c90 c90Var) {
        int i = c90Var instanceof j30 ? 3 : 1;
        if (c90Var instanceof pq) {
            i |= 4;
        }
        if (c90Var instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (c90Var instanceof ij) {
            i |= 32;
        }
        return c90Var instanceof ib ? 524288 | i : i;
    }

    public static final int e(d90 d90Var) {
        int i = d90Var.f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = d90Var.getClass();
        la0 la0Var = a;
        int iD = la0Var.d(cls);
        if (iD >= 0) {
            return la0Var.c[iD];
        }
        int i2 = d90Var instanceof l30 ? 3 : 1;
        if (d90Var instanceof qq) {
            i2 |= 4;
        }
        if (d90Var instanceof et0) {
            i2 |= 8;
        }
        if (d90Var instanceof qj0) {
            i2 |= 16;
        }
        if (d90Var instanceof g90) {
            i2 |= 32;
        }
        if (d90Var instanceof ah0) {
            i2 |= 64;
        }
        if (d90Var instanceof b30) {
            i2 |= 128;
        }
        if (d90Var instanceof xw) {
            i2 |= 256;
        }
        if (d90Var instanceof av) {
            i2 |= 1024;
        }
        if (d90Var instanceof tu) {
            i2 |= 2048;
        }
        if (d90Var instanceof iu) {
            i2 |= 4096;
        }
        if (d90Var instanceof o20) {
            i2 |= 8192;
        }
        if (d90Var instanceof do0) {
            i2 |= 16384;
        }
        if (d90Var instanceof pi) {
            i2 |= 32768;
        }
        if (d90Var instanceof j31) {
            i2 |= 262144;
        }
        if (d90Var instanceof ib) {
            i2 |= 524288;
        }
        la0Var.h(i2, cls);
        return i2;
    }

    public static final int f(d90 d90Var) {
        if (!(d90Var instanceof mn)) {
            return e(d90Var);
        }
        mn mnVar = (mn) d90Var;
        int iF = mnVar.r;
        for (d90 d90Var2 = mnVar.s; d90Var2 != null; d90Var2 = d90Var2.i) {
            iF |= f(d90Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
