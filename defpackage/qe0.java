package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class qe0 extends ef0 {
    public static final qe0 c = new qe0(1, 0, 2);

    @Override // defpackage.ef0
    public final void a(tw twVar, f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) {
        m2 m2Var;
        int iC;
        int iB = twVar.b(0);
        if (ev0Var.n != 0) {
            fi.c("Cannot move a group while inserting");
        }
        if (iB < 0) {
            fi.c("Parameter offset is out of bounds");
        }
        if (iB == 0) {
            return;
        }
        int i = ev0Var.t;
        int i2 = ev0Var.v;
        int i3 = ev0Var.u;
        int i4 = i;
        while (iB > 0) {
            i4 += ev0Var.b[(ev0Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                fi.c("Parameter offset is out of bounds");
            }
            iB--;
        }
        int i5 = ev0Var.b[(ev0Var.r(i4) * 5) + 3];
        int iG = ev0Var.g(ev0Var.b, ev0Var.r(ev0Var.t));
        int iG2 = ev0Var.g(ev0Var.b, ev0Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = ev0Var.g(ev0Var.b, ev0Var.r(i6));
        int i7 = iG3 - iG2;
        ev0Var.w(i7, Math.max(ev0Var.t - 1, 0));
        ev0Var.v(i5);
        int[] iArr = ev0Var.b;
        int iR = ev0Var.r(i6) * 5;
        y9.p0(iArr, iArr, ev0Var.r(i) * 5, iR, (i5 * 5) + iR);
        if (i7 > 0) {
            Object[] objArr = ev0Var.c;
            int iH = ev0Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, ev0Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = ev0Var.k;
        int i11 = ev0Var.l;
        int length = ev0Var.c.length;
        int i12 = ev0Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = ev0Var.r(i14);
            int i15 = i9;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = ev0.i(ev0.i(ev0Var.g(iArr, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), ev0Var.k, ev0Var.l, ev0Var.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = ev0Var.p();
        int iB2 = dv0.b(ev0Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iB2 >= 0) {
            while (iB2 < ev0Var.d.size() && (iC = ev0Var.c((m2Var = (m2) ev0Var.d.get(iB2)))) >= i6 && iC < i16) {
                arrayList.add(m2Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            m2 m2Var2 = (m2) arrayList.get(i18);
            int iC2 = ev0Var.c(m2Var2) + i17;
            if (iC2 >= ev0Var.g) {
                m2Var2.a = -(iP - iC2);
            } else {
                m2Var2.a = iC2;
            }
            ev0Var.d.add(dv0.b(ev0Var.d, iC2, iP), m2Var2);
        }
        if (ev0Var.H(i6, i5)) {
            fi.c("Unexpectedly removed anchors");
        }
        ev0Var.m(i2, ev0Var.u, i);
        if (i7 > 0) {
            ev0Var.I(i8, i7, i6 - 1);
        }
    }
}
