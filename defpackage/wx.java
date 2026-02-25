package defpackage;

import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wx {
    public static final wx a = new wx();

    private final void C(r40 r40Var, SelectGesture selectGesture, u01 u01Var) {
        if (u01Var != null) {
            long jK = b10.K(r40Var, l81.d0(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
            r40 r40Var2 = u01Var.d;
            if (r40Var2 != null) {
                r40Var2.f(jK);
            }
            r40 r40Var3 = u01Var.d;
            if (r40Var3 != null) {
                r40Var3.e(w11.b);
            }
            if (w11.b(jK)) {
                return;
            }
            u01Var.p(false);
            u01Var.n(px.d);
        }
    }

    private final void D(z21 z21Var, SelectGesture selectGesture, q11 q11Var) {
        l81.d0(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final void E(r40 r40Var, SelectRangeGesture selectRangeGesture, u01 u01Var) {
        if (u01Var != null) {
            long jM = b10.m(r40Var, l81.d0(selectRangeGesture.getSelectionStartArea()), l81.d0(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
            r40 r40Var2 = u01Var.d;
            if (r40Var2 != null) {
                r40Var2.f(jM);
            }
            r40 r40Var3 = u01Var.d;
            if (r40Var3 != null) {
                r40Var3.e(w11.b);
            }
            if (w11.b(jM)) {
                return;
            }
            u01Var.p(false);
            u01Var.n(px.d);
        }
    }

    private final void F(z21 z21Var, SelectRangeGesture selectRangeGesture, q11 q11Var) {
        l81.d0(selectRangeGesture.getSelectionStartArea());
        l81.d0(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final int G(int i) {
        return i != 1 ? 0 : 1;
    }

    private final int a(z21 z21Var, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, iw iwVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        iwVar.g(new xf(fallbackText, 1));
        return 5;
    }

    private final int c(r40 r40Var, DeleteGesture deleteGesture, q8 q8Var, iw iwVar) {
        int iG = G(deleteGesture.getGranularity());
        long jK = b10.K(r40Var, l81.d0(deleteGesture.getDeletionArea()), iG);
        if (w11.b(jK)) {
            return a.b(ux.l(deleteGesture), iwVar);
        }
        h(jK, q8Var, iG == 1, iwVar);
        return 1;
    }

    private final int d(z21 z21Var, DeleteGesture deleteGesture, q11 q11Var) {
        G(deleteGesture.getGranularity());
        l81.d0(deleteGesture.getDeletionArea());
        throw null;
    }

    private final int e(r40 r40Var, DeleteRangeGesture deleteRangeGesture, q8 q8Var, iw iwVar) {
        int iG = G(deleteRangeGesture.getGranularity());
        long jM = b10.m(r40Var, l81.d0(deleteRangeGesture.getDeletionStartArea()), l81.d0(deleteRangeGesture.getDeletionEndArea()), iG);
        if (w11.b(jM)) {
            return a.b(ux.l(deleteRangeGesture), iwVar);
        }
        h(jM, q8Var, iG == 1, iwVar);
        return 1;
    }

    private final int f(z21 z21Var, DeleteRangeGesture deleteRangeGesture, q11 q11Var) {
        G(deleteRangeGesture.getGranularity());
        l81.d0(deleteRangeGesture.getDeletionStartArea());
        l81.d0(deleteRangeGesture.getDeletionEndArea());
        throw null;
    }

    private final void g(z21 z21Var, long j, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    private final void h(long j, q8 q8Var, boolean z, iw iwVar) {
        if (z) {
            int i = w11.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(q8Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < q8Var.e.length() ? Character.codePointAt(q8Var, iCharCount2) : 10;
            if (b10.R(iCodePointBefore) && (b10.Q(iCodePointAt) || b10.O(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(q8Var, iCharCount);
                    }
                } while (b10.R(iCodePointBefore));
                j = no0.a(iCharCount, iCharCount2);
            } else if (b10.R(iCodePointAt) && (b10.Q(iCodePointBefore) || b10.O(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == q8Var.e.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(q8Var, iCharCount2);
                    }
                } while (b10.R(iCodePointAt));
                j = no0.a(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (j & 4294967295L);
        iwVar.g(new xx(new hr[]{new fu0(i2, i2), new sn(w11.c(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int k(defpackage.r40 r7, android.view.inputmethod.InsertGesture r8, defpackage.c61 r9, defpackage.iw r10) {
        /*
            r6 = this;
            if (r9 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r7 = defpackage.ux.l(r8)
            int r6 = r6.b(r7, r10)
            return r6
        Lb:
            android.graphics.PointF r0 = defpackage.ux.g(r8)
            float r1 = r0.x
            float r0 = r0.y
            long r0 = defpackage.nm.f(r1, r0)
            p11 r2 = r7.d()
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L49
            o11 r2 = r2.a
            u90 r2 = r2.b
            d30 r5 = r7.c()
            if (r5 == 0) goto L49
            long r0 = r5.C(r0)
            int r9 = defpackage.b10.I(r2, r0, r9)
            if (r9 != r3) goto L34
            goto L49
        L34:
            float r5 = r2.d(r9)
            float r9 = r2.b(r9)
            float r9 = r9 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r5
            long r0 = defpackage.ed0.a(r0, r9, r4)
            int r9 = r2.e(r0)
            goto L4a
        L49:
            r9 = r3
        L4a:
            if (r9 == r3) goto L63
            p11 r7 = r7.d()
            if (r7 == 0) goto L5b
            o11 r7 = r7.a
            boolean r7 = defpackage.b10.n(r7, r9)
            if (r7 != r4) goto L5b
            goto L63
        L5b:
            java.lang.String r7 = defpackage.ux.q(r8)
            r6.m(r9, r7, r10)
            return r4
        L63:
            android.view.inputmethod.HandwritingGesture r7 = defpackage.ux.l(r8)
            int r6 = r6.b(r7, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.k(r40, android.view.inputmethod.InsertGesture, c61, iw):int");
    }

    private final int l(z21 z21Var, InsertGesture insertGesture, q11 q11Var, c61 c61Var) {
        PointF insertionPoint = insertGesture.getInsertionPoint();
        nm.f(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i, String str, iw iwVar) {
        iwVar.g(new xx(new hr[]{new fu0(i, i), new xf(str, 1)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(defpackage.r40 r11, android.view.inputmethod.JoinOrSplitGesture r12, defpackage.q8 r13, defpackage.c61 r14, defpackage.iw r15) {
        /*
            r10 = this;
            if (r14 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r1 = defpackage.ux.l(r12)
            int r0 = r10.b(r1, r15)
            return r0
        Lb:
            android.graphics.PointF r2 = defpackage.ux.h(r12)
            float r4 = r2.x
            float r2 = r2.y
            long r6 = defpackage.nm.f(r4, r2)
            p11 r2 = r11.d()
            r4 = -1
            r8 = 1
            if (r2 == 0) goto L49
            o11 r2 = r2.a
            u90 r2 = r2.b
            d30 r9 = r11.c()
            if (r9 == 0) goto L49
            long r6 = r9.C(r6)
            int r1 = defpackage.b10.I(r2, r6, r14)
            if (r1 != r4) goto L34
            goto L49
        L34:
            float r9 = r2.d(r1)
            float r1 = r2.b(r1)
            float r1 = r1 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r9
            long r6 = defpackage.ed0.a(r6, r1, r8)
            int r1 = r2.e(r6)
            goto L4a
        L49:
            r1 = r4
        L4a:
            if (r1 == r4) goto La4
            p11 r2 = r11.d()
            if (r2 == 0) goto L5b
            o11 r2 = r2.a
            boolean r2 = defpackage.b10.n(r2, r1)
            if (r2 != r8) goto L5b
            goto La4
        L5b:
            r2 = r1
        L5c:
            if (r2 <= 0) goto L6f
            int r4 = java.lang.Character.codePointBefore(r13, r2)
            boolean r6 = defpackage.b10.Q(r4)
            if (r6 != 0) goto L69
            goto L6f
        L69:
            int r4 = java.lang.Character.charCount(r4)
            int r2 = r2 - r4
            goto L5c
        L6f:
            java.lang.String r4 = r13.e
            int r4 = r4.length()
            if (r1 >= r4) goto L88
            int r4 = java.lang.Character.codePointAt(r13, r1)
            boolean r6 = defpackage.b10.Q(r4)
            if (r6 != 0) goto L82
            goto L88
        L82:
            int r4 = java.lang.Character.charCount(r4)
            int r1 = r1 + r4
            goto L6f
        L88:
            long r1 = defpackage.no0.a(r2, r1)
            boolean r4 = defpackage.w11.b(r1)
            if (r4 == 0) goto L9c
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            java.lang.String r2 = " "
            r10.m(r1, r2, r15)
            return r8
        L9c:
            r4 = 0
            r0 = r10
            r3 = r13
            r5 = r15
            r0.h(r1, r3, r4, r5)
            return r8
        La4:
            android.view.inputmethod.HandwritingGesture r1 = defpackage.ux.l(r12)
            int r0 = r10.b(r1, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.n(r40, android.view.inputmethod.JoinOrSplitGesture, q8, c61, iw):int");
    }

    private final int o(z21 z21Var, JoinOrSplitGesture joinOrSplitGesture, q11 q11Var, c61 c61Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int p(defpackage.r40 r18, android.view.inputmethod.RemoveSpaceGesture r19, defpackage.q8 r20, defpackage.c61 r21, defpackage.iw r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.p(r40, android.view.inputmethod.RemoveSpaceGesture, q8, c61, iw):int");
    }

    private final int q(z21 z21Var, RemoveSpaceGesture removeSpaceGesture, q11 q11Var, c61 c61Var) {
        throw null;
    }

    private final int r(r40 r40Var, SelectGesture selectGesture, u01 u01Var, iw iwVar) {
        long jK = b10.K(r40Var, l81.d0(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
        if (w11.b(jK)) {
            return a.b(ux.l(selectGesture), iwVar);
        }
        v(jK, u01Var, iwVar);
        return 1;
    }

    private final int s(z21 z21Var, SelectGesture selectGesture, q11 q11Var) {
        l81.d0(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final int t(r40 r40Var, SelectRangeGesture selectRangeGesture, u01 u01Var, iw iwVar) {
        long jM = b10.m(r40Var, l81.d0(selectRangeGesture.getSelectionStartArea()), l81.d0(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
        if (w11.b(jM)) {
            return a.b(ux.l(selectRangeGesture), iwVar);
        }
        v(jM, u01Var, iwVar);
        return 1;
    }

    private final int u(z21 z21Var, SelectRangeGesture selectRangeGesture, q11 q11Var) {
        l81.d0(selectRangeGesture.getSelectionStartArea());
        l81.d0(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final void v(long j, u01 u01Var, iw iwVar) {
        int i = w11.c;
        iwVar.g(new fu0((int) (j >> 32), (int) (j & 4294967295L)));
        if (u01Var != null) {
            u01Var.f(true);
        }
    }

    private final void w(r40 r40Var, DeleteGesture deleteGesture, u01 u01Var) {
        if (u01Var != null) {
            long jK = b10.K(r40Var, l81.d0(deleteGesture.getDeletionArea()), G(deleteGesture.getGranularity()));
            r40 r40Var2 = u01Var.d;
            if (r40Var2 != null) {
                r40Var2.e(jK);
            }
            r40 r40Var3 = u01Var.d;
            if (r40Var3 != null) {
                r40Var3.f(w11.b);
            }
            if (w11.b(jK)) {
                return;
            }
            u01Var.p(false);
            u01Var.n(px.d);
        }
    }

    private final void x(z21 z21Var, DeleteGesture deleteGesture, q11 q11Var) {
        l81.d0(deleteGesture.getDeletionArea());
        G(deleteGesture.getGranularity());
        throw null;
    }

    private final void y(r40 r40Var, DeleteRangeGesture deleteRangeGesture, u01 u01Var) {
        if (u01Var != null) {
            long jM = b10.m(r40Var, l81.d0(deleteRangeGesture.getDeletionStartArea()), l81.d0(deleteRangeGesture.getDeletionEndArea()), G(deleteRangeGesture.getGranularity()));
            r40 r40Var2 = u01Var.d;
            if (r40Var2 != null) {
                r40Var2.e(jM);
            }
            r40 r40Var3 = u01Var.d;
            if (r40Var3 != null) {
                r40Var3.f(w11.b);
            }
            if (w11.b(jM)) {
                return;
            }
            u01Var.p(false);
            u01Var.n(px.d);
        }
    }

    private final void z(z21 z21Var, DeleteRangeGesture deleteRangeGesture, q11 q11Var) {
        l81.d0(deleteRangeGesture.getDeletionStartArea());
        l81.d0(deleteRangeGesture.getDeletionEndArea());
        G(deleteRangeGesture.getGranularity());
        throw null;
    }

    public final boolean A(r40 r40Var, PreviewableHandwritingGesture previewableHandwritingGesture, u01 u01Var, CancellationSignal cancellationSignal) {
        n11 n11Var;
        q8 q8Var = r40Var.j;
        if (q8Var == null) {
            return false;
        }
        p11 p11VarD = r40Var.d();
        if (!q8Var.equals((p11VarD == null || (n11Var = p11VarD.a.a) == null) ? null : n11Var.a)) {
            return false;
        }
        if (ux.x(previewableHandwritingGesture)) {
            C(r40Var, ux.o(previewableHandwritingGesture), u01Var);
        } else if (s5.q(previewableHandwritingGesture)) {
            w(r40Var, s5.h(previewableHandwritingGesture), u01Var);
        } else if (s5.w(previewableHandwritingGesture)) {
            E(r40Var, s5.k(previewableHandwritingGesture), u01Var);
        } else {
            if (!s5.y(previewableHandwritingGesture)) {
                return false;
            }
            y(r40Var, s5.i(previewableHandwritingGesture), u01Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new ph(1, u01Var));
        return true;
    }

    public final boolean B(z21 z21Var, PreviewableHandwritingGesture previewableHandwritingGesture, q11 q11Var, CancellationSignal cancellationSignal) {
        if (ux.x(previewableHandwritingGesture)) {
            D(z21Var, ux.o(previewableHandwritingGesture), q11Var);
        } else if (s5.q(previewableHandwritingGesture)) {
            x(z21Var, s5.h(previewableHandwritingGesture), q11Var);
        } else if (s5.w(previewableHandwritingGesture)) {
            F(z21Var, s5.k(previewableHandwritingGesture), q11Var);
        } else {
            if (!s5.y(previewableHandwritingGesture)) {
                return false;
            }
            z(z21Var, s5.i(previewableHandwritingGesture), q11Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new vx());
        return true;
    }

    public final int i(r40 r40Var, HandwritingGesture handwritingGesture, u01 u01Var, c61 c61Var, iw iwVar) {
        n11 n11Var;
        q8 q8Var = r40Var.j;
        if (q8Var == null) {
            return 3;
        }
        p11 p11VarD = r40Var.d();
        if (!q8Var.equals((p11VarD == null || (n11Var = p11VarD.a.a) == null) ? null : n11Var.a)) {
            return 3;
        }
        if (ux.x(handwritingGesture)) {
            return r(r40Var, ux.o(handwritingGesture), u01Var, iwVar);
        }
        if (s5.q(handwritingGesture)) {
            return c(r40Var, s5.h(handwritingGesture), q8Var, iwVar);
        }
        if (s5.w(handwritingGesture)) {
            return t(r40Var, s5.k(handwritingGesture), u01Var, iwVar);
        }
        if (s5.y(handwritingGesture)) {
            return e(r40Var, s5.i(handwritingGesture), q8Var, iwVar);
        }
        if (ux.v(handwritingGesture)) {
            return n(r40Var, ux.m(handwritingGesture), q8Var, c61Var, iwVar);
        }
        if (s5.A(handwritingGesture)) {
            return k(r40Var, s5.j(handwritingGesture), c61Var, iwVar);
        }
        if (ux.r(handwritingGesture)) {
            return p(r40Var, ux.n(handwritingGesture), q8Var, c61Var, iwVar);
        }
        return 2;
    }

    public final int j(z21 z21Var, HandwritingGesture handwritingGesture, q11 q11Var, c61 c61Var) {
        if (ux.x(handwritingGesture)) {
            return s(z21Var, ux.o(handwritingGesture), q11Var);
        }
        if (s5.q(handwritingGesture)) {
            return d(z21Var, s5.h(handwritingGesture), q11Var);
        }
        if (s5.w(handwritingGesture)) {
            return u(z21Var, s5.k(handwritingGesture), q11Var);
        }
        if (s5.y(handwritingGesture)) {
            return f(z21Var, s5.i(handwritingGesture), q11Var);
        }
        if (ux.v(handwritingGesture)) {
            return o(z21Var, ux.m(handwritingGesture), q11Var, c61Var);
        }
        if (s5.A(handwritingGesture)) {
            return l(z21Var, s5.j(handwritingGesture), q11Var, c61Var);
        }
        if (ux.r(handwritingGesture)) {
            return q(z21Var, ux.n(handwritingGesture), q11Var, c61Var);
        }
        return 2;
    }
}
