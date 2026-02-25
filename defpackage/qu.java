package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import defpackage.d90;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qu implements ou {
    public final p3 a;
    public final p3 b;
    public final nu d;
    public ja0 f;
    public av h;
    public final av c = new av(null, 6);
    public final FocusOwnerImpl$modifier$1 e = new i90() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.i90
        public final d90 f() {
            return this.a.c;
        }

        @Override // defpackage.i90
        public final /* bridge */ /* synthetic */ void g(d90 d90Var) {
        }

        public final int hashCode() {
            return this.a.c.hashCode();
        }
    };
    public final ma0 g = new ma0(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public qu(p3 p3Var, p3 p3Var2) {
        this.a = p3Var;
        this.b = p3Var2;
        this.d = new nu(this, p3Var2);
    }

    public final boolean a(boolean z) {
        jc0 jc0Var;
        av avVar = this.h;
        if (avVar != null) {
            g(null);
            yu yuVar = yu.d;
            yu yuVar2 = yu.g;
            avVar.A0(yuVar, yuVar2);
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
                                    ((av) d90VarI).A0(yu.e, yuVar2);
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
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = c10.N(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new fg();
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        p3 p3Var = this.a;
        if (p3Var.isFocused() || p3Var.hasFocus()) {
            p3Var.clearFocus();
        } else if (p3Var.hasFocus()) {
            View viewFindFocus = p3Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            p3Var.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[Catch: all -> 0x02de, TryCatch #0 {all -> 0x02de, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:162:0x01d6, B:143:0x01a0, B:145:0x01a6, B:147:0x01aa, B:149:0x01b2, B:151:0x01b8, B:155:0x01c0, B:157:0x01c9, B:158:0x01cd, B:159:0x01d0, B:163:0x01db, B:164:0x01de, B:166:0x01e4, B:168:0x01e8, B:171:0x01ef, B:173:0x01f7, B:180:0x020e, B:182:0x0213, B:184:0x0217, B:207:0x0259, B:188:0x0223, B:190:0x0229, B:192:0x022d, B:194:0x0235, B:196:0x023b, B:200:0x0243, B:202:0x024c, B:203:0x0250, B:204:0x0253, B:208:0x025e, B:212:0x026e, B:214:0x0273, B:216:0x0277, B:239:0x02b9, B:220:0x0283, B:222:0x0289, B:224:0x028d, B:226:0x0295, B:228:0x029b, B:232:0x02a3, B:234:0x02ac, B:235:0x02b0, B:236:0x02b3, B:241:0x02c0, B:243:0x02c7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:253:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [eb0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [eb0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v24, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v28, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v29, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v33, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [d90] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [eb0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r13, defpackage.gw r14) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.d(android.view.KeyEvent, gw):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [xy0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v10, types: [av] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [d90] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [eb0] */
    public final Boolean e(int i, xl0 xl0Var, iw iwVar) {
        Boolean bool;
        boolean zT;
        Boolean bool2;
        jc0 jc0Var;
        av avVar = this.c;
        av avVarR = m20.r(avVar);
        int i2 = 4;
        p3 p3Var = this.b;
        if (avVarR != null) {
            e30 layoutDirection = p3Var.getLayoutDirection();
            bool = null;
            su suVarB0 = avVarR.B0();
            vu vuVar = suVarB0.h;
            vu vuVar2 = suVarB0.i;
            if (i == 1) {
                vuVar = suVarB0.b;
            } else if (i == 2) {
                vuVar = suVarB0.c;
            } else if (i == 5) {
                vuVar = suVarB0.d;
            } else if (i == 6) {
                vuVar = suVarB0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new fg();
                    }
                    vuVar = vuVar2;
                }
                if (vuVar == vu.b) {
                    vuVar = null;
                }
                if (vuVar == null) {
                    vuVar = suVarB0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    vuVar = vuVar2;
                } else if (iOrdinal2 != 1) {
                    throw new fg();
                }
                if (vuVar == vu.b) {
                    vuVar = null;
                }
                if (vuVar == null) {
                    vuVar = suVarB0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                qu quVar = (qu) ((p3) d80.A(avVarR)).getFocusOwner();
                av avVar2 = quVar.h;
                if (i == 7) {
                    suVarB0.j.getClass();
                } else {
                    suVarB0.k.getClass();
                }
                vuVar = avVar2 != quVar.h ? vu.d : vu.b;
            }
            if (!c10.i(vuVar, vu.c)) {
                if (c10.i(vuVar, vu.d)) {
                    av avVarR2 = m20.r(avVar);
                    if (avVarR2 != null) {
                        return (Boolean) iwVar.g(avVarR2);
                    }
                } else if (!c10.i(vuVar, vu.b)) {
                    return Boolean.valueOf(vuVar.a(iwVar));
                }
            }
            return bool;
        }
        bool = null;
        avVarR = null;
        e30 layoutDirection2 = p3Var.getLayoutDirection();
        u7 u7Var = new u7(avVarR, this, iwVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zT = b10.D(avVar, u7Var);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zT = b10.t(avVar, u7Var);
            }
            return Boolean.valueOf(zT);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return no0.x(i, u7Var, avVar, xl0Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new fg();
                }
                i2 = 3;
            }
            av avVarR3 = m20.r(avVar);
            if (avVarR3 != null) {
                return no0.x(i2, u7Var, avVarR3, xl0Var);
            }
            return bool;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) gu.a(i))).toString());
        }
        av avVarR4 = m20.r(avVar);
        boolean zBooleanValue = false;
        if (avVarR4 == null) {
            bool2 = bool;
        } else {
            if (!avVarR4.d.q) {
                pz.b("visitAncestors called on an unattached node");
            }
            ?? r2 = avVarR4.d.h;
            t30 t30VarZ = d80.z(avVarR4);
            loop0: while (t30VarZ != null) {
                if ((t30VarZ.G.f.g & 1024) != 0) {
                    for (d90 d90Var = r2; d90Var != null; d90Var = d90Var.h) {
                        if ((d90Var.f & 1024) != 0) {
                            mn mnVarI = d90Var;
                            ?? eb0Var = bool;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof av) {
                                    ?? r3 = (av) mnVarI;
                                    if (r3.B0().a) {
                                        bool2 = r3;
                                        break loop0;
                                    }
                                } else if ((mnVarI.f & 1024) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var2 = mnVarI.s;
                                    int i3 = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var2 != null) {
                                        if ((d90Var2.f & 1024) != 0) {
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
                                                    mnVarI = bool;
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
                t30VarZ = t30VarZ.t();
                r2 = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? bool : jc0Var.e;
            }
            bool2 = bool;
        }
        if (bool2 != null && !bool2.equals(avVar)) {
            zBooleanValue = ((Boolean) u7Var.g(bool2)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean f(int i) {
        boolean zE0;
        View viewB;
        dm0 dm0Var = new dm0();
        dm0Var.d = Boolean.FALSE;
        av avVar = this.h;
        p3 p3Var = this.a;
        Boolean boolE = e(i, p3Var.getEmbeddedViewFocusRect(), new pu(i, 0, dm0Var));
        if (!c10.i(boolE, Boolean.TRUE) || avVar == this.h) {
            if (boolE != null && dm0Var.d != null) {
                if (!boolE.booleanValue() || !((Boolean) dm0Var.d).booleanValue()) {
                    if (i != 1 && i != 2) {
                        if (i != 7 && i != 8) {
                            Integer numI0 = b10.i0(i);
                            if (numI0 == null) {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                            int iIntValue = numI0.intValue();
                            xl0 embeddedViewFocusRect = p3Var.getEmbeddedViewFocusRect();
                            Rect rectA0 = embeddedViewFocusRect != null ? l81.a0(embeddedViewFocusRect) : null;
                            Object obj = ku.f.get();
                            c10.m(obj);
                            ku kuVar = (ku) obj;
                            if (rectA0 == null) {
                                viewB = kuVar.b(p3Var, p3Var.findFocus(), iIntValue);
                            } else {
                                kuVar.a.set(rectA0);
                                Rect rect = kuVar.a;
                                ArrayList<View> arrayList = kuVar.e;
                                try {
                                    arrayList.clear();
                                    p3Var.addFocusables(arrayList, iIntValue, p3Var.isInTouchMode() ? 1 : 0);
                                    View viewA = arrayList.isEmpty() ? null : kuVar.a(iIntValue, rect, null, p3Var, arrayList);
                                    arrayList.clear();
                                    viewB = viewA;
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (viewB != null) {
                                zE0 = b10.e0(viewB, Integer.valueOf(iIntValue), rectA0);
                            }
                            if (!zE0) {
                            }
                        }
                        zE0 = false;
                        if (!zE0) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new l3(i, 2));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(av avVar) {
        t30 t30VarZ;
        ct0 ct0VarV;
        t30 t30VarZ2;
        ct0 ct0VarV2;
        av avVar2 = this.h;
        this.h = avVar;
        ma0 ma0Var = this.g;
        Object[] objArr = ma0Var.a;
        int i = ma0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            s2 s2Var = (s2) objArr[i2];
            s2Var.getClass();
            if (avVar2 != null && (t30VarZ2 = d80.z(avVar2)) != null && (ct0VarV2 = t30VarZ2.v()) != null && ct0VarV2.d.b(bt0.f)) {
                ((AutofillManager) s2Var.a.e).notifyViewExited(s2Var.c, t30VarZ2.e);
            }
            if (avVar != null && (t30VarZ = d80.z(avVar)) != null && (ct0VarV = t30VarZ.v()) != null && ct0VarV.d.b(bt0.f)) {
                int i3 = t30VarZ.e;
                s2Var.d.a.b(i3, new r2(s2Var, i3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.d * 32, r0 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.y9.x0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r17 = r13;
        r13 = (r16 ^ (r16 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | ((r16 & 127) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.e = defpackage.eq0.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.eq0.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033e, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0340, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.h(android.view.KeyEvent):boolean");
    }
}
