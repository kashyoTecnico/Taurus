package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ii0 extends x {
    public final Object[] d;
    public final Object[] e;
    public final int f;
    public final int g;

    public ii0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i;
        this.g = i2;
        if (!(a() > 32)) {
            zj0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, y0 y0Var) {
        Object[] objArrCopyOf;
        int i3 = n2.i(i2, i);
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                c10.o(objArrCopyOf, "copyOf(...)");
            }
            y9.r0(objArr, objArrCopyOf, i3 + 1, i3, 31);
            y0Var.a = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        c10.o(objArrCopyOf2, "copyOf(...)");
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = i((Object[]) obj2, i4, i2, obj, y0Var);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            c10.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i3] = i((Object[]) obj3, i4, 0, y0Var.a, y0Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, y0 y0Var) {
        Object[] objArrK;
        int i3 = n2.i(i2, i);
        if (i == 5) {
            y0Var.a = objArr[i3];
            objArrK = null;
        } else {
            Object obj = objArr[i3];
            c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrK = k((Object[]) obj, i - 5, i2, y0Var);
        }
        if (objArrK == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i3] = objArrK;
        return objArrCopyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int i3 = n2.i(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        c10.o(objArrCopyOf, "copyOf(...)");
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[i3];
        c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[i3] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // defpackage.x
    public final x b(int i, Object obj) {
        int i2 = this.f;
        nm.n(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.d;
        if (i >= iP) {
            return j(objArr, i - iP, obj);
        }
        y0 y0Var = new y0(null);
        return j(i(objArr, this.g, i, obj, y0Var), 0, y0Var.a);
    }

    @Override // defpackage.x
    public final x c(Object obj) {
        int iP = p();
        int i = this.f;
        int i2 = i - iP;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return l(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = obj;
        return new ii0(objArr, objArrCopyOf, i + 1, this.g);
    }

    @Override // defpackage.x
    public final ji0 e() {
        return new ji0(this, this.d, this.e, this.g);
    }

    @Override // defpackage.x
    public final x f(w wVar) {
        ji0 ji0Var = new ji0(this, this.d, this.e, this.g);
        ji0Var.y(wVar);
        return ji0Var.c();
    }

    @Override // defpackage.x
    public final x g(int i) {
        nm.m(i, this.f);
        int iP = p();
        Object[] objArr = this.d;
        int i2 = this.g;
        return i >= iP ? o(objArr, iP, i2, i - iP) : o(n(objArr, i2, i, new y0(this.e[0])), iP, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        nm.m(i, a());
        if (p() <= i) {
            objArr = this.e;
        } else {
            Object[] objArr2 = this.d;
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[n2.i(i, i2)];
                c10.n(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.x
    public final x h(int i, Object obj) {
        int i2 = this.f;
        nm.m(i, i2);
        int iP = p();
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i3 = this.g;
        if (iP > i) {
            return new ii0(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        c10.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new ii0(objArr, objArrCopyOf, i2, i3);
    }

    public final ii0 j(Object[] objArr, int i, Object obj) {
        int iP = p();
        int i2 = this.f;
        int i3 = i2 - iP;
        Object[] objArr2 = this.e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        c10.o(objArrCopyOf, "copyOf(...)");
        if (i3 < 32) {
            y9.r0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new ii0(objArr, objArrCopyOf, i2 + 1, this.g);
        }
        Object obj2 = objArr2[31];
        y9.r0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    public final ii0 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 <= (1 << i3)) {
            return new ii0(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ii0(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        nm.n(i, this.f);
        return new ki0(this.d, this.e, i, this.f, (this.g / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int i2 = n2.i(a() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            c10.o(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[i2] = m(i - 5, (Object[]) objArrCopyOf[i2], objArr2);
        return objArrCopyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, y0 y0Var) {
        Object[] objArrCopyOf;
        int i3 = n2.i(i2, i);
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                c10.o(objArrCopyOf, "copyOf(...)");
            }
            y9.r0(objArr, objArrCopyOf, i3, i3 + 1, 32);
            objArrCopyOf[31] = y0Var.a;
            y0Var.a = objArr[i3];
            return objArrCopyOf;
        }
        int i4 = objArr[31] == null ? n2.i(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        c10.o(objArrCopyOf2, "copyOf(...)");
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = objArrCopyOf2[i4];
                c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[i4] = n((Object[]) obj, i5, 0, y0Var);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = n((Object[]) obj2, i5, i2, y0Var);
        return objArrCopyOf2;
    }

    public final x o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        if (i4 != 1) {
            Object[] objArr2 = this.e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            c10.o(objArrCopyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                y9.r0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new ii0(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                c10.o(objArr, "copyOf(...)");
            }
            return new fv0(objArr);
        }
        y0 y0Var = new y0(null);
        Object[] objArrK = k(objArr, i2, i - 1, y0Var);
        c10.m(objArrK);
        Object obj = y0Var.a;
        c10.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new ii0(objArrK, objArr3, i, i2);
        }
        Object obj2 = objArrK[0];
        c10.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new ii0((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.f - 1) & (-32);
    }
}
