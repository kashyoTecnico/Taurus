package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class k9 implements j9, m9 {
    public final float d;
    public final float e;

    public k9(float f) {
        this.d = f;
        this.e = f;
    }

    @Override // defpackage.j9, defpackage.m9
    public final float a() {
        return this.e;
    }

    @Override // defpackage.m9
    public final void b(int i, n80 n80Var, int[] iArr, int[] iArr2) {
        d(n80Var, i, iArr, e30.d, iArr2);
    }

    @Override // defpackage.j9
    public final void d(xn xnVar, int i, int[] iArr, e30 e30Var, int[] iArr2) {
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iN = xnVar.N(this.d);
        boolean z = e30Var == e30.e;
        v71 v71Var = o9.a;
        if (z) {
            i2 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i3 = iArr[length];
                int iMin2 = Math.min(i2, i - i3);
                iArr2[length] = iMin2;
                iMin = Math.min(iN, (i - iMin2) - i3);
                i2 = iArr2[length] + i3 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i4 = 0;
            i2 = 0;
            iMin = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = iArr[i4];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[i5] = iMin3;
                int iMin4 = Math.min(iN, (i - iMin3) - i6);
                int i7 = iArr2[i5] + i6 + iMin4;
                i4++;
                iMin = iMin4;
                i2 = i7;
                i5++;
            }
        }
        if (i2 - iMin < i) {
            int iRound = Math.round((1 + (e30Var != e30.d ? (-1.0f) * (-1) : -1.0f)) * ((i - r4) / 2.0f));
            int length3 = iArr2.length;
            for (int i8 = 0; i8 < length3; i8++) {
                iArr2[i8] = iArr2[i8] + iRound;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9) || !kp.a(this.d, ((k9) obj).d)) {
            return false;
        }
        Object obj2 = n9.f;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return n9.f.hashCode() + b8.d(Float.hashCode(this.d) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) kp.b(this.d)) + ", " + n9.f + ')';
    }
}
