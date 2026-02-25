package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class zu0 extends d90 implements l30 {
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0(defpackage.n80 r8) {
        /*
            r7 = this;
            float r0 = r7.t
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = defpackage.kp.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.t
            int r0 = r8.N(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.u
            boolean r4 = defpackage.kp.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.u
            int r4 = r8.N(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.r
            boolean r5 = defpackage.kp.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.r
            int r5 = r8.N(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.s
            boolean r1 = defpackage.kp.a(r6, r1)
            if (r1 != 0) goto L5b
            float r7 = r7.s
            int r7 = r8.N(r7)
            if (r7 <= r4) goto L55
            r7 = r4
        L55:
            if (r7 >= 0) goto L58
            r7 = r3
        L58:
            if (r7 == r2) goto L5b
            r3 = r7
        L5b:
            long r7 = defpackage.hj.a(r5, r0, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu0.A0(n80):long");
    }

    @Override // defpackage.l30
    public final int C(v60 v60Var, g80 g80Var, int i) {
        long jA0 = A0(v60Var);
        return gj.e(jA0) ? gj.g(jA0) : hj.f(jA0, g80Var.b0(i));
    }

    @Override // defpackage.l30
    public final int P(v60 v60Var, g80 g80Var, int i) {
        long jA0 = A0(v60Var);
        return gj.f(jA0) ? gj.h(jA0) : hj.g(jA0, g80Var.S(i));
    }

    @Override // defpackage.l30
    public final m80 e(n80 n80Var, g80 g80Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jA0 = A0(n80Var);
        if (this.v) {
            jA = hj.e(j, jA0);
        } else {
            if (kp.a(this.r, Float.NaN)) {
                iJ = gj.j(j);
                int iH2 = gj.h(jA0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = gj.j(jA0);
            }
            if (kp.a(this.t, Float.NaN)) {
                iH = gj.h(j);
                int iJ2 = gj.j(jA0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = gj.h(jA0);
            }
            if (kp.a(this.s, Float.NaN)) {
                i = gj.i(j);
                int iG2 = gj.g(jA0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = gj.i(jA0);
            }
            if (kp.a(this.u, Float.NaN)) {
                iG = gj.g(j);
                int i2 = gj.i(jA0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = gj.g(jA0);
            }
            jA = hj.a(iJ, iH, i, iG);
        }
        oi0 oi0VarE = g80Var.e(jA);
        return n80Var.a0(oi0VarE.d, oi0VarE.e, ls.d, new t6(oi0VarE, 6));
    }

    @Override // defpackage.l30
    public final int f(v60 v60Var, g80 g80Var, int i) {
        long jA0 = A0(v60Var);
        return gj.f(jA0) ? gj.h(jA0) : hj.g(jA0, g80Var.X(i));
    }

    @Override // defpackage.l30
    public final int m(v60 v60Var, g80 g80Var, int i) {
        long jA0 = A0(v60Var);
        return gj.e(jA0) ? gj.g(jA0) : hj.f(jA0, g80Var.f(i));
    }
}
