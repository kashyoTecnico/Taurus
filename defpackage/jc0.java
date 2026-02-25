package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jc0 {
    public final t30 a;
    public final ic0 b;
    public final vz c;
    public nc0 d;
    public final xy0 e;
    public d90 f;
    public eb0 g;
    public eb0 h;
    public final eb0 i;
    public hc0 j;

    public jc0(t30 t30Var) {
        this.a = t30Var;
        ic0 ic0Var = new ic0();
        ic0Var.g = -1;
        this.b = ic0Var;
        vz vzVar = new vz(t30Var);
        this.c = vzVar;
        this.d = vzVar;
        xy0 xy0Var = vzVar.R;
        this.e = xy0Var;
        this.f = xy0Var;
        this.i = new eb0(new e90[16]);
    }

    public static final void a(jc0 jc0Var, d90 d90Var, nc0 nc0Var) {
        for (d90 d90Var2 = d90Var.h; d90Var2 != null; d90Var2 = d90Var2.h) {
            if (d90Var2 == jc0Var.b) {
                t30 t30VarT = jc0Var.a.t();
                nc0Var.t = t30VarT != null ? t30VarT.G.c : null;
                jc0Var.d = nc0Var;
                return;
            } else {
                if ((d90Var2.f & 2) != 0) {
                    return;
                }
                d90Var2.z0(nc0Var);
            }
        }
    }

    public static d90 b(c90 c90Var, d90 d90Var) {
        d90 d90VarF;
        if (c90Var instanceof i90) {
            d90VarF = ((i90) c90Var).f();
            d90VarF.f = oc0.f(d90VarF);
        } else {
            ha haVar = new ha();
            haVar.f = oc0.d(c90Var);
            haVar.r = c90Var;
            haVar.s = new HashSet();
            d90VarF = haVar;
        }
        if (d90VarF.q) {
            pz.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        d90VarF.l = true;
        d90 d90Var2 = d90Var.i;
        if (d90Var2 != null) {
            d90Var2.h = d90VarF;
            d90VarF.i = d90Var2;
        }
        d90Var.i = d90VarF;
        d90VarF.h = d90Var;
        return d90VarF;
    }

    public static d90 c(d90 d90Var) {
        boolean z = d90Var.q;
        if (z) {
            la0 la0Var = oc0.a;
            if (!z) {
                pz.b("autoInvalidateRemovedNode called on unattached node");
            }
            oc0.a(d90Var, -1, 2);
            d90Var.x0();
            d90Var.r0();
        }
        d90 d90Var2 = d90Var.i;
        d90 d90Var3 = d90Var.h;
        if (d90Var2 != null) {
            d90Var2.h = d90Var3;
            d90Var.i = null;
        }
        if (d90Var3 != null) {
            d90Var3.i = d90Var2;
            d90Var.h = null;
        }
        c10.m(d90Var3);
        return d90Var3;
    }

    public static void h(c90 c90Var, c90 c90Var2, d90 d90Var) {
        if ((c90Var instanceof i90) && (c90Var2 instanceof i90)) {
            c10.n(d90Var, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((i90) c90Var2).g(d90Var);
            if (d90Var.q) {
                oc0.c(d90Var);
                return;
            } else {
                d90Var.m = true;
                return;
            }
        }
        if (!(d90Var instanceof ha)) {
            pz.b("Unknown Modifier.Node type");
            return;
        }
        ha haVar = (ha) d90Var;
        if (haVar.q) {
            haVar.B0();
        }
        haVar.r = c90Var2;
        haVar.f = oc0.d(c90Var2);
        if (haVar.q) {
            haVar.A0(false);
        }
        if (d90Var.q) {
            oc0.c(d90Var);
        } else {
            d90Var.m = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.g & i) != 0;
    }

    public final void e() {
        for (d90 d90Var = this.f; d90Var != null; d90Var = d90Var.i) {
            d90Var.w0();
            if (d90Var.l) {
                la0 la0Var = oc0.a;
                if (!d90Var.q) {
                    pz.b("autoInvalidateInsertedNode called on unattached node");
                }
                oc0.a(d90Var, -1, 1);
            }
            if (d90Var.m) {
                oc0.c(d90Var);
            }
            d90Var.l = false;
            d90Var.m = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, defpackage.eb0 r33, defpackage.eb0 r34, defpackage.d90 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc0.f(int, eb0, eb0, d90, boolean):void");
    }

    public final void g() {
        t30 t30Var;
        n30 n30Var;
        d90 d90Var = this.e.h;
        nc0 nc0Var = this.c;
        d90 d90Var2 = d90Var;
        while (true) {
            t30Var = this.a;
            if (d90Var2 == null) {
                break;
            }
            l30 l30VarJ = d80.j(d90Var2);
            if (l30VarJ != null) {
                nc0 nc0Var2 = d90Var2.k;
                if (nc0Var2 != null) {
                    n30 n30Var2 = (n30) nc0Var2;
                    l30 l30Var = n30Var2.R;
                    n30Var2.q1(l30VarJ);
                    n30Var = n30Var2;
                    if (l30Var != d90Var2) {
                        dg0 dg0Var = n30Var2.L;
                        n30Var = n30Var2;
                        if (dg0Var != null) {
                            ((gx) dg0Var).invalidate();
                            n30Var = n30Var2;
                        }
                    }
                } else {
                    n30 n30Var3 = new n30(t30Var, l30VarJ);
                    d90Var2.z0(n30Var3);
                    n30Var = n30Var3;
                }
                nc0Var.t = n30Var;
                n30Var.s = nc0Var;
                nc0Var = n30Var;
            } else {
                d90Var2.z0(nc0Var);
            }
            d90Var2 = d90Var2.h;
        }
        t30 t30VarT = t30Var.t();
        nc0Var.t = t30VarT != null ? t30VarT.G.c : null;
        this.d = nc0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        d90 d90Var = this.f;
        xy0 xy0Var = this.e;
        if (d90Var == xy0Var) {
            sb.append("]");
        } else {
            while (true) {
                if (d90Var == null || d90Var == xy0Var) {
                    break;
                }
                sb.append(String.valueOf(d90Var));
                if (d90Var.i == xy0Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                d90Var = d90Var.i;
            }
        }
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }
}
