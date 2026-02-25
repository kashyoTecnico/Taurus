package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class gf0 extends d80 {
    public int k;
    public int m;
    public int o;
    public ef0[] j = new ef0[16];
    public int[] l = new int[16];
    public Object[] n = new Object[16];

    public final void K() {
        this.k = 0;
        this.m = 0;
        y9.v0(this.n, 0, this.o);
        this.o = 0;
    }

    public final void L(f9 f9Var, ev0 ev0Var, hm0 hm0Var, ff0 ff0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (N()) {
            tw twVar = new tw(this);
            gf0 gf0Var = (gf0) twVar.e;
            while (true) {
                ef0 ef0Var = gf0Var.j[twVar.b];
                m2 m2VarB = ef0Var.b(twVar);
                f9 f9Var2 = f9Var;
                ev0 ev0Var2 = ev0Var;
                hm0 hm0Var2 = hm0Var;
                ff0 ff0Var2 = ff0Var;
                try {
                    ef0Var.a(twVar, f9Var2, ev0Var2, hm0Var2, ff0Var2);
                    int i = twVar.b;
                    int i2 = gf0Var.k;
                    if (i < i2) {
                        ef0 ef0Var2 = gf0Var.j[i];
                        twVar.c += ef0Var2.a;
                        twVar.d += ef0Var2.b;
                        int i3 = i + 1;
                        twVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        f9Var = f9Var2;
                        ev0Var = ev0Var2;
                        hm0Var = hm0Var2;
                        ff0Var = ff0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        K();
    }

    public final boolean M() {
        return this.k == 0;
    }

    public final boolean N() {
        return this.k != 0;
    }

    public final void O(ef0 ef0Var) {
        int i = this.k;
        ef0[] ef0VarArr = this.j;
        if (i == ef0VarArr.length) {
            ef0[] ef0VarArr2 = new ef0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ef0VarArr, 0, ef0VarArr2, 0, i);
            this.j = ef0VarArr2;
        }
        int i2 = this.m;
        int i3 = ef0Var.a;
        int i4 = ef0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.l;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            y9.p0(iArr, iArr2, 0, 0, length);
            this.l = iArr2;
        }
        int i7 = this.o + i4;
        Object[] objArr = this.n;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.n = objArr2;
        }
        ef0[] ef0VarArr3 = this.j;
        int i9 = this.k;
        this.k = i9 + 1;
        ef0VarArr3[i9] = ef0Var;
        this.m += ef0Var.a;
        this.o += i4;
    }
}
