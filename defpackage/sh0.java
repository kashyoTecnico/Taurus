package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sh0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final da0 e;
    public final qy0 f;

    public sh0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            zj0.a("Invalid start index");
        }
        this.d = new ArrayList();
        da0 da0Var = new da0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            n20 n20Var = (n20) this.a.get(i3);
            int i4 = n20Var.c;
            int i5 = n20Var.d;
            da0Var.g(i4, new kx(i3, i2, i5));
            i2 += i5;
        }
        this.e = da0Var;
        this.f = m20.J(new rh0(this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        da0 da0Var = this.e;
        kx kxVar = (kx) da0Var.b(i);
        if (kxVar == null) {
            return false;
        }
        int i4 = kxVar.b;
        int i5 = i2 - kxVar.c;
        kxVar.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = da0Var.c;
        long[] jArr = da0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        kx kxVar2 = (kx) objArr[(i6 << 3) + i8];
                        if (kxVar2.b >= i4 && !kxVar2.equals(kxVar) && (i3 = kxVar2.b + i5) >= 0) {
                            kxVar2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
