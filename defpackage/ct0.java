package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ct0 implements Iterable, c20 {
    public final ta0 d;
    public z70 e;
    public boolean f;
    public boolean g;

    public ct0() {
        long[] jArr = eq0.a;
        this.d = new ta0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ct0 a() {
        /*
            r17 = this;
            r0 = r17
            ct0 r1 = new ct0
            r1.<init>()
            boolean r2 = r0.f
            r1.f = r2
            boolean r2 = r0.g
            r1.g = r2
            ta0 r2 = r1.d
            r2.getClass()
            java.lang.String r3 = "from"
            ta0 r0 = r0.d
            defpackage.c10.p(r0, r3)
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L62
            r6 = 0
            r7 = r6
        L28:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L42:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.l(r14, r13)
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L42
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r7 == r5) goto L62
            int r7 = r7 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.a():ct0");
    }

    public final Object b(ot0 ot0Var) {
        Object objG = this.d.g(ot0Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + ot0Var + " - consider getOrElse or getOrNull");
    }

    public final void c(ct0 ct0Var) {
        ta0 ta0Var = ct0Var.d;
        Object[] objArr = ta0Var.b;
        Object[] objArr2 = ta0Var.c;
        long[] jArr = ta0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ot0 ot0Var = (ot0) obj;
                        ta0 ta0Var2 = this.d;
                        Object objG = ta0Var2.g(ot0Var);
                        c10.n(ot0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objE = ot0Var.b.e(objG, obj2);
                        if (objE != null) {
                            ta0Var2.l(ot0Var, objE);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void d(ot0 ot0Var, Object obj) {
        boolean z = obj instanceof j0;
        ta0 ta0Var = this.d;
        if (z && ta0Var.c(ot0Var)) {
            Object objG = ta0Var.g(ot0Var);
            c10.n(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            j0 j0Var = (j0) objG;
            j0 j0Var2 = (j0) obj;
            String str = j0Var2.a;
            if (str == null) {
                str = j0Var.a;
            }
            ow owVar = j0Var2.b;
            if (owVar == null) {
                owVar = j0Var.b;
            }
            ta0Var.l(ot0Var, new j0(str, owVar));
        } else {
            ta0Var.l(ot0Var, obj);
        }
        ot0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct0)) {
            return false;
        }
        ct0 ct0Var = (ct0) obj;
        return c10.i(this.d, ct0Var.d) && this.f == ct0Var.f && this.g == ct0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + b8.d(this.d.hashCode() * 31, 31, this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        z70 z70Var = this.e;
        if (z70Var == null) {
            ta0 ta0Var = this.d;
            ta0Var.getClass();
            z70 z70Var2 = new z70(ta0Var);
            this.e = z70Var2;
            z70Var = z70Var2;
        }
        return ((qs) z70Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.g
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            ta0 r4 = r0.d
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            ot0 r8 = (defpackage.ot0) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = defpackage.nm.E(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.toString():java.lang.String");
    }
}
