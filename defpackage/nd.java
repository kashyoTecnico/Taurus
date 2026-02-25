package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class nd implements sw {
    public final ml d;
    public final int e;
    public final ec f;
    public final vt g;

    public nd(vt vtVar, ml mlVar, int i, ec ecVar) {
        this.d = mlVar;
        this.e = i;
        this.f = ecVar;
        this.g = vtVar;
    }

    public abstract nd a(ml mlVar, int i, ec ecVar);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // defpackage.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.wt r8, defpackage.lk r9) {
        /*
            r7 = this;
            int r0 = r7.e
            r1 = -3
            xl r2 = defpackage.xl.d
            r3 = 0
            j41 r4 = defpackage.j41.a
            if (r0 != r1) goto L71
            ml r0 = r9.f()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            nl r5 = new nl
            r6 = 2
            r5.<init>(r6)
            ml r6 = r7.d
            java.lang.Object r1 = r6.r(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L29
            ml r1 = r0.k(r6)
            goto L2e
        L29:
            r1 = 0
            ml r1 = defpackage.r31.A(r0, r6, r1)
        L2e:
            boolean r5 = defpackage.c10.i(r1, r0)
            if (r5 == 0) goto L3d
            mk r9 = (defpackage.mk) r9
            java.lang.Object r7 = r7.d(r8, r9)
            if (r7 != r2) goto L82
            return r7
        L3d:
            g2 r5 = defpackage.g2.v
            kl r6 = r1.n(r5)
            kl r0 = r0.n(r5)
            boolean r0 = defpackage.c10.i(r6, r0)
            if (r0 == 0) goto L71
            ml r0 = r9.f()
            boolean r5 = r8 instanceof defpackage.wt0
            if (r5 != 0) goto L60
            boolean r5 = r8 instanceof defpackage.vc0
            if (r5 == 0) goto L5a
            goto L60
        L5a:
            zt r5 = new zt
            r5.<init>(r8, r0)
            r8 = r5
        L60:
            md r0 = new md
            r5 = 1
            r0.<init>(r7, r3, r5)
            java.lang.Object r7 = defpackage.b10.h0(r1)
            java.lang.Object r7 = defpackage.c4.J(r1, r8, r7, r0, r9)
            if (r7 != r2) goto L82
            return r7
        L71:
            ob r0 = new ob
            r1 = 1
            r0.<init>(r8, r7, r3, r1)
            java.lang.Object r7 = defpackage.nm.q(r0, r9)
            if (r7 != r2) goto L7e
            goto L7f
        L7e:
            r7 = r4
        L7f:
            if (r7 != r2) goto L82
            return r7
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.b(wt, lk):java.lang.Object");
    }

    public vt c() {
        return null;
    }

    public abstract Object d(wt wtVar, mk mkVar);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.sw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vt e(defpackage.ml r5, int r6, defpackage.ec r7) {
        /*
            r4 = this;
            ml r0 = r4.d
            ml r5 = r5.k(r0)
            ec r1 = defpackage.ec.d
            ec r2 = r4.f
            int r3 = r4.e
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.c10.i(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            nd r4 = r4.a(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.e(ml, int, ec):vt");
    }

    public final String f() {
        ArrayList arrayList = new ArrayList(4);
        is isVar = is.d;
        ml mlVar = this.d;
        if (mlVar != isVar) {
            arrayList.add("context=" + mlVar);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ec ecVar = ec.d;
        ec ecVar2 = this.f;
        if (ecVar2 != ecVar) {
            arrayList.add("onBufferOverflow=" + ecVar2);
        }
        return getClass().getSimpleName() + '[' + ue.W(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.g + " -> " + f();
    }
}
